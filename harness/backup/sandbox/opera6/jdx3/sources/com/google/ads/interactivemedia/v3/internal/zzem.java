package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.internal.atv_ads_framework.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.mbi;

/* loaded from: classes.dex */
public final class zzem {
    public final mbi a;
    public final zzsx b;
    public final a36 c;
    public final zzeg d;
    public final TaskCompletionSource e;

    public zzem(mbi mbiVar, zzsx zzsxVar, zzeg zzegVar, TestingConfiguration testingConfiguration) {
        a36 a36Var;
        if (zzds.a(mbiVar, testingConfiguration)) {
            a36Var = new a36();
            new zzd();
        } else {
            a36Var = null;
        }
        this.e = new TaskCompletionSource();
        this.a = mbiVar;
        this.b = zzsxVar;
        this.d = zzegVar;
        this.c = a36Var;
    }
}
