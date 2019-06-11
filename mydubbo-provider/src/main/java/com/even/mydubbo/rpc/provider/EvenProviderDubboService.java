package com.even.mydubbo.rpc.provider;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * @author :liyanwei
 * @date :2019-06-06 11:14
 */
@Service
@Slf4j
public class EvenProviderDubboService implements EvenProviderDubboServiceApi {

    @Override
    public String evenProvider(String name) {
        log.info("!!!!" + "dubbo provider service start >>>>> ");

        log.info("!!!!" + "dubbo provider service start >>>>> ");

        log.info("!!!!" + "dubbo provider service start >>>>> ");

        return "Provider Name : [ " + name + " ]" ;
    }
}

