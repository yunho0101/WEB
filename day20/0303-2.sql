SELECT concat(CONCAT(empno, ':'), ENAME) AS concat_result FROM emp 

SELECT empno || ':' || ename AS concat_result FROM emp 

SELECT * FROM EMP

SELECT LENGTH(trim(ename)) FROM emp

SELECT LENGTH(ename) FROM emp

SELECT TRIM(BOTH 'A' from ename) FROM emp -- 양쪽끝에 A를 제거  

SELECT TRIM(LEADING 'A' from ename) FROM emp -- 앞쪽에 A를 제거
 
SELECT TRIM(TRAILING 'A' from ename) FROM emp  -- 뒷쪽에 A를 제거

select REPLACE(ENAME, ' ', '') from EMP

UPDATE EMP 
SET COMM = 0
WHERE COMM IS NULL

SELECT *
FROM EMP 

SELECT SAL + COMM AS total 
FROM EMP

SELECT *
FROM emp