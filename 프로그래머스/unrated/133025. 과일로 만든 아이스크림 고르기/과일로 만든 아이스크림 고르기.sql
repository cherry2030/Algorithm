-- 코드를 입력하세요
-- FIRST_HALF 테이블의 기본 키는 FLAVOR입니다
-- ICECREAM_INFO의 기본 키는 FLAVOR
-- ICECREAM_INFO 테이블의 FLAVOR는 FIRST_HALF 테이블의 FLAVOR의 외래 키입니다.

-- 총주문량이 3,000보다 높으면서 => TOTAL_ORDER>=3000
-- 아이스크림의 주 성분이 과일인 아이스크림의 맛 => INGREDIENT_TYPE='fruit_based'
-- 총주문량이 큰 순서대로 조회 => order by TOTAL_ORDER desc

SELECT A.FLAVOR
from FIRST_HALF A
inner join ICECREAM_INFO B
on A.FLAVOR = B.FLAVOR
where A.TOTAL_ORDER>=3000 and B.INGREDIENT_TYPE='fruit_based'
order by A.TOTAL_ORDER DESC;
