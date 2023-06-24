-- 코드를 입력하세요
-- 자동차 종류가 '트럭'인 자동차
-- 대여 기록 별로 대여 금액(컬럼명: FEE)을 구하여 대여 기록 ID와 대여 금액 리스트를 출력하는 SQL문
-- 대여 금액을 기준으로 내림차순 정렬하고, 대여 기록 ID를 기준으로 내림차순 정렬

/*SELECT HISTORY_ID, 
round(DAILY_FEE * (DATEDIFF(END_DATE, START_DATE)+1)* (CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 90 then 0.9
                                                    when DATEDIFF(END_DATE, START_DATE)+1 >= 30 then 0.93
                                                    when DATEDIFF(END_DATE, START_DATE)+1 >= 7 then 0.95
                                                    else 1 end)) as FEE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY H
join CAR_RENTAL_COMPANY_CAR C on H.CAR_ID = C.CAR_ID
join CAR_RENTAL_COMPANY_DISCOUNT_PLAN P on P.CAR_TYPE = C.CAR_TYPE
where C.CAR_TYPE = '트럭'
group by HISTORY_ID
order by FEE desc, HISTORY_ID desc
*/

SELECT HISTORY_ID, 
    round(DAILY_FEE * (DATEDIFF(h.END_DATE,h.START_DATE)+1)
    * (case 
    when DATEDIFF(END_DATE,START_DATE)+1 < 7 then 1
    when DATEDIFF(END_DATE,START_DATE)+1 < 30 then 0.95
    when DATEDIFF(END_DATE,START_DATE)+1 < 90 then 0.92
    else 0.85 end)) as "FEE"

from CAR_RENTAL_COMPANY_CAR as c 
    join CAR_RENTAL_COMPANY_RENTAL_HISTORY as h
    on c.CAR_ID = h.CAR_ID
    join CAR_RENTAL_COMPANY_DISCOUNT_PLAN as p
    on c.CAR_TYPE = p.CAR_TYPE

where c.car_type = "트럭"

group by HISTORY_ID

order by FEE desc , HISTORY_ID desc