--
-- Title: 5월 식품들의 총매출 조회하기 
-- Date: 23.05.15
--
SELECT a.PRODUCT_ID, PRODUCT_NAME,  sum(AMOUNT*PRICE) as TOTAL_SALES
FROM FOOD_PRODUCT as a join FOOD_ORDER as b
on a.PRODUCT_ID = b.PRODUCT_ID
where b.PRODUCE_DATE like '2022-05%'
group by PRODUCT_ID
order by TOTAL_SALES desc, a.PRODUCT_ID asc