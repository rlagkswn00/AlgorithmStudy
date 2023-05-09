--
-- Title: 아픈 동물 찾기 
-- Date: 23.05.09
--

select ANIMAL_ID, NAME from ANIMAL_INS
where INTAKE_CONDITION like 'sick'
order by ANIMAL_ID