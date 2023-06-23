-- 코드를 입력하세요
-- '경제' 카테고리에 속하는 도서들
-- 출판일을 기준으로 오름차순 정렬
SELECT BOOK_ID, AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from BOOK b
join AUTHOR a
on b.AUTHOR_ID = a.AUTHOR_ID
where CATEGORY = '경제'
order by PUBLISHED_DATE;