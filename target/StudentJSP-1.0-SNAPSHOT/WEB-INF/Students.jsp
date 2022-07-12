<%-- 
    Document   : Students
    Created on : Jul 11, 2022, 7:53:14 PM
    Author     : isi
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.isimtl.students.models.Student"%>
<%@page import="com.isimtl.students.services.StudentService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        ArrayList<Student> studentList = (ArrayList<Student>)request.getAttribute("students");
        %>
        
        <h1>All Students</h1>
       
        <% for (Student student  : studentList) {
                
          
           
           out.println("<h1><a href='?id="+student.getId()+"'>"+student.getFullName()+"</a></h1>");
           out.println("<ul>");
           out.println("<li>");
           out.println("Id : "+student.getId());
           out.println("</li>");
           out.println("<li>");
           out.println("Graduated : "+student.isGraduated());
           out.println("</li>");
           out.println("</ul>");


        }%>
        
    </body>
</html>
