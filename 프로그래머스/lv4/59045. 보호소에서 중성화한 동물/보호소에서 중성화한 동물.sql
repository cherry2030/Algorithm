-- 코드를 입력하세요
-- 보호소에서 중성화 수술을 거친 동물 정보를 알아보려 합니다. 보호소에 들어올 당시에는 중성화1되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물
-- 조회하는 아이디 순으로 조회

SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
from ANIMAL_INS I
join ANIMAL_OUTS O
on I.ANIMAL_ID = O.ANIMAL_ID
where (I.SEX_UPON_INTAKE like 'Intact%') and (O.SEX_UPON_OUTCOME like 'Spayed%' or O.SEX_UPON_OUTCOME like 'Neutered%')
order by I.ANIMAL_ID