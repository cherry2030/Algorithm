-- 코드를 입력하세요
-- 평균 대여 기간이 7일 이상인 자동차
-- 평균 대여 기간은 소수점 두번째 자리에서 반올림
-- 결과는 평균 대여 기간을 기준으로 내림차순 정렬, 자동차 ID를 기준으로 내림차순 정렬

SELECT CAR_ID, round(avg(DATEDIFF(END_DATE, START_DATE)+1), 1) as AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by CAR_ID
having AVERAGE_DURATION >=7
order by AVERAGE_DURATION desc, CAR_ID desc
