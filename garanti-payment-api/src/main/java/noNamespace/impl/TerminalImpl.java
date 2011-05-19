/*
 * XML Type:  Terminal
 * Namespace: 
 * Java type: noNamespace.Terminal
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML Terminal(@).
 *
 * This is a complex type.
 */
public class TerminalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.Terminal
{
    private static final long serialVersionUID = 1L;
    
    public TerminalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVUSERID$0 = 
        new javax.xml.namespace.QName("", "ProvUserID");
    private static final javax.xml.namespace.QName HASHDATA$2 = 
        new javax.xml.namespace.QName("", "HashData");
    private static final javax.xml.namespace.QName USERID$4 = 
        new javax.xml.namespace.QName("", "UserID");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName MERCHANTID$8 = 
        new javax.xml.namespace.QName("", "MerchantID");
    
    
    /**
     * Gets the "ProvUserID" element
     */
    public java.lang.String getProvUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVUSERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProvUserID" element
     */
    public org.apache.xmlbeans.XmlString xgetProvUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVUSERID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProvUserID" element
     */
    public boolean isSetProvUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVUSERID$0) != 0;
        }
    }
    
    /**
     * Sets the "ProvUserID" element
     */
    public void setProvUserID(java.lang.String provUserID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVUSERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVUSERID$0);
            }
            target.setStringValue(provUserID);
        }
    }
    
    /**
     * Sets (as xml) the "ProvUserID" element
     */
    public void xsetProvUserID(org.apache.xmlbeans.XmlString provUserID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVUSERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVUSERID$0);
            }
            target.set(provUserID);
        }
    }
    
    /**
     * Unsets the "ProvUserID" element
     */
    public void unsetProvUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVUSERID$0, 0);
        }
    }
    
    /**
     * Gets the "HashData" element
     */
    public java.lang.String getHashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HashData" element
     */
    public org.apache.xmlbeans.XmlString xgetHashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHDATA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "HashData" element
     */
    public boolean isSetHashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASHDATA$2) != 0;
        }
    }
    
    /**
     * Sets the "HashData" element
     */
    public void setHashData(java.lang.String hashData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHDATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHDATA$2);
            }
            target.setStringValue(hashData);
        }
    }
    
    /**
     * Sets (as xml) the "HashData" element
     */
    public void xsetHashData(org.apache.xmlbeans.XmlString hashData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHDATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASHDATA$2);
            }
            target.set(hashData);
        }
    }
    
    /**
     * Unsets the "HashData" element
     */
    public void unsetHashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASHDATA$2, 0);
        }
    }
    
    /**
     * Gets the "UserID" element
     */
    public java.lang.String getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserID" element
     */
    public org.apache.xmlbeans.XmlString xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "UserID" element
     */
    public boolean isSetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERID$4) != 0;
        }
    }
    
    /**
     * Sets the "UserID" element
     */
    public void setUserID(java.lang.String userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$4);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" element
     */
    public void xsetUserID(org.apache.xmlbeans.XmlString userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$4);
            }
            target.set(userID);
        }
    }
    
    /**
     * Unsets the "UserID" element
     */
    public void unsetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERID$4, 0);
        }
    }
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$6) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$6, 0);
        }
    }
    
    /**
     * Gets the "MerchantID" element
     */
    public java.lang.String getMerchantID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERCHANTID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MerchantID" element
     */
    public org.apache.xmlbeans.XmlString xgetMerchantID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "MerchantID" element
     */
    public boolean isSetMerchantID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERCHANTID$8) != 0;
        }
    }
    
    /**
     * Sets the "MerchantID" element
     */
    public void setMerchantID(java.lang.String merchantID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERCHANTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MERCHANTID$8);
            }
            target.setStringValue(merchantID);
        }
    }
    
    /**
     * Sets (as xml) the "MerchantID" element
     */
    public void xsetMerchantID(org.apache.xmlbeans.XmlString merchantID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERCHANTID$8);
            }
            target.set(merchantID);
        }
    }
    
    /**
     * Unsets the "MerchantID" element
     */
    public void unsetMerchantID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERCHANTID$8, 0);
        }
    }
}
