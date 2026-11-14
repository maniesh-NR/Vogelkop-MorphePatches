package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class hd9 implements am9 {
    public final /* synthetic */ jd9 a;

    public hd9(jd9 jd9Var) {
        this.a = jd9Var;
    }

    public final void onBackStackChanged() {
        jd9 jd9Var = this.a;
        List listF = jd9Var.getParentFragmentManager().c.f();
        boolean z = true;
        if (!listF.isEmpty() && am2.l(1, listF) == jd9Var) {
            z = false;
        }
        jd9Var.n = z;
        jd9Var.z0();
    }
}
