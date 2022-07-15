-- 고양이와 개는 몇 마리 있을까 (my,orcl 같음)
select ANIMAL_TYPE, count(ANIMAL_TYPE) count
from ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE;