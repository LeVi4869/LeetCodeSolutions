# Write your MySQL query statement below
SELECT Users.name AS NAME, SUM(Transactions.amount) AS BALANCE
FROM Users, Transactions
WHERE Users.account = Transactions.account
GROUP BY Users.name
HAVING SUM(Transactions.amount) > 10000;