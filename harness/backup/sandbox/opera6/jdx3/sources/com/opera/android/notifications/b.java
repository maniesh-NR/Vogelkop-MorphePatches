package com.opera.android.notifications;

import android.content.Context;
import android.content.Intent;
import defpackage.c7d;
import defpackage.kqd;

/* loaded from: classes.dex */
public final class b implements c7d {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ kqd c;

    public b(Context context, Intent intent, kqd kqdVar) {
        this.a = context;
        this.b = intent;
        this.c = kqdVar;
    }

    @Override // defpackage.c7d
    public final void c(int i) {
        this.c.onDone();
    }

    @Override // defpackage.c7d
    public final void onSuccess() {
        NotificationBridge.a(this.b, this.c);
    }
}
