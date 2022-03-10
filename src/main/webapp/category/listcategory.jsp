<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1>Danh Sách Category</h1>
    <div><a href="http://localhost:8080/">về trang chủ</a></div>
    <a href="/categories?action=create">Tạo Category Mới</a>
    <table class="table table-bordered border-primary">
        <thead>
        <tr>
            <th scope="col">Mã Category</th>
            <th scope="col">Tên Category</th>
            <%--            thêm cột xóa--%>
            <th colspan="2">Tùy Chỉnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="categoy" items="${categories}">
            <tr>
                <td>${categoy.id}</td>
                <td>${categoy.name}</td>
                <td><a href="/categories?action=edit&id=${categoy.id}">Edit</a></td>
                <td><a href="/categories?action=delete&id=${categoy.id}">Delete</a></td>
            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
