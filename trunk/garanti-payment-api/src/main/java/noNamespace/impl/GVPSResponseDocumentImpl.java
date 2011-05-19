/*
 * An XML document type.
 * Localname: GVPSResponse
 * Namespace: 
 * Java type: noNamespace.GVPSResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one GVPSResponse(@) element.
 *
 * This is a complex type.
 */
public class GVPSResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GVPSResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GVPSResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GVPSRESPONSE$0 = 
        new javax.xml.namespace.QName("", "GVPSResponse");
    
    
    /**
     * Gets the "GVPSResponse" element
     */
    public noNamespace.GVPSResponseDocument.GVPSResponse getGVPSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GVPSResponseDocument.GVPSResponse target = null;
            target = (noNamespace.GVPSResponseDocument.GVPSResponse)get_store().find_element_user(GVPSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GVPSResponse" element
     */
    public void setGVPSResponse(noNamespace.GVPSResponseDocument.GVPSResponse gvpsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GVPSResponseDocument.GVPSResponse target = null;
            target = (noNamespace.GVPSResponseDocument.GVPSResponse)get_store().find_element_user(GVPSRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.GVPSResponseDocument.GVPSResponse)get_store().add_element_user(GVPSRESPONSE$0);
            }
            target.set(gvpsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GVPSResponse" element
     */
    public noNamespace.GVPSResponseDocument.GVPSResponse addNewGVPSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GVPSResponseDocument.GVPSResponse target = null;
            target = (noNamespace.GVPSResponseDocument.GVPSResponse)get_store().add_element_user(GVPSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GVPSResponse(@).
     *
     * This is a complex type.
     */
    public static class GVPSResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GVPSResponseDocument.GVPSResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GVPSResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MODE$0 = 
            new javax.xml.namespace.QName("", "Mode");
        private static final javax.xml.namespace.QName ORDER$2 = 
            new javax.xml.namespace.QName("", "Order");
        private static final javax.xml.namespace.QName TRANSACTION$4 = 
            new javax.xml.namespace.QName("", "Transaction");
        
        
        /**
         * Gets the "Mode" element
         */
        public java.lang.String getMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Mode" element
         */
        public org.apache.xmlbeans.XmlString xgetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Mode" element
         */
        public boolean isSetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODE$0) != 0;
            }
        }
        
        /**
         * Sets the "Mode" element
         */
        public void setMode(java.lang.String mode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODE$0);
                }
                target.setStringValue(mode);
            }
        }
        
        /**
         * Sets (as xml) the "Mode" element
         */
        public void xsetMode(org.apache.xmlbeans.XmlString mode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODE$0);
                }
                target.set(mode);
            }
        }
        
        /**
         * Unsets the "Mode" element
         */
        public void unsetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODE$0, 0);
            }
        }
        
        /**
         * Gets the "Order" element
         */
        public noNamespace.ResponseOrderType getOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResponseOrderType target = null;
                target = (noNamespace.ResponseOrderType)get_store().find_element_user(ORDER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Order" element
         */
        public boolean isSetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDER$2) != 0;
            }
        }
        
        /**
         * Sets the "Order" element
         */
        public void setOrder(noNamespace.ResponseOrderType order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResponseOrderType target = null;
                target = (noNamespace.ResponseOrderType)get_store().find_element_user(ORDER$2, 0);
                if (target == null)
                {
                    target = (noNamespace.ResponseOrderType)get_store().add_element_user(ORDER$2);
                }
                target.set(order);
            }
        }
        
        /**
         * Appends and returns a new empty "Order" element
         */
        public noNamespace.ResponseOrderType addNewOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResponseOrderType target = null;
                target = (noNamespace.ResponseOrderType)get_store().add_element_user(ORDER$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Order" element
         */
        public void unsetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDER$2, 0);
            }
        }
        
        /**
         * Gets the "Transaction" element
         */
        public noNamespace.ResponseTransactionType getTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResponseTransactionType target = null;
                target = (noNamespace.ResponseTransactionType)get_store().find_element_user(TRANSACTION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Transaction" element
         */
        public boolean isSetTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSACTION$4) != 0;
            }
        }
        
        /**
         * Sets the "Transaction" element
         */
        public void setTransaction(noNamespace.ResponseTransactionType transaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResponseTransactionType target = null;
                target = (noNamespace.ResponseTransactionType)get_store().find_element_user(TRANSACTION$4, 0);
                if (target == null)
                {
                    target = (noNamespace.ResponseTransactionType)get_store().add_element_user(TRANSACTION$4);
                }
                target.set(transaction);
            }
        }
        
        /**
         * Appends and returns a new empty "Transaction" element
         */
        public noNamespace.ResponseTransactionType addNewTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ResponseTransactionType target = null;
                target = (noNamespace.ResponseTransactionType)get_store().add_element_user(TRANSACTION$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Transaction" element
         */
        public void unsetTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSACTION$4, 0);
            }
        }
    }
}
