--
-- Title: 조건에 맞는 도서 리스트 출력하기 
-- Date: 23.05.22
--
select BOOK_ID, DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
from BOOK
where PUBLISHED_DATE like '2021%'
and CATEGORY = '인문'
order by PUBLISHED_DATE asc