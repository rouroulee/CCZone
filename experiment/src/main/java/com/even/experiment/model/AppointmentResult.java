package com.even.experiment.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author :liyanwei
 * @date :2019-04-23 15:34
 */
@Data
@Builder
public class AppointmentResult implements Serializable {

    private String hospitalId;

    private String patientId;

    private String patientName;

    private String patientGender;

    private String patientBirtday;

    private Short patientAge;

    private String patientPhone;

    private String patientEthnicity;

    private String patientIdcardNo;

    private String patientAdd;

    private String patientZipcode;

    private String examNo;

    private String patientSource;

    private String outPatientNo;

    private String admissionNo;

    private String chargeType;

    private Short bedNo;

    private String clinDiag;

    private Short settlementState;

    private String amount;

    private String regstrtnDatetime;

    private Short appntmntMade;

    private String appntmntDatetime;

    private String deptcode;

    private String deptname;

    private String doctorName;

    private String modality;

    private String bodyPart;

    private String bodyOrgan;

    private String exam̲Itemcode;

    private String exam̲Item;

    private String exam̲Device;

    private String creationTime;

    private String updateTime;

    private String comment;

}
