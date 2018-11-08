package org.pursuit;

public class Child extends Parent{
    private int age;

    public Child(){}
    public Child(int age, String setEyeColor, String setHairColor){
    super(setEyeColor, setHairColor);
    this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
