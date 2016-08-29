package org.wang.mall.command;

import org.wang.mall.model.Commodity;


/**
 * Created by ozintel06 on 16/8/29.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/29/2016 16:48
 */
public class CommodityInfoCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String  brand;
  private String  category;
  private String  effect;
  private Long    id;
  private String  name;
  private Integer price;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new CommodityInfoCommand object.
   */
  public CommodityInfoCommand() { }

  /**
   * Creates a new CommodityInfoCommand object.
   *
   * @param  commodity  Commodity
   */
  public CommodityInfoCommand(Commodity commodity) {
    this.name  = commodity.getName();
    this.id    = commodity.getId();
    this.price = commodity.getPrice();

    if (commodity.getBrand() != null) {
      this.brand = commodity.getBrand().getName();
    }

    if (commodity.getCategory() != null) {
      this.category = commodity.getCategory().getName();
    }

    if (commodity.getEffect() != null) {
      this.effect = commodity.getEffect().getName();
    }
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for brand.
   *
   * @return  String
   */
  public String getBrand() {
    return brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for category.
   *
   * @return  String
   */
  public String getCategory() {
    return category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for effect.
   *
   * @return  String
   */
  public String getEffect() {
    return effect;
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
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
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
   * setter method for brand.
   *
   * @param  brand  String
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for category.
   *
   * @param  category  String
   */
  public void setCategory(String category) {
    this.category = category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for effect.
   *
   * @param  effect  String
   */
  public void setEffect(String effect) {
    this.effect = effect;
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
   * setter method for name.
   *
   * @param  name  String
   */
  public void setName(String name) {
    this.name = name;
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

} // end class CommodityInfoCommand
