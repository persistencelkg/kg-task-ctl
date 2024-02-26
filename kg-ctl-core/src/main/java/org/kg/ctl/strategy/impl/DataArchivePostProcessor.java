package org.kg.ctl.strategy.impl;

import org.kg.ctl.dao.TaskSegment;
import org.kg.ctl.dao.enums.TaskModeEnum;
import org.kg.ctl.strategy.TaskPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Author: 李开广
 * Date: 2024/2/20 1:38 PM
 */
@Component
public class DataArchivePostProcessor implements TaskPostProcessor {
    @Override
    public void postProcessBeforeExecute(TaskSegment taskSegment) {

    }

    @Override
    public void postProcessAfterExecute(TaskSegment taskSegment, Integer resultSize) {
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        TASK_MANAGER.put(TaskModeEnum.FUll_CHECK, this);
    }
}
