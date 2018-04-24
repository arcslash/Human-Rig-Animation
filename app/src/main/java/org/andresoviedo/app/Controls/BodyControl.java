package org.andresoviedo.app.Controls;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import org.andresoviedo.app.model3D.view.ModelActivity;

public class BodyControl extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadDemo();
    }

    private void loadDemo(){

        Intent intent = new Intent(BodyControl.this.getApplicationContext(), ModelActivity.class);
        Bundle b = new Bundle();
        b.putString("assetDir", "models");
        b.putString("assetFilename", "cow3.dae");
        b.putString("immersiveMode", "true");
        b.putString("backgroundColor", "255 255 255 0");
        intent.putExtras(b);
        BodyControl.this.startActivity(intent);
    }



}
