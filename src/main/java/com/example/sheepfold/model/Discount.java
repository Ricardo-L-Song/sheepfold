package com.example.sheepfold.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Discount {
    /**
     * 优惠券ID
     */
    @Id
    @Column(name = "DISCOUNT_ID")
    private String discountId;

    /**
     * 优惠券所在账户ID
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 优惠券抬头
     */
    @Column(name = "DISCOUNT_TITLE")
    private String discountTitle;

    /**
     * 优惠券开始使用日期
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "DISCOUNT_START_DATE")
    private Date discountStartDate;

    /**
     * 优惠券截止使用日期
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd  HH:MM:ss")
    @Column(name = "DISCOUNT_END_DATE")
    private Date discountEndDate;

    @Column(name = "DISCOUNT_LOGO")
    private String discountLogo;

    public String getDiscountLeft() {
        return discountLeft;
    }

    public void setDiscountLeft(String discountLeft) {
        this.discountLeft = discountLeft;
    }

    @Column(name = "DISCOUNT_LEFT")
    private String discountLeft;

    /**
     * 优惠券种类(对应场景种类)
     */
    @Column(name = "DISCOUNT_TYPE")
    private BigDecimal discountType;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    @Column(name = "REC_STATUS")
    private String recStatus;

    public Discount(String discountId, String accountId, String discountTitle, Date discountStartDate, Date discountEndDate, String discountLogo, BigDecimal discountType, Date createTime, Date lstUpdTime, String recStatus, String discountLeft) {
        this.discountId = discountId;
        this.accountId = accountId;
        this.discountTitle = discountTitle;
        this.discountStartDate = discountStartDate;
        this.discountEndDate = discountEndDate;
        this.discountLogo = discountLogo;
        this.discountType = discountType;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
        this.discountLeft = discountLeft;
    }

    public Discount() {
        super();
    }

    /**
     * 获取优惠券ID
     *
     * @return DISCOUNT_ID - 优惠券ID
     */
    public String getDiscountId() {
        return discountId;
    }

    /**
     * 设置优惠券ID
     *
     * @param discountId 优惠券ID
     */
    public void setDiscountId(String discountId) {
        this.discountId = discountId == null ? null : discountId.trim();
    }

    /**
     * 获取优惠券所在账户ID
     *
     * @return ACCOUNT_ID - 优惠券所在账户ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置优惠券所在账户ID
     *
     * @param accountId 优惠券所在账户ID
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 获取优惠券抬头
     *
     * @return DISCOUNT_TITLE - 优惠券抬头
     */
    public String getDiscountTitle() {
        return discountTitle;
    }

    /**
     * 设置优惠券抬头
     *
     * @param discountTitle 优惠券抬头
     */
    public void setDiscountTitle(String discountTitle) {
        this.discountTitle = discountTitle == null ? null : discountTitle.trim();
    }

    /**
     * 获取优惠券开始使用日期
     *
     * @return DISCOUNT_START_DATE - 优惠券开始使用日期
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd  HH:MM:ss")
    public Date getDiscountStartDate() {
        return discountStartDate;
    }

    /**
     * 设置优惠券开始使用日期
     *
     * @param discountStartDate 优惠券开始使用日期
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd  HH:MM:ss")
    public void setDiscountStartDate(Date discountStartDate) {
        this.discountStartDate = discountStartDate;
    }

    /**
     * 获取优惠券截止使用日期
     *
     * @return DISCOUNT_END_DATE - 优惠券截止使用日期
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd  HH:MM:ss")
    public Date getDiscountEndDate() {
        return discountEndDate;
    }

    /**
     * 设置优惠券截止使用日期
     *
     * @param discountEndDate 优惠券截止使用日期
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd  HH:MM:ss")
    public void setDiscountEndDate(Date discountEndDate) {
        this.discountEndDate = discountEndDate;
    }

    /**
     * @return DISCOUNT_LOGO
     */
    public String getDiscountLogo() {
        return discountLogo;
    }

    /**
     * @param discountLogo
     */
    public void setDiscountLogo(String discountLogo) {
        this.discountLogo = discountLogo == null ? null : discountLogo.trim();
    }

    /**
     * 获取优惠券种类(对应场景种类)
     *
     * @return DISCOUNT_TYPE - 优惠券种类(对应场景种类)
     */
    public BigDecimal getDiscountType() {
        return discountType;
    }

    /**
     * 设置优惠券种类(对应场景种类)
     *
     * @param discountType 优惠券种类(对应场景种类)
     */
    public void setDiscountType(BigDecimal discountType) {
        this.discountType = discountType;
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