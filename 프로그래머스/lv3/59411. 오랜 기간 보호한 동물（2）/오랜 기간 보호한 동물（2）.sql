-- 코드를 입력하세요
-- 입양을 간 동물 중, 보호 기간이 가장 길었던 동물 두 마리의 아이디와 이름을 조회

SELECT I.ANIMAL_ID, I.NAME
from ANIMAL_INS I
left outer join ANIMAL_OUTS O
on I.ANIMAL_ID = O.ANIMAL_ID
where O.DATETIME is not null
order by DATEDIFF(O.DATETIME, I.DATETIME) desc
limit 2
