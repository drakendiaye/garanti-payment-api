/*
 * XML Type:  Card
 * Namespace: 
 * Java type: noNamespace.Card
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML Card(@).
 *
 * This is a complex type.
 */
public class CardImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.Card
{
    private static final long serialVersionUID = 1L;
    
    public CardImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("", "Number");
    private static final javax.xml.namespace.QName EXPIREDATE$2 = 
        new javax.xml.namespace.QName("", "ExpireDate");
    private static final javax.xml.namespace.QName CVV2$4 = 
        new javax.xml.namespace.QName("", "CVV2");
    
    
    /**
     * Gets the "Number" element
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" element
     */
    public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Number" element
     */
    public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" element
     */
    public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Unsets the "Number" element
     */
    public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "ExpireDate" element
     */
    public java.lang.String getExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIREDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExpireDate" element
     */
    public org.apache.xmlbeans.XmlString xgetExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIREDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExpireDate" element
     */
    public boolean isSetExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIREDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "ExpireDate" element
     */
    public void setExpireDate(java.lang.String expireDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIREDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIREDATE$2);
            }
            target.setStringValue(expireDate);
        }
    }
    
    /**
     * Sets (as xml) the "ExpireDate" element
     */
    public void xsetExpireDate(org.apache.xmlbeans.XmlString expireDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIREDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIREDATE$2);
            }
            target.set(expireDate);
        }
    }
    
    /**
     * Unsets the "ExpireDate" element
     */
    public void unsetExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIREDATE$2, 0);
        }
    }
    
    /**
     * Gets the "CVV2" element
     */
    public java.lang.String getCVV2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVV2$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CVV2" element
     */
    public org.apache.xmlbeans.XmlString xgetCVV2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV2$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CVV2" element
     */
    public boolean isSetCVV2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVV2$4) != 0;
        }
    }
    
    /**
     * Sets the "CVV2" element
     */
    public void setCVV2(java.lang.String cvv2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVV2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVV2$4);
            }
            target.setStringValue(cvv2);
        }
    }
    
    /**
     * Sets (as xml) the "CVV2" element
     */
    public void xsetCVV2(org.apache.xmlbeans.XmlString cvv2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVV2$4);
            }
            target.set(cvv2);
        }
    }
    
    /**
     * Unsets the "CVV2" element
     */
    public void unsetCVV2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVV2$4, 0);
        }
    }
}
