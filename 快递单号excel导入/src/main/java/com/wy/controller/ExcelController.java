package com.wy.controller;

import com.wy.bean.Express;
import com.wy.common.Result;
import com.wy.service.ExpressService;
import com.wy.utils.POIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/fileUpload")
public class ExcelController {

    @Autowired
    private ExpressService expressService;

    @RequestMapping("/express")
    public Result express(@RequestParam("excelFile") MultipartFile excelFile){
        System.out.println("excelFile = " + excelFile);
        // poi 专门读取 office 办公  excel
        List<String[]> lists=null;
        try {
            lists = POIUtils.readExcel(excelFile); //使用工具类 进行读取 excel  表格
            System.out.println("lists = " + lists);
            for (String[] strings: lists) {
                System.out.println("strings = " + strings);
                for (String string : strings) {
                    System.out.println("string = " + string);
                }
            }

            ArrayList<Express> data = new ArrayList<>();
            for (String[] strings : lists) {

                String policyNo= strings[1];
                String csCompany= strings[2];
                String courierNumber= strings[3];
                String remark= strings[4];
                String mailingDate= strings[5];

                System.out.println("policyNo = " + policyNo);
                System.out.println("csCompany = " + csCompany);
                System.out.println("courierNumber = " + courierNumber);
                System.out.println("remark = " + remark);
                System.out.println("mailingDate = " + mailingDate);
                Express express = new Express();
                express.setPolicyNo(policyNo);
                express.setCsCompany(csCompany);
                express.setCourierNumber(courierNumber);
                express.setRemark(remark);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date date = null;
                try {
                    date = simpleDateFormat.parse(mailingDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                express.setMailingDate(date);
                data.add(express);
                expressService.addListExpress(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
