package com.mango.applicationrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author 凌风的MI
 */
@Component
@Order(100)
public class MyApplicationRunner01 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] sourceArgs = args.getSourceArgs();
        System.err.println("sourceArgs>>>"+ Arrays.toString(sourceArgs));
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.err.println("nonOptionArgs>>>"+nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        System.err.println(">>>>>>>>>>>>>>>>>MyApplicationRunner01开始>>>>>>>>>>>>>>>>");
        for (String optionName : optionNames) {
            System.err.println(optionName+":"+args.getOptionValues(optionName));
        }
        System.err.println(">>>>>>>>>>>>>>>>>MyApplicationRunner01结束>>>>>>>>>>>>>>>>");
    }
}
