package com.example.saber.loginstatemode;

import android.content.Context;

/**
 * Created by saber on 2017/8/2.
 */

public class UserLogin implements IUserState{

    private static UserLogin mInstance;

    //默认为为登录状态
    private IUserState userState = new UserNoLoginState();

    private UserLogin() {
    }

    public static UserLogin getInstance(){
        if(mInstance == null){
            synchronized (UserLogin.class){
                if(mInstance == null){
                    mInstance = new UserLogin();
                }
            }
        }
        return mInstance;
    }

    public void setUserState(IUserState userState) {
        this.userState = userState;
    }


    @Override
    public void Share(Context context) {
        userState.Share(context);
    }

    @Override
    public void commit(Context context) {
        userState.commit(context);
    }
}
