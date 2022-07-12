<%-- 
    Document   : Student
    Created on : Jul 11, 2022, 7:53:23 PM
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
        <title>Student Information</title>
    </head>
    <body>
         <% 
        Student student = (Student)request.getAttribute("student");
        %>
        <%
                out.println("<li> Id : "+ student.getId()+"</li>");
                out.println("<li> Full name : "+ student.getFullName()+"</li>");
                out.println("<li> DOB : "+ student.getDateOfBirth().toString()+"</li>");
                out.println("<li> Age : "+ student.getAge()+"</li>");
                out.println("<li> Graduated : "+ student.isGraduated() +"</li>");
                out.println("<br>");
         %>
    </body>
</html>
