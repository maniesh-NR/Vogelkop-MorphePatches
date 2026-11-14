package defpackage;

import android.view.ViewGroup;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class v9l {
    public final ndc a;
    public final gjm b;
    public final x5f c;
    public final umi d;
    public final z77 e;
    public final p77 f;
    public final ysj g;
    public final k6l h;
    public final u4l i;
    public final i53 j;
    public final nr8 k;
    public final SettingsManager l;
    public final c4l m;
    public final mt3 n;
    public final mt3 o;
    public final mt3 p;
    public final eme q;
    public final jo3 r;
    public final yqa s;
    public final x77 t;
    public final gb3 u;
    public r9l v;
    public km5 w;
    public final pde x;

    public v9l(ndc ndcVar, gjm gjmVar, x5f x5fVar, umi umiVar, z77 z77Var, p77 p77Var, ysj ysjVar, k6l k6lVar, u4l u4lVar, i53 i53Var, nr8 nr8Var, SettingsManager settingsManager, c4l c4lVar, mt3 mt3Var, mt3 mt3Var2, mt3 mt3Var3, eme emeVar, jo3 jo3Var, yqa yqaVar, x77 x77Var, gb3 gb3Var) {
        this.a = ndcVar;
        this.b = gjmVar;
        this.c = x5fVar;
        this.d = umiVar;
        this.e = z77Var;
        this.f = p77Var;
        this.g = ysjVar;
        this.h = k6lVar;
        this.i = u4lVar;
        this.j = i53Var;
        this.k = nr8Var;
        this.l = settingsManager;
        this.m = c4lVar;
        this.n = mt3Var;
        this.o = mt3Var2;
        this.p = mt3Var3;
        this.q = emeVar;
        this.r = jo3Var;
        this.s = yqaVar;
        this.t = x77Var;
        this.u = gb3Var;
        this.x = oup.i0(ndcVar.getLifecycle());
    }

    public final void a(p6l p6lVar) {
        r9l r9lVar = this.v;
        if (r9lVar != null) {
            if (p6lVar != null) {
                r9lVar.t.g(p6lVar);
                return;
            }
            return;
        }
        r9l r9lVar2 = new r9l(this.x, this.m, this.b, this.c, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.g, this.p, (ViewGroup) this.n.invoke(), this.o, this.q, this.r, this.s, p6lVar, this.u, new j1k(0, this, v9l.class, "handleHideUi", "handleHideUi()V", 0, (byte) 24));
        this.v = r9lVar2;
        x77 x77Var = this.t;
        x77Var.d = ((qim) x77Var.b).f(r9lVar2);
        ((gm8) x77Var.c).d();
    }
}
