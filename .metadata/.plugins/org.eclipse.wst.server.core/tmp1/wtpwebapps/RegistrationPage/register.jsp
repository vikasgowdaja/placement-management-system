<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <jsp:useBean class="com.vikas.Employee" id="emp" scope="session"></jsp:useBean>
    
    <jsp:setProperty property="*" name="emp"></jsp:setProperty>
    
    <h3>Data has been set</h3>
    
    <a href='table.jsp'>Display Data</a>