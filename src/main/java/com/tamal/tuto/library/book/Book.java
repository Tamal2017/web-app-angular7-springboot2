/**
 * 
 */
package com.tamal.tuto.library.book;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.tamal.tuto.library.category.Category;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Joseph T
 *
 */
@Entity
@Table(name = "BOOK")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  Long id;

  @Column(name = "ISBN")
  String isbn;

  @Column(name = "TITLE")
  String title;

  @Column(name = "RELEASE_DATE")
  LocalDate releaseDate;

  @Column(name = "REGISTER_DATE")
  LocalDate registerDate;

  @Column(name = "TOTAL_NUMBER")
  Integer totalNumber;

  @ManyToOne(optional = false)
  @JoinColumn(name = "CATEGORY_CODE", referencedColumnName = "CODE")
  Category category;



}
