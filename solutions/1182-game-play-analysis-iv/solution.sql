# Write your MySQL query statement below
select Round(count(distinct player_id)/(select count(distinct player_id) from Activity),2) as fraction
from Activity 
where (player_id,(date_sub(event_date,Interval 1 day))) in
(SELECT 
    player_id ,min(event_date) from Activity 
    group by player_id)

