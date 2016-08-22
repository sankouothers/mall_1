package org.wang.mall.command;

import org.wang.mall.model.Consumer;
import org.wang.mall.model.Merchant;


/**
 * Created by ozintel06 on 16/8/11.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/11/2016 14:37
 */
public class PasswordCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String answer;

  private Long id;

  private String isQuestion;
  private String name;
  private String newPassWord;

  private String noUser;
  private String page;
  private String passWord;
  private String passWordValidator;
  private String question;

  private String requestError;
  private String role;

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
   * getter method for id.
   *
   * @return  Long
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for is question.
   *
   * @return  String
   */
  public String getIsQuestion() {
    return isQuestion;
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
   * getter method for new pass word.
   *
   * @return  String
   */
  public String getNewPassWord() {
    return newPassWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for no user.
   *
   * @return  String
   */
  public String getNoUser() {
    return noUser;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for page.
   *
   * @return  String
   */
  public String getPage() {
    return page;
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
   * getter method for question.
   *
   * @return  String
   */
  public String getQuestion() {
    return question;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for request error.
   *
   * @return  String
   */
  public String getRequestError() {
    return requestError;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for role.
   *
   * @return  String
   */
  public String getRole() {
    return role;
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
   * setter method for id.
   *
   * @param  id  Long
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for is question.
   *
   * @param  isQuestion  String
   */
  public void setIsQuestion(String isQuestion) {
    this.isQuestion = isQuestion;
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
   * setter method for new pass word.
   *
   * @param  newPassWord  String
   */
  public void setNewPassWord(String newPassWord) {
    this.newPassWord = newPassWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for no user.
   *
   * @param  noUser  String
   */
  public void setNoUser(String noUser) {
    this.noUser = noUser;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for page.
   *
   * @param  page  String
   */
  public void setPage(String page) {
    this.page = page;
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
   * setter method for question.
   *
   * @param  question  String
   */
  public void setQuestion(String question) {
    this.question = question;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for request error.
   *
   * @param  requestError  String
   */
  public void setRequestError(String requestError) {
    this.requestError = requestError;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for role.
   *
   * @param  role  String
   */
  public void setRole(String role) {
    this.role = role;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toForgotPassWord.
   *
   * @param   consumer  Consumer
   *
   * @return  PasswordCommand
   */
  public PasswordCommand toForgotPassWord(Consumer consumer) {
    PasswordCommand command = new PasswordCommand();
    command.setQuestion(consumer.getQuestion());
    command.setName(consumer.getName());
    command.setId(consumer.getId());
    command.setRole("consumer");

    return command;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toForgotPassWord.
   *
   * @param   merchant  Merchant
   *
   * @return  PasswordCommand
   */
  public PasswordCommand toForgotPassWord(Merchant merchant) {
    PasswordCommand command = new PasswordCommand();
    command.setQuestion(merchant.getQuestion());
    command.setName(merchant.getName());
    command.setId(merchant.getId());
    command.setRole("Merchant");

    return command;
  }
} // end class PasswordCommand
