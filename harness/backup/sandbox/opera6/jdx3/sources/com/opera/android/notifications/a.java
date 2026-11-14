package com.opera.android.notifications;

import android.graphics.Bitmap;
import com.opera.android.notifications.NotificationBridge;

/* loaded from: classes.dex */
public final class a implements NotificationBridge.ActionInfo {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public a(NotificationBridge.ActionInfoArrayBuilder actionInfoArrayBuilder, String str, Bitmap bitmap, int i, String str2) {
        this.a = str;
        this.b = bitmap;
        this.c = i;
        this.d = str2;
    }

    @Override // com.opera.android.notifications.NotificationBridge.ActionInfo
    public final String a() {
        return this.d;
    }

    @Override // com.opera.android.notifications.NotificationBridge.ActionInfo
    public final Bitmap getIcon() {
        return this.b;
    }

    @Override // com.opera.android.notifications.NotificationBridge.ActionInfo
    public final String getTitle() {
        return this.a;
    }

    @Override // com.opera.android.notifications.NotificationBridge.ActionInfo
    public final int getType() {
        return this.c;
    }
}
