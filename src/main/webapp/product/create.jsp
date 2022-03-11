
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">

  <h1>Tao San Pham Moi</h1>
  <c:if test="${message!=null}">
    <p class="alert alert-success">${message}</p>
  </c:if>
  <form action="/products?action=create" method="post">

    <div class="mb-3">
      <label for="name" class="form-label">Nhập Tên Sản Phẩm</label>
      <input type="text" class="form-control" id="name" aria-describedby="emailHelp" required name="name">
    </div>
    <div class="mb-3">
      <label for="price" class="form-label">Nhập Giá Sản Phẩm</label>
      <input type="text" class="form-control" id="price" aria-describedby="emailHelp" name="price">
    </div>
    <div class="mb-3">
      <label for="categoryID" class="form-label">Nhập Mã Loại Sản Phẩm</label>
      <select name="categoryId" id="categoryId">
        <c:forEach var="category" items="${categories}">
          <option value="${category.id}">${category.name}</option>
        </c:forEach>
      </select>
    </div>
    <div class="mb-3">
      <label for="promotionId" class="form-label"> Khuyến mại</label>
      <select name="promotionId" id="promotionId">
        <c:forEach var="promotion" items="${promotions}">
          <option value="${promotion.id}">${promotion.description}</option>
        </c:forEach>
      </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <a href="/products">Quay lại danh sách sản phẩm</a></form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
