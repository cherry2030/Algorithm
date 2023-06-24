-- 코드를 입력하세요
-- 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성
-- 시간대 순으로 정렬

set @hour := -1;

SELECT (@hour := @hour+1) as HOUR, (select count(*) from ANIMAL_OUTS where HOUR(DATETIME) = @hour) as COUNT
from ANIMAL_OUTS
WHERE @hour < 23