package net.teachingprogramming.androidsandboxjava;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // レイアウトを作成
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // ボタンを作成
        Button button = new Button(this);
        button.setText("はじめてのボタン");

        // レイアウトにボタンを追加
        linearLayout.addView(button);

        // レイアウトをコンテンツビューとして設定
        setContentView(linearLayout);

        // クリックリスナーのテスト1: OnClickListenerを実装したクラスを作成
        Button button1 = new Button(this);
        button1.setText("クリックリスナーの利用 1");
        button1.setOnClickListener(new SimpleClickListener());
        linearLayout.addView(button1);

        // クリックリスナーのテスト2: OnClickListenerを無名クラスで実装
        Button button2 = new Button(this);
        button2.setText("クリックリスナーの利用 2");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ここでMainActivityのフィールド等を使うことができる
                Toast.makeText(view.getContext(), "無名クラス", Toast.LENGTH_SHORT).show();
            }
        });
        linearLayout.addView(button2);

        // クリックリスナーのテスト3: OnClickListenerをMainActivityで実装
        Button button3 = new Button(this);
        button3.setText("クリックリスナーの利用 3");
        button3.setOnClickListener(this);
        linearLayout.addView(button3);

        Button button4 = new Button(this);
        button4.setText("SecondActivityへ遷移");
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        linearLayout.addView(button4);

        Button button5 = new Button(this);
        button5.setText("ダイアログで画像を表示");
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(MainActivity.this);
                // app/src/main/res/drawableにsmartphone.pngで画像を追加するとR.drawable.smartphoneが使えるようになる
                // 画像はいらすとや（http://www.irasutoya.com/2014/11/blog-post_362.html）より
                imageView.setImageResource(R.drawable.smartphone);
                imageView.setAdjustViewBounds(true);
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).setView(imageView).create();
                alertDialog.show();
            }
        });
        linearLayout.addView(button5);
    }

    @Override
    public void onClick(View view) {
        // ここでMainActivityのフィールド等を使うことができる
        Toast.makeText(view.getContext(), "MainActivity", Toast.LENGTH_SHORT).show();
    }
}
