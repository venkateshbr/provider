package com.ishirock.healthcare.provider.model;

import java.util.ArrayList;
import java.util.List;

public class NPIProvider {
    ArrayList<NPIProviderAddress> addresses = new ArrayList<NPIProviderAddress>();
    NPIProviderBasic basic;
    private float created_epoch;
    private String enumeration_type;
    List<NPIProviderIdentifier> identifiers = new ArrayList<NPIProviderIdentifier>();
    private float last_updated_epoch;
    private float number;
    List<Object> other_names = new ArrayList<Object>();
    List<NPIProviderTaxonomy> taxonomies = new ArrayList<NPIProviderTaxonomy>();

    // Getter Methods

    public NPIProviderBasic getBasic() {
        return basic;
    }

    public float getCreated_epoch() {
        return created_epoch;
    }

    public String getEnumeration_type() {
        return enumeration_type;
    }

    public float getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public float getNumber() {
        return number;
    }

    // Setter Methods

    public void setBasic(NPIProviderBasic basicObject) {
        this.basic = basicObject;
    }

    public void setCreated_epoch(float created_epoch) {
        this.created_epoch = created_epoch;
    }

    public void setEnumeration_type(String enumeration_type) {
        this.enumeration_type = enumeration_type;
    }

    public void setLast_updated_epoch(float last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    /**
     * @return the addresses
     */
    public ArrayList<NPIProviderAddress> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(ArrayList<NPIProviderAddress> addresses) {
        this.addresses = addresses;
    }

    /**
     * @return the identifiers
     */
    public List<NPIProviderIdentifier> getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the identifiers to set
     */
    public void setIdentifiers(List<NPIProviderIdentifier> identifiers) {
        this.identifiers = identifiers;
    }

    /**
     * @return the other_names
     */
    public List<Object> getOther_names() {
        return other_names;
    }

    /**
     * @param other_names the other_names to set
     */
    public void setOther_names(List<Object> other_names) {
        this.other_names = other_names;
    }

    /**
     * @return the taxonomies
     */
    public List<NPIProviderTaxonomy> getTaxonomies() {
        return taxonomies;
    }

    /**
     * @param taxonomies the taxonomies to set
     */
    public void setTaxonomies(List<NPIProviderTaxonomy> taxonomies) {
        this.taxonomies = taxonomies;
    }
}
