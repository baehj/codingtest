-- 고양이와 개는 몇 마리 있을까 (my,orcl 같음)
select ANIMAL_TYPE, count(ANIMAL_TYPE) count
from ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE;



-- 루시와 엘라 찾기 (my,orcl 같음)
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME = 'Lucy' OR NAME = 'Ella' OR NAME = 'Pickle' OR NAME = 'Rogan' OR NAME ='Sabrina'
		OR NAME = 'Mitty';

SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle',
                'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID;
		


-- 루시와 엘라 찾기 (my)
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE 'Lucy, Ella, Pickle, Rogan, Sabrina, Mitty' LIKE CONCAT('%', NAME, '%')
ORDER BY ANIMAL_ID;



-- 최솟값 구하기 (my,orcl 같음)
SELECT MIN(DATETIME)
FROM ANIMAL_INS
ORDER BY DATETIME;

SELECT DATETIME -- ROW_NUMBER() 함수 이용
FROM (SELECT ROW_NUMBER() OVER(ORDER BY DATETIME) RN, DATETIME
        FROM ANIMAL_INS)
WHERE RN=1;



-- 동명 동물 수 찾기 (my는 alias 무조건)
SELECT A.*
FROM (SELECT NAME, COUNT(NAME) COUNT
        FROM ANIMAL_INS
        GROUP BY NAME
        ORDER BY NAME)A
WHERE A.COUNT > 1;



-- 이름에 el이 들어가는 동물 찾기 (my,orcl 같음)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE UPPER(NAME) LIKE '%EL%' AND ANIMAL_TYPE='Dog'
ORDER BY NAME;



-- 동물 수 구하기 (my,orcl 같음)
SELECT COUNT(*)
FROM ANIMAL_INS;



-- 입양 시각 구하기(1) (my) // MYSQL 의 날짜 포맷 기억하기. 
SELECT HOUR(DATETIME) HOUR, COUNT(*) COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME)>8 AND HOUR(DATETIME)<20
GROUP BY HOUR(DATETIME)
ORDER BY HOUR(DATETIME);



-- NULL 처리하기 (my)
SELECT ANIMAL_TYPE, IFNULL(NAME,'No name') NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID

-- NULL 처리하기 (my,orcl 같음)
SELECT ANIMAL_TYPE, COALESCE(NAME,'No name') NAME,
        SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID



-- 중성화 여부 파악하기 (my,orcl 같음)
SELECT ANIMAL_ID, NAME, 
CASE WHEN SEX_UPON_INTAKE LIKE '%Neutered%%'
       OR SEX_UPON_INTAKE LIKE '%Spayed%'
     THEN 'O'
     ELSE 'X'
END 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;



-- 중복 제거하기 (my,orcl 같음)
SELECT COUNT(DISTINCT NAME)
FROM ANIMAL_INS



-- DATETIME에서 DATE로 형 변환 (my)
SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, "%Y-%m-%d") 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
