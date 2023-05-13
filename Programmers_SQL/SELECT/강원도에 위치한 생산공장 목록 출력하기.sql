--
-- Title: 강원도에 위치한 생산공장 목록 출력하기 
-- Date: 23.05.13
--
select FACTORY_ID, FACTORY_NAME, ADDRESS
from FOOD_FACTORY
where ADDRESS like '강원도%'
order by FACTORY_ID