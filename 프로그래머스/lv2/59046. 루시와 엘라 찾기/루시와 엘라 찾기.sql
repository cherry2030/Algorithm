-- 코드를 입력하세요
-- 동물 중 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty인
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
from ANIMAL_INS
where NAME in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')