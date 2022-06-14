package com.example.mytestdata;

import android.os.Bundle;
import android.util.Log;

import java.io.Serializable;

public class PostData implements Serializable {
    public int id;
    public final String id_key = "key_Id";
    public final String ShortDes_key = "key_ShortDes";
    public final String LongDes_key = "key_LongDes";

    public final String dataKey = "mohamedIssa.Key";
    public String ShortDesc;
    public String LongDesc;

    public Bundle setData(Bundle data1) {
        data1 = new Bundle();
        data1.putInt(id_key, id);
        data1.putString(ShortDes_key, ShortDesc);
        data1.putString(LongDes_key, LongDesc);
        if (data1!=null){
            Log.d(id_key,"id is :- "+data1.getInt(id_key));
            Log.d(id_key,"ShortDes is :- "+data1.getString(ShortDes_key));
            Log.d(id_key,"LongDes is :- "+data1.getString(LongDes_key));
            return data1;
        }else {
            Log.d("ErrorSaved"," size is  "+data1.getSize(id_key));
        }

        return null;
    }
}
