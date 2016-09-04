package org.wang.mall.command;

import java.util.List;

import org.wang.mall.model.Address;


/**
 * Created by ozintel06 on 16/9/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/04/2016 16:52
 */
public class ShoppingCarCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private List<IndentCommand> indentCommandList;
  private String              notIndent;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for indent command list.
   *
   * @return  List
   */
  public List<IndentCommand> getIndentCommandList() {
    return indentCommandList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for not indent.
   *
   * @return  String
   */
  public String getNotIndent() {
    return notIndent;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for indent command list.
   *
   * @param  indentCommandList  List
   */
  public void setIndentCommandList(List<IndentCommand> indentCommandList) {
    this.indentCommandList = indentCommandList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for not indent.
   *
   * @param  notIndent  String
   */
  public void setNotIndent(String notIndent) {
    this.notIndent = notIndent;
  }
} // end class ShoppingCarCommand
