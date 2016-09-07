package org.wang.mall.command;

import java.util.Date;

import org.wang.mall.model.Merchant;
import org.wang.mall.util.Util;


/**
 * Created by ozintel06 on 16/8/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/07/2016 22:19
 */
public class MerchantCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String answer;

  private String create     = "F";
  private String createDate;

  private Long id;

  private String IDcard;

  private String name;

  private String passWord;

  private String passWordValidator;

  private String phoneNumber;

  private String question;

  private String userName;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new MerchantCommand object.
   */
  public MerchantCommand() { }

  /**
   * Creates a new MerchantCommand object.
   *
   * @param  merchant  Merchant
   */
  public MerchantCommand(Merchant merchant) {
    this.id          = merchant.getId();
    this.IDcard      = merchant.getIDcard();
    this.name        = merchant.getName();
    this.phoneNumber = merchant.getPhoneNumber();
    this.userName    = merchant.getUserName();
    this.createDate  = Util.sdf.format(merchant.getCreateDate());
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * edit.
   *
   * @param   merchant  Merchant
   * @param   command   MerchantCommand
   *
   * @return  Merchant
   */
  public Merchant edit(Merchant merchant, MerchantCommand command) {
    if (!merchant.getName().equals(command.getName())) {
      merchant.setName(command.getName());
    }

    if (!merchant.getPhoneNumber().equals(command.getPhoneNumber())) {
      merchant.setPhoneNumber(command.getPhoneNumber());
    }

    return merchant;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for answer.
   *
   * @return  String
   */
  public String getAnswer() {
    return answer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create.
   *
   * @return  String
   */
  public String getCreate() {
    return create;
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
   * getter method for IDcard.
   *
   * @return  String
   */
  public String getIDcard() {
    return IDcard;
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
   * getter method for pass word.
   *
   * @return  String
   */
  public String getPassWord() {
    return passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for pass word validator.
   *
   * @return  String
   */
  public String getPassWordValidator() {
    return passWordValidator;
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
   * getter method for question.
   *
   * @return  String
   */
  public String getQuestion() {
    return question;
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
   * setter method for answer.
   *
   * @param  answer  String
   */
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create.
   *
   * @param  create  String
   */
  public void setCreate(String create) {
    this.create = create;
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
   * setter method for IDcard.
   *
   * @param  IDcard  String
   */
  public void setIDcard(String IDcard) {
    this.IDcard = IDcard;
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
   * setter method for pass word.
   *
   * @param  passWord  String
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for pass word validator.
   *
   * @param  passWordValidator  String
   */
  public void setPassWordValidator(String passWordValidator) {
    this.passWordValidator = passWordValidator;
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
   * setter method for question.
   *
   * @param  question  String
   */
  public void setQuestion(String question) {
    this.question = question;
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
   * toMerchant.
   *
   * @param   command  MerchantCommand
   *
   * @return  Merchant
   */
  public Merchant toMerchant(MerchantCommand command) {
    Merchant merchant = new Merchant();
    merchant.setName(command.getName());
    merchant.setQuestion(command.getQuestion());
    merchant.setIDcard(command.getIDcard());
    merchant.setPhoneNumber(command.getPhoneNumber());
    merchant.setAnswer(command.getAnswer());
    merchant.setCreateDate(new Date());
    merchant.setPassWord(command.getPassWord());
    merchant.setUserName(command.getUserName());

    return merchant;
  }
} // end class MerchantCommand
