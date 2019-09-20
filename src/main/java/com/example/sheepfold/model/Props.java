package com.example.sheepfold.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Props {
    /**
     * 道具ID
     */
    @Id
    @Column(name = "PROPS_ID")
    private String propsId;

    /**
     * 道具所在账户的ID
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 道具种类 加速,寻宝
     */
    @Column(name = "PROPS_TYPE")
    private BigDecimal propsType;

    /**
     * 道具最大数量
     */
    @Column(name = "PROPS_MAX")
    private BigDecimal propsMax;

    /**
     * 道具介绍
     */
    @Column(name = "PROPS_INTRODUCTION")
    private String propsIntroduction;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    @Column(name = "REC_STATUS")
    private String recStatus;

    public Props(String propsId, String accountId, BigDecimal propsType, BigDecimal propsMax, String propsIntroduction, Date createTime, Date lstUpdTime, String recStatus) {
        this.propsId = propsId;
        this.accountId = accountId;
        this.propsType = propsType;
        this.propsMax = propsMax;
        this.propsIntroduction = propsIntroduction;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
    }

    public Props() {
        super();
    }

    /**
     * 获取道具ID
     *
     * @return PROPS_ID - 道具ID
     */
    public String getPropsId() {
        return propsId;
    }

    /**
     * 设置道具ID
     *
     * @param propsId 道具ID
     */
    public void setPropsId(String propsId) {
        this.propsId = propsId == null ? null : propsId.trim();
    }

    /**
     * 获取道具所在账户的ID
     *
     * @return ACCOUNT_ID - 道具所在账户的ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置道具所在账户的ID
     *
     * @param accountId 道具所在账户的ID
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 获取道具种类 加速,寻宝
     *
     * @return PROPS_TYPE - 道具种类 加速,寻宝
     */
    public BigDecimal getPropsType() {
        return propsType;
    }

    /**
     * 设置道具种类 加速,寻宝
     *
     * @param propsType 道具种类 加速,寻宝
     */
    public void setPropsType(BigDecimal propsType) {
        this.propsType = propsType;
    }

    /**
     * 获取道具最大数量
     *
     * @return PROPS_MAX - 道具最大数量
     */
    public BigDecimal getPropsMax() {
        return propsMax;
    }

    /**
     * 设置道具最大数量
     *
     * @param propsMax 道具最大数量
     */
    public void setPropsMax(BigDecimal propsMax) {
        this.propsMax = propsMax;
    }

    /**
     * 获取道具介绍
     *
     * @return PROPS_INTRODUCTION - 道具介绍
     */
    public String getPropsIntroduction() {
        return propsIntroduction;
    }

    /**
     * 设置道具介绍
     *
     * @param propsIntroduction 道具介绍
     */
    public void setPropsIntroduction(String propsIntroduction) {
        this.propsIntroduction = propsIntroduction == null ? null : propsIntroduction.trim();
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