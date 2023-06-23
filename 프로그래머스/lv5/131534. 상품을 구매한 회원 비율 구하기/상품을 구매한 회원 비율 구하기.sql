-- 코드를 입력하세요
-- 2021년에 가입한 전체 회원들 중
-- 상품을 구매한 회원수와 상품을 구매한 회원의 비율(=2021년에 가입한 회원 중 상품을 구매한 회원수 / 2021년에 가입한 전체 회원 수)을 년, 월 별로 출력
-- 상품을 구매한 회원의 비율은 소수점 두번째자리에서 반올림
-- 전체 결과는 년을 기준으로 오름차순 정렬해주시고 년이 같다면 월을 기준으로 오름차순 정렬

SELECT YEAR(SALES_DATE) as YEAR, MONTH(SALES_DATE) as MONTH, 
    count(distinct S.USER_ID) as PUCHASED_USERS, 
    ROUND(count(distinct S.USER_ID)/(select count(*) from USER_INFO where YEAR(JOINED) = 2021), 1) as PUCHASED_RATIO
from ONLINE_SALE S
join USER_INFO I
on S.USER_ID = I.USER_ID
where YEAR(JOINED) = 2021
group by YEAR(SALES_DATE), MONTH(SALES_DATE)
order by YEAR, MONTH