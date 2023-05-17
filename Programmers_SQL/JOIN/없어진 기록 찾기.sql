--
-- Title: 없어진 기록 찾기 
-- Date: 23.05.17
--

select a.ANIMAL_ID, a.NAME
from ANIMAL_OUTS as a left outer join ANIMAL_INS as b
on a.ANIMAL_ID = b.ANIMAL_ID
where INTAKE_CONDITION is null