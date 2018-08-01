package com.rao.study.xxljob.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

@JobHandler(value="simpleJobHandler")
@Component
public class SimpleJobHandler extends IJobHandler {
    public ReturnT<String> execute(String s) throws Exception {
        XxlJobLogger.log("XXL-Job execute SimpleJobHandler");
        System.out.println("asdfsafsafasdfsadf");
        return ReturnT.SUCCESS;
    }
}
