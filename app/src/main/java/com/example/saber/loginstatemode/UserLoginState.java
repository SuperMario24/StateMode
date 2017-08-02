package com.example.saber.loginstatemode;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by saber on 2017/8/2.
 */

public class UserLoginState implements IUserState {
    @Override
    public void Share(Context context) {
        Toast.makeText(context, "转发成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void commit(Context context) {
        Toast.makeText(context, "评论成功", Toast.LENGTH_SHORT).show();
    }

}
