package com.even.experiment.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.even.mydubbo.rpc.provider.EvenProviderDubboServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author :liyanwei
 * @date :2019-06-06 11:17
 */
@Service
@Slf4j
public class FindNameConsumerDubboService {


    @Reference
    EvenProviderDubboServiceApi evenProviderDubboServiceApi;

    @Scheduled(cron = "0/10 * * * * ?")
    public void findName() {
        log.info("Consumer Scheduled start ```");
        log.info(evenProviderDubboServiceApi.evenProvider("name")) ;
    }
}
