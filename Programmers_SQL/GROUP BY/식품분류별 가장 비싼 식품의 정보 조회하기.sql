--
-- Title: 식품분류별 가장 비싼 식품의 정보 조회하기
-- Date: 23.05.13
--
select CATEGORY, PRICE as MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT
where PRICE in (select max(PRICE) from FOOD_PRODUCT group by CATEGORY)
and CATEGORY in ('식용유','과자','국','김치')
order by MAX_PRICE desc