package org.andresoviedo.app.Controls;


import android.util.Log;

import org.andresoviedo.app.util.math.Quaternion;

import java.util.HashMap;
import java.util.Map;

public class JointEngine {
    //Quaternion current_sensordata;
    static Map<String, float[]> currentPose = new HashMap<String, float[]>();
    String element = "";


    public JointEngine(Map<String, float[]> initialpose){
        //current_sensordata = new Quaternion(0,0,0,0);
        this.currentPose = initialpose;
        Log.d("InitializedPose",currentPose.keySet().toString());



    }



    public Map<String, float[]> requestPose(){

        return this.currentPose;

    }

    public void changePose(){
        //change the joint according to the jointid
        float[] transmat = new float[]{-0.9408169f, 0.28628558f, -0.88139493f, 0.0f, 0.18397914f, -0.018085718f, -0.98276377f, 0.0f, -0.28463173f, -0.9579736f, -0.03565526f, 0.0f, 0.0f, 1.282774f, 0.0f, 1.0f};
        this.currentPose.put("Lower_Leg_R",transmat);




    }
}
