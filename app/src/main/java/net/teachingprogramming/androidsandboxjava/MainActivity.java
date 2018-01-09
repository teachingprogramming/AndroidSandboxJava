package net.teachingprogramming.androidsandboxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

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
    }
}
