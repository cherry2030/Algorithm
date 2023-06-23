-- 코드를 입력하세요
-- "상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별" -> group by 
-- 상품 개수를 출력
SELECT substr(PRODUCT_CODE, 1,2) as CATEGORY, count(*) as PRODUCTS
from PRODUCT
group by CATEGORY
order by CATEGORY

