package com.managMoney.entity;

import java.util.Date;

public class Bill {
    private long billId;
    private String billType; //�˵�����/�����֧���˵�
    private String billClass; //�˵����/����ʳ���罻
    private String billName;
    private float billMoney;
    private Date createTime;//����ʱ��
    private String payTime;

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillClass() {
        return billClass;
    }

    public void setBillClass(String billClass) {
        this.billClass = billClass;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public float getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(float billMoney) {
        this.billMoney = billMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void addBill() {

    }

    public void deleteBill() {

    }

    public void modifyBill() {

    }

    public void selectBill() {

    }
}
