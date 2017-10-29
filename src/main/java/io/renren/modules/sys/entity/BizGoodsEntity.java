package io.renren.modules.sys.entity;

import org.hibernate.validator.constraints.NotBlank;

public class BizGoodsEntity {
    private int goodid;
    @NotBlank(message = "物料类型不能为空")
    private int type;  // 物料类型
    @NotBlank(message = "编号不能为空")
    private String number; // 编号
    @NotBlank(message = "名称不能为空")
    private String name;    // 名称
    @NotBlank(message = "规格不能为空")
    private String specification;   //规格
    @NotBlank(message = "储存位编码不能为空")
    private String locNumber;   // 储存位编码
    @NotBlank(message = "库存不能为空")
    private double ammount; // 库存
    @NotBlank(message = "单位不能为空")
    private String unit;    // 单位
    @NotBlank(message = "备注不能为空")
    private String remark;  // 备注
    private int status;

    public int getGoodid() {
        return goodid;
    }

    public void setGoodid(int goodid) {
        this.goodid = goodid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getLocNumber() {
        return locNumber;
    }

    public void setLocNumber(String locNumber) {
        this.locNumber = locNumber;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double account) {
        this.ammount = account;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
