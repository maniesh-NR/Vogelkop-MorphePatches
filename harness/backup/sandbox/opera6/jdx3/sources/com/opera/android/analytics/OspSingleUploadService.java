package com.opera.android.analytics;

import android.content.SharedPreferences;
import defpackage.btf;
import defpackage.ru9;

/* loaded from: classes.dex */
public class OspSingleUploadService extends btf {
    public OspSingleUploadService() {
        super(true);
    }

    @Override // defpackage.btf
    public final synchronized boolean b(boolean z) {
        int i;
        ru9 ru9VarC = ru9.c(getApplicationContext());
        int i2 = ru9VarC.a.getInt("oem.osp.retry.count", 0);
        if (z || (i = i2 + 1) >= 5) {
            nv6 nv6VarB = ru9VarC.b();
            ((SharedPreferences.Editor) nv6VarB.a).remove("oem.osp.retry.count");
            nv6VarB.w();
            return false;
        }
        nv6 nv6VarB2 = ru9VarC.b();
        ((SharedPreferences.Editor) nv6VarB2.a).putInt("oem.osp.retry.count", i);
        nv6VarB2.w();
        return true;
    }
}
