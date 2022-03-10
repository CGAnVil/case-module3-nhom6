
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div><a href="http://localhost:8080/">về trang chủ</a></div>
    <h1>Danh Sách Sản Phẩm</h1>
    <a href="/products?action=create">Tạo Sản phẩm Mới</a>
    <table class="table table-bordered border-primary">
        <thead>
        <tr>
            <th scope="col">Mã Sản Phẩm</th>
            <th scope="col">Tên Sản Phẩm</th>
            <th scope="col">Giá Sản Phẩm</th>
            <th scope="col">Mã Loại Sản Phẩm</th>
            <th scope="col">Mã Khuyến Mại</th>
            <%--            thêm cột xóa--%>
            <th colspan="2">Tùy Chỉnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product"  items="${products}">
            <tr>
                <td>${product.id}</td>
                <td><a href="/products?action=view&id=${product.id}">${product.name}</a></td>
                <td>${product.price}</td>
                <td>${product.categoryId}</td>
                <td>${product.promotionId}</td>
                <td><a href="/products?action=edit&id=${product.id}">Edit</a></td>
                <td><a href="/products?action=delete&id=${product.id}">Delete</a></td>

            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
