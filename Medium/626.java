# Write your MySQL query statement below
SELECT
    if(id < (select count(*) from seat), if(id mod 2=0, id-1, id+1), if(id mod 2=0, id-1, id)) as id, student
FROM seat
ORDER BY id;