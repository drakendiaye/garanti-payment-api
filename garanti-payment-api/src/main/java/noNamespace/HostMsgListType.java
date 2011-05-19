/*
 * XML Type:  HostMsgListType
 * Namespace: 
 * Java type: noNamespace.HostMsgListType
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML HostMsgListType(@).
 *
 * This is a complex type.
 */
public interface HostMsgListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostMsgListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B755B3F7219A48EA385FA8800E9C758").resolveHandle("hostmsglisttypeb728type");
    
    /**
     * Gets array of all "HostMsg" elements
     */
    java.lang.String[] getHostMsgArray();
    
    /**
     * Gets ith "HostMsg" element
     */
    java.lang.String getHostMsgArray(int i);
    
    /**
     * Gets (as xml) array of all "HostMsg" elements
     */
    org.apache.xmlbeans.XmlString[] xgetHostMsgArray();
    
    /**
     * Gets (as xml) ith "HostMsg" element
     */
    org.apache.xmlbeans.XmlString xgetHostMsgArray(int i);
    
    /**
     * Returns number of "HostMsg" element
     */
    int sizeOfHostMsgArray();
    
    /**
     * Sets array of all "HostMsg" element
     */
    void setHostMsgArray(java.lang.String[] hostMsgArray);
    
    /**
     * Sets ith "HostMsg" element
     */
    void setHostMsgArray(int i, java.lang.String hostMsg);
    
    /**
     * Sets (as xml) array of all "HostMsg" element
     */
    void xsetHostMsgArray(org.apache.xmlbeans.XmlString[] hostMsgArray);
    
    /**
     * Sets (as xml) ith "HostMsg" element
     */
    void xsetHostMsgArray(int i, org.apache.xmlbeans.XmlString hostMsg);
    
    /**
     * Inserts the value as the ith "HostMsg" element
     */
    void insertHostMsg(int i, java.lang.String hostMsg);
    
    /**
     * Appends the value as the last "HostMsg" element
     */
    void addHostMsg(java.lang.String hostMsg);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HostMsg" element
     */
    org.apache.xmlbeans.XmlString insertNewHostMsg(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HostMsg" element
     */
    org.apache.xmlbeans.XmlString addNewHostMsg();
    
    /**
     * Removes the ith "HostMsg" element
     */
    void removeHostMsg(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.HostMsgListType newInstance() {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.HostMsgListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.HostMsgListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.HostMsgListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.HostMsgListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.HostMsgListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.HostMsgListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.HostMsgListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.HostMsgListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.HostMsgListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.HostMsgListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.HostMsgListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.HostMsgListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.HostMsgListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.HostMsgListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.HostMsgListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.HostMsgListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.HostMsgListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.HostMsgListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
