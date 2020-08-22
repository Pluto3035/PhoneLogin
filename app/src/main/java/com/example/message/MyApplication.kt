package com.example.message

import android.app.Application
import cn.bmob.v3.Bmob

/**
 * @Description
 * 代码高手
 */
class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        //第一.默认初始化
        Bmob.initialize(this, "c12f5ff15568e1e18c72649071389bea");
    }
}