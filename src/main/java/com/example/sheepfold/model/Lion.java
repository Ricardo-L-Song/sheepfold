package com.example.sheepfold.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Lion {
    /**
     * 小狮子ID
     */
    @Id
    @Column(name = "LION_ID")
    private String lionId;

    /**
     * 小狮子名称
     */
    @Column(name = "LION_NAME")
    private String lionName;

    /**
     * 小狮子饲料总量
     */
    @Column(name = "LION_FEED_TOTAL")
    private BigDecimal lionFeedTotal;

    /**
     * 小狮子年龄
     */
    @Column(name = "LION_AGE")
    private BigDecimal lionAge;

    /**
     * 小狮子生日 即创建日期
     */
    @Column(name = "LION_BIRTH")
    private Date lionBirth;

    /**
     * 饲料槽余量
     */
    @Column(name = "LION_FEED_REMAINING")
    private BigDecimal lionFeedRemaining;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    @Column(name = "REC_STATUS")
    private String recStatus;

    public Lion(String lionId, String lionName, BigDecimal lionFeedTotal, BigDecimal lionAge, Date lionBirth, BigDecimal lionFeedRemaining, Date createTime, Date lstUpdTime, String recStatus) {
        this.lionId = lionId;
        this.lionName = lionName;
        this.lionFeedTotal = lionFeedTotal;
        this.lionAge = lionAge;
        this.lionBirth = lionBirth;
        this.lionFeedRemaining = lionFeedRemaining;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
    }

    public Lion() {
        super();
    }

    /**
     * 获取小狮子ID
     *
     * @return LION_ID - 小狮子ID
     */
    public String getLionId() {
        return lionId;
    }

    /**
     * 设置小狮子ID
     *
     * @param lionId 小狮子ID
     */
    public void setLionId(String lionId) {
        this.lionId = lionId == null ? null : lionId.trim();
    }

    /**
     * 获取小狮子名称
     *
     * @return LION_NAME - 小狮子名称
     */
    public String getLionName() {
        return lionName;
    }

    /**
     * 设置小狮子名称
     *
     * @param lionName 小狮子名称
     */
    public void setLionName(String lionName) {
        this.lionName = lionName == null ? null : lionName.trim();
    }

    /**
     * 获取小狮子饲料总量
     *
     * @return LION_FEED_TOTAL - 小狮子饲料总量
     */
    public BigDecimal getLionFeedTotal() {
        return lionFeedTotal;
    }

    /**
     * 设置小狮子饲料总量
     *
     * @param lionFeedTotal 小狮子饲料总量
     */
    public void setLionFeedTotal(BigDecimal lionFeedTotal) {
        this.lionFeedTotal = lionFeedTotal;
    }

    /**
     * 获取小狮子年龄
     *
     * @return LION_AGE - 小狮子年龄
     */
    public BigDecimal getLionAge() {
        return lionAge;
    }

    /**
     * 设置小狮子年龄
     *
     * @param lionAge 小狮子年龄
     */
    public void setLionAge(BigDecimal lionAge) {
        this.lionAge = lionAge;
    }

    /**
     * 获取小狮子生日 即创建日期
     *
     * @return LION_BIRTH - 小狮子生日 即创建日期
     */
    public Date getLionBirth() {
        return lionBirth;
    }

    /**
     * 设置小狮子生日 即创建日期
     *
     * @param lionBirth 小狮子生日 即创建日期
     */
    public void setLionBirth(Date lionBirth) {
        this.lionBirth = lionBirth;
    }

    /**
     * 获取饲料槽余量
     *
     * @return LION_FEED_REMAINING - 饲料槽余量
     */
    public BigDecimal getLionFeedRemaining() {
        return lionFeedRemaining;
    }

    /**
     * 设置饲料槽余量
     *
     * @param lionFeedRemaining 饲料槽余量
     */
    public void setLionFeedRemaining(BigDecimal lionFeedRemaining) {
        this.lionFeedRemaining = lionFeedRemaining;
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