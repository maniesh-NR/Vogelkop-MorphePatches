package com.opera.android.startup;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;
import com.opera.api.Callback;
import defpackage.ak0;
import defpackage.b1o;
import defpackage.ck0;
import defpackage.d47;
import defpackage.dj9;
import defpackage.dll;
import defpackage.etg;
import defpackage.ezg;
import defpackage.g9k;
import defpackage.gl0;
import defpackage.gl6;
import defpackage.hpd;
import defpackage.hs3;
import defpackage.ijf;
import defpackage.j0o;
import defpackage.j4c;
import defpackage.ja0;
import defpackage.jn0;
import defpackage.k0o;
import defpackage.ka0;
import defpackage.kl0;
import defpackage.lkk;
import defpackage.m0o;
import defpackage.m9k;
import defpackage.ma0;
import defpackage.mcj;
import defpackage.mdf;
import defpackage.msl;
import defpackage.n7n;
import defpackage.nqi;
import defpackage.o2c;
import defpackage.o5f;
import defpackage.oon;
import defpackage.p1;
import defpackage.p9k;
import defpackage.pde;
import defpackage.pyl;
import defpackage.q0o;
import defpackage.q9n;
import defpackage.qch;
import defpackage.qfl;
import defpackage.que;
import defpackage.r2n;
import defpackage.r7n;
import defpackage.rml;
import defpackage.rqd;
import defpackage.s03;
import defpackage.sdf;
import defpackage.shf;
import defpackage.sz4;
import defpackage.tn;
import defpackage.tt2;
import defpackage.tzn;
import defpackage.u5f;
import defpackage.u65;
import defpackage.u8n;
import defpackage.u9k;
import defpackage.umi;
import defpackage.v1;
import defpackage.v37;
import defpackage.v56;
import defpackage.vme;
import defpackage.vml;
import defpackage.vr3;
import defpackage.vzn;
import defpackage.w6j;
import defpackage.wsf;
import defpackage.wzn;
import defpackage.x56;
import defpackage.x5f;
import defpackage.x77;
import defpackage.xb0;
import defpackage.xbf;
import defpackage.xzn;
import defpackage.y37;
import defpackage.z37;
import defpackage.z7f;
import defpackage.zm9;
import defpackage.zpa;
import defpackage.zs0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/opera/android/startup/WelcomeActivity;", "Lg9k;", "Ln7n;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WelcomeActivity extends g9k implements n7n, qch {
    public static final /* synthetic */ int w = 0;
    public x77 m;
    public bl9 n;
    public final w6j o;
    public final wzn p;
    public final wzn q;
    public mcj r;
    public View s;
    public boolean t;
    public boolean u;
    public final xbf v;

    public WelcomeActivity() {
        byte b = 0;
        byte b2 = 1;
        this.o = new w6j(uqh.a(q0o.class), new xzn(this, (byte) 0), new tzn(this, b), new xzn(this, (byte) 1));
        wzn wznVar = new wzn(this, b);
        this.p = wznVar;
        this.q = new wzn(this, b2);
        this.t = true;
        this.u = true;
        byte b3 = 2;
        this.v = new xbf(this, new tzn(this, b3), new vzn(this, b), new tzn(this, (byte) 4), msl.f, vml.d, new vzn(this, b2), new vzn(this, b3), new vzn(this, (byte) 3), wznVar, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g9k
    public final void J() {
        if (M().i("news_is_blocked_by_personalization_change")) {
            String[] strArr = OperaApplication.K;
            ((OperaApplication) getApplication()).F().b(true, null);
        }
        super.J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(o2c o2cVar) {
        mdf mdfVar = (mdf) ((j4c) this.v.f).get();
        kl0 kl0Var = (kl0) CollectionsKt.R(mdfVar.e);
        if (kl0Var != null) {
            mdfVar.a(kl0Var, gl0.c);
        }
        String[] strArr = OperaApplication.K;
        sdf sdfVarC = ((OperaApplication) getApplication()).C();
        int i = o2cVar.a;
        int i2 = o2cVar.b;
        sdfVarC.c(i);
        SettingsManager settingsManagerM = M();
        if (o2cVar.c(64)) {
            settingsManagerM.V(o2cVar.d(64) ? 1 : 0, "personalized_ads");
        }
        if (o2cVar.c(32)) {
            settingsManagerM.V(o2cVar.d(32) ? 1 : 0, "personalized_news");
        }
        if (o2cVar.c(1)) {
            settingsManagerM.V(o2cVar.d(1) ? 1 : 0, "collect_website_categories");
        }
        if (o2cVar.c(8)) {
            settingsManagerM.V(o2cVar.d(8) ? 1 : 0, "process_news_topics");
        }
        if (o2cVar.c(16)) {
            settingsManagerM.V(o2cVar.d(16) ? 1 : 0, "process_location");
        }
        if (!settingsManagerM.I()) {
            settingsManagerM.V(!o2cVar.c(96) ? 1 : 0, "personalized_default");
        }
        int[] iArr = {32, 8};
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            int i4 = iArr[i3];
            if ((i & i4) == i4 && (i2 & i4) != i4) {
                M().V(1, "news_is_blocked_by_personalization_change");
                break;
            }
            i3++;
        }
        String[] strArr2 = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) getApplication()).L().c;
        boolean zJ = M().J();
        ja0 ja0Var = o2cVar.c ? ja0.e : i2 == 0 ? ja0.b : i2 == i ? ja0.c : ja0.d;
        boolean z = o2cVar.d;
        boolean zC = o2cVar.c(16);
        boolean zC2 = o2cVar.c(96);
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            ka0 ka0Var = new ka0(2443, -1, 7);
            ka0Var.q(0, 1, ja0Var);
            ka0Var.r(1, 1, z);
            ka0Var.r(2, 1, zC);
            ka0Var.r(3, 1, zC2);
            ka0Var.r(4, 1, zJ);
            ka0Var.q(5, 1, ma0.b);
            xb0VarX.Q().add(ka0Var);
            x5fVar.U0(x56VarF);
        }
        W();
    }

    public final void L() {
        Object objF = ((j4c) this.v.f).f();
        if (objF != null) {
            mdf mdfVar = (mdf) objF;
            mdfVar.c(kl0.l);
            kl0 kl0Var = (kl0) CollectionsKt.R(mdfVar.e);
            if (kl0Var != null) {
                mdfVar.a(kl0Var, gl0.c);
            }
            mdfVar.a.b(mdfVar.i);
        }
        J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SettingsManager M() {
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) getApplication()).J();
    }

    public final q0o N() {
        return (q0o) this.o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O() {
        int i;
        int i2;
        View view = this.s;
        if (view != null) {
            if (this.t) {
                r9b r9bVarI = g3o.g((View) null, getWindow().getDecorView().getRootWindowInsets()).a.i(519);
                i2 = r9bVarI.b;
                i = r9bVarI.d;
            } else {
                i = 0;
                i2 = 0;
            }
            if (view.getPaddingTop() == i2 && view.getPaddingBottom() == i) {
                return;
            }
            view.setPadding(0, i2, 0, i);
        }
    }

    public final void P() {
        View view = this.s;
        if (view == null || !this.u) {
            return;
        }
        boolean zI = f03.I(view.getContext());
        mcj mcjVar = this.r;
        if (mcjVar == null) {
            mcjVar = null;
        }
        mcjVar.t(zI);
        mcj mcjVar2 = this.r;
        (mcjVar2 != null ? mcjVar2 : null).r(zI);
    }

    public final void R(u65 u65Var) {
        gl0 gl0Var;
        mdf mdfVar = (mdf) ((j4c) this.v.f).get();
        int iOrdinal = u65Var.ordinal();
        if (iOrdinal == 0) {
            gl0Var = gl0.c;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            gl0Var = gl0.f;
        } else {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        h9o.p();
                        return;
                    }
                }
                gl0Var = gl0.c;
            }
            gl0Var = gl0.d;
        }
        kl0 kl0Var = (kl0) CollectionsKt.R(mdfVar.e);
        if (kl0Var != null) {
            mdfVar.a(kl0Var, gl0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(Intent intent) {
        String action;
        if (intent == null || TextUtils.isEmpty(intent.getAction()) || (action = intent.getAction()) == null) {
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode == 1023872949) {
            if (action.equals("com.opera.android.startup.INSTALL_COMPLETE_NOTIFICATION")) {
                String[] strArr = OperaApplication.K;
                x5f x5fVar = ((OperaApplication) getApplication()).L().c;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    am2.f(zpaVar, x56VarF).b.p(27, 1, 1L);
                    x5fVar.U0(x56VarF);
                }
                setIntent(intent.setAction("android.intent.action.MAIN"));
                return;
            }
            return;
        }
        if (iHashCode == 1988953351 && action.equals("com.opera.android.startup.ONGOING_NOTIFICATION")) {
            String[] strArr2 = OperaApplication.K;
            x5f x5fVar2 = ((OperaApplication) getApplication()).L().c;
            if (x5fVar2.h) {
                zpa zpaVar2 = x5fVar2.d;
                x56 x56VarF2 = zpa.F();
                am2.f(zpaVar2, x56VarF2).b.p(25, 1, 1L);
                x5fVar2.U0(x56VarF2);
            }
            setIntent(intent.setAction("android.intent.action.MAIN"));
        }
    }

    public final void T() {
        if (this.t) {
            this.t = false;
            O();
        }
    }

    public final void V(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        P();
    }

    public final void W() {
        if (H()) {
            L();
        } else {
            N().f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X() {
        xbf xbfVar = this.v;
        ((mdf) ((j4c) xbfVar.f).get()).a(kl0.j, gl0.c);
        M().V(1, "eula_accepted.gdpr");
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplication()).h().b(M().J());
        j4c j4cVar = (j4c) ((xbf) xbfVar.b).e;
        tzn tznVar = new tzn(this, (byte) 1);
        if (((OperaApplication) getApplication()).J().J()) {
            Runnable vr9Var = new vr9(new gl6((Object) this, (Object) tznVar, (Object) j4cVar, (byte) 0), 2);
            rqd rqdVar = z7f.k;
            ipe.E(this).b(vr9Var);
            v1.u(this).b(vr9Var);
        } else {
            tznVar.invoke();
        }
        ((m9k) this.p.get()).S();
        W();
    }

    public final void Y() {
        mdf mdfVar = (mdf) ((j4c) this.v.f).get();
        mdfVar.getClass();
        x5f x5fVar = mdfVar.c;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        zs0 zs0Var = new ck0(zpaVar, x56VarF).h().a;
        zs0Var.getClass();
        zs0Var.q(12, 1, "v1");
        x5fVar.U0(x56VarF);
        wsf wsfVar = mdfVar.d;
        qs7 qs7Var = wsfVar.b;
        v56 v56VarU = qs7.u();
        ((jn0) new ak0(qs7Var, v56VarU).e.getValue()).a.x(8, "v1");
        if (wsfVar.e.c(v56VarU)) {
            return;
        }
        new rml(Unit.a, wsfVar.a).a(new o5f(wsfVar, (byte) 17)).m(wsfVar.d);
    }

    @Override // defpackage.g9k, defpackage.qch
    public final void b(boolean z) {
        q0o q0oVarN = N();
        q0oVarN.i = true;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) q0oVarN.c.a.a.get()).edit();
        editorEdit.putInt("pushed.sequence", 2);
        editorEdit.apply();
        if (z) {
            W();
        }
    }

    @Override // defpackage.n7n
    public final r7n j() {
        return (r7n) ((j4c) this.v.g).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g9k, defpackage.hjf
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        final byte b = 0;
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        this.r = new mcj(window);
        umi umiVar = vml.d;
        String[] strArr = OperaApplication.K;
        wsf wsfVar = ((OperaApplication) getApplicationContext()).L().g;
        SettingsManager settingsManagerJ = ((OperaApplication) getApplicationContext()).J();
        b1o b1oVar = (b1o) ((OperaApplication) getApplicationContext()).r.r1.get();
        wsfVar.a(new u5f(z5i.I(this), (byte) 4));
        boolean zJ = settingsManagerJ.J();
        qs7 qs7Var = wsfVar.b;
        v56 v56VarU = qs7.u();
        new ak0(qs7Var, v56VarU);
        final byte b2 = 1;
        v56VarU.r(11, 1, zJ);
        if (!wsfVar.e.c(v56VarU)) {
            new rml(Unit.a, wsfVar.a).a(new o5f(wsfVar, (byte) 17)).m(wsfVar.d);
        }
        hs3.a.getClass();
        wsfVar.a(new ai(n9a.t(this), vtp.G(4, this), etg.a(this), vtp.G(1, this), (Long) null));
        avj avjVar = cak.d;
        avj.g(1, new hpd(wsfVar, this, (byte) 25));
        vr3 vr3Var = new vr3((Callback) new ydf(wsfVar, (byte) 0));
        tt2 tt2VarB = vr3Var.b();
        dj9 dj9VarT = dj9.t(this);
        dj9VarT.F(new p1(dj9VarT, tt2VarB, (byte) 9));
        tt2 tt2VarB2 = vr3Var.b();
        v1 v1VarU = v1.u(this);
        v1VarU.F(new p1(v1VarU, tt2VarB2, (byte) 10));
        vr3Var.d();
        na2.B(b1oVar.g, (CoroutineContext) null, (rx5) null, new cek(new ydf(wsfVar, (byte) 1), b1oVar, (mt5) null, (byte) 11), 3);
        vr3 vr3Var2 = new vr3((Callback) new ydf(wsfVar, (byte) 2));
        new d5o(new v37(umiVar, b)).y(new d47(vr3Var2.b(), (byte) 1));
        new d5o(new y37(getApplicationContext(), umiVar)).y(new d47(vr3Var2.b(), (byte) 1));
        vr3Var2.b().run(Boolean.valueOf((ActivityManager.isUserAMonkey() ? z37.b : z37.a) == z37.b));
        new d5o(new v37(umiVar, b2)).y(new d47(vr3Var2.b(), (byte) 1));
        vr3Var2.d();
        OperaApplication operaApplication = (OperaApplication) getApplication();
        w supportFragmentManager = getSupportFragmentManager();
        xbf xbfVar = this.v;
        supportFragmentManager.B = (ol9) ((j4c) xbfVar.e).get();
        if (!H()) {
            this.m = new x77(operaApplication, operaApplication.J(), operaApplication.L().d);
        }
        this.h = new sz4(new zg(new WeakReference(this)));
        super.onCreate(bundle);
        if (H()) {
            return;
        }
        setContentView(2131559573);
        if (H()) {
            return;
        }
        l5b l5bVar = q9n.c;
        View viewY = q9n.y(2131363025, getWindow().getDecorView());
        this.s = viewY;
        oon oonVar = new oon(this, (byte) 3);
        dll dllVarS = q9n.s(viewY);
        if (dllVarS != null) {
            u8n.b(dllVarS, viewY, oonVar);
        }
        oonVar.a(viewY);
        r2n r2nVar = new r2n((Object) this, (byte) 21);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(viewY, r2nVar);
        byte b3 = 19;
        aib.B(M(), this, new ezg(this, (byte) 13), new vme((byte) 19));
        tcc lifecycle = getLifecycle();
        wzn wznVar = this.p;
        lifecycle.a((mdc) wznVar.get());
        if (M().i("eula_accepted.gdpr")) {
            ((m9k) wznVar.get()).S();
        } else if (bundle == null) {
            new rml(Unit.a, umiVar).a(new qfl(this, b3)).l();
        }
        w supportFragmentManager2 = getSupportFragmentManager();
        shf shfVar = new shf();
        shfVar.a = supportFragmentManager2;
        shfVar.b = new pde(null);
        shfVar.c = new ArrayList();
        supportFragmentManager2.b0(new que(shfVar, b2), true);
        ((pde) shfVar.b).j(this, new f7f(this) { // from class: uzn
            public final /* synthetic */ WelcomeActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void d0(java.lang.Object r7) {
                /*
                    r6 = this;
                    byte r0 = r2
                    com.opera.android.startup.WelcomeActivity r6 = r6.b
                    switch(r0) {
                        case 0: goto L1e;
                        default: goto L7;
                    }
                L7:
                    kl0 r7 = (defpackage.kl0) r7
                    if (r7 == 0) goto L1b
                    xbf r6 = r6.v
                    java.lang.Object r6 = r6.f
                    j4c r6 = (defpackage.j4c) r6
                    java.lang.Object r6 = r6.get()
                    mdf r6 = (defpackage.mdf) r6
                    r6.c(r7)
                    goto L1d
                L1b:
                    int r6 = com.opera.android.startup.WelcomeActivity.w
                L1d:
                    return
                L1e:
                    k0o r7 = (defpackage.k0o) r7
                    int r0 = com.opera.android.startup.WelcomeActivity.w
                    if (r7 == 0) goto Lc9
                    k0o r0 = defpackage.k0o.d
                    if (r7 != r0) goto L2d
                    r6.L()
                    goto Lc9
                L2d:
                    boolean r0 = r7.b
                    r1 = 0
                    if (r0 == 0) goto L50
                    com.opera.android.settings.SettingsManager r0 = r6.M()
                    boolean r0 = r0.J()
                    sz4 r2 = r6.h
                    if (r0 == 0) goto L50
                    if (r2 == 0) goto L50
                    boolean r0 = yi4.T(r2)
                    if (r0 == 0) goto L50
                    vk2 r0 = new vk2
                    r3 = 27
                    r0.<init>(r3)
                    yi4.R(r6, r2, r1, r0)
                L50:
                    kotlin.jvm.functions.Function1 r0 = r7.c
                    java.lang.Object r0 = r0.invoke(r6)
                    androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
                    if (r0 != 0) goto L5f
                    r6.W()
                    goto Lc9
                L5f:
                    j0o r7 = r7.a
                    bl9 r2 = r6.n
                    if (r2 != 0) goto L76
                    xbf r7 = r6.v
                    java.lang.Object r7 = r7.f
                    j4c r7 = (defpackage.j4c) r7
                    r7.get()
                    bl9 r7 = new bl9
                    r7.<init>(r6, r0)
                    r6.n = r7
                    goto Lc9
                L76:
                    boolean r6 = r0 instanceof defpackage.x65
                    if (r6 == 0) goto L7e
                    r6 = r0
                    x65 r6 = (defpackage.x65) r6
                    goto L7f
                L7e:
                    r6 = r1
                L7f:
                    int r7 = r7.ordinal()
                    r3 = 0
                    if (r7 == 0) goto Laf
                    r4 = 1
                    if (r7 == r4) goto Laf
                    r5 = 2
                    if (r7 == r5) goto La9
                    r5 = 3
                    if (r7 == r5) goto La3
                    r5 = 4
                    if (r7 != r5) goto L9f
                    if (r6 == 0) goto L99
                    s65 r1 = new s65
                    r1.<init>(r6, r4)
                L99:
                    mn9 r7 = new mn9
                    r7.<init>(r1, r3, r6)
                    goto Lb4
                L9f:
                    h9o.p()
                    goto Lc9
                La3:
                    mn9 r7 = new mn9
                    r7.<init>(r1, r3, r6)
                    goto Lb4
                La9:
                    nn9 r7 = new nn9
                    r7.<init>()
                    goto Lb4
                Laf:
                    mn9 r7 = new mn9
                    r7.<init>(r1, r3, r1)
                Lb4:
                    java.lang.Object r6 = r2.d
                    java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6
                    java.lang.Object r1 = r6.pop()
                    androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                    r6.push(r0)
                    wr9 r6 = new wr9
                    r6.<init>(r2, r1)
                    r2.b(r0, r1, r7, r6)
                Lc9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uzn.d0(java.lang.Object):void");
            }
        });
        N().e.j(this, new f7f(this) { // from class: uzn
            public final /* synthetic */ WelcomeActivity b;

            {
                this.b = this;
            }

            public final void d0(Object v) {
                /*
                    this = this;
                    byte r0 = r2
                    com.opera.android.startup.WelcomeActivity r6 = r6.b
                    switch(r0) {
                        case 0: goto L1e;
                        default: goto L7;
                    }
                L7:
                    kl0 r7 = (defpackage.kl0) r7
                    if (r7 == 0) goto L1b
                    xbf r6 = r6.v
                    java.lang.Object r6 = r6.f
                    j4c r6 = (defpackage.j4c) r6
                    java.lang.Object r6 = r6.get()
                    mdf r6 = (defpackage.mdf) r6
                    r6.c(r7)
                    goto L1d
                L1b:
                    int r6 = com.opera.android.startup.WelcomeActivity.w
                L1d:
                    return
                L1e:
                    k0o r7 = (defpackage.k0o) r7
                    int r0 = com.opera.android.startup.WelcomeActivity.w
                    if (r7 == 0) goto Lc9
                    k0o r0 = defpackage.k0o.d
                    if (r7 != r0) goto L2d
                    r6.L()
                    goto Lc9
                L2d:
                    boolean r0 = r7.b
                    r1 = 0
                    if (r0 == 0) goto L50
                    com.opera.android.settings.SettingsManager r0 = r6.M()
                    boolean r0 = r0.J()
                    sz4 r2 = r6.h
                    if (r0 == 0) goto L50
                    if (r2 == 0) goto L50
                    boolean r0 = yi4.T(r2)
                    if (r0 == 0) goto L50
                    vk2 r0 = new vk2
                    r3 = 27
                    r0.<init>(r3)
                    yi4.R(r6, r2, r1, r0)
                L50:
                    kotlin.jvm.functions.Function1 r0 = r7.c
                    java.lang.Object r0 = r0.invoke(r6)
                    androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
                    if (r0 != 0) goto L5f
                    r6.W()
                    goto Lc9
                L5f:
                    j0o r7 = r7.a
                    bl9 r2 = r6.n
                    if (r2 != 0) goto L76
                    xbf r7 = r6.v
                    java.lang.Object r7 = r7.f
                    j4c r7 = (defpackage.j4c) r7
                    r7.get()
                    bl9 r7 = new bl9
                    r7.<init>(r6, r0)
                    r6.n = r7
                    goto Lc9
                L76:
                    boolean r6 = r0 instanceof defpackage.x65
                    if (r6 == 0) goto L7e
                    r6 = r0
                    x65 r6 = (defpackage.x65) r6
                    goto L7f
                L7e:
                    r6 = r1
                L7f:
                    int r7 = r7.ordinal()
                    r3 = 0
                    if (r7 == 0) goto Laf
                    r4 = 1
                    if (r7 == r4) goto Laf
                    r5 = 2
                    if (r7 == r5) goto La9
                    r5 = 3
                    if (r7 == r5) goto La3
                    r5 = 4
                    if (r7 != r5) goto L9f
                    if (r6 == 0) goto L99
                    s65 r1 = new s65
                    r1.<init>(r6, r4)
                L99:
                    mn9 r7 = new mn9
                    r7.<init>(r1, r3, r6)
                    goto Lb4
                L9f:
                    h9o.p()
                    goto Lc9
                La3:
                    mn9 r7 = new mn9
                    r7.<init>(r1, r3, r6)
                    goto Lb4
                La9:
                    nn9 r7 = new nn9
                    r7.<init>()
                    goto Lb4
                Laf:
                    mn9 r7 = new mn9
                    r7.<init>(r1, r3, r1)
                Lb4:
                    java.lang.Object r6 = r2.d
                    java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6
                    java.lang.Object r1 = r6.pop()
                    androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                    r6.push(r0)
                    wr9 r6 = new wr9
                    r6.<init>(r2, r1)
                    r2.b(r0, r1, r7, r6)
                Lc9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uzn.d0(java.lang.Object):void");
            }
        });
        if (bundle != null) {
            q0o q0oVarN = N();
            q0oVarN.getClass();
            if (bundle.getStringArray("key.welcome_onboarding_flow.shown_leaves") != null) {
                List listG = q0oVarN.g();
                q0oVarN.g = listG;
                pyl pylVar = new pyl(listG, bundle);
                pylVar.r(p7n.a(q0oVarN));
                q0oVarN.f = pylVar;
            }
            ((j4c) xbfVar.f).get();
            this.n = new bl9(this, bundle);
        } else if (M().i("eula_accepted.gdpr")) {
            N().f();
        } else {
            N().e.r(new k0o(j0o.a, false, new q0n((byte) 14), 2));
        }
        S(getIntent());
    }

    @Override // defpackage.hjf
    public final void onDestroy() {
        super.onDestroy();
        bl9 bl9Var = this.n;
        if (bl9Var != null) {
            ArrayDeque arrayDeque = (ArrayDeque) bl9Var.d;
            ((View) bl9Var.f).removeOnLayoutChangeListener((ho3) bl9Var.e);
            w wVar = (w) bl9Var.c;
            a aVarF = u35.f(wVar, wVar);
            while (!arrayDeque.isEmpty()) {
                aVarF.m((Fragment) arrayDeque.pop());
            }
            bl9Var.a(aVarF);
        }
        this.n = null;
        this.h = null;
        Object objF = this.q.f();
        if (objF != null) {
            u9k u9kVar = (u9k) objF;
            u9kVar.a.r(p9k.a);
            tn tnVar = u9kVar.b;
            if (tnVar != null) {
                u9kVar.b = null;
                tnVar.a = true;
                s03 s03Var = (s03) tnVar.b;
                avj avjVar = cak.d;
                avj.f(s03Var);
                s03Var.run();
            }
        }
    }

    @Override // defpackage.g9k, defpackage.hjf
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        S(intent);
    }

    public final void onPause() {
        zm9 zm9Var;
        super/*androidx.fragment.app.r*/.onPause();
        bl9 bl9Var = this.n;
        if (bl9Var == null || (zm9Var = (zm9) bl9Var.g) == null) {
            return;
        }
        zm9Var.b(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*androidx.fragment.app.r*/.onResume();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplication()).d().c();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        pyl pylVar;
        super/*xd5*/.onSaveInstanceState(bundle);
        bl9 bl9Var = this.n;
        if (bl9Var != null) {
            Iterator it = ((ArrayDeque) bl9Var.d).iterator();
            int i = 0;
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                i++;
                ((w) bl9Var.c).a0(bundle, fragment, "f" + i);
            }
        }
        if (H() || (pylVar = N().f) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) pylVar.d;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            m0o m0oVar = (m0o) obj;
            l08 l08Var = (List) ((LinkedHashMap) pylVar.f).get(m0oVar);
            if (l08Var == null) {
                l08Var = l08.a;
            }
            List listSingletonList = (Collection) l08Var;
            if (listSingletonList.isEmpty()) {
                listSingletonList = Collections.singletonList(m0oVar);
            }
            o95.t(listSingletonList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList2, 10));
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            arrayList3.add(((m0o) obj2).name());
        }
        bundle.putStringArray("key.welcome_onboarding_flow.shown_leaves", (String[]) arrayList3.toArray(new String[0]));
        bundle.putInt("key.welcome_onboarding_flow.current_index", pylVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        stopService(new Intent(getApplicationContext(), (Class<?>) InitialStartupService.class));
        ((NotificationManager) getSystemService("notification")).cancel(2131364377);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g9k
    public final void onStop() {
        super.onStop();
        if (M().i("eula_accepted.gdpr")) {
            return;
        }
        if (!H() && !N().i) {
            try {
                startService(new Intent(getApplicationContext(), (Class<?>) InitialStartupService.class));
            } catch (IllegalStateException unused) {
            }
        }
        xf8.n0(getApplicationContext(), lkk.ONBOARDING, false);
    }

    @Override // defpackage.hjf
    public final fi s() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!M().i("eula_accepted.gdpr") ? false : rm5.z(this, intent, new nqi((Object) this, (byte) 20))) {
            return;
        }
        super/*xd5*/.startActivityForResult(intent, i, bundle);
    }

    @Override // defpackage.hjf
    /* renamed from: t */
    public final ijf s() {
        return this.v;
    }
}
