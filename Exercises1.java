package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * 2019-07-01 19:43:00.660 15722-15722/chapter.android.aweme.ss.com.homework.new I/MainActivity: ---onPause-->
 * 2019-07-01 19:43:00.671 15722-15722/chapter.android.aweme.ss.com.homework.new I/MainActivity: ---onStop--->
 * 2019-07-01 19:43:00.672 15722-15722/chapter.android.aweme.ss.com.homework.new I/MainActivity: ---onDestory--->
 * 2019-07-01 19:43:00.709 15722-15722/chapter.android.aweme.ss.com.homework.new I/MainActivity: ------------------onCreate-------->
 * 2019-07-01 19:43:00.729 15722-15722/chapter.android.aweme.ss.com.homework.new I/MainActivity: ---onStart--->
 * 2019-07-01 19:43:00.734 15722-15722/chapter.android.aweme.ss.com.homework.new I/MainActivity: ---onResume--->
 */
public class Exercises1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1);
    }

}
