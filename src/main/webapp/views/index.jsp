<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<%@page pageEncoding="UTF-8" language="java" %>
<head>
    <title>Trang Hiển thị </title>
</head>
<body>
<sf:form action="/phieu-giam-gia/update" modelAttribute="pg" method="post" >
    <div>
        <label>Mã</label>
        <sf:input path="ma" readonly="true"/>
    </div>
    <div>
        <label>Tên</label>
        <sf:input path="ten" />
    </div>
    <div>
        <label>Ngày Bắt Đầu</label>
        <sf:input type="date" path="ngaybd" />
    </div>
    <div>
        <label>Ngày Kết Thúc</label>
        <sf:input type="date" path="ngaykt" />
    </div>
    <div>
        <label>Giá Trị giảm</label>
        <sf:input path="giatrigiam" />
    </div>
    <div>
        <label>Giá Trị giảm</label>
        <sf:input path="gtgtd" />
    </div>
    <div>
        <label>Khách hàng</label>
        <sf:select path="khachHang" >
            <c:forEach items="${listKh}" var="kh">
                <sf:option value="${kh.ten}" >${kh.ten}</sf:option>
            </c:forEach>
        </sf:select>
    </div>
    <button type="submit">update</button>
</sf:form>


<table>
    <thead>
    <tr>
        <th>Mã</th>
        <th>Tên</th>
        <th>Ngày Bắt Đầu</th>
        <th>Ngày Kết Thúc</th>
        <th>Giá Trị Giảm</th>
        <th>Trạng Thái</th>
        <th>Tên Khách Hàng</th>
        <th>Chức Năng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listPhieu}" var="p">
        <tr>
            <td>${p.ma}</td>
            <td>${p.ten}</td>
            <td>${p.ngaybd}</td>
            <td>${p.ngaykt}</td>
            <td>${p.giatrigiam}</td>
            <td>${p.gtgtd}</td>
            <td>${p.tt == 1 ?"Còn Sử Dụng":"Kết Thúc"}</td>
            <td>${p.khachHang.ten}</td>
            <td>
                <a href="/phieu-giam-gia/delete/${p.ma}">xoá</a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>