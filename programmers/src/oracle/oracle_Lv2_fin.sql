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



-- 최솟값 구하기 (my,orcl 같음)
SELECT MIN(DATETIME)
FROM ANIMAL_INS
ORDER BY DATETIME;

SELECT DATETIME -- ROW_NUMBER() 함수 이용
FROM (SELECT ROW_NUMBER() OVER(ORDER BY DATETIME) RN, DATETIME
        FROM ANIMAL_INS)
WHERE RN=1;

-- 최솟값 구하기 (orcl 같음)
SELECT DATETIME
FROM (SELECT ROWNUM , DATETIME
      FROM ANIMAL_INS
      ORDER BY DATETIME)
WHERE ROWNUM = 1;

select a.datetime from 
(SELECT DATETIME , rank() over (order by datetime ) dRank 
from animal_ins ) a
where a.dRank = 1;



-- 동명 동물 수 찾기 (my와 비슷 - my는 alias 무조건)
SELECT *
FROM (SELECT NAME, COUNT(NAME) COUNT
        FROM ANIMAL_INS
        GROUP BY NAME
        ORDER BY NAME)
WHERE COUNT > 1;



-- 이름에 el이 들어가는 동물 찾기 (my,orcl 같음)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE UPPER(NAME) LIKE '%EL%' AND ANIMAL_TYPE='Dog'
ORDER BY NAME;



-- 동물 수 구하기(my,orcl 같음)
SELECT COUNT(*)
FROM ANIMAL_INS;

SELECT MAX(ROWNUM) -- orcl
FROM ANIMAL_INS;



-- 입양 시각 구하기(1) (orcl)
SELECT HOUR, COUNT(HOUR) COUNT
FROM (SELECT TO_CHAR(DATETIME,'HH24') HOUR
FROM ANIMAL_OUTS)
WHERE HOUR >= 9 AND HOUR < 20
GROUP BY HOUR
ORDER BY HOUR;



-- NULL 처리하기 (orcl)
SELECT ANIMAL_TYPE, NVL(NAME, 'No name') NAME, SEX_UPON_INTAKE
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



-- DATETIME에서 DATE로 형 변환 (orcl)
SELECT ANIMAL_ID, NAME, TO_CHAR(DATETIME,'YYYY-MM-DD') 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID