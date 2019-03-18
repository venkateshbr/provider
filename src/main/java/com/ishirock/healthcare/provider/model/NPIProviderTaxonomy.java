package com.ishirock.healthcare.provider.model;

public class NPIProviderTaxonomy {
 private String code;
 private String desc;
 private String license;
 private boolean primary;
 private String state;


 // Getter Methods 

 public String getCode() {
  return code;
 }

 public String getDesc() {
  return desc;
 }

 public String getLicense() {
  return license;
 }

 public boolean getPrimary() {
  return primary;
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

 public void setLicense(String license) {
  this.license = license;
 }

 public void setPrimary(boolean primary) {
  this.primary = primary;
 }

 public void setState(String state) {
  this.state = state;
 }
}