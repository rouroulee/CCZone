package com.even.experiment.model;

import lombok.Data;


/**
 * @author :liyanwei
 * @date :2019-04-23 15:39
 */
@Data
public class AppointmentQuery{
    private Integer pageNum = 1;

    private Integer pageSize = 20;

    private String hospitalId;

    private String startTime;

    private String endTime;


}
