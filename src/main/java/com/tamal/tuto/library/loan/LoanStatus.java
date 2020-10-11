/**
 * 
 */
package com.tamal.tuto.library.loan;


/**
 * @author Joseph T
 *
 */
public enum LoanStatus {

  AVAILABLE("AVAILABLE"), BORROWD("BORROWD"), RETURNED("RETURNED"), POOR_CONDITION(
      "POOR_CONDITION");

  String code;

  LoanStatus(String code) {
    this.code = code;
  }


}
