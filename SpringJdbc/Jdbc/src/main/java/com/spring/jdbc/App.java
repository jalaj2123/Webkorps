package com.spring.jdbc;



import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import com.spring.dao.StudentImpdao;
import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
StudentDao studentdao=(StudentDao)context.getBean("studentdao");






Scanner sc=new Scanner(System.in);


int cond=0;
do{
	System.out.println("1:INSERT");
	System.out.println("2:UPDATE");
	System.out.println("3:DELETE");
	System.out.println("4:SHOW");
	int i=sc.nextInt();
switch(i)
{
case 1:
System.out.println("INSERT");
Student student=new Student();
System.out.println("Enter Sid");
int sid=sc.nextInt();
System.out.println("Enter Name");
String sname=sc.next();
System.out.println("Enter City");
String scity=sc.next();
student.setId(sid);
student.setCity(sname);
student.setName(scity);
int r=studentdao.insert(student);
if(r>0)
{
	System.out.println("INSERT RECORD");
}
break;
case 2:
System.out.println("DELETE");
Student student1=new Student();
int sid1=sc.nextInt();
student1.setId(sid1);
int r1=studentdao.delete(student1.getId());
if(r1>0)
{
	System.out.println("DELETE RECORD");
}
break;
case 3:
System.out.println("UPDATE");
Student student3=new Student();
int sid2=sc.nextInt();
String sname2=sc.next();
String scity2=sc.next();
student3.setId(sid2);
student3.setCity(sname2);
student3.setName(scity2);
int r2=studentdao.insert(student3);
if(r2>0)
{
	System.out.println("UPDATE RECORD");
}
	break;
case 4:
System.out.println("SHOW");
List<Student> student2 =studentdao.GetAllStudent();
for(Student s: student2)
{
	System.out.println(s);
}
break;
default:
System.out.println("Some Problem");
}
System.out.println("PRESS 0 for CONTINUE");
cond=sc.nextInt();
}while(cond==0);

	
	
	
	


}
}
