package org.pursuit;

public class Parent {
    private String  eyeColor;
    private String hairColor;
    public Parent(){}

    public Parent(String setEyeColor, String setHairColor){
        this.eyeColor = setEyeColor;
        this.hairColor = setHairColor;
    }
    public  String getEyeColor(){
        return this.eyeColor;
    }
    public String getHairColor(){
        return this.hairColor;
    }
}
