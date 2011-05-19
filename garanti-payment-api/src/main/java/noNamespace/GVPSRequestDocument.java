/*
 * An XML document type.
 * Localname: GVPSRequest
 * Namespace: 
 * Java type: noNamespace.GVPSRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one GVPSRequest(@) element.
 *
 * This is a complex type.
 */
public interface GVPSRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GVPSRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B755B3F7219A48EA385FA8800E9C758").resolveHandle("gvpsrequest7ce4doctype");
    
    /**
     * Gets the "GVPSRequest" element
     */
    noNamespace.GVPSRequestDocument.GVPSRequest getGVPSRequest();
    
    /**
     * Sets the "GVPSRequest" element
     */
    void setGVPSRequest(noNamespace.GVPSRequestDocument.GVPSRequest gvpsRequest);
    
    /**
     * Appends and returns a new empty "GVPSRequest" element
     */
    noNamespace.GVPSRequestDocument.GVPSRequest addNewGVPSRequest();
    
    /**
     * An XML GVPSRequest(@).
     *
     * This is a complex type.
     */
    public interface GVPSRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GVPSRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B755B3F7219A48EA385FA8800E9C758").resolveHandle("gvpsrequest609delemtype");
        
        /**
         * Gets the "Mode" element
         */
        java.lang.String getMode();
        
        /**
         * Gets (as xml) the "Mode" element
         */
        org.apache.xmlbeans.XmlString xgetMode();
        
        /**
         * True if has "Mode" element
         */
        boolean isSetMode();
        
        /**
         * Sets the "Mode" element
         */
        void setMode(java.lang.String mode);
        
        /**
         * Sets (as xml) the "Mode" element
         */
        void xsetMode(org.apache.xmlbeans.XmlString mode);
        
        /**
         * Unsets the "Mode" element
         */
        void unsetMode();
        
        /**
         * Gets the "Version" element
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "Version" element
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * True if has "Version" element
         */
        boolean isSetVersion();
        
        /**
         * Sets the "Version" element
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "Version" element
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Unsets the "Version" element
         */
        void unsetVersion();
        
        /**
         * Gets the "Terminal" element
         */
        noNamespace.Terminal getTerminal();
        
        /**
         * True if has "Terminal" element
         */
        boolean isSetTerminal();
        
        /**
         * Sets the "Terminal" element
         */
        void setTerminal(noNamespace.Terminal terminal);
        
        /**
         * Appends and returns a new empty "Terminal" element
         */
        noNamespace.Terminal addNewTerminal();
        
        /**
         * Unsets the "Terminal" element
         */
        void unsetTerminal();
        
        /**
         * Gets the "Customer" element
         */
        noNamespace.Customer getCustomer();
        
        /**
         * True if has "Customer" element
         */
        boolean isSetCustomer();
        
        /**
         * Sets the "Customer" element
         */
        void setCustomer(noNamespace.Customer customer);
        
        /**
         * Appends and returns a new empty "Customer" element
         */
        noNamespace.Customer addNewCustomer();
        
        /**
         * Unsets the "Customer" element
         */
        void unsetCustomer();
        
        /**
         * Gets the "Card" element
         */
        noNamespace.Card getCard();
        
        /**
         * True if has "Card" element
         */
        boolean isSetCard();
        
        /**
         * Sets the "Card" element
         */
        void setCard(noNamespace.Card card);
        
        /**
         * Appends and returns a new empty "Card" element
         */
        noNamespace.Card addNewCard();
        
        /**
         * Unsets the "Card" element
         */
        void unsetCard();
        
        /**
         * Gets the "Order" element
         */
        noNamespace.RequestOrder getOrder();
        
        /**
         * True if has "Order" element
         */
        boolean isSetOrder();
        
        /**
         * Sets the "Order" element
         */
        void setOrder(noNamespace.RequestOrder order);
        
        /**
         * Appends and returns a new empty "Order" element
         */
        noNamespace.RequestOrder addNewOrder();
        
        /**
         * Unsets the "Order" element
         */
        void unsetOrder();
        
        /**
         * Gets the "Transaction" element
         */
        noNamespace.RequestTransaction getTransaction();
        
        /**
         * True if has "Transaction" element
         */
        boolean isSetTransaction();
        
        /**
         * Sets the "Transaction" element
         */
        void setTransaction(noNamespace.RequestTransaction transaction);
        
        /**
         * Appends and returns a new empty "Transaction" element
         */
        noNamespace.RequestTransaction addNewTransaction();
        
        /**
         * Unsets the "Transaction" element
         */
        void unsetTransaction();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.GVPSRequestDocument.GVPSRequest newInstance() {
              return (noNamespace.GVPSRequestDocument.GVPSRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.GVPSRequestDocument.GVPSRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.GVPSRequestDocument.GVPSRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.GVPSRequestDocument newInstance() {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.GVPSRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.GVPSRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.GVPSRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.GVPSRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.GVPSRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.GVPSRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.GVPSRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.GVPSRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.GVPSRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.GVPSRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.GVPSRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
