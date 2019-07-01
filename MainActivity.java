package chapter.android.aweme.ss.com.homework;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"------------------onCreate-------->");
       // super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleImageView circleImageView = findViewById(R.id.circle_view);
        circleImageView.setImageResource(R.drawable.icon_micro_game_comment);
        findViewById(R.id.btn_exercises1).setOnClickListener(this);
        findViewById(R.id.btn_exercises2).setOnClickListener(this);
        findViewById(R.id.btn_exercises3).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"---onStart--->");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"---onDestory--->");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"---onResume--->");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"---onPause-->");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"---onStop--->");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_exercises1:
                startActivity(new Intent(this, Exercises1.class));
                break;
            case R.id.btn_exercises2:
                startActivity(new Intent(this, Exercises2.class));
                break;
            case R.id.btn_exercises3:
                startActivity(new Intent(this, Exercises3.class));
                break;
        }
    }
}
