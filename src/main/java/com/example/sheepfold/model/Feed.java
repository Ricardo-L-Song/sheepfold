package com.example.sheepfold.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Feed {
    /**
     * 投放编号
     */
    @Id
    @Column(name = "FEED_ID")
    private String feedId;

    /**
     * 投放记录对应的小狮子ID
     */
    @Column(name = "LION_ID")
    private String lionId;

    /**
     * 投放开始时间
     */
    @Column(name = "FEED_START_DATE")
    private Date feedStartDate;

    /**
     * 投放预期结束时间
     */
    @Column(name = "FEED_END_DATE")
    private Date feedEndDate;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    @Column(name = "REC_STATUS")
    private String recStatus;

    public Feed(String feedId, String lionId, Date feedStartDate, Date feedEndDate, Date createTime, Date lstUpdTime, String recStatus) {
        this.feedId = feedId;
        this.lionId = lionId;
        this.feedStartDate = feedStartDate;
        this.feedEndDate = feedEndDate;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
    }

    public Feed() {
        super();
    }

    /**
     * 获取投放编号
     *
     * @return FEED_ID - 投放编号
     */
    public String getFeedId() {
        return feedId;
    }

    /**
     * 设置投放编号
     *
     * @param feedId 投放编号
     */
    public void setFeedId(String feedId) {
        this.feedId = feedId == null ? null : feedId.trim();
    }

    /**
     * 获取投放记录对应的小狮子ID
     *
     * @return LION_ID - 投放记录对应的小狮子ID
     */
    public String getLionId() {
        return lionId;
    }

    /**
     * 设置投放记录对应的小狮子ID
     *
     * @param lionId 投放记录对应的小狮子ID
     */
    public void setLionId(String lionId) {
        this.lionId = lionId == null ? null : lionId.trim();
    }

    /**
     * 获取投放开始时间
     *
     * @return FEED_START_DATE - 投放开始时间
     */
    public Date getFeedStartDate() {
        return feedStartDate;
    }

    /**
     * 设置投放开始时间
     *
     * @param feedStartDate 投放开始时间
     */
    public void setFeedStartDate(Date feedStartDate) {
        this.feedStartDate = feedStartDate;
    }

    /**
     * 获取投放预期结束时间
     *
     * @return FEED_END_DATE - 投放预期结束时间
     */
    public Date getFeedEndDate() {
        return feedEndDate;
    }

    /**
     * 设置投放预期结束时间
     *
     * @param feedEndDate 投放预期结束时间
     */
    public void setFeedEndDate(Date feedEndDate) {
        this.feedEndDate = feedEndDate;
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