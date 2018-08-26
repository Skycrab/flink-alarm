package com.alarm.eagle.api.domain;

import com.alarm.eagle.util.JsonUtil;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by skycrab on 18/1/3.
 */
@Table(name = "eagle_sink")
@Entity
public class PolicySink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name="id")
    private Long id;

    /**
     * 任务id
     */
    @Column(nullable = false, name = "task_id")
    private Integer taskId;

    /**
     * 应用id
     */
    @Column(nullable = false, name = "app_id")
    private Integer appId;

    /**
     * 策略聚合指标,类tag功能
     */
    @Column(nullable = false, name = "metric")
    private String metric;

    /**
     * 策略id
     */
    @Column(nullable = false, name = "policy_id")
    private Integer policyId;

    /**
     * sink结果
     */
    @Column(nullable = false, name = "data")
    private String data;

    /**
     * 创建时间
     */
    @Column(nullable = false, name = "create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return JsonUtil.encode(this);
    }
}
