package com.fpthn.bangncph25477.sof3011.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Table(name = "PhieuGiamGia")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhieuGiamGia {
    @Id
    @Column(name = "MaPhieu")
    private String ma;
    @Column(name = "TenPhieu")
    private String ten;
    @Column(name = "NgayBatDau")
    private Date ngaybd;
    @Column(name = "NgayKetThuc")
    private Date ngaykt;
    @Column(name = "GiaTriGiam")
    private BigDecimal giatrigiam;
    @Column(name = "GiaTriGiamToiDa")
    private BigDecimal gtgtd;
    @Column(name = "TrangThai")
    private Integer tt;
    @ManyToOne
    @JoinColumn(name = "NguoiSoHuu")
    private KhachHang khachHang;
}
