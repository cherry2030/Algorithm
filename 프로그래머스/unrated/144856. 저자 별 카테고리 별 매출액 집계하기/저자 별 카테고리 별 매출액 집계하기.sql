-- 코드를 입력하세요
-- 2022년 1월의 도서 판매 데이터를 기준으로
-- "저자 별, 카테고리 별" 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여
-- 결과는 저자 ID를 오름차순으로, 카테고리를 내림차순 정렬

SELECT A.AUTHOR_ID, AUTHOR_NAME, CATEGORY, sum(PRICE * SALES) as TOTAL_SALES
from BOOK_SALES S
join BOOK B on B.BOOK_ID = S.BOOK_ID
join AUTHOR A on A.AUTHOR_ID = B.AUTHOR_ID
where YEAR(SALES_DATE) = 2022 and MONTH(SALES_DATE) = 01
group by A.AUTHOR_ID, AUTHOR_NAME, CATEGORY
order by B.AUTHOR_ID, CATEGORY desc
