--0727
select * from emp;--����Դ
--select * ��ѯ������
--��ѯԱ��������Ա����
select empno,ename from emp;--ͶӰ��ѯ,,����չʾ˳��
--��ѯԱ����������Ϣ
select * from emp;
--���������:+ - * /;
--���������������֮������µ��ַ�
select ename,sal+300 from emp;
--���Ա����Ա���ţ���н����н
select empno,ename,sal "��н",sal * 12 "��н" from emp;
--Ա��������6���£�ת������н�ϵ�20%�����ѯ������Ա��������һ����������루�迼�ǽ��𲿷�)��Ҫ����ʾ�б���ΪԱ���������������룬�������룬�����롣
select empno,ename,sal,sal * 6 + sal * 1.2 * 6 yearsal from emp;
--��ֵ null
--��ֵ���ֵ��ӣ����Ϊnull����0��ӣ����Ϊ������ֵ��ʵ������
--����nvl����������ֵ����0����--->oracle����
select empno,ename,sal,comm,sal + comm from emp;
select empno,ename,sal,comm,sal + nvl(comm, 0) as "��" from emp;

select ename "Ա������", sal * 6 + sal * 1.2 * 6 +  nvl(comm, 0)"������",nvl(comm, 0) "����", sal "��������" from emp;

--�����ʽ ���� --����
--�����ַ� ��||��
select ename|| '_' || job from emp;

--�����ʽ ����-����
--�����ţ�ԭ���ַ�
select 'ename - ' || ename from emp;

--distinct:ȥ��
select distinct deptno from emp;

--
select ename || '�ĵ�һ��������Ϊ' || ((sal * 6 )+( sal * 1.2 * 6) +  nvl(comm, 0)) as "��ʾЧ��" from emp;

--������������where
--��ѯ���ű��Ϊ20��Ա����Ϣ
select * from emp where deptno = 20;

--������������ڣ�<>)

--���ڸ�ʽ��DD--MM--YYYY(����)��ȡ���ڵ�ǰ��ϵͳ����

--1��
select empno,job,hiredate from emp where job='SALESMAN';

--�����������between   and; in(��ѯ����)
select * from emp where sal between 1000 and 2000;

--ģ����ѯ���ؼ���like ͨ���%��ƥ��0���������  _(ƥ��һ����

--�޸�����
select t.*,t.rowid from emp t; 

--����SM
select * from emp where ename like 'SM_';
select * from emp where ename like 'SM@_%' escape '@';

-- is null�ж��Ƿ�Ϊ�� nvl()
select * from emp where comm is null;
select * from emp where comm = null;
select * from emp where comm = '';

--�߼������
--or���� and���룩 not����)

--10 ���� 20 ��Ա������ 
select * from emp where deptno = 10 or deptno = 20;

--1000 �� 2000 ��Ա����Ϣ
select * from emp where sal >= 1000 and sal <= 2000;

--����10 �� 20 ��
select * from emp where deptno not in(10�� 20);

--1.��ѯ���ʳ���2000����ְλ��MANAGER,����ְλ��SALESMAN��Ա��������ְλ������
select ename,job,sal from emp where sal > 2000 and job = 'MANAGER' or job = 'SALESMAN';

--2.��ѯ���ʳ���2000����ְλ�� MANAGER��SALESMAN��Ա��������ְλ�����ʡ�
select ename, job, sal from emp where sal > 2000 and ( job = 'MANAGER' or job = 'SALESMAN');

--3.��ѯ������10����20�����ҹ�����3000��5000֮���Ա�����������š����ʡ�
select ename, deptno, sal from emp where deptno in (10, 20) and sal between 3000 and 5000;

--4.��ѯ��ְ������81�꣬����ְλ����SALES��ͷ��Ա����������ְ���ڡ�ְλ��
select ename, hiredate, job from emp where hiredate <= '31-12��-1981' and hiredate >= '1-1��-1981' and job not like 'SALES%';

--5.��ѯְλΪSALESMAN��MANAGER�����ű��Ϊ10����20����������A��Ա��������ְλ�����ű�š�
select ename, job, deptno from emp where job in ('SALESMAN', 'MANAGER') and deptno in (10, 20) and ename like '%A%'; 

--����Ա���������
--asc ����Ĭ�ϣ��� desc ����
--��ֵ��������������󣬽���������ǰ
--�������\���ʽ\�б���\�����
SELECT * FROM EMP ORDER BY comm; 

--ʵ�����⣺�����ֵ����0����������
SELECT * FROM EMP ORDER BY nvl(comm, 0) asc;

--��order by�ж������ʱ����ǰһ���Ļ����ϣ��Ժ�һ����������

--1.��ѯ������20��30��Ա�����������ű�ţ������չ�����������
select ename, deptno from emp where deptno in (10, 20) order by sal;

--2.��ѯ������2000-3000֮�䣬���Ų���10�ŵ�Ա�����������ű�ţ����ʣ������ղ������򣬹��ʽ�������
select ename, deptno, sal from emp where sal between 2000 and 3000 and deptno <> 10 order by deptno asc, sal desc; 

--3.��ѯ��ְ������82����83��֮�䣬ְλ��SALES����MAN��ͷ��Ա����������ְ���ڣ�ְλ����������ְ���ڽ�������
select ename, hiredate, job from emp where hiredate between '1-1��-1981' and '31-12��-1987' and job like 'SALES%' or job like 'MAN%' order by hiredate DESC;


