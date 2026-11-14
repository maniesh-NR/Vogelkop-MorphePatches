package com.leanplum;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.leanplum.annotations.Parser;
import com.leanplum.internal.Constants;

@SuppressLint({"Registered"})
/* loaded from: classes.dex */
public class LeanplumApplication extends Application {
    private static LeanplumApplication instance;

    public static Context getContext() {
        return instance;
    }

    public static LeanplumApplication getInstance() {
        return instance;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return (Constants.isNoop() || !Leanplum.isResourceSyncingEnabled()) ? super.getResources() : new LeanplumResources(super.getResources());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        instance = this;
        LeanplumActivityHelper.enableLifecycleCallbacks(this);
        Parser.parseVariables(this);
    }
}
