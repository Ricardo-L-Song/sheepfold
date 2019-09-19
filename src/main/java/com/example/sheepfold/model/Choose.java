package com.example.sheepfold.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_gr_psg_qsn_r")
public class Choose {
    /**
     * 乘客问卷关系表主键
     */
    @Id
    @Column(name = "psg_qsn_r_id")
    private String psgQsnRId;

    /**
     * 乘客ID
     */
    @Column(name = "psg_id")
    private String psgId;

    /**
     * 问卷模板ID
     */
    @Column(name = "model_id")
    private String modelId;

    /**
     * 问卷条目ID
     */
    @Column(name = "qsn_id")
    private String qsnId;

    /**
     * 问卷选项ID
     */
    @Column(name = "detail_id")
    private String detailId;

    /**
     * 选择项
     */
    private String choose;

    @Column(name = "qsn_type")
    private String qsnType;

    /**
     * 航班号
     */
    @Column(name = "flight_id")
    private String flightId;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 备用字段1
     */
    private String rmk1;

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

    public Choose(String psgQsnRId, String psgId, String modelId, String qsnId, String detailId, String choose, String qsnType, String flightId, Date createDate, String rmk1, String rmk2, String rmk3, String rmk4, String rmk5) {
        this.psgQsnRId = psgQsnRId;
        this.psgId = psgId;
        this.modelId = modelId;
        this.qsnId = qsnId;
        this.detailId = detailId;
        this.choose = choose;
        this.qsnType = qsnType;
        this.flightId = flightId;
        this.createDate = createDate;
        this.rmk1 = rmk1;
        this.rmk2 = rmk2;
        this.rmk3 = rmk3;
        this.rmk4 = rmk4;
        this.rmk5 = rmk5;
    }

    public Choose() {
        super();
    }

    /**
     * 获取乘客问卷关系表主键
     *
     * @return psg_qsn_r_id - 乘客问卷关系表主键
     */
    public String getPsgQsnRId() {
        return psgQsnRId;
    }

    /**
     * 设置乘客问卷关系表主键
     *
     * @param psgQsnRId 乘客问卷关系表主键
     */
    public void setPsgQsnRId(String psgQsnRId) {
        this.psgQsnRId = psgQsnRId == null ? null : psgQsnRId.trim();
    }

    /**
     * 获取乘客ID
     *
     * @return psg_id - 乘客ID
     */
    public String getPsgId() {
        return psgId;
    }

    /**
     * 设置乘客ID
     *
     * @param psgId 乘客ID
     */
    public void setPsgId(String psgId) {
        this.psgId = psgId == null ? null : psgId.trim();
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
     * 获取问卷条目ID
     *
     * @return qsn_id - 问卷条目ID
     */
    public String getQsnId() {
        return qsnId;
    }

    /**
     * 设置问卷条目ID
     *
     * @param qsnId 问卷条目ID
     */
    public void setQsnId(String qsnId) {
        this.qsnId = qsnId == null ? null : qsnId.trim();
    }

    /**
     * 获取问卷选项ID
     *
     * @return detail_id - 问卷选项ID
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * 设置问卷选项ID
     *
     * @param detailId 问卷选项ID
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    /**
     * 获取选择项
     *
     * @return choose - 选择项
     */
    public String getChoose() {
        return choose;
    }

    /**
     * 设置选择项
     *
     * @param choose 选择项
     */
    public void setChoose(String choose) {
        this.choose = choose == null ? null : choose.trim();
    }

    /**
     * @return qsn_type
     */
    public String getQsnType() {
        return qsnType;
    }

    /**
     * @param qsnType
     */
    public void setQsnType(String qsnType) {
        this.qsnType = qsnType == null ? null : qsnType.trim();
    }

    /**
     * 获取航班号
     *
     * @return flight_id - 航班号
     */
    public String getFlightId() {
        return flightId;
    }

    /**
     * 设置航班号
     *
     * @param flightId 航班号
     */
    public void setFlightId(String flightId) {
        this.flightId = flightId == null ? null : flightId.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取备用字段1
     *
     * @return rmk1 - 备用字段1
     */
    public String getRmk1() {
        return rmk1;
    }

    /**
     * 设置备用字段1
     *
     * @param rmk1 备用字段1
     */
    public void setRmk1(String rmk1) {
        this.rmk1 = rmk1 == null ? null : rmk1.trim();
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