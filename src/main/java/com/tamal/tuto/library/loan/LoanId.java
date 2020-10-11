/**
 * 
 */
package com.tamal.tuto.library.loan;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import com.tamal.tuto.library.book.Book;
import com.tamal.tuto.library.customer.Customer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


/**
 * @author Joseph T
 *
 */

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoanId implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @ManyToOne
  Book book;

  @ManyToOne
  Customer customer;

  @Column(name = "CREATION_DATE_TIME")
  LocalDateTime creationDate = LocalDateTime.now();

}
