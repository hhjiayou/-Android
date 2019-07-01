package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {


    private String TAG = "MainActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exercise2);
       /* LinearLayout layout =(LinearLayout)findViewById(R.id.mainmain);
        getViewCount(layout);
        Log.i(TAG, "Activity_main共有"+layout.getChildCount()+"子view");
        */
        TextView tv=findViewById(R.id.textView3);
        View inflate= LayoutInflater.from(this).inflate(R.layout.activity_chatroom,null);
        tv.setText("activity_chatroom 页面中View个数："+getViewCount(inflate));


    }


    public static int getViewCount(View view) {
        //todo 补全你的代码 统计⻚⾯所有view的个数 ViewGroup中的API
        //： getChildCount() getChildAt()
        int ViewCount=0;
        if(view==null){
            return 0;
        }
        if(view instanceof ViewGroup){
            ViewCount++;
            for(int i = 0; i<((android.view.ViewGroup)view).getChildCount(); i++){
                View v=((ViewGroup) view).getChildAt(i);
                if (v instanceof ViewGroup) {
                    ViewCount += getViewCount(v);
                } else {
                    ViewCount++;
                }
            }
        }
        return ViewCount;

    }

            //    Toast.makeText(FirstActivity.this,"You clicked the button1",Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivity.this,"5 ",Toast.LENGTH_LONG).show();

        //return 0;
    }


