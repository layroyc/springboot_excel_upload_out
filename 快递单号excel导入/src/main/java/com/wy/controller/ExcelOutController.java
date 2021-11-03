package com.wy.controller;

import com.wy.bean.Express;
import com.wy.service.ExpressService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/api/excel")
public class ExcelOutController {
    @Autowired
    private ExpressService expressService;
    @RequestMapping("/export")
    public void Export(HttpServletResponse response) throws IOException {
        //HSSFWorkbook   excel的文档对象
        HSSFWorkbook workbook = new HSSFWorkbook();
        //HSSFSheet   excel的表单   创建表单 并起个名
        HSSFSheet sheet = workbook.createSheet("快递订单表");
        // 调用 全查方法
        List<Express> classmateList  = expressService.selectByExample(null);

        // 设置要导出的文件的名字
        String fileName = "wywy"  + ".xls";

        // 新增数据行，并且设置单元格数据
        int rowNum = 1;
        // headers表示excel表中第一行的表头 在excel表中添加表头
        String[] headers = { "序号", "保单号", "快递公司", "快递单号","备注","邮寄日期"};
        HSSFRow row = sheet.createRow(0);
        for(int i=0;i<headers.length;i++){
            //HSSFCell     excel的格子单元
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (Express item : classmateList) {
//            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//            Date date=null;
//            try {
//                Date youdate = item.getYoudate();
//                date=sdf.parse(String.valueOf(youdate));
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            String youdate1=sdf.format(date);
            //HSSFRow  excel的行
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(item.getId());
            row1.createCell(1).setCellValue(item.getPolicyNo());
            row1.createCell(2).setCellValue(item.getCsCompany());
            row1.createCell(3).setCellValue(item.getCourierNumber());
            row1.createCell(4).setCellValue(item.getRemark());
            row1.createCell(5).setCellValue(item.getMailingDate());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

}
