-- 코드를 입력하세요

SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
from DOCTOR
where MCDP_CD = 'CS' or MCDP_CD = 'GS'
order by HIRE_YMD DESC, DR_NAME;
-- 고용일자를 기준으로 내림차순, 고용일자가 같다면 이름을 기준으로 오름차순