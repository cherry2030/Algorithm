-- 코드를 입력하세요
-- 할인율이 적용되는 대여 기간 종류로는 '7일 이상' (대여 기간이 7일 이상 30일 미만인 경우), '30일 이상' (대여 기간이 30일 이상 90일 미만인 경우), '90일 이상' (대여 기간이 90일 이상인 경우) 이 있습니다. 
-- 대여 기간이 7일 미만인 경우 할인정책이 없습니다.

-- 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 / 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하며
-- 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차
-- 대여 금액 내림차순 정렬하고, 자동차 종류를 기준으로 오름차순 정렬, 자동차 ID를 기준으로 내림차순 정렬

SELECT C.CAR_ID, C.CAR_TYPE, ROUND(C.DAILY_FEE * 30 * (100- DISCOUNT_RATE) / 100) as FEE
from CAR_RENTAL_COMPANY_CAR as C
join CAR_RENTAL_COMPANY_RENTAL_HISTORY as H on H.CAR_ID = C.CAR_ID
join CAR_RENTAL_COMPANY_DISCOUNT_PLAN as P on C.CAR_TYPE = P.CAR_TYPE
where (C.CAR_TYPE = '세단' or C.CAR_TYPE = 'SUV')
    and DURATION_TYPE = '30일 이상'
    and C.CAR_ID NOT IN (select CAR_ID 
                         from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                         where END_DATE > '2022-11-01' AND START_DATE < '2022-12-01'
                        )
group by C.CAR_ID
having FEE >= 500000 and FEE <= 2000000
order by FEE desc, C.CAR_TYPE, C.CAR_ID desc
