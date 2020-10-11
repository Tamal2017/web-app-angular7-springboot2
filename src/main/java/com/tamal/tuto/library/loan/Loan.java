/**
 * 
 */
package com.tamal.tuto.library.loan;

import java.time.LocalDate;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * @author Joseph T
 *
 */
@Entity
@Table(name = "LOAN")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AssociationOverrides({
    @AssociationOverride(name = "pk.book", joinColumns = @JoinColumn(name = "BOOk_ID")),
    @AssociationOverride(name = "pk.customer", joinColumns = @JoinColumn(name = "CUSTOMER_ID"))})

public class Loan {

  @EmbeddedId
  LoanId pk = new LoanId();

  @Column(name = "BEGIN_DATE")
  LocalDate beginDate;

  @Column(name = "END_DATE")
  LocalDate endDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "STATUS")
  LoanStatus status;

}
