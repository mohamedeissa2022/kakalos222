package com.example.mytestdata;

public class MohamedEissaClass2022 {
    public PostData data ;
    public MohamedEissaClass2022(PostData data){
        this.data=data;
    }
    public boolean CheckDataIsEmpty(){
        if (data==null) return true;
        else return false;
    }
}
