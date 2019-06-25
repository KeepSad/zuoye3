package com.example.asus.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnOnClick(View view1) {
//        AlertDialog.Builder selfDefDialogBuilder = new AlertDialog.Builder(MainActivity.this);
//        selfDefDialogBuilder.setIcon(R.drawable.icon_normal_dialog);
//        selfDefDialogBuilder.setTitle("请输入用户名和密码");
//        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_self_def_login, null); //    通过LayoutInflater来加载一个xml的布局文件作为一个View对象
//        selfDefDialogBuilder.setView(view);  //    设置我们自己定义的布局文件作为弹出框的Content
//
//        final EditText username = (EditText) view.findViewById(R.id.username);
//        final EditText password = (EditText) view.findViewById(R.id.password);
//
//        selfDefDialogBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
//
//            public void onClick(DialogInterface dialog, int which) {
//                String a = username.getText().toString().trim();
//                String b = password.getText().toString().trim();
//                //    将输入的用户名和密码打印出来
//                Toast.makeText(MainActivity.this, "用户名: " + a + ", 密码: " + b, Toast.LENGTH_SHORT).show();
//            }
//        });
//        selfDefDialogBuilder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
//        selfDefDialogBuilder.show();
        ProgressDialog  mProgressDialog=new ProgressDialog(this);
        mProgressDialog.show();
        View view = LayoutInflater.from(this).inflate(R.layout.progressdialog_layout,null);
        ImageView animImage = (ImageView)view.findViewById(R.id.animImage);
        Animation animationProgress = AnimationUtils.loadAnimation(this, R.anim.progress);
        animImage.startAnimation(animationProgress);
        View mProgressDialogTvTip = (TextView) view.findViewById(R.id.tvTip);

        mProgressDialog.setContentView(view);

    }
    }
