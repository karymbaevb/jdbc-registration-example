package com.company;

public class Product {
    private Long id;
    private String name;
    private String package1;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPackage1(String package1){
        this.package1 = package1;
    }

    public String getPackage1(){
        return package1;
    }

}
