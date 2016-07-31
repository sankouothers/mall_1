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
import javax.persistence.OneToMany;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 21:48
 */
@Entity public class Merchant implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -8954876391070126047L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(
    length   = 100,
    nullable = false
  )
  private String answer;

  @JoinTable(
    name               = "Merchant_commodity",
    joinColumns        = { @JoinColumn(name = "merchantId") },
    inverseJoinColumns = { @JoinColumn(name = "commodityId") }
  )
  @ManyToMany private Set<Commodity> commoditySet;

  @Column(nullable = false)
  private Date createDate;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  @Column(
    length   = 18,
    nullable = false
  )
  private String IDcard;


  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  @OneToMany
  private Set<Indent> indentSet;

  @Column(
    length   = 16,
    nullable = false
  )
  private String passWord;


  @Column(
    length   = 11,
    nullable = false
  )
  private String phoneNumber;

  @Column(
    length   = 100,
    nullable = false
  )
  private String problem;


} // end class Merchant
