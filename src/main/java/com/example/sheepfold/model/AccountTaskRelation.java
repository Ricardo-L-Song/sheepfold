package com.example.sheepfold.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "ACCOUNT_TASK_RELATION")
public class AccountTaskRelation {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ACCOUNT_TASK_ID")
    private String accountTaskId;

    /**
     * 账户ID
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 任务ID
     */
    @Column(name = "TASK_ID")
    private String taskId;

    /**
     * 是否完成任务
     */
    @Column(name = "IS_COMPLETE_TASK")
    private String isCompleteTask;

    /**
     * 是否领取饲料/道具
     */
    @Column(name = "IS_RECEIVE")
    private String isReceive;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    @Column(name = "REC_STATUS")
    private String recStatus;

    public AccountTaskRelation(String accountTaskId, String accountId, String taskId, String isCompleteTask, String isReceive, Date createTime, Date lstUpdTime, String recStatus) {
        this.accountTaskId = accountTaskId;
        this.accountId = accountId;
        this.taskId = taskId;
        this.isCompleteTask = isCompleteTask;
        this.isReceive = isReceive;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
    }

    public AccountTaskRelation() {
        super();
    }

    /**
     * 获取主键ID
     *
     * @return ACCOUNT_TASK_ID - 主键ID
     */
    public String getAccountTaskId() {
        return accountTaskId;
    }

    /**
     * 设置主键ID
     *
     * @param accountTaskId 主键ID
     */
    public void setAccountTaskId(String accountTaskId) {
        this.accountTaskId = accountTaskId == null ? null : accountTaskId.trim();
    }

    /**
     * 获取账户ID
     *
     * @return ACCOUNT_ID - 账户ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户ID
     *
     * @param accountId 账户ID
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 获取任务ID
     *
     * @return TASK_ID - 任务ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置任务ID
     *
     * @param taskId 任务ID
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * 获取是否完成任务
     *
     * @return IS_COMPLETE_TASK - 是否完成任务
     */
    public String getIsCompleteTask() {
        return isCompleteTask;
    }

    /**
     * 设置是否完成任务
     *
     * @param isCompleteTask 是否完成任务
     */
    public void setIsCompleteTask(String isCompleteTask) {
        this.isCompleteTask = isCompleteTask == null ? null : isCompleteTask.trim();
    }

    /**
     * 获取是否领取饲料/道具
     *
     * @return IS_RECEIVE - 是否领取饲料/道具
     */
    public String getIsReceive() {
        return isReceive;
    }

    /**
     * 设置是否领取饲料/道具
     *
     * @param isReceive 是否领取饲料/道具
     */
    public void setIsReceive(String isReceive) {
        this.isReceive = isReceive == null ? null : isReceive.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return LST_UPD_TIME
     */
    public Date getLstUpdTime() {
        return lstUpdTime;
    }

    /**
     * @param lstUpdTime
     */
    public void setLstUpdTime(Date lstUpdTime) {
        this.lstUpdTime = lstUpdTime;
    }

    /**
     * @return REC_STATUS
     */
    public String getRecStatus() {
        return recStatus;
    }

    /**
     * @param recStatus
     */
    public void setRecStatus(String recStatus) {
        this.recStatus = recStatus == null ? null : recStatus.trim();
    }
}