<%-- 
    Document   : index.jsp
    Created on : Jul 31, 2020, 9:07:53 AM
    Author     : lebinhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .vertical {
                display: flex;
                flex-direction: column;
            }
            .w-40 {
                width: 40%;
            }
            .login-form input {
                margin-bottom: 0.2em;
                margin-top: 0.2em;
            }
            .login-form button {
                margin-top: 0.5em;
            }
        </style>
    </head>
    <body>
        <h1>Hello MVC!</h1>
        <form class="login-form" action="Controller" method="POST">
            <h2>
                Do loi ky thuat nen gio ID chi co the nhap so thoi<br/>
                Ma lap trinh vien luoi qua nen chua fix <br/>
                ACE thong cam nha
            </h2>
            <div class="vertical w-40">
                ID:     <input type="text" name="txtUser">
                Password: <input type="password" name="txtPassword">
                <button type="submit">Login</button>
            </div>
        </form>
    </body>
</html>
