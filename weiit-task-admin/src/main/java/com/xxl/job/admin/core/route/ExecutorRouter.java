package com.xxl.job.admin.core.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.weiit.task.core.biz.model.ReturnT;
import com.weiit.task.core.biz.model.TriggerParam;

import java.util.ArrayList;

/**
 * Created by xuxueli on 17/3/10.
 */
public abstract class ExecutorRouter {
    protected static Logger logger = LoggerFactory.getLogger(ExecutorRouter.class);

    /**
     * route run executor
     *
     * @param triggerParam
     * @param addressList
     * @return ReturnT.content: final address
     */
    public abstract ReturnT<String> routeRun(TriggerParam triggerParam, ArrayList<String> addressList);

}
