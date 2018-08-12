--0727
select * from emp;--数据源
--select * 查询所有列
--查询员工姓名，员工号
select empno,ename from emp;--投影查询,,可以展示顺序
--查询员工的所有信息
select * from emp;
--算数运算符:+ - * /;
--起别名：在所查列之后跟上新的字符
select ename,sal+300 from emp;
--输出员工的员工号，月薪和年薪
select empno,ename,sal "月薪",sal * 12 "年薪" from emp;
--员工试用期6个月，转正后月薪上调20%，请查询出所有员工工作第一年的所有收入（需考虑奖金部分)，要求显示列标题为员工姓名，工资收入，奖金收入，总收入。
select empno,ename,sal,sal * 6 + sal * 1.2 * 6 yearsal from emp;
--空值 null
--数值与空值相加，结果为null，与0相加，结果为正常数值。实际问题
--函数nvl（列名（空值），0）；--->oracle函数
select empno,ename,sal,comm,sal + comm from emp;
select empno,ename,sal,comm,sal + nvl(comm, 0) as "鬼扯" from emp;

select ename "员工姓名", sal * 6 + sal * 1.2 * 6 +  nvl(comm, 0)"总收入",nvl(comm, 0) "奖金", sal "工资收入" from emp;

--输出格式 姓名 --工作
--连接字符 “||”
select ename|| '_' || job from emp;

--输出格式 列名-名字
--单引号：原意字符
select 'ename - ' || ename from emp;

--distinct:去重
select distinct deptno from emp;

--
select ename || '的第一年总收入为' || ((sal * 6 )+( sal * 1.2 * 6) +  nvl(comm, 0)) as "显示效果" from emp;

--加限制条件：where
--查询部门编号为20的员工信息
select * from emp where deptno = 20;

--运算符：不等于（<>)

--日期格式：DD--MM--YYYY(中文)，取决于当前的系统环境

--1、
select empno,job,hiredate from emp where job='SALESMAN';

--特殊运算符：between   and; in(查询条件)
select * from emp where sal between 1000 and 2000;

--模糊查询：关键字like 通配符%（匹配0个到多个）  _(匹配一个）

--修改数据
select t.*,t.rowid from emp t; 

--查找SM
select * from emp where ename like 'SM_';
select * from emp where ename like 'SM@_%' escape '@';

-- is null判断是否为空 nvl()
select * from emp where comm is null;
select * from emp where comm = null;
select * from emp where comm = '';

--逻辑运算符
--or（或） and（与） not（非)

--10 或者 20 的员工姓名 
select * from emp where deptno = 10 or deptno = 20;

--1000 和 2000 的员工信息
select * from emp where sal >= 1000 and sal <= 2000;

--不是10 和 20 的
select * from emp where deptno not in(10， 20);

--1.查询工资超过2000并且职位是MANAGER,或者职位是SALESMAN的员工姓名、职位、工资
select ename,job,sal from emp where sal > 2000 and job = 'MANAGER' or job = 'SALESMAN';

--2.查询工资超过2000并且职位是 MANAGER或SALESMAN的员工姓名、职位、工资。
select ename, job, sal from emp where sal > 2000 and ( job = 'MANAGER' or job = 'SALESMAN');

--3.查询部门在10或者20，并且工资在3000到5000之间的员工姓名、部门、工资。
select ename, deptno, sal from emp where deptno in (10, 20) and sal between 3000 and 5000;

--4.查询入职日期在81年，并且职位不是SALES开头的员工姓名、入职日期、职位。
select ename, hiredate, job from emp where hiredate <= '31-12月-1981' and hiredate >= '1-1月-1981' and job not like 'SALES%';

--5.查询职位为SALESMAN或MANAGER，部门编号为10或者20，姓名包含A的员工姓名、职位、部门编号。
select ename, job, deptno from emp where job in ('SALESMAN', 'MANAGER') and deptno in (10, 20) and ename like '%A%'; 

--根据员工编号排序
--asc 升序（默认）； desc 降序
--空值在升序中排在最后，降序排在最前
--后接列名\表达式\列别名\列序号
SELECT * FROM EMP ORDER BY comm; 

--实际问题：解决空值当做0的排序问题
SELECT * FROM EMP ORDER BY nvl(comm, 0) asc;

--当order by有多个参数时，在前一个的基础上，对后一个进行排序

--1.查询部门在20或30的员工姓名，部门编号，并按照工资升序排序。
select ename, deptno from emp where deptno in (10, 20) order by sal;

--2.查询工资在2000-3000之间，部门不在10号的员工姓名，部门编号，工资，并按照部门升序，工资降序排序。
select ename, deptno, sal from emp where sal between 2000 and 3000 and deptno <> 10 order by deptno asc, sal desc; 

--3.查询入职日期在82年至83年之间，职位以SALES或者MAN开头的员工姓名，入职日期，职位，并按照入职日期降序排序。
select ename, hiredate, job from emp where hiredate between '1-1月-1981' and '31-12月-1987' and job like 'SALES%' or job like 'MAN%' order by hiredate DESC;


