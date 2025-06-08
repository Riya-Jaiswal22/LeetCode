# Write your MySQL query statement below
select transaction_date, 
SUM(CASE WHEN amount%2<>0 then amount
WHEN amount%2=0 then 0 end) as odd_sum,
SUM(CASE WHEN amount%2=0 then amount
WHEN amount%2<>0 then 0 end) as even_sum 
from transactions
group by transaction_date
order by transaction_date;