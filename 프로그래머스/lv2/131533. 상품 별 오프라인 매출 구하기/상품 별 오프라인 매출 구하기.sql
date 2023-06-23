-- 코드를 입력하세요
-- 상품코드 별 매출액(판매가 * 판매량) 합계를 출력
-- 매출액을 기준으로 내림차순 정렬, 매출액이 같다면 상품코드를 기준으로 오름차순 정렬

SELECT PRODUCT_CODE, sum(SALES_AMOUNT)*PRICE as SALES
from OFFLINE_SALE s
join PRODUCT p
on s.PRODUCT_ID = p.PRODUCT_ID
group by PRODUCT_CODE
order by SALES desc, PRODUCT_CODE