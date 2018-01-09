package net.teachingprogramming.androidsandboxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    }

    @Override
    public void onClick(View view) {
        // ここでMainActivityのフィールド等を使うことができる
        Toast.makeText(view.getContext(), "MainActivity", Toast.LENGTH_SHORT).show();
    }
}
