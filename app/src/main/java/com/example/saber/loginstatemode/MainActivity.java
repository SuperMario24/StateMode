package com.example.saber.loginstatemode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnShare;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShare = (Button) findViewById(R.id.btn_share);
        btnExit = (Button) findViewById(R.id.btn_exit);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserLogin.getInstance().Share(MainActivity.this);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserLogin.getInstance().setUserState(new UserNoLoginState());
                Toast.makeText(MainActivity.this, "注销成功", Toast.LENGTH_SHORT).show();
            }
        });



    }

}
