package org.wang.mall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 21:59
 */
@Entity public class Brand implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -7083109822529113089L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  @Column(
    length   = 12,
    nullable = false
  )
  private String name;



} // end class Brand
