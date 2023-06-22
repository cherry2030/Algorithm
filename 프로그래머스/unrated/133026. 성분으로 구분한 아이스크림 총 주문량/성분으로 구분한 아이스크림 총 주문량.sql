-- 코드를 입력하세요
-- 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량
-- 총주문량이 작은 순서대로 조회

SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF A
inner join ICECREAM_INFO B
on A.FLAVOR = B.FLAVOR
group by INGREDIENT_TYPE
order by sum(TOTAL_ORDER)
