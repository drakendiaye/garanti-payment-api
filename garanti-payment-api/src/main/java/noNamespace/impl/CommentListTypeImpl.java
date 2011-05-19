/*
 * XML Type:  CommentListType
 * Namespace: 
 * Java type: noNamespace.CommentListType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML CommentListType(@).
 *
 * This is a complex type.
 */
public class CommentListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CommentListType
{
    private static final long serialVersionUID = 1L;
    
    public CommentListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("", "Comment");
    
    
    /**
     * Gets array of all "Comment" elements
     */
    public noNamespace.CommentType[] getCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENT$0, targetList);
            noNamespace.CommentType[] result = new noNamespace.CommentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Comment" element
     */
    public noNamespace.CommentType getCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CommentType target = null;
            target = (noNamespace.CommentType)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Comment" element
     */
    public int sizeOfCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$0);
        }
    }
    
    /**
     * Sets array of all "Comment" element
     */
    public void setCommentArray(noNamespace.CommentType[] commentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentArray, COMMENT$0);
        }
    }
    
    /**
     * Sets ith "Comment" element
     */
    public void setCommentArray(int i, noNamespace.CommentType comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CommentType target = null;
            target = (noNamespace.CommentType)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comment" element
     */
    public noNamespace.CommentType insertNewComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CommentType target = null;
            target = (noNamespace.CommentType)get_store().insert_element_user(COMMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Comment" element
     */
    public noNamespace.CommentType addNewComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CommentType target = null;
            target = (noNamespace.CommentType)get_store().add_element_user(COMMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Comment" element
     */
    public void removeComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$0, i);
        }
    }
}
