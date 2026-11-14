package com.opera.android.gcm;

import android.content.Intent;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import defpackage.hd;
import defpackage.mdb;
import defpackage.nbh;
import defpackage.umi;
import defpackage.vml;
import defpackage.x5f;
import java.util.HashSet;

/* loaded from: classes.dex */
public class PushNotificationService extends ilf {
    public x5f f;
    public nbh g;

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Intent intent) {
        if (sfe.g0(this) || this.g == null) {
            return;
        }
        HashSet hashSet = mdb.a;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            Bundle extras = intent.getExtras();
            if (action.equals("com.opera.android.gcm.NEW_PUSH_NOTIFICATION")) {
                try {
                    ybh.l(this.g.a(this, extras, true), this.f);
                } catch (IllegalArgumentException e) {
                    oup.j0(this.f, e, extras);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        super.onCreate();
        if (sfe.g0(this)) {
            return;
        }
        umi umiVar = vml.d;
        String[] strArr = OperaApplication.K;
        this.f = ((OperaApplication) getApplicationContext()).L().c;
        this.g = new nbh(this, umiVar, this.f, ((OperaApplication) getApplicationContext()).L().d);
        hd.o(this);
    }
}
