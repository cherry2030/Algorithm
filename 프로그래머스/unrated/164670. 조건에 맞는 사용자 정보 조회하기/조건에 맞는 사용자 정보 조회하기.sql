-- 코드를 입력하세요
-- 중고 거래 게시물을 3건 이상 등록한 사용자
-- 전체 주소는 시, 도로명 주소, 상세 주소가 함께 출력
-- 전화번호의 경우 xxx-xxxx-xxxx 같은 형태로 하이픈 문자열(-)을 삽입하여 출력
-- 회원 ID를 기준으로 내림차순 정렬

SELECT U.USER_ID, U.NICKNAME, concat(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2) as 전체주소, 
concat(substr(TLNO,1,3), '-', substr(TLNO,4,4), '-', substr(TLNO,8,4)) as 전화번호
from USED_GOODS_BOARD B
join USED_GOODS_USER U on U.USER_ID = B.WRITER_ID
group by WRITER_ID
having count(*) >=3
order by U.USER_ID desc;