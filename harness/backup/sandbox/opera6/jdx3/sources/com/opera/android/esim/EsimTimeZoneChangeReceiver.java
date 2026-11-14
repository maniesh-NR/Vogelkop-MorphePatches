package com.opera.android.esim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.opera.android.esim.work.EsimPromotionWorker;
import defpackage.tn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/esim/EsimTimeZoneChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EsimTimeZoneChangeReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context)) {
            return;
        }
        if (Intrinsics.a(intent != null ? intent.getAction() : null, "android.intent.action.TIMEZONE_CHANGED")) {
            x4o.c(context).b("ESIMPR", new tn(EsimPromotionWorker.class).j());
        }
    }
}
