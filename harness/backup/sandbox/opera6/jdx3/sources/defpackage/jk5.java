package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class jk5 {
    public final pv1 a;
    public final ru9 c;
    public String e;
    public final ode b = new ode();
    public final Object d = new Object();

    public jk5(Context context, pv1 pv1Var) {
        this.a = pv1Var;
        this.c = ru9.c(context);
    }

    public final String a() {
        return this.c.a.getString("config_bundle.active", null);
    }
}
