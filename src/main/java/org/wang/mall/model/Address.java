package org.wang.mall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 21:58
 */
@Entity public class Address implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -8781606225475361664L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(
    length   = 50,
    nullable = false
  )
  private String address;

  @JoinColumn(name = "consumerId")
  @ManyToOne private Consumer consumer;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long            id;

  @Column(nullable = false)
  private boolean isDefaultAddress;


} // end class Address
