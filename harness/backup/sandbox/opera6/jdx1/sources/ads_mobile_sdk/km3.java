package ads_mobile_sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ce2;
import defpackage.fbp;
import defpackage.opo;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class km3 extends BroadcastReceiver implements opo, fbp {
    public final Context a;
    public final ExecutorService b;
    public boolean c = true;

    public km3(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // defpackage.fbp
    public final ListenableFuture a() {
        return yr9.e(new ce2(this, (byte) 11), this.b);
    }

    @Override // defpackage.opo
    public final void a(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // defpackage.opo
    public final void a(HashMap map, Context context, View view) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // defpackage.opo
    public final void b(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.c = false;
            }
        }
    }
}
