package com.example.sheepfold.model;

import javax.persistence.*;

@Table(name = "t_gr_psg")
public class Psg {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "psg_id")
    private String psgId;

    /**
     * 用户编号
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 备用字段1
     */
    private String email;

    /**
     * 备用字段2
     */
    private String phone;

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

    public Psg(String psgId, String name, String password, String email, String phone, String rmk3, String rmk4, String rmk5) {
        this.psgId = psgId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.rmk3 = rmk3;
        this.rmk4 = rmk4;
        this.rmk5 = rmk5;
    }

    public Psg() {
        super();
    }

    /**
     * 获取用户ID
     *
     * @return psg_id - 用户ID
     */
    public String getPsgId() {
        return psgId;
    }

    /**
     * 设置用户ID
     *
     * @param psgId 用户ID
     */
    public void setPsgId(String psgId) {
        this.psgId = psgId == null ? null : psgId.trim();
    }

    /**
     * 获取用户编号
     *
     * @return name - 用户编号
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户编号
     *
     * @param name 用户编号
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取备用字段1
     *
     * @return email - 备用字段1
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置备用字段1
     *
     * @param email 备用字段1
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取备用字段2
     *
     * @return phone - 备用字段2
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置备用字段2
     *
     * @param phone 备用字段2
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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