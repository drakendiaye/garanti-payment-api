/*
 * XML Type:  Secure3D
 * Namespace: 
 * Java type: noNamespace.Secure3D
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML Secure3D(@).
 *
 * This is a complex type.
 */
public class Secure3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.Secure3D
{
    private static final long serialVersionUID = 1L;
    
    public Secure3DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONCODE$0 = 
        new javax.xml.namespace.QName("", "AuthenticationCode");
    private static final javax.xml.namespace.QName SECURITYLEVEL$2 = 
        new javax.xml.namespace.QName("", "SecurityLevel");
    private static final javax.xml.namespace.QName TXNID$4 = 
        new javax.xml.namespace.QName("", "TxnID");
    private static final javax.xml.namespace.QName MD$6 = 
        new javax.xml.namespace.QName("", "Md");
    
    
    /**
     * Gets the "AuthenticationCode" element
     */
    public java.lang.String getAuthenticationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AuthenticationCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthenticationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AuthenticationCode" element
     */
    public boolean isSetAuthenticationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATIONCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "AuthenticationCode" element
     */
    public void setAuthenticationCode(java.lang.String authenticationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHENTICATIONCODE$0);
            }
            target.setStringValue(authenticationCode);
        }
    }
    
    /**
     * Sets (as xml) the "AuthenticationCode" element
     */
    public void xsetAuthenticationCode(org.apache.xmlbeans.XmlString authenticationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHENTICATIONCODE$0);
            }
            target.set(authenticationCode);
        }
    }
    
    /**
     * Unsets the "AuthenticationCode" element
     */
    public void unsetAuthenticationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATIONCODE$0, 0);
        }
    }
    
    /**
     * Gets the "SecurityLevel" element
     */
    public java.lang.String getSecurityLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYLEVEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecurityLevel" element
     */
    public org.apache.xmlbeans.XmlString xgetSecurityLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYLEVEL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecurityLevel" element
     */
    public boolean isSetSecurityLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYLEVEL$2) != 0;
        }
    }
    
    /**
     * Sets the "SecurityLevel" element
     */
    public void setSecurityLevel(java.lang.String securityLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYLEVEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYLEVEL$2);
            }
            target.setStringValue(securityLevel);
        }
    }
    
    /**
     * Sets (as xml) the "SecurityLevel" element
     */
    public void xsetSecurityLevel(org.apache.xmlbeans.XmlString securityLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYLEVEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYLEVEL$2);
            }
            target.set(securityLevel);
        }
    }
    
    /**
     * Unsets the "SecurityLevel" element
     */
    public void unsetSecurityLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYLEVEL$2, 0);
        }
    }
    
    /**
     * Gets the "TxnID" element
     */
    public java.lang.String getTxnID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TXNID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TxnID" element
     */
    public org.apache.xmlbeans.XmlString xgetTxnID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TXNID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "TxnID" element
     */
    public boolean isSetTxnID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXNID$4) != 0;
        }
    }
    
    /**
     * Sets the "TxnID" element
     */
    public void setTxnID(java.lang.String txnID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TXNID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TXNID$4);
            }
            target.setStringValue(txnID);
        }
    }
    
    /**
     * Sets (as xml) the "TxnID" element
     */
    public void xsetTxnID(org.apache.xmlbeans.XmlString txnID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TXNID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TXNID$4);
            }
            target.set(txnID);
        }
    }
    
    /**
     * Unsets the "TxnID" element
     */
    public void unsetTxnID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXNID$4, 0);
        }
    }
    
    /**
     * Gets the "Md" element
     */
    public java.lang.String getMd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Md" element
     */
    public org.apache.xmlbeans.XmlString xgetMd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MD$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Md" element
     */
    public boolean isSetMd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MD$6) != 0;
        }
    }
    
    /**
     * Sets the "Md" element
     */
    public void setMd(java.lang.String md)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MD$6);
            }
            target.setStringValue(md);
        }
    }
    
    /**
     * Sets (as xml) the "Md" element
     */
    public void xsetMd(org.apache.xmlbeans.XmlString md)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MD$6);
            }
            target.set(md);
        }
    }
    
    /**
     * Unsets the "Md" element
     */
    public void unsetMd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MD$6, 0);
        }
    }
}
