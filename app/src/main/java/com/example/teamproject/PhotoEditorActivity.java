package com.example.teamproject;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.teamproject.PhotoEditorFragment;
import com.example.teamproject.R;

//public class PhotoEditorActivity extends AppCompatActivity {
//    FragmentManager fragManager;
//    FragmentTransaction fragTransaction;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        fragManager=getFragmentManager();
//        fragManager.findFragmentById(R.id.fragmentContainer);
//        fragTransaction=fragManager.beginTransaction();
//        fragTransaction.replace(R.id.fragmentContainer, new PhotoEditorFragment());
//        fragTransaction.commit();
//    }
//}