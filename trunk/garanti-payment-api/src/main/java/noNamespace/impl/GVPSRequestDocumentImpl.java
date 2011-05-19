/*
 * An XML document type.
 * Localname: GVPSRequest
 * Namespace: 
 * Java type: noNamespace.GVPSRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one GVPSRequest(@) element.
 *
 * This is a complex type.
 */
public class GVPSRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GVPSRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GVPSRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GVPSREQUEST$0 = 
        new javax.xml.namespace.QName("", "GVPSRequest");
    
    
    /**
     * Gets the "GVPSRequest" element
     */
    public noNamespace.GVPSRequestDocument.GVPSRequest getGVPSRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GVPSRequestDocument.GVPSRequest target = null;
            target = (noNamespace.GVPSRequestDocument.GVPSRequest)get_store().find_element_user(GVPSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GVPSRequest" element
     */
    public void setGVPSRequest(noNamespace.GVPSRequestDocument.GVPSRequest gvpsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GVPSRequestDocument.GVPSRequest target = null;
            target = (noNamespace.GVPSRequestDocument.GVPSRequest)get_store().find_element_user(GVPSREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.GVPSRequestDocument.GVPSRequest)get_store().add_element_user(GVPSREQUEST$0);
            }
            target.set(gvpsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GVPSRequest" element
     */
    public noNamespace.GVPSRequestDocument.GVPSRequest addNewGVPSRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GVPSRequestDocument.GVPSRequest target = null;
            target = (noNamespace.GVPSRequestDocument.GVPSRequest)get_store().add_element_user(GVPSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GVPSRequest(@).
     *
     * This is a complex type.
     */
    public static class GVPSRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GVPSRequestDocument.GVPSRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GVPSRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MODE$0 = 
            new javax.xml.namespace.QName("", "Mode");
        private static final javax.xml.namespace.QName VERSION$2 = 
            new javax.xml.namespace.QName("", "Version");
        private static final javax.xml.namespace.QName TERMINAL$4 = 
            new javax.xml.namespace.QName("", "Terminal");
        private static final javax.xml.namespace.QName CUSTOMER$6 = 
            new javax.xml.namespace.QName("", "Customer");
        private static final javax.xml.namespace.QName CARD$8 = 
            new javax.xml.namespace.QName("", "Card");
        private static final javax.xml.namespace.QName ORDER$10 = 
            new javax.xml.namespace.QName("", "Order");
        private static final javax.xml.namespace.QName TRANSACTION$12 = 
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
         * Gets the "Version" element
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Version" element
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Version" element
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERSION$2) != 0;
            }
        }
        
        /**
         * Sets the "Version" element
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$2);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "Version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$2);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "Version" element
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERSION$2, 0);
            }
        }
        
        /**
         * Gets the "Terminal" element
         */
        public noNamespace.Terminal getTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Terminal target = null;
                target = (noNamespace.Terminal)get_store().find_element_user(TERMINAL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Terminal" element
         */
        public boolean isSetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TERMINAL$4) != 0;
            }
        }
        
        /**
         * Sets the "Terminal" element
         */
        public void setTerminal(noNamespace.Terminal terminal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Terminal target = null;
                target = (noNamespace.Terminal)get_store().find_element_user(TERMINAL$4, 0);
                if (target == null)
                {
                    target = (noNamespace.Terminal)get_store().add_element_user(TERMINAL$4);
                }
                target.set(terminal);
            }
        }
        
        /**
         * Appends and returns a new empty "Terminal" element
         */
        public noNamespace.Terminal addNewTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Terminal target = null;
                target = (noNamespace.Terminal)get_store().add_element_user(TERMINAL$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Terminal" element
         */
        public void unsetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TERMINAL$4, 0);
            }
        }
        
        /**
         * Gets the "Customer" element
         */
        public noNamespace.Customer getCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Customer target = null;
                target = (noNamespace.Customer)get_store().find_element_user(CUSTOMER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Customer" element
         */
        public boolean isSetCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUSTOMER$6) != 0;
            }
        }
        
        /**
         * Sets the "Customer" element
         */
        public void setCustomer(noNamespace.Customer customer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Customer target = null;
                target = (noNamespace.Customer)get_store().find_element_user(CUSTOMER$6, 0);
                if (target == null)
                {
                    target = (noNamespace.Customer)get_store().add_element_user(CUSTOMER$6);
                }
                target.set(customer);
            }
        }
        
        /**
         * Appends and returns a new empty "Customer" element
         */
        public noNamespace.Customer addNewCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Customer target = null;
                target = (noNamespace.Customer)get_store().add_element_user(CUSTOMER$6);
                return target;
            }
        }
        
        /**
         * Unsets the "Customer" element
         */
        public void unsetCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUSTOMER$6, 0);
            }
        }
        
        /**
         * Gets the "Card" element
         */
        public noNamespace.Card getCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Card target = null;
                target = (noNamespace.Card)get_store().find_element_user(CARD$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Card" element
         */
        public boolean isSetCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CARD$8) != 0;
            }
        }
        
        /**
         * Sets the "Card" element
         */
        public void setCard(noNamespace.Card card)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Card target = null;
                target = (noNamespace.Card)get_store().find_element_user(CARD$8, 0);
                if (target == null)
                {
                    target = (noNamespace.Card)get_store().add_element_user(CARD$8);
                }
                target.set(card);
            }
        }
        
        /**
         * Appends and returns a new empty "Card" element
         */
        public noNamespace.Card addNewCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.Card target = null;
                target = (noNamespace.Card)get_store().add_element_user(CARD$8);
                return target;
            }
        }
        
        /**
         * Unsets the "Card" element
         */
        public void unsetCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CARD$8, 0);
            }
        }
        
        /**
         * Gets the "Order" element
         */
        public noNamespace.RequestOrder getOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RequestOrder target = null;
                target = (noNamespace.RequestOrder)get_store().find_element_user(ORDER$10, 0);
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
                return get_store().count_elements(ORDER$10) != 0;
            }
        }
        
        /**
         * Sets the "Order" element
         */
        public void setOrder(noNamespace.RequestOrder order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RequestOrder target = null;
                target = (noNamespace.RequestOrder)get_store().find_element_user(ORDER$10, 0);
                if (target == null)
                {
                    target = (noNamespace.RequestOrder)get_store().add_element_user(ORDER$10);
                }
                target.set(order);
            }
        }
        
        /**
         * Appends and returns a new empty "Order" element
         */
        public noNamespace.RequestOrder addNewOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RequestOrder target = null;
                target = (noNamespace.RequestOrder)get_store().add_element_user(ORDER$10);
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
                get_store().remove_element(ORDER$10, 0);
            }
        }
        
        /**
         * Gets the "Transaction" element
         */
        public noNamespace.RequestTransaction getTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RequestTransaction target = null;
                target = (noNamespace.RequestTransaction)get_store().find_element_user(TRANSACTION$12, 0);
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
                return get_store().count_elements(TRANSACTION$12) != 0;
            }
        }
        
        /**
         * Sets the "Transaction" element
         */
        public void setTransaction(noNamespace.RequestTransaction transaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RequestTransaction target = null;
                target = (noNamespace.RequestTransaction)get_store().find_element_user(TRANSACTION$12, 0);
                if (target == null)
                {
                    target = (noNamespace.RequestTransaction)get_store().add_element_user(TRANSACTION$12);
                }
                target.set(transaction);
            }
        }
        
        /**
         * Appends and returns a new empty "Transaction" element
         */
        public noNamespace.RequestTransaction addNewTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RequestTransaction target = null;
                target = (noNamespace.RequestTransaction)get_store().add_element_user(TRANSACTION$12);
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
                get_store().remove_element(TRANSACTION$12, 0);
            }
        }
    }
}
