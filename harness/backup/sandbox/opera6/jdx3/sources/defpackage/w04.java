package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class w04 {
    public static final long e;
    public final Context a;
    public final x05 b;
    public boolean c;
    public final fv2 d;

    static {
        on7 on7Var = pn7.b;
        e = cs5.x0(500, un7.d);
    }

    public w04(Context context, kze kzeVar, p12 p12Var, dll dllVar) {
        this.a = context;
        x05 x05Var = new x05(context);
        u05 u05Var = x05Var.a;
        if (u05Var.n) {
            u05Var.n = false;
        }
        x05Var.invalidateSelf();
        this.b = x05Var;
        this.d = new fv2(this, (byte) 26);
        a26.U(dllVar, kzeVar, new rw0(this, (byte) 4), new oc2(this, (byte) 28));
        a26.T((kze) p12Var.g, kzeVar, new k9(this, (byte) 21));
        kzeVar.k(new pb(new bo3(this, (byte) 12), (byte) 29));
    }
}
