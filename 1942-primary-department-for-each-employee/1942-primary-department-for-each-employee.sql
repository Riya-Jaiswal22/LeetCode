# Write your MySQL query statement below
select employee_id, department_id from Employee where primary_flag='Y' UNION ALL
select employee_id, department_id from Employee GROUP BY 1 having count(distinct department_id)=1;