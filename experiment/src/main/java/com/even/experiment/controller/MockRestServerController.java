package com.even.experiment.controller;

import com.even.experiment.model.AppointmentQuery;
import com.even.experiment.model.AppointmentResult;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author :liyanwei
 * @date :2019-04-23 15:31
 */
@RestController
@Slf4j
public class MockRestServerController {

    @PostMapping("/hris/appointment/list")
    @ResponseBody
    public Page<AppointmentResult> mockQueryAppoint(@RequestBody AppointmentQuery appointmentQuery){
        log.info("RequestBody : {}",appointmentQuery.toString());
        Page<AppointmentResult> page = new Page<>();
        page.setPageNum(appointmentQuery.getPageNum());
        page.setPageSize(1);
        AppointmentResult result0 = AppointmentResult.builder().hospitalId( "200034")
                .patientId("eqw123123432")
                .patientName("even")
                .patientGender("")
                .examNo("1903116896")
                .patientBirtday("2019-11-11")
                .patientAge(Short.valueOf("1"))
                .patientPhone("13520206418")
                .patientIdcardNo("14242719931115031X")
                .patientAdd("Beijing ")
                .patientSource("1")
                .outPatientNo("OUT12312312")
                .chargeType("1")
                .bedNo(Short.valueOf("3007"))
                .appntmntMade(Short.valueOf("1"))
                .bodyPart("101")
                .modality("CT")
                .bodyOrgan("eye")
                .exam̲Item("眼部检查")
                .exam̲Itemcode("103").build();
        AppointmentResult result1 = AppointmentResult.builder().hospitalId( "200034")
                .patientId("eqw1231234321")
                .patientName("2222222222")
                .patientGender("")
                .examNo("1903116896")
                .patientBirtday("2019-11-11")
                .patientAge(Short.valueOf("1"))
                .patientPhone("13520206418")
                .patientIdcardNo("14242719931115031X")
                .patientAdd("Beijing ")
                .patientSource("1")
                .outPatientNo("OUT12312312")
                .chargeType("1")
                .bedNo(Short.valueOf("3007"))
                .appntmntMade(Short.valueOf("1"))
                .bodyPart("101")
                .modality("CT")
                .bodyOrgan("eye")
                .exam̲Item("头部检查")
                .clinDiag("临床诊断")
                .exam̲Itemcode("103").build();
        if (appointmentQuery.getPageNum() == 1){
            page.add(result0);
        }else{
            page.add(result1);
        }
        page.setTotal(2);
        return page;
    }

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
