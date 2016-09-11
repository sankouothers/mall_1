package org.wang.mall.command;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.wang.mall.model.Brand;
import org.wang.mall.model.Category;
import org.wang.mall.model.Commodity;
import org.wang.mall.model.Effect;
import org.wang.mall.model.Indent;
import org.wang.mall.model.Merchant;


/**
 * Created by ozintel06 on 16/9/11.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/11/2016 23:50
 */
public class CommodityCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Brand          brand;
  private Long           brandId;
  private List<Brand>    brandList;
  private Category       category;
  private Long           categoryId;
  private List<Category> categoryList;
  private Date           createDate;
  private Effect         effect;
  private Long           effectId;
  private List<Effect>   effectList;
  private Long           id;
  private List<Indent>   indentSet;
  private Boolean        isPutaway;
  private Long           merchantId;
  private String         name;
  private Integer        price;
  private Date           putawayTime;
  private Integer        sales;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * getter method for brand.
   *
   * @return  Brand
   */
  public Brand getBrand() {
    return brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for brand id.
   *
   * @return  Long
   */
  public Long getBrandId() {
    return brandId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for brand list.
   *
   * @return  List
   */
  public List<Brand> getBrandList() {
    return brandList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for category.
   *
   * @return  Category
   */
  public Category getCategory() {
    return category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for category id.
   *
   * @return  Long
   */
  public Long getCategoryId() {
    return categoryId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for category list.
   *
   * @return  List
   */
  public List<Category> getCategoryList() {
    return categoryList;
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
   * getter method for effect.
   *
   * @return  Effect
   */
  public Effect getEffect() {
    return effect;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for effect id.
   *
   * @return  Long
   */
  public Long getEffectId() {
    return effectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for effect list.
   *
   * @return  List
   */
  public List<Effect> getEffectList() {
    return effectList;
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
   * getter method for indent set.
   *
   * @return  List
   */
  public List<Indent> getIndentSet() {
    return indentSet;
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
   * getter method for putaway.
   *
   * @return  Boolean
   */
  public Boolean getPutaway() {
    return isPutaway;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for putaway time.
   *
   * @return  Date
   */
  public Date getPutawayTime() {
    return putawayTime;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for sales.
   *
   * @return  Integer
   */
  public Integer getSales() {
    return sales;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for brand.
   *
   * @param  brand  Brand
   */
  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for brand id.
   *
   * @param  brandId  Long
   */
  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for brand list.
   *
   * @param  brandList  List
   */
  public void setBrandList(List<Brand> brandList) {
    this.brandList = brandList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for category.
   *
   * @param  category  Category
   */
  public void setCategory(Category category) {
    this.category = category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for category id.
   *
   * @param  categoryId  Long
   */
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for category list.
   *
   * @param  categoryList  List
   */
  public void setCategoryList(List<Category> categoryList) {
    this.categoryList = categoryList;
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
   * setter method for effect.
   *
   * @param  effect  Effect
   */
  public void setEffect(Effect effect) {
    this.effect = effect;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for effect id.
   *
   * @param  effectId  Long
   */
  public void setEffectId(Long effectId) {
    this.effectId = effectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for effect list.
   *
   * @param  effectList  List
   */
  public void setEffectList(List<Effect> effectList) {
    this.effectList = effectList;
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
   * setter method for indent set.
   *
   * @param  indentSet  List
   */
  public void setIndentSet(List<Indent> indentSet) {
    this.indentSet = indentSet;
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for putaway.
   *
   * @param  putaway  Boolean
   */
  public void setPutaway(Boolean putaway) {
    isPutaway = putaway;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for putaway time.
   *
   * @param  putawayTime  Date
   */
  public void setPutawayTime(Date putawayTime) {
    this.putawayTime = putawayTime;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for sales.
   *
   * @param  sales  Integer
   */
  public void setSales(Integer sales) {
    this.sales = sales;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toCommodity.
   *
   * @param   command  CommodityCommand
   *
   * @return  Commodity
   */
  public Commodity toCommodity(CommodityCommand command) {
    Commodity commodity = new Commodity();
    commodity.setId(command.getId());
    commodity.setPrice(command.getPrice());
    commodity.setPutaway(command.getPutaway());
    commodity.setPutawayTime(command.getPutawayTime());
    commodity.setSales(command.getSales());
    commodity.setName(command.getName());


    if (command.getCategoryId() != null) {
      Category category = new Category();
      category.setId(command.getCategoryId());
      commodity.setCategory(category);
    }

    commodity.setCreateDate(new Date());

    if (command.getMerchantId() != null) {
      Merchant merchant = new Merchant();
      merchant.setId(command.getMerchantId());
      commodity.setMerchant(merchant);
    }

    if (command.getBrandId() != null) {
      Brand brand = new Brand();
      brand.setId(command.getBrandId());
      commodity.setBrand(brand);
    }

    if (command.getEffectId() != null) {
      Effect effect = new Effect();
      effect.setId(command.getEffectId());
      commodity.setEffect(effect);
    }

    return commodity;
  } // end method toCommodity
} // end class CommodityCommand
