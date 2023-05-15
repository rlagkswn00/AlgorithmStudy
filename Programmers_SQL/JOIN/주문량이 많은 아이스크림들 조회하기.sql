--
-- Title: 주문량이 많은 아이스크림들 조회하기 
-- Date: 23.05.15
--

select a.FLAVOR
from FIRST_HALF as a join
(select FLAVOR, sum(TOTAL_ORDER) as TOTAL_ORDER from JULY group by FLAVOR) as b
on a.FLAVOR = b.FLAVOR
order by a.TOTAL_ORDER+b.TOTAL_ORDER desc
limit 3