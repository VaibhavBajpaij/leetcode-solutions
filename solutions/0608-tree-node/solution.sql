# Write your MySQL query statement below
select Id,
Case
    when p_id is null then 'Root'
    when id in (select distinct p_id from Tree  where p_id is not null) then 'Inner'
    else 'Leaf'
END
as type
from Tree

