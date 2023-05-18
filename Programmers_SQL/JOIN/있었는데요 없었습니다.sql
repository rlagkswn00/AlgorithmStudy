--
-- Title: 있었는데요 없었습니다 
-- Date: 23.05.18
--
select a.ANIMAL_ID, a.NAME
from ANIMAL_INS as a join ANIMAL_OUTS as b
on a.ANIMAL_ID = b.ANIMAL_ID
where a.DATETIME > b.DATETIME
order by DATETIME asc