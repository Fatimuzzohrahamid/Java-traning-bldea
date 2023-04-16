package com.bldea.croreoathi;

public class Candidate {
    private String name;
    private int age;
    private String city;
    private String state;
    static int amount;

/**
 * @param name
 * @param age
 * @param city
 * @param state
 */
public Candidate(String name,int age,String city,String state){
    super();
    this.name=name;
    this.age=age;
    this.city=city;
    this.state=state;
}
    public int getAmount(){
    return amount;

    }
public static void setAmount(int amt){
    amount=amt;

}
public String getName(){
    return name;

}
public int getAge(){
    return age;

}
public String getCity(){
    return city;

}
public String getState(){
    return state;
}
}
