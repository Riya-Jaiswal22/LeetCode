# Write your MySQL query statement below
select person_name from 
(select person_name, turn, sum(weight) over(order by turn) as cumulative_sum 
from Queue order by turn) as q2 
where cumulative_sum<=1000 
order by cumulative_sum DESC limit 1;