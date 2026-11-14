package com.opera.android.startup;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.opera.android.OperaApplication;
import defpackage.cm;
import defpackage.ld9;
import defpackage.s03;
import defpackage.tn;
import defpackage.ua7;
import defpackage.x56;
import defpackage.x5f;
import defpackage.yhe;
import defpackage.zpa;

/* loaded from: classes.dex */
public class InitialStartupService extends Service {
    public static final /* synthetic */ int b = 0;
    public tn a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        getApplicationContext();
        this.a = new tn(new ld9(this, (byte) 28));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        tn tnVar = this.a;
        tnVar.a = true;
        s03 s03Var = (s03) tnVar.b;
        avj avjVar = cak.d;
        avj.f(s03Var);
        s03Var.run();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean zL;
        int i3 = WelcomeActivity.w;
        Intent intent2 = new Intent(this, (Class<?>) WelcomeActivity.class);
        intent2.setAction("com.opera.android.startup.ONGOING_NOTIFICATION");
        yhe yheVarF = yhe.f(this, 0, intent2, 0, false);
        ua7 ua7VarT = zi4.t("other", new cm((String) null, 2131364376, (byte) 5));
        ua7VarT.N(yheVarF);
        ua7VarT.R(true);
        ua7VarT.S(2131231676);
        ua7VarT.P(getString(2132021633, getString(2132017591)));
        Notification notification = (Notification) ua7VarT.l().b;
        if (Build.VERSION.SDK_INT >= 31) {
            zL = m41.L(this, 2131364376, notification);
        } else {
            startForeground(2131364376, notification);
            zL = true;
        }
        if (zL) {
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) getApplicationContext()).L().c;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.f(zpaVar, x56VarF).b.p(24, 1, 1L);
                x5fVar.U0(x56VarF);
            }
        }
        return 1;
    }

    public final void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        stopSelf();
    }
}
