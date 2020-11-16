package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.util.BitmapLoadUtils;

import java.io.File;
import java.util.UUID;

public class MainActivty extends Activity {

    Button btn_crop;
    Uri image_selected_uri;
    public static final int PERMISSION_PICK_IMAGE=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_crop=(Button)findViewById(R.id.crop_button);

        btn_crop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startCrop(image_selected_uri);
            }
        });
    }

    private void startCrop(Uri uri) {
        String destinationFileName = new StringBuilder(UUID.randomUUID().toString()).append(".jpg").toString();

        UCrop ucrop = UCrop.of(uri,Uri.fromFile(new File(getCacheDir(),destinationFileName)));

        ucrop.start(MainActivty.this);
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (resultCode == RESULT_OK && requestCode == UCrop.REQUEST_CROP) {
                final Uri resultUri = UCrop.getOutput(data);
            } else if (resultCode == UCrop.RESULT_ERROR) {
                final Throwable cropError = UCrop.getError(data);
            }

        }

    }
}
