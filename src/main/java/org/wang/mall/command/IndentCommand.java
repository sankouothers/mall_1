package org.wang.mall.command;

import java.util.Date;
import java.util.List;

import org.wang.mall.model.Address;
import org.wang.mall.model.Commodity;
import org.wang.mall.model.Consumer;
import org.wang.mall.model.Indent;
import org.wang.mall.model.Merchant;
import org.wang.mall.util.Util;


/**
 * Created by ozintel06 on 16/9/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/04/2016 16:03
 */
public class IndentCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Long addressId;

  private Long    commodityId;
  private String  commodityName;
  private String  createDate;
  private Long    id;
  private String  phoneNumber;
  private Integer price;
  private Integer totalNumber;

  private String userName;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new IndentCommand object.
   */
  public IndentCommand() { }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address id.
   *
   * @return  Long
   */
  public Long getAddressId() {
    return addressId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for commodity id.
   *
   * @return  Long
   */
  public Long getCommodityId() {
    return commodityId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for commodity name.
   *
   * @return  String
   */
  public String getCommodityName() {
    return commodityName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  String
   */
  public String getCreateDate() {
    return createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Long
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for phone number.
   *
   * @return  String
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for price.
   *
   * @return  Integer
   */
  public Integer getPrice() {
    return price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for total number.
   *
   * @return  Integer
   */
  public Integer getTotalNumber() {
    return totalNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for user name.
   *
   * @return  String
   */
  public String getUserName() {
    return userName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for address id.
   *
   * @param  addressId  Long
   */
  public void setAddressId(Long addressId) {
    this.addressId = addressId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for commodity id.
   *
   * @param  commodityId  Long
   */
  public void setCommodityId(Long commodityId) {
    this.commodityId = commodityId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  String
   */
  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Long
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for phone number.
   *
   * @param  phoneNumber  String
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for total number.
   *
   * @param  totalNumber  Integer
   */
  public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toShoppingCar.
   *
   * @param  indent  Indent
   */
  public void toShoppingCar(Indent indent) {
    this.setId(indent.getId());
    this.setCreateDate(Util.sdf.format(indent.getCreateDate()));

    if (indent.getCommodity() != null) {
      this.setCommodityName(indent.getCommodity().getName());
      this.setPrice(indent.getCommodity().getPrice());
    }

    if (indent.getConsumer() != null) {
      this.setUserName(indent.getConsumer().getName());
    }
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  private void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  private void setPrice(Integer price) {
    this.price = price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  private void setUserName(String userName) {
    this.userName = userName;
  }
} // end class IndentCommand
