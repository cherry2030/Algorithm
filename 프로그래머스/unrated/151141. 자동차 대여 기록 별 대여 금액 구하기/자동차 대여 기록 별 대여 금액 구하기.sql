-- 코드를 입력하세요
-- 자동차 종류가 '트럭'인 자동차
-- 대여 기록 별로 대여 금액(컬럼명: FEE)을 구하여 대여 기록 ID와 대여 금액 리스트를 출력하는 SQL문
-- 대여 금액을 기준으로 내림차순 정렬하고, 대여 기록 ID를 기준으로 내림차순 정렬
-- 
-- order by FEE desc, HISTORY_ID desc

with A as (select HISTORY_ID, H.CAR_ID, START_DATE, END_DATE, CAR_TYPE, DAILY_FEE, 
           (CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 90 then "90일 이상"
                    when DATEDIFF(END_DATE, START_DATE)+1 >= 30 then "30일 이상"
                    when DATEDIFF(END_DATE, START_DATE)+1 >= 7 then "7일 이상"
                    else "NULL" end) as duration 
from CAR_RENTAL_COMPANY_RENTAL_HISTORY H
join CAR_RENTAL_COMPANY_CAR C on H.CAR_ID = C.CAR_ID
where C.CAR_TYPE = '트럭')


SELECT A.HISTORY_ID, round(DAILY_FEE * (DATEDIFF(END_DATE, START_DATE)+1)* (100 - IFNULL(DISCOUNT_RATE , 0)) / 100) as FEE
from A
left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN P on (P.CAR_TYPE = A.CAR_TYPE and P.DURATION_TYPE = A.duration)
order by FEE desc, HISTORY_ID desc
