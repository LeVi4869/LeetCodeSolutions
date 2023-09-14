# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id AS unique_id,Employees.name AS name
FROM Employees LEFT JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id;