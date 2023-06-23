-- 코드를 입력하세요
-- 2021년에 가입한 회원
-- 나이가 20세 이상 29세 이하인 회원이 몇명인지
SELECT count(*) as USERS from USER_INFO
where YEAR(JOINED) = 2021 and AGE >= 20 and AGE <= 29
