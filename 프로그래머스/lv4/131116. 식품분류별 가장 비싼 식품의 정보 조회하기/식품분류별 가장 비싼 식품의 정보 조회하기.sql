-- 코드를 입력하세요
-- "식품분류별"로 "가격이 제일 비싼 식품"의 분류, 가격, 이름을 조회하는 SQL문
-- 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력
-- 결과는 식품 가격을 기준으로 내림차순 정렬

SELECT CATEGORY, price as MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT
where (CATEGORY, price) in (select CATEGORY, max(price) from FOOD_PRODUCT
                            where CATEGORY in ('과자', '국', '김치','식용유')
                            group by CATEGORY
                            )
order by MAX_PRICE desc;
