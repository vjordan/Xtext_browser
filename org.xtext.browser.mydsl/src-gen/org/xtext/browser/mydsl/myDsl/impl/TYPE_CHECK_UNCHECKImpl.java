/**
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.browser.mydsl.myDsl.MyDslPackage;
import org.xtext.browser.mydsl.myDsl.TYPE_CHECK_UNCHECK;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE CHECK UNCHECK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.impl.TYPE_CHECK_UNCHECKImpl#getTableau <em>Tableau</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TYPE_CHECK_UNCHECKImpl extends MinimalEObjectImpl.Container implements TYPE_CHECK_UNCHECK
{
  /**
   * The cached value of the '{@link #getTableau() <em>Tableau</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableau()
   * @generated
   * @ordered
   */
  protected EList<String> tableau;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TYPE_CHECK_UNCHECKImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.TYPE_CHECK_UNCHECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTableau()
  {
    if (tableau == null)
    {
      tableau = new EDataTypeEList<String>(String.class, this, MyDslPackage.TYPE_CHECK_UNCHECK__TABLEAU);
    }
    return tableau;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE_CHECK_UNCHECK__TABLEAU:
        return getTableau();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE_CHECK_UNCHECK__TABLEAU:
        getTableau().clear();
        getTableau().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE_CHECK_UNCHECK__TABLEAU:
        getTableau().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE_CHECK_UNCHECK__TABLEAU:
        return tableau != null && !tableau.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (tableau: ");
    result.append(tableau);
    result.append(')');
    return result.toString();
  }

} //TYPE_CHECK_UNCHECKImpl