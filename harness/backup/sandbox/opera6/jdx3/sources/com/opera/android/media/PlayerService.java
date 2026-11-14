package com.opera.android.media;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.IBinder;
import com.opera.android.OperaApplication;
import defpackage.bp;
import defpackage.i4d;
import defpackage.kg7;
import defpackage.qd0;
import defpackage.qkg;
import defpackage.rh0;
import defpackage.rkg;
import defpackage.sh0;
import defpackage.tjg;
import defpackage.vh0;
import defpackage.we7;
import defpackage.x56;
import defpackage.x5f;
import defpackage.xbf;
import defpackage.yh0;
import defpackage.zh0;
import defpackage.zkd;
import defpackage.zpa;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class PlayerService extends Service {
    public static final /* synthetic */ int e = 0;
    public xbf a;
    public gkg b;
    public final qkg c;
    public final we7 d;

    public PlayerService() {
        qkg qkgVar = new qkg(this);
        this.c = qkgVar;
        this.d = new we7(this, qkgVar, (byte) 8);
    }

    public static void d(tjg tjgVar, qjd qjdVar, yh0 yh0Var) {
        if (qjdVar != null) {
            Context context = t8.a;
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
            rh0 rh0VarR = zkd.R(tjgVar, qjdVar);
            sh0 sh0Var = tjgVar.k(qjdVar) == kg7.g ? sh0.b : sh0.c;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                zh0 zh0Var = new zh0(2443, -1, 2);
                zh0Var.q(0, 1, yh0Var);
                vh0 vh0Var = (vh0) zh0Var.n(1);
                if (vh0Var == null) {
                    zh0Var.q(1, 1, zpa.A());
                    vh0Var = (vh0) zh0Var.n(1);
                }
                vh0Var.q(1, 1, rh0VarR);
                vh0Var.q(0, 1, sh0Var);
                x56 x56VarF = zpa.F();
                qd0 qd0VarB = x56VarF.B(zpaVar);
                List list = (List) qd0VarB.n(13);
                ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 13, vep.t(qd0VarB, 13, 1)) : new hf0(qd0VarB, 13, list)).add(zh0Var);
                x5fVar.U0(x56VarF);
            }
        }
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        this.b.b((gk9) null);
        this.d.b(this.a);
        ((tjg) this.a.b).H(this.c);
        this.a = null;
    }

    public final void b(String str) {
        bp.S(getApplicationContext(), getClass(), str);
    }

    public final void c(yh0 yh0Var) {
        xbf xbfVar = this.a;
        d((tjg) xbfVar.b, ((gig) ((ode) xbfVar.c).g()).g(), yh0Var);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (sfe.g0(this)) {
            return;
        }
        b("create");
        qkg qkgVar = this.c;
        qkgVar.e = true;
        String[] strArr = OperaApplication.K;
        tjg tjgVarX = ((OperaApplication) getApplicationContext()).x();
        xbf xbfVar = tjgVarX.o;
        this.a = xbfVar;
        this.d.a(xbfVar);
        tjgVarX.F(qkgVar);
        i4d i4dVar = new i4d((Object) this, (byte) 16);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        notificationManager.getClass();
        notificationManager.createNotificationChannel(new NotificationChannel("media", getString(2132020055), 2));
        gkg gkgVar = new gkg(this, 2131363344, i4dVar, qkgVar);
        this.b = gkgVar;
        if (gkgVar.F) {
            gkgVar.F = false;
            if (gkgVar.r) {
                Handler handler = gkgVar.f;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
            }
        }
        if (((ode) this.a.c).g() != null) {
            this.b.b(new rkg(this, (gig) ((ode) this.a.c).g()));
        }
        gkg gkgVar2 = this.b;
        MediaSession.Token token = ((xod) ((pod) this.a.d).a.h.j.b).c.b;
        if (Objects.equals(gkgVar2.t, token)) {
            return;
        }
        gkgVar2.t = token;
        if (gkgVar2.r) {
            Handler handler2 = gkgVar2.f;
            if (handler2.hasMessages(1)) {
                return;
            }
            handler2.sendEmptyMessage(1);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (sfe.g0(this)) {
            return;
        }
        b("destroy");
        a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("onStart[");
        sb.append(intent == null ? "null" : "avail");
        sb.append(",fl=");
        sb.append(i);
        sb.append("]");
        b(sb.toString());
        return 1;
    }
}
