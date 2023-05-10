--
-- Title: 조건에 부합하는 중고거래 댓글 조회하기 
-- Date: 23.05.10
--

select a.TITLE, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, DATE_FORMAT(b.CREATED_DATE,'%Y-%m-%d') as CREATED_DATE
from USED_GOODS_BOARD as a inner join USED_GOODS_REPLY as b on a.BOARD_ID = b.BOARD_ID
where a.CREATED_DATE like '2022-10%'
order by b.CREATED_DATE asc, a.TITLE asc