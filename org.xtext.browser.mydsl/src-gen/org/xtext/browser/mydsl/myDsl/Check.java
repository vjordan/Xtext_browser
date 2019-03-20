/**
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Check#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends INSTRUCTION
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TYPE_CHECK_UNCHECK)
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getCheck_Type()
   * @model containment="true"
   * @generated
   */
  TYPE_CHECK_UNCHECK getType();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Check#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TYPE_CHECK_UNCHECK value);

} // Check