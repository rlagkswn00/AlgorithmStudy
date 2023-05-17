--
-- Title: 조건에 맞는 도서와 저자 리스트 출력하기 
-- Date: 23.05.16
--

select a.BOOK_ID, b.AUTHOR_NAME, DATE_FORMAT(a.PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
from BOOK as a join AUTHOR as b
on a.AUTHOR_ID = b.AUTHOR_ID
where a.CATEGORY = '경제'
order by a.PUBLISHED_DATE asc