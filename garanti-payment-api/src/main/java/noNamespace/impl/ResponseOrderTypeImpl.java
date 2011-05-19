/*
 * XML Type:  ResponseOrderType
 * Namespace: 
 * Java type: noNamespace.ResponseOrderType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ResponseOrderType(@).
 *
 * This is a complex type.
 */
public class ResponseOrderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ResponseOrderType
{
    private static final long serialVersionUID = 1L;
    
    public ResponseOrderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERID$0 = 
        new javax.xml.namespace.QName("", "OrderID");
    private static final javax.xml.namespace.QName ORDERINQRESULT$2 = 
        new javax.xml.namespace.QName("", "OrderInqResult");
    
    
    /**
     * Gets the "OrderID" element
     */
    public java.lang.String getOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderID" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderID" element
     */
    public boolean isSetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERID$0) != 0;
        }
    }
    
    /**
     * Sets the "OrderID" element
     */
    public void setOrderID(java.lang.String orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$0);
            }
            target.setStringValue(orderID);
        }
    }
    
    /**
     * Sets (as xml) the "OrderID" element
     */
    public void xsetOrderID(org.apache.xmlbeans.XmlString orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERID$0);
            }
            target.set(orderID);
        }
    }
    
    /**
     * Unsets the "OrderID" element
     */
    public void unsetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERID$0, 0);
        }
    }
    
    /**
     * Gets the "OrderInqResult" element
     */
    public noNamespace.OrderInqResultType getOrderInqResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OrderInqResultType target = null;
            target = (noNamespace.OrderInqResultType)get_store().find_element_user(ORDERINQRESULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrderInqResult" element
     */
    public boolean isSetOrderInqResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERINQRESULT$2) != 0;
        }
    }
    
    /**
     * Sets the "OrderInqResult" element
     */
    public void setOrderInqResult(noNamespace.OrderInqResultType orderInqResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OrderInqResultType target = null;
            target = (noNamespace.OrderInqResultType)get_store().find_element_user(ORDERINQRESULT$2, 0);
            if (target == null)
            {
                target = (noNamespace.OrderInqResultType)get_store().add_element_user(ORDERINQRESULT$2);
            }
            target.set(orderInqResult);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderInqResult" element
     */
    public noNamespace.OrderInqResultType addNewOrderInqResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OrderInqResultType target = null;
            target = (noNamespace.OrderInqResultType)get_store().add_element_user(ORDERINQRESULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "OrderInqResult" element
     */
    public void unsetOrderInqResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERINQRESULT$2, 0);
        }
    }
}
