-- 코드를 입력하세요
-- 생산일자가 2022년 5월인
-- 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬

SELECT O.PRODUCT_ID, PRODUCT_NAME, sum(O.AMOUNT * P.PRICE) as TOTAL_SALES
from FOOD_ORDER O
join FOOD_PRODUCT P
on O.PRODUCT_ID = P.PRODUCT_ID
where YEAR(PRODUCE_DATE) = 2022 and MONTH(PRODUCE_DATE) = 05
group by PRODUCT_ID
order by TOTAL_SALES desc, O.PRODUCT_ID