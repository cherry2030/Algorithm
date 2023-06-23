-- 코드를 입력하세요
-- 이름에 'el'이 들어간다고

SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where ANIMAL_TYPE = 'Dog' and UPPER(NAME) like '%EL%'
order by NAME