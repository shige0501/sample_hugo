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

        toast();
    }

    @DebugLog
    public String toast() {
        Toast.makeText(this, "サンプルメッセージ", Toast.LENGTH_SHORT).show();
        return "表示完了";
    }
}
