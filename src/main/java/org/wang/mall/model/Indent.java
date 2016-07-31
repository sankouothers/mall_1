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
@Entity
@Table
public class Indent implements Serializable {
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


} // end class Indent
