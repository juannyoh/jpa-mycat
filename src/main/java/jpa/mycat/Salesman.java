package jpa.mycat;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by ssab on 17-1-5.
 */
@Entity
@Table(name = "salesman")
public class Salesman {
  @Id
  @GenericGenerator(name = "idgen", strategy = "increment")
  @GeneratedValue(generator = "idgen")
  @Column(name = "id")
  private Long id;//业务员ID

  private String userNum;//工号

  private String trueName;//真实姓名

  private String address;//地址

  private String avatarPicUrl;//头像的图片地址

  private String telephone;//固定电话:区号-号码

  private String mobile;//手机号码

  private int disabled;//是否作废0否1是

  private String remark;//备注

  private String appUserId;//备用userId字段(外勤APP用)

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserNum() {
    return userNum;
  }

  public void setUserNum(String userNum) {
    this.userNum = userNum;
  }

  public String getTrueName() {
    return trueName;
  }

  public void setTrueName(String trueName) {
    this.trueName = trueName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAvatarPicUrl() {
    return avatarPicUrl;
  }

  public void setAvatarPicUrl(String avatarPicUrl) {
    this.avatarPicUrl = avatarPicUrl;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public int getDisabled() {
    return disabled;
  }

  public void setDisabled(int disabled) {
    this.disabled = disabled;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getAppUserId() {
    return appUserId;
  }

  public void setAppUserId(String appUserId) {
    this.appUserId = appUserId;
  }

  @Override
  public String toString() {
    return "Salesman{" +
        "id=" + id +
        ", userNum='" + userNum + '\'' +
        ", trueName='" + trueName + '\'' +
        ", address='" + address + '\'' +
        ", avatarPicUrl='" + avatarPicUrl + '\'' +
        ", telephone='" + telephone + '\'' +
        ", mobile='" + mobile + '\'' +
        ", disabled=" + disabled +
        ", remark='" + remark + '\'' +
        ", appUserId='" + appUserId + '\'' +
        '}';
  }
}
