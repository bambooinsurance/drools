package org.jboss.quickstarts.brms;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class PriceQuotation  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer price;

    public PriceQuotation() {
    }

    public PriceQuotation(java.lang.Integer price) {
        this.price = price;
    }


    
    public java.lang.Integer getPrice() {
        return this.price;
    }

    public void setPrice(  java.lang.Integer price ) {
        this.price = price;
    }
}