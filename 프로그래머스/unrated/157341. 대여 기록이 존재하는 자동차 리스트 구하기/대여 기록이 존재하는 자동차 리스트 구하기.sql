-- 코드를 입력하세요
-- 자동차 종류가 '세단'인 자동차
-- 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트를 출력
-- 자동차 ID 리스트는 중복이 없어야 하며, 자동차 ID를 기준으로 내림차순 정렬


SELECT distinct H.CAR_ID
from CAR_RENTAL_COMPANY_RENTAL_HISTORY H
join CAR_RENTAL_COMPANY_CAR C
on H.CAR_ID = C.CAR_ID
where CAR_TYPE = '세단' and MONTH(START_DATE) = 10
order by H.CAR_ID desc