package com.example.sheepfold.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Action {
    /**
     * 行为记录ID
     */
    @Id
    @Column(name = "ACTION_ID")
    private String actionId;

    /**
     * 行为对应的账号ID
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 行为类型 喂养记录，寻宝记录，兑换记录
     */
    @Column(name = "ACTION_TYPE")
    private BigDecimal actionType;

    /**
     * 行为对应的ID
     */
    @Column(name = "ACTION_RELATED_ID")
    private String actionRelatedId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    @Column(name = "REC_STATUS")
    private String recStatus;

    public Action(String actionId, String accountId, BigDecimal actionType, String actionRelatedId, Date createTime, Date lstUpdTime, String recStatus) {
        this.actionId = actionId;
        this.accountId = accountId;
        this.actionType = actionType;
        this.actionRelatedId = actionRelatedId;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
    }

    public Action() {
        super();
    }

    /**
     * 获取行为记录ID
     *
     * @return ACTION_ID - 行为记录ID
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * 设置行为记录ID
     *
     * @param actionId 行为记录ID
     */
    public void setActionId(String actionId) {
        this.actionId = actionId == null ? null : actionId.trim();
    }

    /**
     * 获取行为对应的账号ID
     *
     * @return ACCOUNT_ID - 行为对应的账号ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置行为对应的账号ID
     *
     * @param accountId 行为对应的账号ID
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 获取行为类型 喂养记录，寻宝记录，兑换记录
     *
     * @return ACTION_TYPE - 行为类型 喂养记录，寻宝记录，兑换记录
     */
    public BigDecimal getActionType() {
        return actionType;
    }

    /**
     * 设置行为类型 喂养记录，寻宝记录，兑换记录
     *
     * @param actionType 行为类型 喂养记录，寻宝记录，兑换记录
     */
    public void setActionType(BigDecimal actionType) {
        this.actionType = actionType;
    }

    /**
     * 获取行为对应的ID
     *
     * @return ACTION_RELATED_ID - 行为对应的ID
     */
    public String getActionRelatedId() {
        return actionRelatedId;
    }

    /**
     * 设置行为对应的ID
     *
     * @param actionRelatedId 行为对应的ID
     */
    public void setActionRelatedId(String actionRelatedId) {
        this.actionRelatedId = actionRelatedId == null ? null : actionRelatedId.trim();
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