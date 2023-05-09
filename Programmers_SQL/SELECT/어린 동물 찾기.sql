--
-- Title: 어린 동물 찾기 
-- Date: 23.05.09
--
select ANIMAL_ID, NAME from ANIMAL_INS
where INTAKE_CONDITION not like 'Aged'
order by ANIMAL_ID