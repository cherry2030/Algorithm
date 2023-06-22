-- 코드를 입력하세요
-- 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문
-- 아이디 순으로 조회

SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where INTAKE_CONDITION= 'Sick'
order by ANIMAL_ID;