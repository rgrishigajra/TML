package com.example.rishabhgajra.tml;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/**
 * Created by rishabh Gajra on 1/31/2017.
 */

public class splashscreen extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(5000);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }finally
                {
                    Intent intent = new Intent(splashscreen.this,Login.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
