package net.teachingprogramming.androidsandboxjava;

import android.view.View;
import android.widget.Toast;

public class SimpleClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "SimpleClickListener", Toast.LENGTH_SHORT).show();
    }
}
