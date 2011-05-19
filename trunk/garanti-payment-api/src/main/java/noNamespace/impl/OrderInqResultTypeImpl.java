/*
 * XML Type:  OrderInqResultType
 * Namespace: 
 * Java type: noNamespace.OrderInqResultType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML OrderInqResultType(@).
 *
 * This is a complex type.
 */
public class OrderInqResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.OrderInqResultType
{
    private static final long serialVersionUID = 1L;
    
    public OrderInqResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARGETYPE$0 = 
        new javax.xml.namespace.QName("", "ChargeType");
    private static final javax.xml.namespace.QName PREAUTHAMOUNT$2 = 
        new javax.xml.namespace.QName("", "PreAuthAmount");
    private static final javax.xml.namespace.QName PREAUTHDATE$4 = 
        new javax.xml.namespace.QName("", "PreAuthDate");
    private static final javax.xml.namespace.QName AUTHAMOUNT$6 = 
        new javax.xml.namespace.QName("", "AuthAmount");
    private static final javax.xml.namespace.QName AUTHDATE$8 = 
        new javax.xml.namespace.QName("", "AuthDate");
    
    
    /**
     * Gets the "ChargeType" element
     */
    public java.lang.String getChargeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChargeType" element
     */
    public org.apache.xmlbeans.XmlString xgetChargeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChargeType" element
     */
    public boolean isSetChargeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARGETYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "ChargeType" element
     */
    public void setChargeType(java.lang.String chargeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGETYPE$0);
            }
            target.setStringValue(chargeType);
        }
    }
    
    /**
     * Sets (as xml) the "ChargeType" element
     */
    public void xsetChargeType(org.apache.xmlbeans.XmlString chargeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHARGETYPE$0);
            }
            target.set(chargeType);
        }
    }
    
    /**
     * Unsets the "ChargeType" element
     */
    public void unsetChargeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARGETYPE$0, 0);
        }
    }
    
    /**
     * Gets the "PreAuthAmount" element
     */
    public java.lang.String getPreAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREAUTHAMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreAuthAmount" element
     */
    public org.apache.xmlbeans.XmlString xgetPreAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREAUTHAMOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PreAuthAmount" element
     */
    public boolean isSetPreAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREAUTHAMOUNT$2) != 0;
        }
    }
    
    /**
     * Sets the "PreAuthAmount" element
     */
    public void setPreAuthAmount(java.lang.String preAuthAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREAUTHAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREAUTHAMOUNT$2);
            }
            target.setStringValue(preAuthAmount);
        }
    }
    
    /**
     * Sets (as xml) the "PreAuthAmount" element
     */
    public void xsetPreAuthAmount(org.apache.xmlbeans.XmlString preAuthAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREAUTHAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREAUTHAMOUNT$2);
            }
            target.set(preAuthAmount);
        }
    }
    
    /**
     * Unsets the "PreAuthAmount" element
     */
    public void unsetPreAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREAUTHAMOUNT$2, 0);
        }
    }
    
    /**
     * Gets the "PreAuthDate" element
     */
    public java.lang.String getPreAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREAUTHDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreAuthDate" element
     */
    public org.apache.xmlbeans.XmlString xgetPreAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREAUTHDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PreAuthDate" element
     */
    public boolean isSetPreAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREAUTHDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "PreAuthDate" element
     */
    public void setPreAuthDate(java.lang.String preAuthDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREAUTHDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREAUTHDATE$4);
            }
            target.setStringValue(preAuthDate);
        }
    }
    
    /**
     * Sets (as xml) the "PreAuthDate" element
     */
    public void xsetPreAuthDate(org.apache.xmlbeans.XmlString preAuthDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREAUTHDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREAUTHDATE$4);
            }
            target.set(preAuthDate);
        }
    }
    
    /**
     * Unsets the "PreAuthDate" element
     */
    public void unsetPreAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREAUTHDATE$4, 0);
        }
    }
    
    /**
     * Gets the "AuthAmount" element
     */
    public java.lang.String getAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHAMOUNT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AuthAmount" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHAMOUNT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "AuthAmount" element
     */
    public boolean isSetAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHAMOUNT$6) != 0;
        }
    }
    
    /**
     * Sets the "AuthAmount" element
     */
    public void setAuthAmount(java.lang.String authAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHAMOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHAMOUNT$6);
            }
            target.setStringValue(authAmount);
        }
    }
    
    /**
     * Sets (as xml) the "AuthAmount" element
     */
    public void xsetAuthAmount(org.apache.xmlbeans.XmlString authAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHAMOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHAMOUNT$6);
            }
            target.set(authAmount);
        }
    }
    
    /**
     * Unsets the "AuthAmount" element
     */
    public void unsetAuthAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHAMOUNT$6, 0);
        }
    }
    
    /**
     * Gets the "AuthDate" element
     */
    public java.lang.String getAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AuthDate" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "AuthDate" element
     */
    public boolean isSetAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "AuthDate" element
     */
    public void setAuthDate(java.lang.String authDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHDATE$8);
            }
            target.setStringValue(authDate);
        }
    }
    
    /**
     * Sets (as xml) the "AuthDate" element
     */
    public void xsetAuthDate(org.apache.xmlbeans.XmlString authDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHDATE$8);
            }
            target.set(authDate);
        }
    }
    
    /**
     * Unsets the "AuthDate" element
     */
    public void unsetAuthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHDATE$8, 0);
        }
    }
}
