-- 코드를 입력하세요
-- 대여 시작일이 2022년 9월
-- 대여 기간이 30일 이상이면 '장기 대여' 그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: RENT_TYPE)을 추가하여 대여기록을 출력하는 SQL문
-- 대여 기록 ID를 기준으로 내림차순 정렬해주세요.
SELECT HISTORY_ID, CAR_ID, DATE_FORMAT(START_DATE, '%Y-%m-%d') as START_DATE, 
    DATE_FORMAT(END_DATE, '%Y-%m-%d') as END_DATE,
    IF(DATEDIFF(END_DATE, START_DATE)+1 >=30, '장기 대여', '단기 대여') as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where YEAR(START_DATE) = 2022 and MONTH(START_DATE) = 9
order by HISTORY_ID desc