package com.example.sheepfold.model;

import javax.persistence.*;

@Table(name = "t_gr_qsn_detail")
public class Detail {
    /**
     * 问卷数据ID
     */
    @Id
    @Column(name = "detail_id")
    private String detailId;

    /**
     * 问卷条目ID
     */
    @Column(name = "qsn_id")
    private String qsnId;

    /**
     * 选项内容
     */
    @Column(name = "option_num")
    private String optionNum;

    /**
     * 顺序
     */
    @Column(name = "order_num")
    private Short orderNum;

    /**
     * 数据类型 0:单选 1:复选
     */
    private String type;

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

    public Detail(String detailId, String qsnId, String optionNum, Short orderNum, String type, String rmk1, String rmk2, String rmk3, String rmk4, String rmk5) {
        this.detailId = detailId;
        this.qsnId = qsnId;
        this.optionNum = optionNum;
        this.orderNum = orderNum;
        this.type = type;
        this.rmk1 = rmk1;
        this.rmk2 = rmk2;
        this.rmk3 = rmk3;
        this.rmk4 = rmk4;
        this.rmk5 = rmk5;
    }

    public Detail() {
        super();
    }

    /**
     * 获取问卷数据ID
     *
     * @return detail_id - 问卷数据ID
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * 设置问卷数据ID
     *
     * @param detailId 问卷数据ID
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
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
     * 获取选项内容
     *
     * @return option_num - 选项内容
     */
    public String getOptionNum() {
        return optionNum;
    }

    /**
     * 设置选项内容
     *
     * @param optionNum 选项内容
     */
    public void setOptionNum(String optionNum) {
        this.optionNum = optionNum == null ? null : optionNum.trim();
    }

    /**
     * 获取顺序
     *
     * @return order_num - 顺序
     */
    public Short getOrderNum() {
        return orderNum;
    }

    /**
     * 设置顺序
     *
     * @param orderNum 顺序
     */
    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取数据类型 0:单选 1:复选
     *
     * @return type - 数据类型 0:单选 1:复选
     */
    public String getType() {
        return type;
    }

    /**
     * 设置数据类型 0:单选 1:复选
     *
     * @param type 数据类型 0:单选 1:复选
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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