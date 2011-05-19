/*
 * XML Type:  ResponseTransactionType
 * Namespace: 
 * Java type: noNamespace.ResponseTransactionType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ResponseTransactionType(@).
 *
 * This is a complex type.
 */
public class ResponseTransactionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ResponseTransactionType
{
    private static final long serialVersionUID = 1L;
    
    public ResponseTransactionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("", "Response");
    private static final javax.xml.namespace.QName RETREFNUM$2 = 
        new javax.xml.namespace.QName("", "RetrefNum");
    private static final javax.xml.namespace.QName AUTHCODE$4 = 
        new javax.xml.namespace.QName("", "AuthCode");
    private static final javax.xml.namespace.QName BATCHNUM$6 = 
        new javax.xml.namespace.QName("", "BatchNum");
    private static final javax.xml.namespace.QName SEQUENCENUM$8 = 
        new javax.xml.namespace.QName("", "SequenceNum");
    private static final javax.xml.namespace.QName PROVDATE$10 = 
        new javax.xml.namespace.QName("", "ProvDate");
    private static final javax.xml.namespace.QName HOSTMSGLIST$12 = 
        new javax.xml.namespace.QName("", "HostMsgList");
    
    
    /**
     * Gets the "Response" element
     */
    public noNamespace.ResponseType getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ResponseType target = null;
            target = (noNamespace.ResponseType)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Response" element
     */
    public boolean isSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "Response" element
     */
    public void setResponse(noNamespace.ResponseType response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ResponseType target = null;
            target = (noNamespace.ResponseType)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ResponseType)get_store().add_element_user(RESPONSE$0);
            }
            target.set(response);
        }
    }
    
    /**
     * Appends and returns a new empty "Response" element
     */
    public noNamespace.ResponseType addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ResponseType target = null;
            target = (noNamespace.ResponseType)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Response" element
     */
    public void unsetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSE$0, 0);
        }
    }
    
    /**
     * Gets the "RetrefNum" element
     */
    public java.lang.String getRetrefNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETREFNUM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RetrefNum" element
     */
    public org.apache.xmlbeans.XmlString xgetRetrefNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETREFNUM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RetrefNum" element
     */
    public boolean isSetRetrefNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETREFNUM$2) != 0;
        }
    }
    
    /**
     * Sets the "RetrefNum" element
     */
    public void setRetrefNum(java.lang.String retrefNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETREFNUM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETREFNUM$2);
            }
            target.setStringValue(retrefNum);
        }
    }
    
    /**
     * Sets (as xml) the "RetrefNum" element
     */
    public void xsetRetrefNum(org.apache.xmlbeans.XmlString retrefNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETREFNUM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETREFNUM$2);
            }
            target.set(retrefNum);
        }
    }
    
    /**
     * Unsets the "RetrefNum" element
     */
    public void unsetRetrefNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETREFNUM$2, 0);
        }
    }
    
    /**
     * Gets the "AuthCode" element
     */
    public java.lang.String getAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AuthCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "AuthCode" element
     */
    public boolean isSetAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "AuthCode" element
     */
    public void setAuthCode(java.lang.String authCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHCODE$4);
            }
            target.setStringValue(authCode);
        }
    }
    
    /**
     * Sets (as xml) the "AuthCode" element
     */
    public void xsetAuthCode(org.apache.xmlbeans.XmlString authCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHCODE$4);
            }
            target.set(authCode);
        }
    }
    
    /**
     * Unsets the "AuthCode" element
     */
    public void unsetAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHCODE$4, 0);
        }
    }
    
    /**
     * Gets the "BatchNum" element
     */
    public java.lang.String getBatchNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHNUM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BatchNum" element
     */
    public org.apache.xmlbeans.XmlString xgetBatchNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATCHNUM$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "BatchNum" element
     */
    public boolean isSetBatchNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BATCHNUM$6) != 0;
        }
    }
    
    /**
     * Sets the "BatchNum" element
     */
    public void setBatchNum(java.lang.String batchNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHNUM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHNUM$6);
            }
            target.setStringValue(batchNum);
        }
    }
    
    /**
     * Sets (as xml) the "BatchNum" element
     */
    public void xsetBatchNum(org.apache.xmlbeans.XmlString batchNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATCHNUM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BATCHNUM$6);
            }
            target.set(batchNum);
        }
    }
    
    /**
     * Unsets the "BatchNum" element
     */
    public void unsetBatchNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BATCHNUM$6, 0);
        }
    }
    
    /**
     * Gets the "SequenceNum" element
     */
    public java.lang.String getSequenceNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCENUM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SequenceNum" element
     */
    public org.apache.xmlbeans.XmlString xgetSequenceNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQUENCENUM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "SequenceNum" element
     */
    public boolean isSetSequenceNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCENUM$8) != 0;
        }
    }
    
    /**
     * Sets the "SequenceNum" element
     */
    public void setSequenceNum(java.lang.String sequenceNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCENUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENCENUM$8);
            }
            target.setStringValue(sequenceNum);
        }
    }
    
    /**
     * Sets (as xml) the "SequenceNum" element
     */
    public void xsetSequenceNum(org.apache.xmlbeans.XmlString sequenceNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQUENCENUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEQUENCENUM$8);
            }
            target.set(sequenceNum);
        }
    }
    
    /**
     * Unsets the "SequenceNum" element
     */
    public void unsetSequenceNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCENUM$8, 0);
        }
    }
    
    /**
     * Gets the "ProvDate" element
     */
    public java.lang.String getProvDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProvDate" element
     */
    public org.apache.xmlbeans.XmlString xgetProvDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVDATE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProvDate" element
     */
    public boolean isSetProvDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "ProvDate" element
     */
    public void setProvDate(java.lang.String provDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVDATE$10);
            }
            target.setStringValue(provDate);
        }
    }
    
    /**
     * Sets (as xml) the "ProvDate" element
     */
    public void xsetProvDate(org.apache.xmlbeans.XmlString provDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVDATE$10);
            }
            target.set(provDate);
        }
    }
    
    /**
     * Unsets the "ProvDate" element
     */
    public void unsetProvDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVDATE$10, 0);
        }
    }
    
    /**
     * Gets the "HostMsgList" element
     */
    public noNamespace.HostMsgListType getHostMsgList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HostMsgListType target = null;
            target = (noNamespace.HostMsgListType)get_store().find_element_user(HOSTMSGLIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HostMsgList" element
     */
    public boolean isSetHostMsgList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOSTMSGLIST$12) != 0;
        }
    }
    
    /**
     * Sets the "HostMsgList" element
     */
    public void setHostMsgList(noNamespace.HostMsgListType hostMsgList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HostMsgListType target = null;
            target = (noNamespace.HostMsgListType)get_store().find_element_user(HOSTMSGLIST$12, 0);
            if (target == null)
            {
                target = (noNamespace.HostMsgListType)get_store().add_element_user(HOSTMSGLIST$12);
            }
            target.set(hostMsgList);
        }
    }
    
    /**
     * Appends and returns a new empty "HostMsgList" element
     */
    public noNamespace.HostMsgListType addNewHostMsgList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HostMsgListType target = null;
            target = (noNamespace.HostMsgListType)get_store().add_element_user(HOSTMSGLIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "HostMsgList" element
     */
    public void unsetHostMsgList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOSTMSGLIST$12, 0);
        }
    }
}
