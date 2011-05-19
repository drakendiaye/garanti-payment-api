/*
 * XML Type:  ResponseType
 * Namespace: 
 * Java type: noNamespace.ResponseType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ResponseType(@).
 *
 * This is a complex type.
 */
public class ResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ResponseType
{
    private static final long serialVersionUID = 1L;
    
    public ResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("", "Source");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("", "Code");
    private static final javax.xml.namespace.QName REASONCODE$4 = 
        new javax.xml.namespace.QName("", "ReasonCode");
    private static final javax.xml.namespace.QName MESSAGE$6 = 
        new javax.xml.namespace.QName("", "Message");
    private static final javax.xml.namespace.QName ERRORMSG$8 = 
        new javax.xml.namespace.QName("", "ErrorMsg");
    private static final javax.xml.namespace.QName SYSERRMSG$10 = 
        new javax.xml.namespace.QName("", "SysErrMsg");
    
    
    /**
     * Gets the "Source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0) != 0;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "Source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "Source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, 0);
        }
    }
    
    /**
     * Gets the "Code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Code" element
     */
    public org.apache.xmlbeans.XmlString xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$2) != 0;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" element
     */
    public void xsetCode(org.apache.xmlbeans.XmlString code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$2);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "Code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$2, 0);
        }
    }
    
    /**
     * Gets the "ReasonCode" element
     */
    public java.lang.String getReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReasonCode" element
     */
    public org.apache.xmlbeans.XmlString xgetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReasonCode" element
     */
    public boolean isSetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "ReasonCode" element
     */
    public void setReasonCode(java.lang.String reasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONCODE$4);
            }
            target.setStringValue(reasonCode);
        }
    }
    
    /**
     * Sets (as xml) the "ReasonCode" element
     */
    public void xsetReasonCode(org.apache.xmlbeans.XmlString reasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODE$4);
            }
            target.set(reasonCode);
        }
    }
    
    /**
     * Unsets the "ReasonCode" element
     */
    public void unsetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONCODE$4, 0);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$6);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$6);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "Message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$6, 0);
        }
    }
    
    /**
     * Gets the "ErrorMsg" element
     */
    public java.lang.String getErrorMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMSG$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorMsg" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMSG$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorMsg" element
     */
    public boolean isSetErrorMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORMSG$8) != 0;
        }
    }
    
    /**
     * Sets the "ErrorMsg" element
     */
    public void setErrorMsg(java.lang.String errorMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMSG$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMSG$8);
            }
            target.setStringValue(errorMsg);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorMsg" element
     */
    public void xsetErrorMsg(org.apache.xmlbeans.XmlString errorMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMSG$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMSG$8);
            }
            target.set(errorMsg);
        }
    }
    
    /**
     * Unsets the "ErrorMsg" element
     */
    public void unsetErrorMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMSG$8, 0);
        }
    }
    
    /**
     * Gets the "SysErrMsg" element
     */
    public java.lang.String getSysErrMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSERRMSG$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SysErrMsg" element
     */
    public org.apache.xmlbeans.XmlString xgetSysErrMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSERRMSG$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SysErrMsg" element
     */
    public boolean isSetSysErrMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSERRMSG$10) != 0;
        }
    }
    
    /**
     * Sets the "SysErrMsg" element
     */
    public void setSysErrMsg(java.lang.String sysErrMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSERRMSG$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSERRMSG$10);
            }
            target.setStringValue(sysErrMsg);
        }
    }
    
    /**
     * Sets (as xml) the "SysErrMsg" element
     */
    public void xsetSysErrMsg(org.apache.xmlbeans.XmlString sysErrMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSERRMSG$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYSERRMSG$10);
            }
            target.set(sysErrMsg);
        }
    }
    
    /**
     * Unsets the "SysErrMsg" element
     */
    public void unsetSysErrMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSERRMSG$10, 0);
        }
    }
}
