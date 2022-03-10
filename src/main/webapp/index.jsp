<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
        integrity="sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg=="
        crossorigin="anonymous" referrerpolicy="no-referrer">
  <title>Thế giới di động</title>
  <link rel="stylesheet" href="main.css">
</head>
<body>
<div class="container">
  <!-- header -->
  <div class="header">
    <!-- header-top -->
    <div class="header-top">
      <div class="header-top-left">
        <a href="#">ANH EM NHÓM 6 C1121G1</a>
        <a href="tel: 1800 6281">
          <i class="fa-solid fa-phone"></i> 0968093597
        </a>
      </div>
      <div class="header-top-right">
        <a href="#">
          <i class="fa-solid fa-location-dot"></i>Nhà số 23, Lô TT-01, Khu đô thị MonCity, P. Hàm Nghi, Hà Nội
        </a>
        <a href="#">
          Tiếng Việt
          <i class="fa-solid fa-angle-down"></i>
        </a>
        <a href="login.jsp">
          Đăng nhập
          <i class="fa-solid fa-user"></i>
        </a>
      </div>
    </div>
    <!-- header-top end -->

    <!-- header-middle -->

    <div class="header-middle">
      <!-- logo -->
      <div class="logo">
        <a href="#">
          <img src="./logo.png" alt="logo">
        </a>
      </div>

      <!-- category -->
      <div class="category">
        <i class="fa-solid fa-bars"></i> Danh mục
        <i class="fa-solid fa-angle-down"></i>
      </div>

      <!-- search -->
      <div class="search">
        <div class="search-input">
          <input type="text" placeholder="Bạn tìm gì hôm nay...">
          <i class="fa-solid fa-magnifying-glass"></i>
        </div>

        <div class="nav">
          <a href="#"><i class="fa-solid fa-mobile-screen-button"></i> Điện thoại</a>
          <a href="#"><i class="fa-solid fa-laptop"></i> Laptop</a>
          <a href="#"><i class="fa-solid fa-tablet"></i> Tablet</a>
          <a href="#"><i class="fa-solid fa-headphones"></i> Phụ kiện</a>
          <a href="#"><i class="fa-solid fa-watch-smart"></i> Đồng hồ thông minh</a>
          <a href="#"><i class="fa-solid fa-gem"></i> AVAJi</a>
          <a href="#"><i class="fa-solid fa-desktop"></i> PC, Máy in</a>
        </div>

      </div>

      <!-- cart -->
      <div class="cart">
        <p>Giỏ hàng</p>
        <i class="fa-solid fa-cart-shopping"></i>
      </div>
    </div>
    <!-- header-middle end -->


  </div>
  <!-- header end -->

  <!-- body -->
  <div class="body">
    <!-- ads -->
    <div class="ads">
      <div class="img-1">
        <img src="https://cdn.tgdd.vn/2022/03/banner/reno7-830-300-830x300.png"
             alt="ads-1">
      </div>

      <div class="img-2">
        <img src="https://cdn.tgdd.vn/2021/05/banner/sticky-gop-390-97-390x97.png"
             alt="ads-2">
        <img src="https://cdn.tgdd.vn/2021/05/banner/sticky-hu-390-97-390x97.png"
             alt="ads-3">
      </div>
    </div>
    <!-- ads end -->

    <!-- body-category -->
    <div class="body-category">
      <h2 class="title">Danh mục sản phẩm</h2>
      <div class="category-item">
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/42/153856/iphone-xi-do-600x600.jpg"
               alt="pic-1">
          <span>Điện Thoại</span>
        </div>
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/44/239552/macbook-air-m1-2020-gray-600x600.jpg"
               alt="pic-2"><br><br>
          <span>Laptop</span>
        </div>
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/522/247510/Samsung-Galaxy-Tab-s8-white-thumb-1-600x600.jpg"
               alt="pic-3">
          <span>Tablet</span>
        </div>
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/54/250701/airpods-3-hop-sac-khong-day-thumb-600x600.jpeg"
               alt="pic-4">
          <span>Phụ kiện</span>
        </div>
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/7077/234918/se-40mm-vien-nhom-day-cao-su-den-thumb-600x600.jpg"
               alt="pic-5">
          <span>Đồng hồ thông minh</span>
        </div>
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/7264/228677/nakzen-ss4057l-10n0-nu-thum-600x600.jpg"
               alt="pic-6">
          <span>AVAJi</span>
        </div>
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/5693/115910/may-in-laser-canon-lbp2900-thumb-600x600.jpg"
               alt="pic-7">
          <span>PC, Máy in</span>
        </div>
        <div class="item">
          <img src="https://cdn.tgdd.vn/Products/Images/42/245607/Vivo-V23e-1-2-600x600.jpg"
               alt="pic-8">
          <span>Mua cũ giá rẻ</span>
        </div>
      </div>
    </div>
    <!-- body-category end-->

    <!-- top product -->
    <div class="body-product">
      <!-- 1 -->
      <h2 class="title">Điện thoại nổi bật nhất</h2>
      <div class="product">
        <div class="product-item">
          <img src="./product-img/dienthoai1.png" alt="pic-1">
          <span>Điện thoại Samsung Galaxy S22 5G 128GB</span>
          <p>21.990.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/dienthoai2.png" alt="pic-1">
          <span>IPhone 11 64GB</span>
          <p>16.990.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/dienthoai3.png" alt="pic-1">
          <span>Xiaomi Redmi Note 11S</span>
          <p>6.990.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/dienthoai4.png" alt="pic-1">
          <span>Realme 9 Pro 5G</span>
          <p>7.990.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/dienthoai5.png" alt="pic-1">
          <span>IPhone 13 Pro Max 256GB</span>
          <p>36.990.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>

      </div>

      <!-- 2 -->
      <h2 class="title">Các mặt hàng khác nổi bật</h2>
      <div class="product">
        <div class="product-item">
          <img src="./product-img/laptop.png" alt="pic-1">
          <span>Lenovo IdeaPad 3 14ITL6 i5 1135G7 (82H700WAVN)</span>
          <p>18.890.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/phukien.png" alt="pic-1">
          <span>Tai nghe Bluetooth AirPods 3 Apple MME73 Trắng</span>
          <p>5.490.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/watch.png" alt="pic-1">
          <span>Apple Watch Series 7 GPS 45mm</span>
          <p>12.490.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/nhan.png" alt="pic-1">
          <span>Nhẫn Bạc Nam Đính Đá Mạ Vàng Trắng AvaJi AVJ.R000358 </span>
          <p>583.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>
        <div class="product-item">
          <img src="./product-img/watch1.png" alt="pic-1">
          <span>Samsung Galaxy Watch 4 Classic 42mm</span>
          <p>8.490.000 VND</p>
          <a href="#">Thêm vào giỏ hàng</a>
        </div>

      </div>
    </div>
    <!-- top product end -->
  </div>
  <!-- body end -->
</div>
</body>

</html>
