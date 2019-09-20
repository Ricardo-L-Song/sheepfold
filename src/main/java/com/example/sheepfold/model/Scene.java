package com.example.sheepfold.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Scene {
    /**
     * 场景ID
     */
    @Id
    @Column(name = "SCENE_ID")
    private String sceneId;

    /**
     * 场景种类
     */
    @Column(name = "SCENE_TYPE")
    private BigDecimal sceneType;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LST_UPD_TIME")
    private Date lstUpdTime;

    @Column(name = "REC_STATUS")
    private String recStatus;

    public Scene(String sceneId, BigDecimal sceneType, Date createTime, Date lstUpdTime, String recStatus) {
        this.sceneId = sceneId;
        this.sceneType = sceneType;
        this.createTime = createTime;
        this.lstUpdTime = lstUpdTime;
        this.recStatus = recStatus;
    }

    public Scene() {
        super();
    }

    /**
     * 获取场景ID
     *
     * @return SCENE_ID - 场景ID
     */
    public String getSceneId() {
        return sceneId;
    }

    /**
     * 设置场景ID
     *
     * @param sceneId 场景ID
     */
    public void setSceneId(String sceneId) {
        this.sceneId = sceneId == null ? null : sceneId.trim();
    }

    /**
     * 获取场景种类
     *
     * @return SCENE_TYPE - 场景种类
     */
    public BigDecimal getSceneType() {
        return sceneType;
    }

    /**
     * 设置场景种类
     *
     * @param sceneType 场景种类
     */
    public void setSceneType(BigDecimal sceneType) {
        this.sceneType = sceneType;
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