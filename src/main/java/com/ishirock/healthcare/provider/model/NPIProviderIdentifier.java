package com.ishirock.healthcare.provider.model;

public class NPIProviderIdentifier {
    private String code;
    private String desc;
    private String identifier;
    private String issuer;
    private String state;
   
   
    // Getter Methods 
   
    public String getCode() {
     return code;
    }
   
    public String getDesc() {
     return desc;
    }
   
    public String getIdentifier() {
     return identifier;
    }
   
    public String getIssuer() {
     return issuer;
    }
   
    public String getState() {
     return state;
    }
   
    // Setter Methods 
   
    public void setCode(String code) {
     this.code = code;
    }
   
    public void setDesc(String desc) {
     this.desc = desc;
    }
   
    public void setIdentifier(String identifier) {
     this.identifier = identifier;
    }
   
    public void setIssuer(String issuer) {
     this.issuer = issuer;
    }
   
    public void setState(String state) {
     this.state = state;
    }
   }