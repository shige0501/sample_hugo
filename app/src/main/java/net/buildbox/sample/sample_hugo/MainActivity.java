package net.buildbox.sample.sample_hugo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import hugo.weaving.DebugLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast("Hello, ", "World!");
    }

    @DebugLog
    public String toast(String args1, String args2) {
        Toast.makeText(this, "サンプルメッセージ", Toast.LENGTH_SHORT).show();
        return args1 + args2;
    }
}
