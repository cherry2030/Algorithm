-- 코드를 입력하세요
-- "음식종류별"로 즐겨찾기수가 가장 많은 식당
-- 음식 종류를 기준으로 내림차순 정렬

SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from REST_INFO
where (FOOD_TYPE, FAVORITES) in (select FOOD_TYPE, max(FAVORITES) from REST_INFO
                                group by FOOD_TYPE
                                )
order by FOOD_TYPE desc