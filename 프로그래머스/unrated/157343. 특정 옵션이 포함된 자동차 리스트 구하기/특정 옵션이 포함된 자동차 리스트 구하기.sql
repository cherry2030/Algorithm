-- 코드를 입력하세요
-- '네비게이션' 옵션이 포함된 자동차 리스트를 출력
-- 자동차 ID를 기준으로 내림차순

SELECT CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like '%네비게이션%'
order by CAR_ID desc
