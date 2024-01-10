-- 파일명 01select

select * from emp ; 
select  *  from student ; 
select  *  from  dept ;
select  dname  from dept;

select   empno,   ename,  sal,   job     from emp ; 
/*   여러줄 주석  */
-- 한줄 주석
-- stu_id,  stu_name, sex 컬럼만 검색하기, 대소문자 구분 없음
select   stu_id, stu_name, sex   from  student ; 

-- 산술연산자  숫자 컬럼(열)만 할 수 있다. 
select   empno,   ename,  sal,  sal * 12,    job    from emp ; 
select   empno,   ename,  sal,  sal * 12,   sal*12*0.33,     job    from emp ; 
select   empno as 사원번호,   ename as 사원명,  sal as 급여,  sal * 12 as 연봉,   sal*12*0.33 as 연세금,     job as 직급    from emp ; 
-- 컬럼명 [as] 별칭  
select   empno  사원번호,   ename  사원명,  sal  급여,  sal * 12  연봉,   sal*12*0.33  연세금,     job  직급    from emp ; 
-- as는 생략할 수 있다

select  *  from  salgrade;
-- 산술연산 Hisal + 1000  Losal + 1500 더하기 해서 출력하기
select  grade,  losal,  losal + 1500,  hisal,  hisal + 1000   from  salgrade ;
-- 별칭(애칭) 붙여 주기
-- 등급, 최저금액, 인상최저금액, 최대금액, 인상최대금액
select  grade as 등급,  losal  최저금액,  losal + 1500  인상최저금액  ,  hisal  최대금액,  hisal + 1000  인상최대금액  from  salgrade ;

-- NULL이란? 0 아님,  빈공간 아니다, 미확정, 알수없는 의미, 어떤값이 아직 모른다, 연산을 할 수 없다.
select   *  from    emp ; 

-- comm  보너스를  + 100씩 지급하자
select   comm,    comm + 100  from  emp ; -- null 컬럼은 + 100이 안되고 null로 나타난다.
select  comm,   nvl( comm, 0 ) + 100  "보 너 스"    from emp ;  -- nvl( comm, 0 )  null이면 0으로 null 아니면 comm 값으로 

-- 문자열 연결 ||   '  ' 따옴표 안에 넣기, " "따옴표는 에러 발생
select   ename  ||  '의 직급은 ' ||   job ||  '입니다'     직급     from  emp ; 

select  *  from student ; 
-- 문종헌의 나이는 24살입니다   
select   stu_name  ||  '의 나이는 '  ||  age  ||  '입니다'   나이    from student ; 

-- 전체 코스는 무엇인가요?  (중복 제거하기)
select    distinct   cou_id  from student ; 

select    *    from  emp ;

-- 부서명(deptno)의 종류는? (중복제거하기) 
select   distinct    deptno    from  emp ; 

-- 부서명이 20인 사원들 보기
select    *    from  emp    where    deptno  =  20 ; 

-- job이 사원인 것만 보기
select   *    from  emp  where  job = '사원' ;

-- job이 사원이거나 과장인 것만 보기
select   *    from  emp  where  job = '사원'   or    job = '과장' ;

-- sal 400이상인 사람의 사원번호, 이름, 급여 보기
select    empno  사원번호,  ename  이름,  sal 급여    from   emp     where   sal >= 400 ;

-- sal 400이상이고  job이 부장인 사람의 사원번호, 이름, 직급, 급여 보기
select    empno  사원번호,  ename  이름,  job 직급,  sal 급여     from   emp     where   sal >= 400   and  job = '부장' ;

-- Hiredate 입사일
-- 입사일 2005/01/01 이전에 입사한 사람 
select    *    from   emp    where    hiredate  <  '05/01/01'  ;

-- 입사일 2005/01/01 이후에 입사한 사람 
select    *    from   emp    where    hiredate  >  '05/01/01'  ;

-- 입사일  2006/01/01 ~  2007/12/31 사이에 입사한 사람
select    *    from   emp    where      '06/01/01'  <=  hiredate     and     hiredate <= '07/12/31' ;

-- 이씨 성을 가진 사람만 
select    *    from   emp    where  ename  like '이%'  ; -- like 유사하다

-- 이씨 성 또는 오씨 성을 가진 사람만 
select    *    from   emp    where  ename  like '이%'    or   ename like  '오%'  ;

-- 이씨 성이 아닌 사람 
select    *    from   emp    where  not  ename  like   '이%'  ; -- like 유사하다
select    *    from   emp    where    ename not  like   '이%'  ; -- like 유사하다

-- 이름 중간 글씨가 '동'인 사람, 이름에 '동'자가 들어 가는 사람
select    *    from   emp    where  ename  like '%동%'  ; -- '%'는 임의의 글자

-- in ~안에
-- job 사원이거나 과장이거나 부장인 사람 출력하기
select  *   from emp   where  job = '사원'   or    job = '과장' or job = '부장'  ; 
select  *   from emp   where  job  in  (  '사원', '과장', '부장' )   ; 

-- 컬럼명 between   시작수    and  끝수     시작수~끝수 사이 
--  300 <= sal  <= 600 사이인 사람 출력하기
select  *   from  emp    where   sal  between  300  and  600 ;

-- 입사일  2006/01/01 ~  2007/12/31 사이에 입사한 사람
select    *    from   emp    where      '06/01/01'  <=  hiredate     and     hiredate <= '07/12/31' ;
select    *    from   emp    where   hiredate   between  '06/01/01'  and   '07/12/31' ; 

-- MGR(멘토 사번) 이 1010~1020 사이 
select    *    from   emp    where  mgr   between  1010 and 1020 ;

-- comm 이 null 인 사람 출력하기 
-- select    *    from   emp    where  comm = null ; 안됨 null 미확정된 자료 , 정의되기 전에 자료
 select    *    from   emp    where  comm  is  null ;

-- 이름 오름차순으로 출력하기
select   *   from  emp   order  by  ename  asc ;  --asc    ascending 오름 차순 생략할 수 있다
select   *   from  emp   order  by  ename ; 

-- 급여 내림차순으로 출력하기
select   *   from  emp   order  by  sal  desc ;  -- descending 내림차순 

-- 부서번호 오름차순으로 출력하기
select   *   from  emp   order  by  deptno ;

-- job 내림차순으로 출력하기
select   *   from  emp   order  by  job desc ;

-- 부서번호 오름차순, 만약 동일하면 empno(사원번호) 순서대로  출력하기
select   *   from  emp   order  by  deptno,   empno  ;

-- 부서번호 오름차순, 만약 동일하면 sal 내림차순 순서대로  출력하기
select   *   from  emp   order  by  deptno,   sal    desc   ;

-- job이 과장이거나 부장인 사람의   job 오름차순으로 출력하기 
select   *   from   emp   where   job in ( '과장', '부장' )   order  by   job  asc ;
-- select   *   from   emp    order  by   job  asc   where   job in ( '과장', '부장' )   ; 오류

-- deptno가 10이거나 30인 사람의  mgr 오름차순, deptno 오름차순으로 
select   *   from   emp   where  deptno in (10, 30)  order by  mgr , deptno  ;

-- 합집합 중복된것 한번만 출력
select    *   from  group_star 
union 
select    *   from  single_star ;

-- 합집합 중복된 것 모두 출력
select    *   from  group_star 
union all 
select    *   from  single_star ;

-- 교집합 
select    *   from  group_star 
intersect  
select    *   from  single_star ;

-- 차집합  그룹활동만 하고 있는 스타들 
select    *   from  group_star 
minus 
select    *   from  single_star ;

-- 차집합  싱글활동만 하고 있는 스타들 
select    *   from  single_star 
minus 
select    *   from  group_star ;

-- 급여가 300 이하인 사원의 사원번호, 사원이름, 급여를 출력하기
select   * from emp;
select  empno,  ename,  sal  from emp   where  sal <= 300 ; 

-- 이름이 '오지호'인 사원의 사원번호, 사원명, 급여을 출력하기
select  empno,  ename,  sal  from emp   where ename = '오지호' ;

-- 급여가 250이거나 300이거나 500인 사원들의 사원번호와 사원명과 급여을 출력하기
select  empno,  ename,  sal  from emp   where  sal  in ( 250, 300, 500 ); 

-- 급여가 250도, 300도 500도 아닌 사원들 출력하기
select  empno,  ename,  sal  from emp   where  sal  not  in ( 250, 300, 500 );

-- 이름이 '김'으로 시작하는 사람과 이름 중에 '기'를 포함하는 사원의 사원번호와 사원이름 출력하기
select  empno,  ename  from emp   where  ename like '김%'  or  ename like '%기%' ; -- % 0이거나 여러개 대신 

-- select  empno,  ename  from emp   where  ename  like in  ( '김%',  '%기%' )  ; 오류

-- 상급자(mgr)가 없는 사원을 출력하기
select   *   from emp   where  mgr  is  null ;

-- 부서번호가 빠른 사원부터 출력하되 같은 부서 내의 사원을 출력할 경우 입사한 지 가장 오래된 사원부터 출력하기
select   *  from  emp   order by   deptno   asc,   hiredate   asc ;
select   *  from  emp   order by   deptno ,   hiredate   ;

select  *   from   emp   where   job in ( '과장', '부장' )   order  by   job  asc ;
--         3                1                       2                            4

