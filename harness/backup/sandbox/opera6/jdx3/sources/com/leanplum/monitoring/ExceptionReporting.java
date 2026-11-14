package com.leanplum.monitoring;

import android.content.Context;

/* loaded from: classes.dex */
public interface ExceptionReporting {
    void reportException(Throwable th);

    void setContext(Context context);
}
