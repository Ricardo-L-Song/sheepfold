package com.example.sheepfold.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Account {
    /**
     * 账户ID UUID生成
     */
    @Id
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 账户对应的小狮子ID UUID生成
     */
    @Column(name = "LION_ID")
    private String lionId;

    /**
     * 账户中小狮子能量值 只记录数值即可 满100则代码逻辑中金币+1
     */
    @Column(name = "ACCOUNT_ENERGY")
    private BigDecimal accountEnergy;

    /**
     * 账户剩余金币 金币可以用来兑换优惠券
     */
    @Column(name = "ACCOUNT_GOLD")
    private BigDecimal accountGold;

    /**
     * 账户剩余寻宝次数(对应小铲子)
     */
    @Column(name = "ACCOUNT_WAKUANG")
    private BigDecimal accountWakuang;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 最后更新时间
     */
    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    /**
     * 是否可见(是否逻辑删除) 0:删除(不可见) 1:正在使用（可见）
     */
    @Column(name = "REC_STATUS")
    private String recStatus;

    public Account(String accountId, String lionId, BigDecimal accountEnergy, BigDecimal accountGold, BigDecimal accountWakuang, Date createTime, Date lstUpdTime, String recStatus) {
        this.accountId = accountId;
        this.lionId = lionId;
        this.accountEnergy = accountEnergy;
        this.accountGold = accountGold;
        this.accountWakuang = accountWakuang;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
    }

    public Account() {
        super();
    }

    /**
     * 获取账户ID UUID生成
     *
     * @return ACCOUNT_ID - 账户ID UUID生成
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户ID UUID生成
     *
     * @param accountId 账户ID UUID生成
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 获取账户对应的小狮子ID UUID生成
     *
     * @return LION_ID - 账户对应的小狮子ID UUID生成
     */
    public String getLionId() {
        return lionId;
    }

    /**
     * 设置账户对应的小狮子ID UUID生成
     *
     * @param lionId 账户对应的小狮子ID UUID生成
     */
    public void setLionId(String lionId) {
        this.lionId = lionId == null ? null : lionId.trim();
    }

    /**
     * 获取账户中小狮子能量值 只记录数值即可 满100则代码逻辑中金币+1
     *
     * @return ACCOUNT_ENERGY - 账户中小狮子能量值 只记录数值即可 满100则代码逻辑中金币+1
     */
    public BigDecimal getAccountEnergy() {
        return accountEnergy;
    }

    /**
     * 设置账户中小狮子能量值 只记录数值即可 满100则代码逻辑中金币+1
     *
     * @param accountEnergy 账户中小狮子能量值 只记录数值即可 满100则代码逻辑中金币+1
     */
    public void setAccountEnergy(BigDecimal accountEnergy) {
        this.accountEnergy = accountEnergy;
    }

    /**
     * 获取账户剩余金币 金币可以用来兑换优惠券
     *
     * @return ACCOUNT_GOLD - 账户剩余金币 金币可以用来兑换优惠券
     */
    public BigDecimal getAccountGold() {
        return accountGold;
    }

    /**
     * 设置账户剩余金币 金币可以用来兑换优惠券
     *
     * @param accountGold 账户剩余金币 金币可以用来兑换优惠券
     */
    public void setAccountGold(BigDecimal accountGold) {
        this.accountGold = accountGold;
    }

    /**
     * 获取账户剩余寻宝次数(对应小铲子)
     *
     * @return ACCOUNT_WAKUANG - 账户剩余寻宝次数(对应小铲子)
     */
    public BigDecimal getAccountWakuang() {
        return accountWakuang;
    }

    /**
     * 设置账户剩余寻宝次数(对应小铲子)
     *
     * @param accountWakuang 账户剩余寻宝次数(对应小铲子)
     */
    public void setAccountWakuang(BigDecimal accountWakuang) {
        this.accountWakuang = accountWakuang;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后更新时间
     *
     * @return LST_UPD_TIME - 最后更新时间
     */
    public Date getLstUpdTime() {
        return lstUpdTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param lstUpdTime 最后更新时间
     */
    public void setLstUpdTime(Date lstUpdTime) {
        this.lstUpdTime = lstUpdTime;
    }

    /**
     * 获取是否可见(是否逻辑删除) 0:删除(不可见) 1:正在使用（可见）
     *
     * @return REC_STATUS - 是否可见(是否逻辑删除) 0:删除(不可见) 1:正在使用（可见）
     */
    public String getRecStatus() {
        return recStatus;
    }

    /**
     * 设置是否可见(是否逻辑删除) 0:删除(不可见) 1:正在使用（可见）
     *
     * @param recStatus 是否可见(是否逻辑删除) 0:删除(不可见) 1:正在使用（可见）
     */
    public void setRecStatus(String recStatus) {
        this.recStatus = recStatus == null ? null : recStatus.trim();
    }
}