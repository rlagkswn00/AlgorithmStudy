--
-- Title: 상품 별 오프라인 매출 구하기 
-- Date: 23.05.19
--
select a.PRODUCT_CODE, sum(AMOUNT * PRICE) as SALES
from PRODUCT as a JOIN (
select PRODUCT_ID, sum(SALES_AMOUNT) as AMOUNT from OFFLINE_SALE group by PRODUCT_ID) as b
on a.PRODUCT_ID = b.PRODUCT_ID
group by a.PRODUCT_ID
order by SALES desc, a.PRODUCT_CODE