SELECT st.student_id,
       st.student_name,
       sb.subject_name,
       COUNT(Ex.subject_name) AS attended_exams
FROM Students st
CROSS JOIN Subjects sb
LEFT JOIN Examinations Ex
    ON st.student_id = Ex.student_id
   AND sb.subject_name = Ex.subject_name
GROUP BY st.student_id, st.student_name, sb.subject_name
ORDER BY st.student_id, st.student_name;

