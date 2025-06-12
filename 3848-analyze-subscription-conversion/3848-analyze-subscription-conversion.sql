SELECT 
    ua.user_id,
    ROUND(AVG(CASE WHEN ua.activity_type = 'free_trial' THEN ua.activity_duration END),2) AS trial_avg_duration,
    ROUND(AVG(CASE WHEN ua.activity_type = 'paid' THEN ua.activity_duration END),2) AS paid_avg_duration
FROM UserActivity ua
WHERE ua.user_id IN (
    SELECT user_id
    FROM UserActivity
    WHERE activity_type IN ('free_trial', 'paid')
    GROUP BY user_id
    HAVING COUNT(DISTINCT activity_type) = 2
)
GROUP BY ua.user_id
ORDER BY ua.user_id;