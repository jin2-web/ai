select  24*60 as ���  from dual ;

select  * from dual; -- dual ����Ŭ�� �����ϴ� ���̺�  �뵵 ����

select  sign( 10 ) from dual ;
select  round( 3.456, 2 ) from dual ; 
select trunc( 5354.4567, -2 ) from dual ; --  -�̸� �Ҽ����ڸ����� ������ 2ĭ���� �޺κ� �ڸ���
select trunc( 5354.4567, 2 ) from dual ;
select mod( 25, 4 ) from dual ;  --  25 % 4 ������

select * from student;

select     upper( stu_email )       from student;
select     lower( stu_email ), initcap( stu_email),  upper( stu_email)        from student;

select  length('oracle'), length('����Ŭ') from dual ;
select  lengthb('oracle'), lengthb('����Ŭ') from dual ;

-- substr(  ���, ������ġ, ������ ���� )
select substr('Welcome to Oracle', 9, 2 )  from dual ; -- ù ��ġ�� 1�� ���� 

-- �������� �̸����� �պκ��� �����ϱ� ��� moon
select  substr(  stu_email,  1, 4 ) from student  where  stu_name = '������' ;

-- stu_id�� 101~110������ ������� �̸����� �� �޺κ� �� com�� �����ϱ�
select    substr(  stu_email,  -3, 3 )     from   student   where stu_id   between 101 and 110 ;    --  -3�� �ڿ������� 3��° 

-- instr( ���, ã�¹��� )  ��󿡼� ã�¹����� ��ġ�� ���ڷ� ��ȯ��
select instr('Welcome to Oracle', 'e' )  from dual ; -- ���� �տ����� 'e'�� ã�� �ش�. 2��° �ִ�

-- instr( ���, ã�¹���, ������ġ )  ��󿡼� ã�¹����� ��ġ�� ���ڷ� ��ȯ��
select instr('Welcome to Oracle', 'e', 3 )  from dual ;  -- ������ġ���� 'e'�� ã�� �ش�. 7��° �ִ�

-- instr( ���, ã�¹���, ������ġ, ���°�߰� )  ��󿡼� ã�¹����� ��ġ�� ���ڷ� ��ȯ��
select instr('Welcome to Oracle', 'e', 3, 2)  from dual ;  -- ������ġ���� 'e'�� ã�µ� 2��° �߰��� ��. 17��° �ִ�


select * from student;
-- ��� �л��� �̸����� @��ġ�˱�
select     instr(stu_email, '@' )  from student ; 

-- ��� �л��� id�� ���ϱ�  ��� moon five again cook ...
select      substr(  stu_email, 1,   instr(stu_email, '@' )-1   )  id  from student;

-- LPAD  left padding
-- RPAD right padding
select  lpad('oracle', 20, '#') from  dual ;
select  rpad('oracle', 20, '#') from  dual ;


select  lpad('oracle', 20, '#') from  dual ;
select  rpad('oracle', 20, '#') from  dual ;

select * from emp;
select lpad( job, 10, ' ' ) from emp ; 


-- 3. ����ȯ�Լ�
-- to_char()   to_date()  to_number()

-- ���� �ð��� �����ش�
select sysdate from dual;

select sysdate,  to_char( sysdate, 'YYYY-MM-DD Day am hh:mi:ss') from dual ;
select * from emp;
select hiredate, to_char( hiredate, 'yyyy-mm-dd dy' ) from emp;

select to_char( 12345678,  '000,000,000') from dual ; -- 012,345,678
select to_char( 12345678,  '000,000') from dual ; -- #���� ä��� ����

select to_char( 12345678,  '999,999,999') from dual ; -- ����12,345,678
select to_char( 12345678,  '999,999') from dual ; -- #���� ä��� ����

select to_char( 12345678,  'L999,999,999') from dual ; -- ��ȭ��ȣ12,345,678

-- to_date() ��¥������ �ٲٱ� ****
-- ����Ŭ���� �⺻��¥���� 'mm/dd/yy' 
-- to_date( '����', '����')  ���ڰ� ������ �ٲ� ��¥���� �ȴ�
-- to_date( ����, '����')  ���ڰ� ������ �ٲ� ��¥���� �ȴ�
select * from emp;
-- select * from emp where hiredate = 20070402 ;  ���� �߻� 

select * from emp where hiredate =  to_date(20070402, 'yyyymmdd')  ;
select * from emp where hiredate =  to_date('20070402', 'yyyymmdd')  ;

-- ���ó�¥ - Ư���� ���ϱ�

-- select sysdate - '2023/04/14' from dual; �����߻�
select  trunc( sysdate - to_date( 20230414, 'yyyymmdd') ,  0  )   from dual; 

select * from emp;
-- �ȼ��� �Ի��� - ���� �Ի��� ����
select  to_date('20070321', 'yyyymmdd')  - to_date('20070310', 'yyyymmdd')  from dual ;

-- to_number( ',�� �ִ� ����', '����') 
select to_number('20,000', '99,999') -  to_number('10,000','99,999' ) from dual ;

select '20000' - '10000' from dual ;

-- ��¥�Լ�
-- ���� ���� ����
select  sysdate - 1 ����, sysdate ����,  sysdate + 1  ���� from dual ;

select  to_char( sysdate - 1, 'yyyy-mm-dd day')  ����,   sysdate ����,    sysdate + 1  ���� from dual ;

-- months_between
select months_between( sysdate,  '2023/12/04')  from dual ;
select add_months(  '2023/10/01', 10 ) from dual;
select round( to_date('20/07/17', 'yy/mm/dd') ,  'month') from dual;

select   hiredate, trunc(hiredate, 'month')      from emp;

-- �Ի���, ���� ��¥, �ټӳ�, �ټӿ�, �ټ���
select ename �����, sysdate ������, hiredate �Ի���,
trunc(months_between(sysdate, hiredate)/12, 0) �ٹ���� ,
trunc(months_between(sysdate, hiredate), 0) �ٹ��޼� ,
trunc(months_between(sysdate, hiredate), 0)*30 �ٹ��ϼ� from emp;

-- ���� ��¥�� �������� ���ʷ� �����ϴ� �������� ��¥��?
select to_char(next_day(sysdate,'��'),'yy/mm/dd') from dual;

select last_day ('24/01/01') from dual;

select *from emp;

select empno �����ȣ,  last_day (sysdate) �޿��� from  emp;

select *from emp;
select comm, nvl(comm,0) from emp;


select * from emp;


-- nvl( comm, 0)
select   *  from   emp   where  hiredate is null ;

-- �Ի����� null�̸� ���ó�¥ �־��ֱ�
select  hiredate, nvl(  hiredate, sysdate )  from emp where  hiredate is null ;

select  hiredate, nvl(  hiredate, sysdate )  from emp  ; 

-- �̸��� null �̸� '����' job null�̸� '���' �־��ֱ�
select  empno, nvl( ename, '����'),  nvl( job, '���' ) from emp ; 


-- nvl2(  ��1, ��2, ��3 )  ���࿡ ��1�� null�� �ƴϸ� ��2�� ��ȯ�ϰ� null �̸� ��3�� ��ȯ�Ѵ�
-- ��) ��������ϱ�,   comm�� null �ƴ� ��� sal * 12 + comm, comm�� null�� ��� sal * 12

select * from emp;   
select ename, sal,  nvl2(  comm,  sal * 12 + comm,  sal * 12 ) ����  from  emp;


-- coalesce( ��1, ��2, ..., ��n) 
--  ��1�� null�� �ƴϸ� ��1�� ���, ��2�� null�� �ƴϸ� ��2 ����ϰ�, ��� �� null �̸� ��n ����ϱ�
-- ��) ��� ���̺��� Ŀ�̼��� null �� �ƴϸ� Ŀ�̼��� ����ϰ�, Ŀ�̼��� null�̰� �޿��� null�� �ƴϸ� �޿��� ����ϰ� 
--      ���� Ŀ�̼ǰ� �޿��� ��� null �̸� 0�� ����ϱ�

-- �޿��� null �ڷ� �����ϱ�
insert  into  emp   values( 1019, null, '�븮', 1003, sysdate, null, null, 20 );
insert  into  emp   values( 1020, null, '�븮', 1003, sysdate, null, 100, 20 );

select   comm, sal,  coalesce(  comm, sal,  0 ) from emp ;

-- ������ ���� decode �Լ� ( switch~case���� �����)
/* decode ( ǥ����, ����1, ���1, 
                              ����2, ���2,
                              ����3, ���3,
                              �⺻���n
*/
-- ��) deptno�� 10�̸� '�渮��', 20�̸� �λ�� 30�̸� ������ 40�̸� ����η� ����ϱ�
select  * from emp ;

select  deptno,   decode(  deptno, 10, '�渮��',
                                                         20, '�λ��',
                                                         '�����' ) 
from 
emp ;

select  *  from student;
-- sex�� 'M' ���� 'F' ����
select  sex,  decode( sex,  'M', '����',
                                             'F', '����' )
from student ;


-- �׷��Լ�
select  count( ename ) from emp ; -- 20�� �Է� 1�� ���  �׷��Լ�

select   ename   from emp ;  -- 20�� �Է�  20�� ���  �������Լ�

-- select ename, count( ename )  from emp ; ������� ������ �޶� ���� �� �� ����. 

select  sum( sal ) from emp ;

select  sum( sal ),  count( ename ), avg( sal ), max( sal ), min( sal )  from emp ;
-- �׷��Լ����� sum, count������ null ���꿡�� ����

-- ���ʽ��� �޴� �������?
select  count( comm )  from emp ; 

-- ���� ������ ����?
-- ���� ����
select  count(  distinct  job )  from   emp;


select * from emp;

select * from emp   order  by  deptno ;

-- �� �μ����� ���� ���� �޿� ����ϱ�
select    deptno,  max( sal )     from   emp    group by  deptno    order by deptno  ;


-- job ���� �޿��� ���� ���� �޿� ����ϱ�
select   job, min( sal )   from   emp   group by  job ; 
select * from emp   order  by  job ;

-- job���� �޿� ��� ����ϱ�

-- ����̰ų� �븮�̰ų� ������  �޿� �հ踦 ���ϼ���. 

-- 1�ܰ� ���, �븮, ���� ����ϱ�
select   *   from emp   where   job   in ('���', '�븮', '����') ;

-- 2�ܰ� �׷����� �����ϱ� 
select   job,  round(  avg(sal) )   from emp   where   job   in ('���', '�븮', '����')  group by job ; 

-- �ִ� �޿��� 700�� �ʰ��ϴ� �μ��� ���ؼ� �ִ�޿��� �ּ� �޿��� ���ϱ�
-- ���   20  1000  300 
-- 1�ܰ� �μ��� �ִ밪 ���ϱ�
select   deptno, max( sal )    from emp  group by  deptno ;

-- 2�ܰ� �ִ� �޿��� 700�� �Ѵ� ����? - �׷��Լ��� ����

select   deptno, max( sal )    from emp  group by  deptno  having  max(sal)  > 700 ;

-- ���޺���  �޿��� ����� 500�̻��� ����, �޿������ ����ϱ� 
-- 1�ܰ� ���޺� �׷� �ϱ�
select    job, avg(sal)  from  emp  group by  job;
-- 2�ܰ� �޿��� ����� 500�̻��� ����ϱ�
select    job, avg(sal)  from  emp  group by  job  having  avg(sal)  >= 500 ;
-- ��ձ޿� ������������ ����ϱ�
select    job, avg(sal)  from  emp  group by  job  having  avg(sal)  >= 500   order  by   avg(sal)   asc ;

select   *  from student ;
-- �ִ볪��?
select    max(age)   from  student;

-- �ּҳ���?
select    min(age)   from  student;

-- ��ճ���?
select    avg(age)   from  student;

-- ���� �ִ� ����, ���� �ִ� ���� group by
select     sex,  max( age )    from  student group by  sex;

-- cou_id ���� ��� ���� ���ϱ� 
select    cou_id, avg( age )       from student    group by  cou_id ;

-- cou_id ���� ��� ���̰� 25�� �̻��� �ڽ��� ��ճ��� ���ϱ� 
select    cou_id, avg( age )       from student    group by  cou_id  having    avg(age)  >= 25 ;

-- ������ ��쿡  cou_id     ����       ��� ���̰� 25�� �̻��� �ڽ��� ��ճ��� ������������ ���ϱ� 
--    where                   group by                      having                              order by
-- 1�ܰ� ���ڸ� ���
select   *  from student   where  sex = 'M' ;
-- 2�ܰ� ������ ��쿡  cou_id     ����
select  avg(age), cou_id  from student   where  sex = 'M'   group by  cou_id ;
-- 3�ܰ�   ������ ��쿡  cou_id     ����       ��� ���̰� 25�� �̻��� �ڽ��� ��ճ��� 
select  avg(age), cou_id  from student   where  sex = 'M'   group by  cou_id   having  avg( age ) >= 25 ;
-- 4�ܰ�   ������ ��쿡  cou_id     ����       ��� ���̰� 25�� �̻��� �ڽ��� ��ճ��� ������������ ���ϱ� 
select  avg(age), cou_id  from student   where  sex = 'M'   group by  cou_id   having  avg( age ) >= 25  order by avg( age ) ;
