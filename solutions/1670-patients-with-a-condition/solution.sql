# Write your MySQL query statement below

SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%'       -- starts with DIAB1
   OR conditions LIKE '% DIAB1%'     -- in middle
   OR conditions LIKE '% DIAB1';     -- at end

