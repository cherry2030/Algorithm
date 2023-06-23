-- 코드를 입력하세요

-- 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문
-- 시간대 순으로 정렬

SELECT HOUR(DATETIME) as HOUR, count(HOUR(DATETIME)) as COUNT
from ANIMAL_OUTS
where HOUR(DATETIME) >= 9 and HOUR(DATETIME) <=19
group by HOUR(DATETIME)
order by HOUR