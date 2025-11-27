# Write your MySQL query statement below
select * from (
select employee_id
from Employees
where name is NULL 
or employee_id not in (
    select employee_id from Salaries 

)
union
select employee_id 
from Salaries
where employee_id
not in(
    select employee_id from Employees
)
) as t
order by employee_id asc

