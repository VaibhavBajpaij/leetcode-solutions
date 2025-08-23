-- For each query_name:
-- quality = average of (rating / position)
-- poor_query_percentage = 100 * (rows with rating < 3) / total rows
SELECT
    query_name,
    ROUND(AVG(rating / position), 2)            AS quality,
    ROUND(100 * SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) / COUNT(*), 2)
                                                AS poor_query_percentage
FROM Queries
GROUP BY query_name;

