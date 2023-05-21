--
-- Title: 인기있는 아이스크림 
-- Date: 23.05.21
--
select flavor
from FIRST_HALF
order by TOTAL_ORDER desc, SHIPMENT_ID asc