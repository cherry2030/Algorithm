-- 코드를 입력하세요
-- 2022년 4월 13일 /취소되지 않은 /흉부외과(CS) 진료 예약 내역
-- 진료예약일시를 기준으로 오름차순 정렬

SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, A.MCDP_CD, D.DR_NAME, A.APNT_YMD
from APPOINTMENT A
join PATIENT P on P.PT_NO = A.PT_NO
join DOCTOR D on D.DR_ID = A.MDDR_ID
where A.APNT_YMD like '2022-04-13%'
and A.MCDP_CD = 'CS'
and A.APNT_CNCL_YN = 'N'
order by APNT_YMD