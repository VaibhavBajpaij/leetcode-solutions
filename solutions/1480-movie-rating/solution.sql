

(select name as results from Users u join 
MovieRating mr on u.user_id=mr.user_id
group by u.user_id
order by count(mr.user_id) desc ,u.name asc
limit 1)

union all

(select title as result from Movies m join MovieRating mr
on m.movie_id=mr.movie_id
where month(created_at)='02' and year(created_at)='2020'
group by mr.movie_id
order by avg(rating) desc,title asc
limit 1)
