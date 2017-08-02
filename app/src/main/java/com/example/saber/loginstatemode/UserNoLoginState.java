package com.example.saber.loginstatemode;

import android.content.Context;
import android.content.Intent;

/**
 * Created by saber on 2017/8/2.
 */

public class UserNoLoginState implements IUserState {

    @Override
    public void Share(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void commit(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }

}
