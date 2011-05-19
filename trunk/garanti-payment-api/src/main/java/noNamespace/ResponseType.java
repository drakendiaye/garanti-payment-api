/*
 * XML Type:  ResponseType
 * Namespace: 
 * Java type: noNamespace.ResponseType
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML ResponseType(@).
 *
 * This is a complex type.
 */
public interface ResponseType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B755B3F7219A48EA385FA8800E9C758").resolveHandle("responsetype1824type");
    
    /**
     * Gets the "Source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "Source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * True if has "Source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "Source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "Source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Unsets the "Source" element
     */
    void unsetSource();
    
    /**
     * Gets the "Code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "Code" element
     */
    org.apache.xmlbeans.XmlString xgetCode();
    
    /**
     * True if has "Code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "Code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "Code" element
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);
    
    /**
     * Unsets the "Code" element
     */
    void unsetCode();
    
    /**
     * Gets the "ReasonCode" element
     */
    java.lang.String getReasonCode();
    
    /**
     * Gets (as xml) the "ReasonCode" element
     */
    org.apache.xmlbeans.XmlString xgetReasonCode();
    
    /**
     * True if has "ReasonCode" element
     */
    boolean isSetReasonCode();
    
    /**
     * Sets the "ReasonCode" element
     */
    void setReasonCode(java.lang.String reasonCode);
    
    /**
     * Sets (as xml) the "ReasonCode" element
     */
    void xsetReasonCode(org.apache.xmlbeans.XmlString reasonCode);
    
    /**
     * Unsets the "ReasonCode" element
     */
    void unsetReasonCode();
    
    /**
     * Gets the "Message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "Message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * True if has "Message" element
     */
    boolean isSetMessage();
    
    /**
     * Sets the "Message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "Message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Unsets the "Message" element
     */
    void unsetMessage();
    
    /**
     * Gets the "ErrorMsg" element
     */
    java.lang.String getErrorMsg();
    
    /**
     * Gets (as xml) the "ErrorMsg" element
     */
    org.apache.xmlbeans.XmlString xgetErrorMsg();
    
    /**
     * True if has "ErrorMsg" element
     */
    boolean isSetErrorMsg();
    
    /**
     * Sets the "ErrorMsg" element
     */
    void setErrorMsg(java.lang.String errorMsg);
    
    /**
     * Sets (as xml) the "ErrorMsg" element
     */
    void xsetErrorMsg(org.apache.xmlbeans.XmlString errorMsg);
    
    /**
     * Unsets the "ErrorMsg" element
     */
    void unsetErrorMsg();
    
    /**
     * Gets the "SysErrMsg" element
     */
    java.lang.String getSysErrMsg();
    
    /**
     * Gets (as xml) the "SysErrMsg" element
     */
    org.apache.xmlbeans.XmlString xgetSysErrMsg();
    
    /**
     * True if has "SysErrMsg" element
     */
    boolean isSetSysErrMsg();
    
    /**
     * Sets the "SysErrMsg" element
     */
    void setSysErrMsg(java.lang.String sysErrMsg);
    
    /**
     * Sets (as xml) the "SysErrMsg" element
     */
    void xsetSysErrMsg(org.apache.xmlbeans.XmlString sysErrMsg);
    
    /**
     * Unsets the "SysErrMsg" element
     */
    void unsetSysErrMsg();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ResponseType newInstance() {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
