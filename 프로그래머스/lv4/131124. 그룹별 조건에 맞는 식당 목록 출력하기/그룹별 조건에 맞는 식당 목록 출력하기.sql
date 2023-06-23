-- 코드를 입력하세요
-- 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회하는 SQL문
-- 결과는 리뷰 작성일을 기준으로 오름차순, 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순 정렬

SELECT MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
from REST_REVIEW r
left outer join MEMBER_PROFILE m
on r.MEMBER_ID = m.MEMBER_ID
where r.MEMBER_ID = (select MEMBER_ID 
                     from REST_REVIEW 
                     group by MEMBER_ID
                     order by count(MEMBER_ID) desc
                     limit 1
                    )
order by r.REVIEW_DATE, REVIEW_TEXT