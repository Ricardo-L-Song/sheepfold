package com.example.sheepfold.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_gr_qsn_model")
public class Model {
    /**
     * 问卷调查模板ID
     */
    @Id
    @Column(name = "model_id")
    private String modelId;

    /**
     * 问卷调查模板名
     */
    private String name;

    /**
     * 日期
     */
    private Date time;

    /**
     * 创建人姓名
     */
    @Column(name = "create_name")
    private String createName;

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

    public Model(String modelId, String name, Date time, String createName, String rmk2, String rmk3, String rmk4, String rmk5) {
        this.modelId = modelId;
        this.name = name;
        this.time = time;
        this.createName = createName;
        this.rmk2 = rmk2;
        this.rmk3 = rmk3;
        this.rmk4 = rmk4;
        this.rmk5 = rmk5;
    }

    public Model() {
        super();
    }

    /**
     * 获取问卷调查模板ID
     *
     * @return model_id - 问卷调查模板ID
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 设置问卷调查模板ID
     *
     * @param modelId 问卷调查模板ID
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * 获取问卷调查模板名
     *
     * @return name - 问卷调查模板名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置问卷调查模板名
     *
     * @param name 问卷调查模板名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取日期
     *
     * @return time - 日期
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置日期
     *
     * @param time 日期
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取创建人姓名
     *
     * @return create_name - 创建人姓名
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置创建人姓名
     *
     * @param createName 创建人姓名
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
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