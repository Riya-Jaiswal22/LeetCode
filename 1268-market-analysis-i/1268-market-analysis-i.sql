# Write your MySQL query statement below
select u.user_id as buyer_id, u.join_date as join_date, IFNULL(count(order_id),0) as orders_in_2019
from Users u left join Orders o
on o.buyer_id = u.user_id
and YEAR(order_date)='2019'
group by 1;