/*
 * XML Type:  OrderInqResultType
 * Namespace: 
 * Java type: noNamespace.OrderInqResultType
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML OrderInqResultType(@).
 *
 * This is a complex type.
 */
public interface OrderInqResultType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderInqResultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B755B3F7219A48EA385FA8800E9C758").resolveHandle("orderinqresulttypec79etype");
    
    /**
     * Gets the "ChargeType" element
     */
    java.lang.String getChargeType();
    
    /**
     * Gets (as xml) the "ChargeType" element
     */
    org.apache.xmlbeans.XmlString xgetChargeType();
    
    /**
     * True if has "ChargeType" element
     */
    boolean isSetChargeType();
    
    /**
     * Sets the "ChargeType" element
     */
    void setChargeType(java.lang.String chargeType);
    
    /**
     * Sets (as xml) the "ChargeType" element
     */
    void xsetChargeType(org.apache.xmlbeans.XmlString chargeType);
    
    /**
     * Unsets the "ChargeType" element
     */
    void unsetChargeType();
    
    /**
     * Gets the "PreAuthAmount" element
     */
    java.lang.String getPreAuthAmount();
    
    /**
     * Gets (as xml) the "PreAuthAmount" element
     */
    org.apache.xmlbeans.XmlString xgetPreAuthAmount();
    
    /**
     * True if has "PreAuthAmount" element
     */
    boolean isSetPreAuthAmount();
    
    /**
     * Sets the "PreAuthAmount" element
     */
    void setPreAuthAmount(java.lang.String preAuthAmount);
    
    /**
     * Sets (as xml) the "PreAuthAmount" element
     */
    void xsetPreAuthAmount(org.apache.xmlbeans.XmlString preAuthAmount);
    
    /**
     * Unsets the "PreAuthAmount" element
     */
    void unsetPreAuthAmount();
    
    /**
     * Gets the "PreAuthDate" element
     */
    java.lang.String getPreAuthDate();
    
    /**
     * Gets (as xml) the "PreAuthDate" element
     */
    org.apache.xmlbeans.XmlString xgetPreAuthDate();
    
    /**
     * True if has "PreAuthDate" element
     */
    boolean isSetPreAuthDate();
    
    /**
     * Sets the "PreAuthDate" element
     */
    void setPreAuthDate(java.lang.String preAuthDate);
    
    /**
     * Sets (as xml) the "PreAuthDate" element
     */
    void xsetPreAuthDate(org.apache.xmlbeans.XmlString preAuthDate);
    
    /**
     * Unsets the "PreAuthDate" element
     */
    void unsetPreAuthDate();
    
    /**
     * Gets the "AuthAmount" element
     */
    java.lang.String getAuthAmount();
    
    /**
     * Gets (as xml) the "AuthAmount" element
     */
    org.apache.xmlbeans.XmlString xgetAuthAmount();
    
    /**
     * True if has "AuthAmount" element
     */
    boolean isSetAuthAmount();
    
    /**
     * Sets the "AuthAmount" element
     */
    void setAuthAmount(java.lang.String authAmount);
    
    /**
     * Sets (as xml) the "AuthAmount" element
     */
    void xsetAuthAmount(org.apache.xmlbeans.XmlString authAmount);
    
    /**
     * Unsets the "AuthAmount" element
     */
    void unsetAuthAmount();
    
    /**
     * Gets the "AuthDate" element
     */
    java.lang.String getAuthDate();
    
    /**
     * Gets (as xml) the "AuthDate" element
     */
    org.apache.xmlbeans.XmlString xgetAuthDate();
    
    /**
     * True if has "AuthDate" element
     */
    boolean isSetAuthDate();
    
    /**
     * Sets the "AuthDate" element
     */
    void setAuthDate(java.lang.String authDate);
    
    /**
     * Sets (as xml) the "AuthDate" element
     */
    void xsetAuthDate(org.apache.xmlbeans.XmlString authDate);
    
    /**
     * Unsets the "AuthDate" element
     */
    void unsetAuthDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.OrderInqResultType newInstance() {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.OrderInqResultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.OrderInqResultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.OrderInqResultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.OrderInqResultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.OrderInqResultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.OrderInqResultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.OrderInqResultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.OrderInqResultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.OrderInqResultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.OrderInqResultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.OrderInqResultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.OrderInqResultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.OrderInqResultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.OrderInqResultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.OrderInqResultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.OrderInqResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.OrderInqResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.OrderInqResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
