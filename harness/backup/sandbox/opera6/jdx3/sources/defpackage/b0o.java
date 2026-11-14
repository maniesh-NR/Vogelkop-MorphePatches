package defpackage;

import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0o implements r7n {
    public final j4c a;
    public final a0o b;
    public final j4c c;
    public final g92 d;
    public final tzn e;
    public final j4c f;
    public final cq5 g;
    public final j4c h;
    public final wv1 i;
    public final SettingsManager j;
    public final a0o k;
    public final Lazy l;
    public final WelcomeActivity m;

    public b0o(j4c j4cVar, a0o a0oVar, j4c j4cVar2, g92 g92Var, tzn tznVar, j4c j4cVar3, cq5 cq5Var, j4c j4cVar4, wv1 wv1Var, SettingsManager settingsManager, a0o a0oVar2, Lazy lazy, WelcomeActivity welcomeActivity) {
        this.a = j4cVar;
        this.b = a0oVar;
        this.c = j4cVar2;
        this.d = g92Var;
        this.e = tznVar;
        this.f = j4cVar3;
        this.g = cq5Var;
        this.h = j4cVar4;
        this.i = wv1Var;
        this.j = settingsManager;
        this.k = a0oVar2;
        this.l = lazy;
        this.m = welcomeActivity;
    }

    @Override // defpackage.r7n
    public final l7n c(Class cls) {
        l7n zcgVar = Intrinsics.a(cls, zcg.class) ? new zcg((yk6) this.a.get(), (h0a) this.c.get(), (xnc) this.d.get(), (ru9) this.b.get(), (mdf) this.f.get(), this.g, (vbg) this.h.get(), this.j, (qln) this.l.get(), this.m) : Intrinsics.a(cls, q0o.class) ? new q0o((xbf) this.k.get(), (pch) this.i.b.get(), this.e) : null;
        if (zcgVar == null) {
            zcgVar = null;
        }
        if (zcgVar != null) {
            return zcgVar;
        }
        qp2.o("WelcomeActivityViewModelFactory doesn't know how to create ".concat(cls.getName()));
        return null;
    }
}
