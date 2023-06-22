-- 코드를 입력하세요
-- 이름이 있는 동물의 ID를 조회하는 SQL 문
-- ID는 오름차순 정렬
SELECT ANIMAL_ID
from ANIMAL_INS
where NAME is not null
order by ANIMAL_ID;