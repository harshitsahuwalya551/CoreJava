

create database ineuron;

create table student(stu_id INT, stud_name VARCHAR(50),marks INT);

insert into student values(1, 'Harshit', 70);

select * from student;

insert into student values(2,'Harsh',45),(3,'Nagesh',46),(4,'Saksham',67);

select stud_name from student;

select stud_name from student where marks>50;

select marks from student;


select max(marks) from student;
select min(marks) from student;
select sum(marks) from student;
select avg(marks) from student;

select stud_name from student where marks=(select min(marks) from student);

---------------------------------->
update student set marks = 79 where stu_id = 1;
select * from student;

alter table student add tech VARCHAR(50);

update student set tech = 'JAVA';

update student set tech = 'Blockchain' where stu_id = 3;

delete student where stu_id = 3;

 
