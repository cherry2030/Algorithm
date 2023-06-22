-- 코드를 입력하세요
-- 2021 출판
-- 인문 카테고리
-- 출판일을 기준으로 오름차순 정렬
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
from BOOK
where YEAR(PUBLISHED_DATE) = 2021 and CATEGORY='인문'
order by PUBLISHED_DATE;