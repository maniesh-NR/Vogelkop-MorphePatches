package defpackage;

import com.opera.android.Lazy;
import com.opera.android.PushedContentHandler;

/* loaded from: classes.dex */
public final class fk5 implements f7f {
    public final t5d a;
    public final z77 b;
    public final eej c;
    public final zv3 d;
    public final r9c e;
    public final PushedContentHandler f;
    public final x5f g;
    public final x5f h;
    public final Lazy i;
    public final wv1 j;

    public fk5(t5d t5dVar, z77 z77Var, eej eejVar, zv3 zv3Var, r9c r9cVar, PushedContentHandler pushedContentHandler, x5f x5fVar, x5f x5fVar2, Lazy lazy, wv1 wv1Var) {
        this.a = t5dVar;
        this.b = z77Var;
        this.c = eejVar;
        this.d = zv3Var;
        this.e = r9cVar;
        this.f = pushedContentHandler;
        this.g = x5fVar;
        this.h = x5fVar2;
        this.i = lazy;
        this.j = wv1Var;
    }

    public final void d0(Object obj) {
        eb8 eb8Var = (eb8) obj;
        ip1 ip1Var = new ip1(this, (byte) 5);
        if (eb8Var.b) {
            return;
        }
        eb8Var.b = true;
        ip1Var.accept(eb8Var.a);
    }
}
