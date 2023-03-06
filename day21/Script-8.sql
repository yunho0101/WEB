CREATE TABLE subject2 
(	강좌이름 varchar2(100),
	강의실 varchar2(100)
)
​
CREATE TABLE student_info
(	학생번호 integers,
	학생이름 varchar2(100),
	주소 varchar2(100),
	학과 varchar2(100)
)
​
CREATE TABLE "record"
(	학생번호 float,
	강좌이름 varchar2(100),
	성적 number(28,0)
)
​
CREATE TABLE department
(	학과 varchar2(100),
	학과사무실 varchar2(100)
)
​
INSERT INTO DEPARTMENT VALUES ('컴퓨터학과', '공학관101')
​
INSERT INTO DEPARTMENT VALUES ('체육학과', '체육관101')
​
INSERT INTO SUBJECT  VALUES ('데이터베이스', '공학관110')
​
INSERT INTO SUBJECT  VALUES ('스포츠경영학', '체육관103')
​
INSERT INTO SUBJECT  VALUES ('자료구조', '공학관111')
​
INSERT INTO STUDENT_INFORMATION VALUES (501, '박지성', '영국 멘체스터','컴퓨터학과')
​
INSERT INTO STUDENT_INFORMATION VALUES (401, '김연아', '대한민국 서울','컴퓨터학과')
​
INSERT INTO STUDENT_INFORMATION VALUES (402, '장미란', '대한민국 강원도','컴퓨터학과')
​
INSERT INTO STUDENT_INFORMATION VALUES (502, '추신수', '미국 클리블랜드','컴퓨터학과')
​
INSERT INTO RECORD VALUES (501, '데이터베이스', 3.5)
​
INSERT INTO RECORD VALUES (401, '데이터베이스', 4)
​
INSERT INTO RECORD VALUES (402, '스포츠경영학', 3.5)
​
INSERT INTO RECORD VALUES (502, '자료구조', 4)
​
INSERT INTO RECORD VALUES (501, '자료구조', 3.5)
​
SELECT * FROM DEPARTMENT d
​
SELECT * FROM SUBJECT s 
​
SELECT * FROM STUDENT_INFORMATION 
​
SELECT * FROM RECORD  
​
SELECT * 
FROM STUDENT_INFORMATION si , "RECORD" r 
WHERE(si.학생번호=R.학생번호)
​
SELECT * 
FROM  SUBJECT s, "RECORD" r 
WHERE(s.강좌이름=R.강좌이름)
​
UPDATE STUDENT_INFORMATION 
SET 주소 = '대한민국 대전'
WHERE 학생번호 = 501
​
INSERT INTO STUDENT_INFORMATION VALUES (503, '홍길동', '대한민국 부산','컴퓨터학과')
​
DELETE FROM "RECORD" WHERE 강좌이름='데이터베이스'
​
INSERT INTO RECORD VALUES (501, '데이터베이스', 3.5)