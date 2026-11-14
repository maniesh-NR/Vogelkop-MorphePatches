package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class mue extends lim implements due, p5j, xxf {
    public final ru9 a;
    public final fue b;
    public final SettingsManager c;
    public final zxf d;
    public final nr8 e;
    public boolean f;
    public boolean g;
    public final kze h = new kze(lue.a);

    public mue(ru9 ru9Var, fue fueVar, SettingsManager settingsManager, dyf dyfVar, nr8 nr8Var) {
        this.a = ru9Var;
        this.b = fueVar;
        this.c = settingsManager;
        this.d = dyfVar.b();
        this.e = nr8Var;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("enable_newsfeed")) {
            S();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r4.a.getBoolean("startpage.feed_has_categories", true) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r1.isEmpty() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lue R() {
        /*
            r4 = this;
            boolean r0 = r4.g
            if (r0 == 0) goto L3e
            fue r0 = r4.b
            r0.d()
            cue r0 = r0.a
            cue r1 = defpackage.cue.None
            if (r0 == r1) goto L5d
            com.opera.android.settings.SettingsManager r0 = r4.c
            java.lang.String r1 = "enable_newsfeed"
            boolean r0 = r0.i(r1)
            if (r0 == 0) goto L5d
            boolean r0 = r4.f
            if (r0 != 0) goto L3e
            zxf r0 = r4.d
            java.util.HashSet r1 = r0.c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2b
            java.util.ArrayList r1 = r0.a
            if (r1 != 0) goto L2f
        L2b:
            java.util.ArrayList r1 = r0.a()
        L2f:
            java.lang.String r0 = "startpage.feed_has_categories"
            r2 = 1
            ru9 r4 = r4.a
            if (r1 != 0) goto L41
            android.content.SharedPreferences r4 = r4.a
            boolean r4 = r4.getBoolean(r0, r2)
            if (r4 != 0) goto L5a
        L3e:
            lue r4 = defpackage.lue.a
            return r4
        L41:
            nv6 r4 = r4.b()
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r2
            java.lang.Object r2 = r4.a
            android.content.SharedPreferences$Editor r2 = (android.content.SharedPreferences.Editor) r2
            r2.putBoolean(r0, r3)
            r4.w()
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L5d
        L5a:
            lue r4 = defpackage.lue.c
            return r4
        L5d:
            lue r4 = defpackage.lue.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mue.R():lue");
    }

    public final void S() {
        lue lueVarR = R();
        kze kzeVar = this.h;
        if (lueVarR == kzeVar.g()) {
            return;
        }
        kzeVar.r(lueVarR);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.d.F(this);
        this.b.b(this);
        SettingsManager settingsManager = this.c;
        settingsManager.F(this);
        if (settingsManager.i("speed_dial.enabled")) {
            this.f = true;
            this.e.f(new yqd(this, (byte) 15));
        }
        this.g = true;
        this.h.r(R());
    }

    @Override // defpackage.due
    public final void b(cue cueVar) {
        S();
    }

    @Override // defpackage.xxf
    public final void f() {
        S();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.g = false;
        this.d.H(this);
        this.b.e(this);
        this.c.H(this);
    }
}
