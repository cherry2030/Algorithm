-- 코드를 입력하세요
-- 경기도에 위치한
-- 냉동시설 여부가 NULL인 경우, 'N'으로 출력
-- 창고 ID를 기준으로 오름차순 정렬

SELECT WAREHOUSE_ID,WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N') as FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS like '경기도%'
order by WAREHOUSE_ID;