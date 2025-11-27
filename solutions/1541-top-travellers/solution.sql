# Write your MySQL query statement below
select u.name ,
IFNULL(SUM(r.distance), 0) AS travelled_distance from Users u
left join Rides r
on r.user_id=u.id
group by name ,u.id
order by travelled_distance desc ,name asc

