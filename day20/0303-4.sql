-- join: 왜 하는가? 검색을 하고 싶은데 항목들이 여러개의 테이블에 흩어져있는 경우
--      테이블을 모아서(합해서) 검색
-- 2개의 테이블의 공통된 값들만 조인해서 검색 

SELECT *
FROM "MEMBER" m , BBS b 
WHERE m.ID = b.WRITER 

SELECT b."no", b.title, NAME 
FROM "MEMBER" m , BBS b 
WHERE m.ID = b.WRITER 


---- Inner join: 테이블간 공통된 값만 추출
---- emp테이블과 dept테이블을 조인하세요.
---- 하나의 컬럼이상이 동일한 컬럼이 있어야 함.
---- empno, ename, job, deptno, loc 컬럼 검색
---- 조인조건: deptno

SELECT e.EMPNO, e.ENAME, e.JOB, d.DEPTNO, d.LOC 
FROM DEPT d, EMP e 
WHERE d.DEPTNO = e.DEPTNO 

SELECT *
FROM "MEMBER" m 
LEFT OUTER JOIN BBS b 
on (m.ID = b.WRITER) 

SELECT *
FROM "MEMBER" m 
RIGHT OUTER JOIN BBS b 
on (m.ID = b.WRITER)

-- left/right outer join

1. emp테이블의 정보는 다보이게 하고 싶음. dept는 맞는 것만 오른쪽에 붙여주고 싶음.

SELECT *
FROM EMP e 
LEFT OUTER JOIN DEPT d 
ON (e.DEPTNO = d.DEPTNO)

2. dept테이블의 정보는 다보이게 하고 싶음. emp는 맞는 것만 오른쪽에 붙여주고 싶음.

SELECT *
FROM EMP e 
RIGHT OUTER JOIN DEPT d 
ON (e.DEPTNO = d.DEPTNO)

-- inner join

SELECT *
FROM "MEMBER" m, BBS b 
WHERE m.ID = b.WRITER 

-- outer join(left, right)

SELECT m.ID, m.NAME, b.TITLE, b.CONTENT 
FROM "MEMBER" m 
LEFT OUTER JOIN BBS b
ON (m.ID = b.WRITER)

SELECT m.ID, m.NAME, b.TITLE, b.CONTENT 
FROM "MEMBER" m 
RIGHT OUTER JOIN BBS b
ON (m.ID = b.WRITER)

CREATE TABLE company (
	id varchar2(200) primary key,
	name varchar2(200),
	addr varchar2(200),
	tel varchar2(200)
)

INSERT INTO company VALUES ('c100', 'good', 'seoul', '011')

INSERT INTO company VALUES ('c200', 'joa', 'busan', '012')

INSERT INTO company VALUES ('c300', 'maria', 'ulsan', '013')

INSERT INTO company VALUES ('c400', 'my', 'kwangju', '014')

SELECT * FROM company