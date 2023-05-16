--
-- Title: 그룹별 조건에 맞는 식당 출력하기 
-- Date: 23.05.16
--
select b.MEMBER_NAME, a.REVIEW_TEXT, DATE_FORMAT(a.REVIEW_DATE,'%Y-%m-%d')
from REST_REVIEW as a
join (
    select n.MEMBER_ID, m.MEMBER_NAME, rank() over(order by CNT DESC) as ranking
    from (
        select *, count(MEMBER_ID) as CNT
        from REST_REVIEW
        group by MEMBER_ID) as n
    join MEMBER_PROFILE m on n.MEMBER_ID = m.MEMBER_ID) as b
on a.MEMBER_ID = b.MEMBER_ID
where b.RANKING = 1
order by a.REVIEW_DATE
