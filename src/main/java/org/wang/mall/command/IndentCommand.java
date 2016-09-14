package org.wang.mall.command;

import java.text.ParsePosition;

import java.util.ArrayList;
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

  private Long          addressId;
  private List<Address> addressList;

  private Long    commodityId;
  private String  commodityName;
  private Long    consumerId;
  private String  createAddress;
  private String  createDate;
  private Long    id;
  private Long    merchantId;
  private String  phoneNumber;
  private Integer price;
  private String  state;
  private Integer totalNumber;
  private Integer totalPrice;

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
   * getter method for address list.
   *
   * @return  List
   */
  public List<Address> getAddressList() {
    return addressList;
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
   * getter method for consumer id.
   *
   * @return  Long
   */
  public Long getConsumerId() {
    return consumerId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create address.
   *
   * @return  String
   */
  public String getCreateAddress() {
    return createAddress;
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
   * getter method for merchant id.
   *
   * @return  Long
   */
  public Long getMerchantId() {
    return merchantId;
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
   * getter method for state.
   *
   * @return  String
   */
  public String getState() {
    return state;
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
   * setter method for address id.
   *
   * @param  addressId  Long
   */
  public void setAddressId(Long addressId) {
    this.addressId = addressId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for address list.
   *
   * @param  addressList  List
   */
  public void setAddressList(List<Address> addressList) {
    this.addressList = addressList;
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
   * setter method for commodity name.
   *
   * @param  commodityName  String
   */
  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for consumer id.
   *
   * @param  consumerId  Long
   */
  public void setConsumerId(Long consumerId) {
    this.consumerId = consumerId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create address.
   *
   * @param  createAddress  String
   */
  public void setCreateAddress(String createAddress) {
    this.createAddress = createAddress;
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
   * setter method for merchant id.
   *
   * @param  merchantId  Long
   */
  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
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
   * setter method for price.
   *
   * @param  price  Integer
   */
  public void setPrice(Integer price) {
    this.price = price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for state.
   *
   * @param  state  String
   */
  public void setState(String state) {
    this.state = state;
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toAllIndent.
   *
   * @param  indent  Indent
   */
  public void toAllIndent(Indent indent) {
    this.setId(indent.getId());

    if (indent.getCommodity() != null) {
      this.setCommodityName(indent.getCommodity().getName());
      this.setPrice(indent.getCommodity().getPrice());
    }

    this.setCreateDate(Util.sdf.format(indent.getCreateDate()));
    this.setTotalPrice(indent.getTotalPrice());
    this.setTotalNumber(indent.getTotalNumber());

    if (!indent.isShipping() && !indent.isPickup()) {
      this.setState("waitShipping");
    } else if (indent.isShipping() && !indent.isPickup()) {
      this.setState("waitPickup");
    } else if (indent.isShipping() && indent.isPickup()) {
      this.setState("isPickup");
    }
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toBuy.
   *
   * @param  indent       Indent
   * @param  addressList  List
   */
  public void toBuy(Indent indent, List<Address> addressList) {
    List<Address> list = new ArrayList<Address>();
    List<Address> a    = new ArrayList<Address>();

    for (Address address : addressList) {
      if (address.isDefaultAddress()) {
        list.add(address);
      } else {
        a.add(address);
      }
    }

    list.addAll(a);
    this.setAddressList(list);
    this.setId(indent.getId());
    this.setTotalNumber(1);
    this.setCreateDate(Util.sdf.format(indent.getCreateDate()));

    if (indent.getCommodity() != null) {
      this.setCommodityName(indent.getCommodity().getName());
      this.setCommodityId(indent.getCommodity().getId());
      this.setPrice(indent.getCommodity().getPrice());
      this.setTotalPrice(indent.getCommodity().getPrice());
    }

    if (indent.getMerchant() != null) {
      this.setMerchantId(indent.getMerchant().getId());
    }

    if (indent.getConsumer() != null) {
      this.setUserName(indent.getConsumer().getName());
      this.setConsumerId(indent.getConsumer().getId());
      this.setPhoneNumber(indent.getConsumer().getPhoneNumber());
    }
  } // end method toBuy

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toIndent.
   *
   * @param   indentCommand  IndentCommand
   *
   * @return  Indent
   */
  public Indent toIndent(IndentCommand indentCommand) {
    Indent indent = new Indent();

    if (indentCommand.getConsumerId() != null) {
      Consumer consumer = new Consumer();
      consumer.setId(indentCommand.getConsumerId());
      indent.setConsumer(consumer);
    }

    if (indentCommand.getCommodityId() != null) {
      Commodity commodity = new Commodity();
      commodity.setId(indentCommand.getCommodityId());
      indent.setCommodity(commodity);
    }

    if (indentCommand.getAddressId() != null) {
      Address address = new Address();
      address.setId(indentCommand.getAddressId());
      indent.setAddress(address);
    }

    if (indentCommand.getMerchantId() != null) {
      Merchant merchant = new Merchant();
      merchant.setId(indentCommand.getMerchantId());
      indent.setMerchant(merchant);
    }

    indent.setPhoneNumber(indentCommand.getPhoneNumber());
    indent.setShipping(false);
    indent.setPickup(false);
    indent.setUserName(indentCommand.getUserName());
    indent.setConfirm(true);


    indent.setCreateDate(Util.sdf.parse(indentCommand.getCreateDate(), new ParsePosition(0)));
    indent.setId(indentCommand.getId());
    indent.setTotalNumber(indentCommand.getTotalNumber());
    indent.setTotalPrice(indentCommand.getTotalPrice());

    return indent;
  } // end method toIndent

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toMerchantIndent.
   *
   * @param  indent  Indent
   */
  public void toMerchantIndent(Indent indent) {
    this.setId(indent.getId());

    if (indent.getCommodity() != null) {
      this.setCommodityName(indent.getCommodity().getName());
      this.setPrice(indent.getCommodity().getPrice());
    }

    this.setCreateDate(Util.sdf.format(indent.getCreateDate()));
    this.setTotalPrice(indent.getTotalPrice());
    this.setTotalNumber(indent.getTotalNumber());

    if (!indent.isShipping() && !indent.isPickup()) {
      this.setState("DengDaiFaHuo");
    } else if (indent.isShipping() && !indent.isPickup()) {
      this.setState("ZhengZaiYunShu");
    }
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toShoppingCar.
   *
   * @param  indent  Indent
   */
  public void toShoppingCart(Indent indent) {
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
} // end class IndentCommand
