
-- 모든 레코드 조회하기 (my,orcl 같음)
SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-- 최댓값 구하기 (my,orcl 같음)
SELECT MAX(DATETIME)
FROM ANIMAL_INS

-- 이름이 없는 동물의 아이디 (my,orcl 같음)
SELECT ANIMAL_ID	
FROM ANIMAL_INS
WHERE NAME IS NULL
ORDER BY ANIMAL_ID;

-- 역순 정렬하기 (my,orcl 같음)
SELECT NAME,	DATETIME
FROM ANIMAL_INS
ORDER BY  ANIMAL_ID DESC;

-- 이름이 있는 동물의 아이디 (my,orcl 같음)
SELECT ANIMAL_ID
FROM ANIMAL_INS 
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID;

-- 아픈 동물 찾기 (my,orcl 같을 수 있지만. 주의 !!!!!)
-- my는 varchar 타입 비교시 ""와 ''모두 사용가능 / orcl은 ''만 사용 가능! 
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID;

-- 어린 동물 찾기 (my,orcl 같을 수 있지만. 주의 !!!!!)
-- != 대신 <> 를 사용할수도 있음. 같지 않을때의 조건 연산자.
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID;

-- 동물의 아이디와 이름 (my,orcl 같음)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-- 여러 기준으로 정렬하기 (my,orcl 같음)
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC;

-- 상위 n개 레코드 (my,orcl 같을 수 있지만. 주의 !!!!!)
SELECT NAME
FROM ANIMAL_INS
WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS);

-- Mysql에서 ROWNUM을 사용할 때는 아래와 같이 Oracle에서 사용하듯이 사용X 
-- SELECT NAME
-- FROM (SELECT NAME
--	     FROM ANIMAL_INS
--      ORDER BY DATETIME)
-- WHERE ROWNUM=1;




