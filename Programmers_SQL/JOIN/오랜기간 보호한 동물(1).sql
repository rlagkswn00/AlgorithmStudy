--
-- Title: 오랜기간 보호한 동물(1) 
-- Date: 23.05.18
--
select a.NAME, a.DATETIME
from ANIMAL_INS as a left outer join ANIMAL_OUTS as b
on a.ANIMAL_ID = b.ANIMAL_ID
where b.DATETIME is NULL
order by a.DATETIME asc
limit 3