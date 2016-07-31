package org.wang.mall.model;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 21:48
 */
@Entity public class Commodity implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = 9082039051529571936L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn(name = "brandId")
  @ManyToOne private Brand brand;

  @JoinColumn(name = "categoryId")
  @ManyToOne private Category category;

  @Column(nullable = false)
  private Date createDate;

  @OneToMany
  private Set<Indent> indentSet;

  @JoinColumn(name = "effectId")
  @ManyToOne private Effect effect;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long          id;

  @Column private Boolean isPutaway;

  @JoinTable(
    name               = "Merchant_commodity",
    joinColumns        = { @JoinColumn(name = "commodityId") },
    inverseJoinColumns = { @JoinColumn(name = "merchantId") }
  )
  @ManyToMany private Set<Merchant> merchantSet;


  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  @Column(nullable = false)
  private Integer price;

  @Column private Date putawayTime;

  @Column private Integer sales;


} // end class Commodity
