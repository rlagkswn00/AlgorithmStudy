--
-- Title: 흉부외과 또는 일반외과 의사 목록 출력하기
-- Date: 23.05.13
--
select DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD,"%Y-%m-%d") as HIRE_YMD
from DOCTOR
where MCDP_CD = 'CS' or MCDP_CD = 'GS'
order by HIRE_YMD desc, DR_NAME