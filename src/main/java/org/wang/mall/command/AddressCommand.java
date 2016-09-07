package org.wang.mall.command;

import org.wang.mall.model.Address;
import org.wang.mall.model.Consumer;


/**
 * Created by ozintel06 on 16/9/5.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/07/2016 16:56
 */
public class AddressCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String address;

  private Consumer consumer;
  private Long     consumerId;
  private Boolean  defaultAddress = false;
  private Long     id;
  private Long     indentId;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address.
   *
   * @return  String
   */
  public String getAddress() {
    return address;
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
   * getter method for consumer id.
   *
   * @return  Long
   */
  public Long getConsumerId() {
    return consumerId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for default address.
   *
   * @return  Boolean
   */
  public Boolean getDefaultAddress() {
    return defaultAddress;
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
   * getter method for indent id.
   *
   * @return  Long
   */
  public Long getIndentId() {
    return indentId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for address.
   *
   * @param  address  String
   */
  public void setAddress(String address) {
    this.address = address;
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
   * setter method for consumer id.
   *
   * @param  consumerId  Long
   */
  public void setConsumerId(Long consumerId) {
    this.consumerId = consumerId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for default address.
   *
   * @param  defaultAddress  Boolean
   */
  public void setDefaultAddress(Boolean defaultAddress) {
    this.defaultAddress = defaultAddress;
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
   * setter method for indent id.
   *
   * @param  indentId  Long
   */
  public void setIndentId(Long indentId) {
    this.indentId = indentId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toAddress.
   *
   * @param   addressCommand  AddressCommand
   *
   * @return  Address
   */
  public Address toAddress(AddressCommand addressCommand) {
    Address address = new Address();

    if (addressCommand.getConsumerId() != null) {
      Consumer consumer = new Consumer();
      consumer.setId(addressCommand.getConsumerId());
      address.setConsumer(consumer);
    }

    address.setId(addressCommand.getId());
    address.setAddress(addressCommand.getAddress());
    address.setDefaultAddress(addressCommand.getDefaultAddress());

    return address;
  }
} // end class AddressCommand
