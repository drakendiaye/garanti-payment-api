/*
 * XML Type:  Secure3D
 * Namespace: 
 * Java type: noNamespace.Secure3D
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML Secure3D(@).
 *
 * This is a complex type.
 */
public interface Secure3D extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Secure3D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B755B3F7219A48EA385FA8800E9C758").resolveHandle("secure3d55b1type");
    
    /**
     * Gets the "AuthenticationCode" element
     */
    java.lang.String getAuthenticationCode();
    
    /**
     * Gets (as xml) the "AuthenticationCode" element
     */
    org.apache.xmlbeans.XmlString xgetAuthenticationCode();
    
    /**
     * True if has "AuthenticationCode" element
     */
    boolean isSetAuthenticationCode();
    
    /**
     * Sets the "AuthenticationCode" element
     */
    void setAuthenticationCode(java.lang.String authenticationCode);
    
    /**
     * Sets (as xml) the "AuthenticationCode" element
     */
    void xsetAuthenticationCode(org.apache.xmlbeans.XmlString authenticationCode);
    
    /**
     * Unsets the "AuthenticationCode" element
     */
    void unsetAuthenticationCode();
    
    /**
     * Gets the "SecurityLevel" element
     */
    java.lang.String getSecurityLevel();
    
    /**
     * Gets (as xml) the "SecurityLevel" element
     */
    org.apache.xmlbeans.XmlString xgetSecurityLevel();
    
    /**
     * True if has "SecurityLevel" element
     */
    boolean isSetSecurityLevel();
    
    /**
     * Sets the "SecurityLevel" element
     */
    void setSecurityLevel(java.lang.String securityLevel);
    
    /**
     * Sets (as xml) the "SecurityLevel" element
     */
    void xsetSecurityLevel(org.apache.xmlbeans.XmlString securityLevel);
    
    /**
     * Unsets the "SecurityLevel" element
     */
    void unsetSecurityLevel();
    
    /**
     * Gets the "TxnID" element
     */
    java.lang.String getTxnID();
    
    /**
     * Gets (as xml) the "TxnID" element
     */
    org.apache.xmlbeans.XmlString xgetTxnID();
    
    /**
     * True if has "TxnID" element
     */
    boolean isSetTxnID();
    
    /**
     * Sets the "TxnID" element
     */
    void setTxnID(java.lang.String txnID);
    
    /**
     * Sets (as xml) the "TxnID" element
     */
    void xsetTxnID(org.apache.xmlbeans.XmlString txnID);
    
    /**
     * Unsets the "TxnID" element
     */
    void unsetTxnID();
    
    /**
     * Gets the "Md" element
     */
    java.lang.String getMd();
    
    /**
     * Gets (as xml) the "Md" element
     */
    org.apache.xmlbeans.XmlString xgetMd();
    
    /**
     * True if has "Md" element
     */
    boolean isSetMd();
    
    /**
     * Sets the "Md" element
     */
    void setMd(java.lang.String md);
    
    /**
     * Sets (as xml) the "Md" element
     */
    void xsetMd(org.apache.xmlbeans.XmlString md);
    
    /**
     * Unsets the "Md" element
     */
    void unsetMd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.Secure3D newInstance() {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.Secure3D newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.Secure3D parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.Secure3D parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.Secure3D parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.Secure3D parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.Secure3D parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.Secure3D parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.Secure3D parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.Secure3D parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.Secure3D parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.Secure3D parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.Secure3D parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.Secure3D parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.Secure3D parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.Secure3D parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.Secure3D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.Secure3D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.Secure3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
