package com.opera.android.notifications;

import android.content.Context;
import android.content.Intent;
import defpackage.c7d;

/* loaded from: classes.dex */
public final class c implements c7d {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ NotificationService c;

    public c(Context context, Intent intent, NotificationService notificationService) {
        this.a = context;
        this.b = intent;
        this.c = notificationService;
    }

    @Override // defpackage.c7d
    public final void c(int i) {
        int i2 = NotificationService.b;
        NotificationService notificationService = this.c;
        int i3 = notificationService.a - 1;
        notificationService.a = i3;
        if (i3 == 0) {
            notificationService.stopSelf();
        }
    }

    @Override // defpackage.c7d
    public final void onSuccess() {
        NotificationBridge.a(this.b, this.c);
    }
}
