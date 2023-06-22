-- 코드를 입력하세요
-- NULL -> "No name"으로 표시
SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name') as NAME, SEX_UPON_INTAKE
from ANIMAL_INS