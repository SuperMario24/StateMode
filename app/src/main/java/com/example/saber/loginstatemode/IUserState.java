package com.example.saber.loginstatemode;

import android.content.Context;

/**
 * Created by saber on 2017/8/2.
 */

public interface IUserState {
    //转发
    void Share(Context context);
    //评论
    void commit(Context context);

}
