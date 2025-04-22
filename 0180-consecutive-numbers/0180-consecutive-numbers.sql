# Write your MySQL query statement below
select distinct num as ConsecutiveNums from Logs L1 where 
num IN (select num from Logs L2 where L2.id = L1.id+1) AND
num IN (select num from Logs L3 where L3.id = L1.id+2);