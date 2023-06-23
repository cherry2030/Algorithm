-- 코드를 입력하세요

-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회
-- JULY가 외래키
-- 7월에는 같은 아이스크림에 대하여 서로 다른 두 공장에서 아이스크림 가게로 출하를 진행하는 경우가 있습니다. 이 경우 같은 맛의 아이스크림이라도 다른 출하 번호를 갖게 됩니다.

SELECT F.FLAVOR
from FIRST_HALF F
join (select FLAVOR, sum(TOTAL_ORDER) as sum from JULY group by FLAVOR) as J
on F.FLAVOR = J.FLAVOR
group by F.FLAVOR
order by sum(F.TOTAL_ORDER + J.sum) desc
limit 3