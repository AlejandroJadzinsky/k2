/* vim: set et ts=2 sw=2 cindent fo=qroca: */

package com.k2.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;

/** Sample entity to use in HibernateTest.
 *
 * This is the base class of a single table inherintance hierarchy. */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class TablePerClassBaseClass {

  /** The pk. */
  private @Id @GeneratedValue long id;

  /** a sample column. */
  private String value;

  /** The pk.
   *
   * @return the pk.
   */
  public long getId() {
    return id;
  }

  /** The value.
   *
   * @return the value.
   */
  public String getValue() {
    return value;
  }

  /** Empty constructor. */
  TablePerClassBaseClass() {
  }

  /** Constructor to initialize the value.
   *
   * @param theValue the value.
   */
  TablePerClassBaseClass(final String theValue) {
    value = theValue;
  }
}

