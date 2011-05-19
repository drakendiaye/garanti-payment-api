/*
 * XML Type:  RequestTransaction
 * Namespace: 
 * Java type: noNamespace.RequestTransaction
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML RequestTransaction(@).
 *
 * This is a complex type.
 */
public interface RequestTransaction extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestTransaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B755B3F7219A48EA385FA8800E9C758").resolveHandle("requesttransaction0718type");
    
    /**
     * Gets the "Type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "Type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "Type" element
     */
    void unsetType();
    
    /**
     * Gets the "InstallmentCnt" element
     */
    java.lang.String getInstallmentCnt();
    
    /**
     * Gets (as xml) the "InstallmentCnt" element
     */
    org.apache.xmlbeans.XmlString xgetInstallmentCnt();
    
    /**
     * True if has "InstallmentCnt" element
     */
    boolean isSetInstallmentCnt();
    
    /**
     * Sets the "InstallmentCnt" element
     */
    void setInstallmentCnt(java.lang.String installmentCnt);
    
    /**
     * Sets (as xml) the "InstallmentCnt" element
     */
    void xsetInstallmentCnt(org.apache.xmlbeans.XmlString installmentCnt);
    
    /**
     * Unsets the "InstallmentCnt" element
     */
    void unsetInstallmentCnt();
    
    /**
     * Gets the "Amount" element
     */
    java.lang.String getAmount();
    
    /**
     * Gets (as xml) the "Amount" element
     */
    org.apache.xmlbeans.XmlString xgetAmount();
    
    /**
     * True if has "Amount" element
     */
    boolean isSetAmount();
    
    /**
     * Sets the "Amount" element
     */
    void setAmount(java.lang.String amount);
    
    /**
     * Sets (as xml) the "Amount" element
     */
    void xsetAmount(org.apache.xmlbeans.XmlString amount);
    
    /**
     * Unsets the "Amount" element
     */
    void unsetAmount();
    
    /**
     * Gets the "CurrencyCode" element
     */
    java.lang.String getCurrencyCode();
    
    /**
     * Gets (as xml) the "CurrencyCode" element
     */
    org.apache.xmlbeans.XmlString xgetCurrencyCode();
    
    /**
     * True if has "CurrencyCode" element
     */
    boolean isSetCurrencyCode();
    
    /**
     * Sets the "CurrencyCode" element
     */
    void setCurrencyCode(java.lang.String currencyCode);
    
    /**
     * Sets (as xml) the "CurrencyCode" element
     */
    void xsetCurrencyCode(org.apache.xmlbeans.XmlString currencyCode);
    
    /**
     * Unsets the "CurrencyCode" element
     */
    void unsetCurrencyCode();
    
    /**
     * Gets the "OriginalRetrefNum" element
     */
    java.lang.String getOriginalRetrefNum();
    
    /**
     * Gets (as xml) the "OriginalRetrefNum" element
     */
    org.apache.xmlbeans.XmlString xgetOriginalRetrefNum();
    
    /**
     * True if has "OriginalRetrefNum" element
     */
    boolean isSetOriginalRetrefNum();
    
    /**
     * Sets the "OriginalRetrefNum" element
     */
    void setOriginalRetrefNum(java.lang.String originalRetrefNum);
    
    /**
     * Sets (as xml) the "OriginalRetrefNum" element
     */
    void xsetOriginalRetrefNum(org.apache.xmlbeans.XmlString originalRetrefNum);
    
    /**
     * Unsets the "OriginalRetrefNum" element
     */
    void unsetOriginalRetrefNum();
    
    /**
     * Gets the "CardholderPresentCode" element
     */
    java.lang.String getCardholderPresentCode();
    
    /**
     * Gets (as xml) the "CardholderPresentCode" element
     */
    org.apache.xmlbeans.XmlString xgetCardholderPresentCode();
    
    /**
     * True if has "CardholderPresentCode" element
     */
    boolean isSetCardholderPresentCode();
    
    /**
     * Sets the "CardholderPresentCode" element
     */
    void setCardholderPresentCode(java.lang.String cardholderPresentCode);
    
    /**
     * Sets (as xml) the "CardholderPresentCode" element
     */
    void xsetCardholderPresentCode(org.apache.xmlbeans.XmlString cardholderPresentCode);
    
    /**
     * Unsets the "CardholderPresentCode" element
     */
    void unsetCardholderPresentCode();
    
    /**
     * Gets the "MotoInd" element
     */
    java.lang.String getMotoInd();
    
    /**
     * Gets (as xml) the "MotoInd" element
     */
    org.apache.xmlbeans.XmlString xgetMotoInd();
    
    /**
     * True if has "MotoInd" element
     */
    boolean isSetMotoInd();
    
    /**
     * Sets the "MotoInd" element
     */
    void setMotoInd(java.lang.String motoInd);
    
    /**
     * Sets (as xml) the "MotoInd" element
     */
    void xsetMotoInd(org.apache.xmlbeans.XmlString motoInd);
    
    /**
     * Unsets the "MotoInd" element
     */
    void unsetMotoInd();
    
    /**
     * Gets the "Secure3D" element
     */
    noNamespace.Secure3D getSecure3D();
    
    /**
     * True if has "Secure3D" element
     */
    boolean isSetSecure3D();
    
    /**
     * Sets the "Secure3D" element
     */
    void setSecure3D(noNamespace.Secure3D secure3D);
    
    /**
     * Appends and returns a new empty "Secure3D" element
     */
    noNamespace.Secure3D addNewSecure3D();
    
    /**
     * Unsets the "Secure3D" element
     */
    void unsetSecure3D();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.RequestTransaction newInstance() {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.RequestTransaction newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.RequestTransaction parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.RequestTransaction parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.RequestTransaction parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.RequestTransaction parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.RequestTransaction parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.RequestTransaction parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.RequestTransaction parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.RequestTransaction parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.RequestTransaction parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.RequestTransaction parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.RequestTransaction parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.RequestTransaction parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.RequestTransaction parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.RequestTransaction parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RequestTransaction parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RequestTransaction parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RequestTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
