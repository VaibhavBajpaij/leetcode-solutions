# Write your MySQL query statement below
-- select  case
--         when (select count(*) from Employee)>=2
--         then max(salary)
--         else null
--         end
--         as SecondHighestSalary
-- from Employee
-- order by max(salary) desc
-- limit 1,1

SELECT IFNULL((
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
), NULL) AS SecondHighestSalary;


