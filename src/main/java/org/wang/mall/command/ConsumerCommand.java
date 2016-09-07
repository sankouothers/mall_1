package org.wang.mall.command;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.wang.mall.model.Address;
import org.wang.mall.model.Consumer;
import org.wang.mall.model.Indent;
import org.wang.mall.util.Util;


/**
 * Created by ozintel06 on 16/8/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/07/2016 22:40
 */
public class ConsumerCommand {
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

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new ConsumerCommand object.
   */
  public ConsumerCommand() { }

  /**
   * Creates a new ConsumerCommand object.
   *
   * @param  consumer  Consumer
   */
  public ConsumerCommand(Consumer consumer) {
    this.id          = consumer.getId();
    this.IDcard      = consumer.getIDcard();
    this.name        = consumer.getName();
    this.phoneNumber = consumer.getPhoneNumber();
    this.createDate  = Util.sdf.format(consumer.getCreateDate());
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * edit.
   *
   * @param   consumer  Consumer
   * @param   command   ConsumerCommand
   *
   * @return  Consumer
   */
  public Consumer edit(Consumer consumer, ConsumerCommand command) {
    if (!consumer.getPhoneNumber().equals(command.getPhoneNumber())) {
      consumer.setPhoneNumber(command.getPhoneNumber());
    }

    if (!consumer.getName().equals(command.getName())) {
      consumer.setName(command.getName());
    }

    return consumer;
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
   * toConsumer.
   *
   * @param   command  ConsumerCommand
   *
   * @return  Consumer
   */
  public Consumer toConsumer(ConsumerCommand command) {
    Consumer consumer = new Consumer();
    consumer.setAnswer(command.getAnswer());
    consumer.setIDcard(command.getIDcard());
    consumer.setName(command.getName());
    consumer.setPassWord(command.getPassWord());
    consumer.setPhoneNumber(command.getPhoneNumber());
    consumer.setQuestion(command.getQuestion());
    consumer.setCreateDate(new Date());

    return consumer;
  }
} // end class ConsumerCommand
