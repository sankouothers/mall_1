package org.wang.mall.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 22:17
 */
@Entity @Table public class Indent implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -4294610589178532064L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn(name = "addressId")
  @ManyToOne private Address address;

  @JoinColumn(name = "commodityId")
  @ManyToOne private Commodity commodity;

  @JoinColumn(name = "consumerId")
  @ManyToOne private Consumer consumer;

  @Column(nullable = false)
  private Date createDate;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  @Column private boolean isConfirm;
  @Column private boolean isPickup;

  @Column private boolean isShipping;

  @JoinColumn(name = "merchantId")
  @ManyToOne private Merchant merchant;

  @Column(length = 11)
  private String          phoneNumber;
  @Column private Integer totalNumber;
  @Column private Integer totalPrice;
  @Column private String  userName;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address.
   *
   * @return  Address
   */
  public Address getAddress() {
    return address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for commodity.
   *
   * @return  Commodity
   */
  public Commodity getCommodity() {
    return commodity;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for consumer.
   *
   * @return  Consumer
   */
  public Consumer getConsumer() {
    return consumer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  Date
   */
  public Date getCreateDate() {
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
   * getter method for merchant.
   *
   * @return  Merchant
   */
  public Merchant getMerchant() {
    return merchant;
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
   * getter method for total number.
   *
   * @return  Integer
   */
  public Integer getTotalNumber() {
    return totalNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for total price.
   *
   * @return  Integer
   */
  public Integer getTotalPrice() {
    return totalPrice;
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
   * getter method for confirm.
   *
   * @return  boolean
   */
  public boolean isConfirm() {
    return isConfirm;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for pickup.
   *
   * @return  boolean
   */
  public boolean isPickup() {
    return isPickup;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for shipping.
   *
   * @return  boolean
   */
  public boolean isShipping() {
    return isShipping;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for address.
   *
   * @param  address  Address
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for commodity.
   *
   * @param  commodity  Commodity
   */
  public void setCommodity(Commodity commodity) {
    this.commodity = commodity;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for confirm.
   *
   * @param  confirm  boolean
   */
  public void setConfirm(boolean confirm) {
    isConfirm = confirm;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for consumer.
   *
   * @param  consumer  Consumer
   */
  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  Date
   */
  public void setCreateDate(Date createDate) {
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
   * setter method for merchant.
   *
   * @param  merchant  Merchant
   */
  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
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
   * setter method for pickup.
   *
   * @param  pickup  boolean
   */
  public void setPickup(boolean pickup) {
    isPickup = pickup;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for shipping.
   *
   * @param  shipping  boolean
   */
  public void setShipping(boolean shipping) {
    isShipping = shipping;
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
   * setter method for total price.
   *
   * @param  totalPrice  Integer
   */
  public void setTotalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for user name.
   *
   * @param  userName  String
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }


} // end class Indent
