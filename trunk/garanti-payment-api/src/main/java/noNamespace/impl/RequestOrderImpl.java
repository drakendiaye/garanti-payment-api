/*
 * XML Type:  RequestOrder
 * Namespace: 
 * Java type: noNamespace.RequestOrder
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML RequestOrder(@).
 *
 * This is a complex type.
 */
public class RequestOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RequestOrder
{
    private static final long serialVersionUID = 1L;
    
    public RequestOrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERID$0 = 
        new javax.xml.namespace.QName("", "OrderID");
    private static final javax.xml.namespace.QName GROUPID$2 = 
        new javax.xml.namespace.QName("", "GroupID");
    private static final javax.xml.namespace.QName COMMENTLIST$4 = 
        new javax.xml.namespace.QName("", "CommentList");
    
    
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
     * Gets the "GroupID" element
     */
    public java.lang.String getGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GroupID" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "GroupID" element
     */
    public boolean isSetGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPID$2) != 0;
        }
    }
    
    /**
     * Sets the "GroupID" element
     */
    public void setGroupID(java.lang.String groupID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$2);
            }
            target.setStringValue(groupID);
        }
    }
    
    /**
     * Sets (as xml) the "GroupID" element
     */
    public void xsetGroupID(org.apache.xmlbeans.XmlString groupID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$2);
            }
            target.set(groupID);
        }
    }
    
    /**
     * Unsets the "GroupID" element
     */
    public void unsetGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPID$2, 0);
        }
    }
    
    /**
     * Gets the "CommentList" element
     */
    public noNamespace.CommentListType getCommentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CommentListType target = null;
            target = (noNamespace.CommentListType)get_store().find_element_user(COMMENTLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CommentList" element
     */
    public boolean isSetCommentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "CommentList" element
     */
    public void setCommentList(noNamespace.CommentListType commentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CommentListType target = null;
            target = (noNamespace.CommentListType)get_store().find_element_user(COMMENTLIST$4, 0);
            if (target == null)
            {
                target = (noNamespace.CommentListType)get_store().add_element_user(COMMENTLIST$4);
            }
            target.set(commentList);
        }
    }
    
    /**
     * Appends and returns a new empty "CommentList" element
     */
    public noNamespace.CommentListType addNewCommentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CommentListType target = null;
            target = (noNamespace.CommentListType)get_store().add_element_user(COMMENTLIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CommentList" element
     */
    public void unsetCommentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTLIST$4, 0);
        }
    }
}
