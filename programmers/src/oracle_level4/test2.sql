
-- Lv.4 입양 시각 구하기(2)

SELECT B.hour, nvl(count, 0) AS count
FROM (SELECT TO_CHAR(datetime, 'HH24') AS hour, count(*) AS count 
        FROM animal_outs 
        GROUP BY TO_CHAR(datetime, 'HH24') 
        ORDER BY hour) A, 
        (SELECT LEVEL-1 AS hour FROM dual CONNECT BY LEVEL<=24) B
WHERE B.hour = A.hour(+)
ORDER BY B.hour;

--** 개념 체크

--1) LEVEL과 CONNECT BY
--	계층데이터. CONNECT BY 는 LEVEL의 계층의 깊이를 의미. 
--	만약 SELECT LEVEL FROM dual CONNECT BY LEVEL <=5; 라면? 
--	LEVEL은 1~5까지 조회됨.
--
--2) B.hour = A.hour(+)
--	OUTER JOIN 한쪽에는 데이터가 있고 한쪽에는 데이터가 없을 때 데이터가 있는 쪽 테이블의 내용을 모두 출력
--
--3) nvl(count, 0)
--	NVL은 오라클에만 있는 함수로, NVL 함수는 값이 null인 경우 지정값을 출력합니다. 




