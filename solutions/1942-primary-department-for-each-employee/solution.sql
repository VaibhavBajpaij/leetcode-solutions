-- Get primary employees OR those who belong to only one department
SELECT employee_id, department_id
FROM Employee
WHERE primary_flag = 'Y'

UNION

SELECT employee_id, department_id
FROM Employee e
WHERE primary_flag = 'N'
  AND (SELECT COUNT(*) 
       FROM Employee 
       WHERE employee_id = e.employee_id) = 1;

