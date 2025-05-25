package com.shuishou.digitalmenu;

import android.app.Application;
import android.content.Context;

import com.shuishou.digitalmenu.io.CrashHandler;

import java.io.File;

import pl.brightinventions.slf4android.FileLogHandlerConfiguration;
import pl.brightinventions.slf4android.LoggerConfiguration;

import androidx.multidex.MultiDex;

/**
 * Created by Administrator on 2017/10/5.
 */

public class DigitalMenuApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FileLogHandlerConfiguration fileHandler = LoggerConfiguration.fileLogHandler(this);
        File dir = new File(InstantValue.ERRORLOGPATH);
        if (!dir.exists())
            dir.mkdir();
        fileHandler.setFullFilePathPattern(InstantValue.ERRORLOGPATH + "/" + InstantValue.ERRORLOGFILENAME + ".%g.%u.log");

        LoggerConfiguration.configuration().addHandlerToRootLogger(fileHandler);
        CrashHandler handler = CrashHandler.getInstance();
        handler.init(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
