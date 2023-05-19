--
-- Title: 보호소에서 중성화한 동물 
-- Date: 23.05.19
--
select a.ANIMAL_ID, a.ANIMAL_TYPE, a.NAME
from ANIMAL_INS as a join(
select ANIMAL_ID from ANIMAL_OUTS 
where SEX_UPON_OUTCOME like 'Spayed%' or SEX_UPON_OUTCOME like 'Neutered%') as b
on a.ANIMAL_ID = b.ANIMAL_ID
where a.SEX_UPON_INTAKE like 'Intact%'
order by a.ANIMAL_ID