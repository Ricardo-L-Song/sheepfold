package com.example.sheepfold.model;

import javax.persistence.*;

@Table(name = "t_gr_qsn")
public class Qsn {
    /**
     * 问卷主键
     */
    @Id
    @Column(name = "qsn_id")
    private String qsnId;

    /**
     * 问卷模板ID
     */
    @Column(name = "model_id")
    private String modelId;

    /**
     * 问卷模板名
     */
    @Column(name = "model_name")
    private String modelName;

    /**
     * 排序号
     */
    @Column(name = "order_num")
    private Short orderNum;

    /**
     * 问卷条目内容
     */
    private String content;

    /**
     * 问题类型 用来确定是单选多选问答
     */
    @Column(name = "qsn_type")
    private String qsnType;

    /**
     * 航班ID
     */
    @Column(name = "flight_id")
    private String flightId;

    /**
     * 正确答案的序号
     */
    @Column(name = "true_num")
    private Short trueNum;

    /**
     * 备用字段2
     */
    private String rmk2;

    /**
     * 备用字段3
     */
    private String rmk3;

    /**
     * 备用字段4
     */
    private String rmk4;

    /**
     * 备用字段5
     */
    private String rmk5;

    public Qsn(String qsnId, String modelId, String modelName, Short orderNum, String content, String qsnType, String flightId, Short trueNum, String rmk2, String rmk3, String rmk4, String rmk5) {
        this.qsnId = qsnId;
        this.modelId = modelId;
        this.modelName = modelName;
        this.orderNum = orderNum;
        this.content = content;
        this.qsnType = qsnType;
        this.flightId = flightId;
        this.trueNum = trueNum;
        this.rmk2 = rmk2;
        this.rmk3 = rmk3;
        this.rmk4 = rmk4;
        this.rmk5 = rmk5;
    }

    public Qsn() {
        super();
    }

    /**
     * 获取问卷主键
     *
     * @return qsn_id - 问卷主键
     */
    public String getQsnId() {
        return qsnId;
    }

    /**
     * 设置问卷主键
     *
     * @param qsnId 问卷主键
     */
    public void setQsnId(String qsnId) {
        this.qsnId = qsnId == null ? null : qsnId.trim();
    }

    /**
     * 获取问卷模板ID
     *
     * @return model_id - 问卷模板ID
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 设置问卷模板ID
     *
     * @param modelId 问卷模板ID
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * 获取问卷模板名
     *
     * @return model_name - 问卷模板名
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 设置问卷模板名
     *
     * @param modelName 问卷模板名
     */
    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    /**
     * 获取排序号
     *
     * @return order_num - 排序号
     */
    public Short getOrderNum() {
        return orderNum;
    }

    /**
     * 设置排序号
     *
     * @param orderNum 排序号
     */
    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取问卷条目内容
     *
     * @return content - 问卷条目内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置问卷条目内容
     *
     * @param content 问卷条目内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取问题类型 用来确定是单选多选问答
     *
     * @return qsn_type - 问题类型 用来确定是单选多选问答
     */
    public String getQsnType() {
        return qsnType;
    }

    /**
     * 设置问题类型 用来确定是单选多选问答
     *
     * @param qsnType 问题类型 用来确定是单选多选问答
     */
    public void setQsnType(String qsnType) {
        this.qsnType = qsnType == null ? null : qsnType.trim();
    }

    /**
     * 获取航班ID
     *
     * @return flight_id - 航班ID
     */
    public String getFlightId() {
        return flightId;
    }

    /**
     * 设置航班ID
     *
     * @param flightId 航班ID
     */
    public void setFlightId(String flightId) {
        this.flightId = flightId == null ? null : flightId.trim();
    }

    /**
     * 获取正确答案的序号
     *
     * @return true_num - 正确答案的序号
     */
    public Short getTrueNum() {
        return trueNum;
    }

    /**
     * 设置正确答案的序号
     *
     * @param trueNum 正确答案的序号
     */
    public void setTrueNum(Short trueNum) {
        this.trueNum = trueNum;
    }

    /**
     * 获取备用字段2
     *
     * @return rmk2 - 备用字段2
     */
    public String getRmk2() {
        return rmk2;
    }

    /**
     * 设置备用字段2
     *
     * @param rmk2 备用字段2
     */
    public void setRmk2(String rmk2) {
        this.rmk2 = rmk2 == null ? null : rmk2.trim();
    }

    /**
     * 获取备用字段3
     *
     * @return rmk3 - 备用字段3
     */
    public String getRmk3() {
        return rmk3;
    }

    /**
     * 设置备用字段3
     *
     * @param rmk3 备用字段3
     */
    public void setRmk3(String rmk3) {
        this.rmk3 = rmk3 == null ? null : rmk3.trim();
    }

    /**
     * 获取备用字段4
     *
     * @return rmk4 - 备用字段4
     */
    public String getRmk4() {
        return rmk4;
    }

    /**
     * 设置备用字段4
     *
     * @param rmk4 备用字段4
     */
    public void setRmk4(String rmk4) {
        this.rmk4 = rmk4 == null ? null : rmk4.trim();
    }

    /**
     * 获取备用字段5
     *
     * @return rmk5 - 备用字段5
     */
    public String getRmk5() {
        return rmk5;
    }

    /**
     * 设置备用字段5
     *
     * @param rmk5 备用字段5
     */
    public void setRmk5(String rmk5) {
        this.rmk5 = rmk5 == null ? null : rmk5.trim();
    }
}