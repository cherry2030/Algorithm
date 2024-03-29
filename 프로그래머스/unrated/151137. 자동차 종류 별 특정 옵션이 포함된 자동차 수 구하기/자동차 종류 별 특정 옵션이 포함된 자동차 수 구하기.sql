-- 코드를 입력하세요
-- '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차가 "자동차 종류 별"로 몇 대
-- 자동차 종류를 기준으로 오름차순 정렬

SELECT CAR_TYPE, count(*) as CARS
from CAR_RENTAL_COMPANY_CAR C
where OPTIONS like '%통풍시트%' or OPTIONS like '%열선시트%' or OPTIONS like '%가죽시트%'
group by CAR_TYPE
order by CAR_TYPE;