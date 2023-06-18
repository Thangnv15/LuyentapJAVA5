package com.fpthn.bangncph25477.sof3011.controller;

import com.fpthn.bangncph25477.sof3011.entities.PhieuGiamGia;
import com.fpthn.bangncph25477.sof3011.reponsitories.KhachHangReponsitories;
import com.fpthn.bangncph25477.sof3011.reponsitories.PhieuGiamGiaReponistories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("phieu-giam-gia")
public class PhieuGiamGiaController {
    @Autowired
    KhachHangReponsitories khr;
    @Autowired
    PhieuGiamGiaReponistories pgg;
    @GetMapping("hien-thi")
    public String hienthi(Model model ,PhieuGiamGia phieuGiamGia){
        model.addAttribute("pg",phieuGiamGia);
        model.addAttribute("listPhieu",pgg.findAll());
        model.addAttribute("listKh",khr.findAll());
        return "index";
    }
    @GetMapping("delete/{ma}")
    public String xoa(@PathVariable("ma")PhieuGiamGia pgg){
        this.pgg.delete(pgg);
        return "redirect:/phieu-giam-gia/hien-thi";
    }
}
