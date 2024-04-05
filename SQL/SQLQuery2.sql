
create table course(c_id int, c_name varchar(20), mentor varchar(20), duration int,primary key(c_id));

create table student1(s_id int, s_name varchar(20),c_id int,assigns int,primary key(s_id),foreign key(c_id) references course(c_id));

insert into course values(101, 'Java', 'Nitin', 8), (102, 'JS', 'Haider', 6), (103, 'DS', 'Krish' , 6);

insert into student1 values(1, 'Mohit', 101 , 3);
insert into student1 values(2, 'Shivani', 102 , 6);
insert into student1 values(3, 'Kishan', 101 , 4), (4, 'GRS', 102, 7);

select * from student1;
select * from course;

select s_name from student1 where c_id = (Select c_id from course where c_name = 'Java');

select * from student1 where c_id in (select c_id from course where c_name like 'J%');

select * from student1 order by s_name desc;

select s_name, c_name 
from student1 s, course c
where s.c_id = c.c_id;




