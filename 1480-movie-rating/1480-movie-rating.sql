# Write your MySQL query statement below
(
  SELECT name AS results
  FROM Users u
  JOIN MovieRating r ON u.user_id = r.user_id
  GROUP BY u.user_id
  ORDER BY COUNT(*) DESC, u.name
  LIMIT 1
)
UNION ALL
(
  SELECT title AS results
  FROM Movies m
  JOIN MovieRating r ON m.movie_id = r.movie_id
  WHERE EXTRACT(YEAR_MONTH FROM r.created_at) = 202002
  GROUP BY m.movie_id
  ORDER BY AVG(r.rating) DESC, m.title
  LIMIT 1
);
