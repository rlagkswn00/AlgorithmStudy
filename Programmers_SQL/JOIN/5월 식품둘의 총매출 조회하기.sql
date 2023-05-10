--
-- Title: 5월 식품들의 총매출 조회하기 
-- Date: 23.05.10
--
SELECT a.PRODUCT_ID, PRODUCT_NAME,  sum(AMOUNT*PRICE) as TOTAL_SALES
FROM FOOD_PRODUCT as a inner join FOOD_ORDER as b
on a.PRODUCT_ID = b.PRODUCT_ID
group by PRODUCT_ID
where PRODUCE_DATE like '2022-05%'
order by total desc, a.PRODUCT_ID desc