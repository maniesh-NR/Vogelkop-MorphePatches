package defpackage;

import J.N;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.format.DateUtils;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.LoadingView;
import com.opera.android.OperaApplication;
import com.opera.android.bookmarks.BookmarksBridge;
import com.opera.android.bookmarks.h;
import com.opera.android.browser.SessionRestore$State;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.obml.Platform;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.android.oauth2.OAuth2Account;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ou3 extends lim {
    public final nrl a = new nrl((byte) 26);
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public SessionRestore$State g;
    public long h;
    public final /* synthetic */ BrowserActivity i;

    public ou3(BrowserActivity browserActivity) {
        this.i = browserActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3, fp1, java.lang.Object, t5d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R(java.util.ArrayList r33) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou3.R(java.util.ArrayList):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0dd1  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0f15  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0dd4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v65, types: [android.content.Context, com.opera.android.BrowserActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v114, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 4714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou3.S():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09f5  */
    @Override // defpackage.as6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(ndc r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou3.W(ndc):void");
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        f6l f6lVar;
        ob obVar;
        ndcVar.getLifecycle().b(this);
        String[] strArr = OperaApplication.K;
        ndc ndcVar2 = this.i;
        Application application = ndcVar2.getApplication();
        ev3 ev3Var = ndcVar2.O0;
        tw3 tw3Var = ndcVar2.y;
        OperaApplication operaApplication = (OperaApplication) application;
        ag7 ag7Var = (ag7) operaApplication.r.D.f();
        if (ag7Var != null) {
            if (ag7Var.e == ndcVar2.R0) {
                ag7Var.e = null;
            }
        }
        cbk cbkVar = operaApplication.m;
        uu3 uu3Var = ndcVar2.M0;
        if (((BrowserActivity) cbkVar.c) == ndcVar2) {
            cbkVar.c = null;
            cbkVar.d = null;
            ac8.d(uu3Var);
        }
        hj.a.c(ev3Var);
        lx3.a.c(ev3Var);
        ydn ydnVarR = operaApplication.R();
        Context context = ydnVarR.l;
        vy vyVar = ydnVarR.z;
        ydnVarR.L = null;
        ydnVarR.P = null;
        long j = ydnVarR.j;
        if (j != 0) {
            N.MGPkZqxB(j);
            ydnVarR.j = 0L;
        }
        i9c i9cVar = ydnVarR.g;
        gkj gkjVar = (gkj) i9cVar.g;
        if (gkjVar != null) {
            gkjVar.finish(hjm.b);
        }
        i9cVar.f = null;
        ydnVarR.m.H(ydnVarR.C);
        ydnVarR.o.H(vyVar);
        ydnVarR.p.H(vyVar);
        ((OperaApplication) context.getApplicationContext()).I().H(ydnVarR.y);
        ru9.c(context).d(ydnVarR.D);
        ydnVarR.i = null;
        yen yenVarT = operaApplication.T();
        fp1 fp1Var = yenVarT.l;
        if (fp1Var != null) {
            ru9.c(fp1Var).d(yenVarT.k);
            yenVarT.l = null;
        }
        gu3 gu3Var = ndcVar2.P0;
        if (gu3Var != null) {
            ac8.d(gu3Var);
            ndcVar2.P0 = null;
        }
        fqe fqeVarY = operaApplication.y();
        ndc ndcVar3 = fqeVarY.j;
        if (ndcVar3 == ndcVar2) {
            tcc lifecycle = ndcVar3.getLifecycle();
            lifecycle.b(fqeVarY.h);
            uqe uqeVar = fqeVarY.c;
            if (uqeVar != null && (obVar = uqeVar.y) != null) {
                lifecycle.b(obVar);
            }
            fqeVarY.j = null;
        }
        d5k d5kVar = ndcVar2.T;
        if (d5kVar == null) {
            d5kVar = null;
        }
        if (!d5kVar.a) {
            d5kVar.a = true;
            Lazy lazy = (Lazy) d5kVar.b.b;
            byte b = 4;
            vk2 vk2Var = new vk2(b);
            Object objF = lazy.f();
            if (objF != null) {
                vk2Var.run(objF);
            }
            Lazy lazy2 = (Lazy) d5kVar.c.b;
            vk2 vk2Var2 = new vk2(b);
            Object objF2 = lazy2.f();
            if (objF2 != null) {
                vk2Var2.run(objF2);
            }
        }
        m8l m8lVar = (m8l) tw3Var.a.z().get();
        k6l k6lVar = ndcVar2.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        if (m8lVar.c != null) {
            m8lVar.c = null;
            k6lVar.H(m8lVar);
            k6lVar.v(m8lVar.b);
            m8lVar.a = null;
        }
        pyl pylVar = ndcVar2.U0;
        k6l k6lVar2 = (k6l) pylVar.d;
        if (k6lVar2 != null && (f6lVar = (f6l) pylVar.f) != null) {
            k6lVar2.H(f6lVar);
            pylVar.f = null;
        }
        pylVar.d = null;
        LoadingView loadingView = (LoadingView) pylVar.c;
        if (loadingView != null) {
            loadingView.b(null);
            pylVar.c = null;
        }
        igi igiVar = ndcVar2.V0;
        if (igiVar != null) {
            ((rf7) igiVar.e).u((ag) igiVar.f);
        }
        sjh sjhVar = ndcVar2.b1;
        if (sjhVar != null) {
            xi5 xi5Var = sjhVar.h;
            rjh rjhVar = sjhVar.j;
            xi5Var.i.c(rjhVar);
            sjhVar.b.v(rjhVar);
        }
        ndcVar2.b1 = null;
        m6m m6mVar = ndcVar2.Y;
        if (m6mVar != null) {
            m6mVar.i.H(m6mVar.o);
            m6mVar.j.H(m6mVar.n);
            l6m l6mVar = m6mVar.l;
            l6mVar.b.H(l6mVar);
            l6m l6mVar2 = m6mVar.m;
            l6mVar2.b.H(l6mVar2);
        }
        ndcVar2.Y = null;
        s28 s28Var = ndcVar2.O;
        if (s28Var != null) {
            if (s28Var.d) {
                ((k6l) s28Var.f).v((qz) s28Var.g);
            }
            s28Var.c.H(s28Var);
        }
        ndcVar2.O = null;
        z43 z43Var = ndcVar2.z;
        if (z43Var == null) {
            z43Var = null;
        }
        ((i7f) z43Var.h).clear();
        gbf gbfVar = (gbf) z43Var.i;
        ay ayVar = gbfVar.s;
        vk2 vk2Var3 = new vk2((byte) 16);
        Object objF3 = ayVar.f();
        if (objF3 != null) {
            vk2Var3.run(objF3);
        }
        vbf vbfVar = gbfVar.j;
        ((i7f) vbfVar.g.b).c(vbfVar.h);
        ((h7f) vbfVar.i.b).c(vbfVar.j);
        vbfVar.f.g.c(vbfVar.k);
        vbfVar.d.H(vbfVar);
        vbfVar.e.H(vbfVar.I);
        vbfVar.b.H(vbfVar.H);
        vbfVar.l.c.c(vbfVar.m);
        N.MyxmjvsL(((hp2) vbfVar.z.b.b).b);
        vbfVar.K.p(vbfVar.L);
        bk5 bk5Var = (bk5) tw3Var.s.f();
        if (bk5Var != null && bk5Var.a()) {
            lh4 lh4Var = bk5Var.g;
            if (lh4Var != null) {
                lh4Var.b = null;
                bk5Var.g = null;
            }
            jk5 jk5Var = bk5Var.a;
            synchronized (jk5Var.d) {
                jk5Var.e = null;
            }
            bk5Var.h = null;
            bk5Var.d(ak5.a);
        }
        rs2 rs2Var = (rs2) tw3Var.a.i().f();
        if (rs2Var != null) {
            rs2Var.c.a();
            rs2Var.e.a();
        }
        v3e v3eVar = (v3e) operaApplication.E.get();
        v3eVar.b = null;
        v3eVar.c = null;
        N.Ml0K9PX$(SessionStore.j.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [android.app.Activity, com.opera.android.BrowserActivity, dx3] */
    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        String[] strArr = OperaApplication.K;
        ?? r7 = this.i;
        OperaApplication operaApplication = (OperaApplication) r7.getApplication();
        operaApplication.o = false;
        synchronized (operaApplication.c) {
            operaApplication.b = null;
        }
        this.e = false;
        qim qimVar = r7.o;
        Objects.requireNonNull(qimVar);
        qimVar.p = true;
        qimVar.b.h++;
        OperaApplication operaApplication2 = (OperaApplication) r7.getApplication();
        ((e) operaApplication2.o()).getClass();
        i7f i7fVar = FavoritesBridge.a;
        if (N.MYJauVto()) {
            N.MH$FqgDA();
        }
        ((h) operaApplication2.g()).getClass();
        if (N.MyZx5kBs()) {
            i7f i7fVar2 = BookmarksBridge.a;
            N.MCmcRACL();
        }
        OAuth2Account oAuth2Account = operaApplication2.b().c;
        if (oAuth2Account != null) {
            N.MZQJlG4L(oAuth2Account.g);
        }
        eac eacVar = r7.s0;
        if (eacVar != null) {
            eacVar.e = false;
        }
        Context context = Platform.a;
        N.MYWkcpdj();
        jl6 jl6Var = r7.R;
        jl6 jl6Var2 = jl6Var != null ? jl6Var : null;
        jl6Var2.q(6);
        am2.x(((SharedPreferences) ((b59) jl6Var2.e).get()).edit(), "session.pause.time");
        q82 q82Var = (q82) r7.l0.f();
        if (q82Var != null) {
            q82Var.d = false;
            if (q82Var.c) {
                h7f h7fVar = q82Var.a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((r82) g7fVarH.next()).e();
                }
            }
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        String[] strArr = OperaApplication.K;
        ((OperaApplication) this.i.getApplication()).o = true;
        this.e = true;
        if (this.d) {
            S();
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        this.b = System.currentTimeMillis();
        this.c = SystemClock.uptimeMillis();
        this.f = false;
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        uqe uqeVar;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.c;
        String[] strArr = OperaApplication.K;
        fqe fqeVarY = ((OperaApplication) this.i.getApplication()).y();
        long j = this.b;
        fue fueVarZ = ((OperaApplication) fqeVarY.a.getApplicationContext()).z();
        fueVarZ.d();
        if (fueVarZ.a.ordinal() == 1 && (uqeVar = fqeVarY.c) != null) {
            uy8 uy8Var = uqeVar.h;
            qy8 qy8Var = uy8Var.p;
            uy8Var.c(new yx8(j / 1000, jUptimeMillis / 1000));
            if (uy8Var.l > 0) {
                uy8Var.g.removeMessages(3);
                he2.a(new py8(uy8Var, uy8Var.l), new Void[0]);
            }
            uy8Var.o.c(true);
            if (DateUtils.isToday(qy8Var.a())) {
                qy8Var.h.g.removeMessages(qy8Var.b);
            }
        }
        this.f = true;
    }
}
