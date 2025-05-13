# Write your MySQL query statement below
select product_name, sum(unit) as unit from 
Products p JOIN Orders o 
ON p.product_id = o.product_id 
where EXTRACT(YEAR_MONTH FROM o.order_date)=202002
group by product_name
having sum(unit)>=100;