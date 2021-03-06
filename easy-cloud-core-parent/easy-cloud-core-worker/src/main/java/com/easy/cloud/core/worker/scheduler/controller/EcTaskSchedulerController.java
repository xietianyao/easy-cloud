package com.easy.cloud.core.worker.scheduler.controller;

import com.easy.cloud.core.basic.controller.EcBaseController;
import com.easy.cloud.core.basic.pojo.dto.EcBaseServiceResult;
import com.easy.cloud.core.worker.executor.pojo.dto.EcTaskExecutorDTO;
import com.easy.cloud.core.worker.executor.service.EcTaskExecutorService;
import com.easy.cloud.core.worker.scheduler.pojo.dto.EcTaskSchedulerDTO;
import com.easy.cloud.core.worker.scheduler.service.EcTaskSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务调度器控制类
 *
 * @author daiqi
 * @create 2018-06-21 14:23
 */
@RestController
@RequestMapping(value = "taskScheduler")
public class EcTaskSchedulerController extends EcBaseController {
    @Autowired
    private EcTaskSchedulerService taskSchedulerService;
    @Autowired
    private EcTaskExecutorService taskExecutorService;

    @RequestMapping(value = "initTask")
    public EcBaseServiceResult initTask(@RequestBody EcTaskSchedulerDTO taskSchedulerDTO) {
        return taskSchedulerService.initTask(taskSchedulerDTO);
    }

    @RequestMapping(value = "updateTaskScheduler")
    public EcBaseServiceResult updateTaskScheduler(@RequestBody EcTaskSchedulerDTO taskSchedulerDTO) {
        return taskSchedulerService.updateTaskScheduler(taskSchedulerDTO);
    }

    @RequestMapping(value = "pauseTaskTrigger")
    public EcBaseServiceResult pauseTaskTrigger(@RequestBody EcTaskSchedulerDTO taskSchedulerDTO) {
        return taskSchedulerService.pauseTaskTrigger(taskSchedulerDTO);
    }

    @RequestMapping(value = "resumeTaskTrigger")
    public EcBaseServiceResult resumeTaskTrigger(@RequestBody EcTaskSchedulerDTO taskSchedulerDTO) {
        return taskSchedulerService.resumeTaskTrigger(taskSchedulerDTO);
    }

    @RequestMapping(value = "deleteTrigger")
    public EcBaseServiceResult deleteTrigger(@RequestBody EcTaskSchedulerDTO taskSchedulerDTO) {
        return taskSchedulerService.deleteTrigger(taskSchedulerDTO);
    }

    @RequestMapping(value = "updateTaskExecutor")
    public EcBaseServiceResult updateTaskExecutor(@RequestBody EcTaskExecutorDTO taskExecutorDTO) {
        return taskExecutorService.updateTaskExecutor(taskExecutorDTO);
    }
}
