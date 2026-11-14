package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class wj9 implements id {
    public final /* synthetic */ byte a = 2;
    public final fd b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public wj9(BrowserActivity browserActivity, BrowserActivity browserActivity2, fd fdVar, j4c j4cVar, zu3 zu3Var) {
        this.c = browserActivity;
        this.d = browserActivity2;
        this.b = fdVar;
        this.e = zu3Var;
        this.f = z4c.b(new s4f(j4cVar, this, (byte) 18));
    }

    public wj9(BrowserActivity browserActivity, dt3 dt3Var, bq3 bq3Var, fd fdVar, zu3 zu3Var) {
        this.c = browserActivity;
        this.d = dt3Var;
        this.e = bq3Var;
        this.b = fdVar;
        this.f = zu3Var;
    }

    public wj9(BrowserActivity browserActivity, dt3 dt3Var, nue nueVar, SettingsManager settingsManager, xnh xnhVar, fd fdVar) {
        this.c = dt3Var;
        this.d = nueVar;
        this.e = settingsManager;
        this.f = xnhVar;
        this.b = fdVar;
        byte b = 15;
        nueVar.getVisibility().j(browserActivity, new cl4(new tu7(this, b), (byte) 22));
        aib.B(settingsManager, browserActivity, new s9(this, b), new vme((byte) 19));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // defpackage.id
    public final defpackage.jf a(defpackage.yk5 r23, defpackage.pc r24) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj9.a(yk5, pc):jf");
    }
}
