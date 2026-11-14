package com.opera.android.browser;

import androidx.annotation.NonNull;
import defpackage.zyn;

/* loaded from: classes.dex */
public final class Webdump {
    public static void send(int i, @NonNull String str) {
        new zyn(i, str).execute(new Void[0]);
    }
}
