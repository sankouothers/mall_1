package org.wang.mall.command;

import org.wang.mall.model.Address;
import org.wang.mall.model.Consumer;

/**
 * Created by ozintel06 on 16/9/5.
 */
public class AddressCommand {
  private Long id;
  private String address;
  private Boolean defaultAddress = false;
  private Long consumerId;
  private Long indentId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Consumer getConsumer() {
    return consumer;
  }

  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }

  private Consumer consumer;

  public Long getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(Long consumerId) {
    this.consumerId = consumerId;
  }

  public Address toAddress(AddressCommand addressCommand) {
    Address address = new Address();
    if (addressCommand.getConsumerId() != null){
      Consumer consumer = new Consumer();
      consumer.setId(addressCommand.getConsumerId());
      address.setConsumer(consumer);
    }

    address.setId(addressCommand.getId());
    address.setAddress(addressCommand.getAddress());
    address.setDefaultAddress(addressCommand.getDefaultAddress());
    return address;
  }

  public Long getIndentId() {
    return indentId;
  }

  public void setIndentId(Long indentId) {
    this.indentId = indentId;
  }

  public Boolean getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(Boolean defaultAddress) {
    this.defaultAddress = defaultAddress;
  }
}
