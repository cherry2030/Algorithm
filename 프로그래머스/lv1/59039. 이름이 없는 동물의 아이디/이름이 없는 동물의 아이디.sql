-- 코드를 입력하세요
-- 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성
-- ID는 오름차순 정렬

SELECT ANIMAL_ID
from ANIMAL_INS
where NAME is null
order by ANIMAL_ID;