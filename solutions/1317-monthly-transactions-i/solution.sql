# Write your MySQL query statement below
select CONCAT(YEAR(trans_date), '-', LPAD(MONTH(trans_date), 2, '0')) AS month
 ,country,count(state) as trans_count,
   SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) AS approved_count,
   sum(amount) as trans_total_amount,
   sum(case when state='approved' then amount else 0 END) as approved_total_amount
from Transactions
group by month,country
