package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class qoa implements v7e {
    public static final mrf b = mrf.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final isd a;

    public qoa(isd isdVar) {
        this.a = isdVar;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        xy9 xy9Var = (xy9) obj;
        p7e p7eVar = (p7e) this.a.b;
        q7e q7eVarA = q7e.a(xy9Var);
        Object objE = p7eVar.e(q7eVarA);
        ArrayDeque arrayDeque = q7e.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(q7eVarA);
        }
        xy9 xy9Var2 = (xy9) objE;
        if (xy9Var2 == null) {
            p7eVar.j(q7e.a(xy9Var), xy9Var);
        } else {
            xy9Var = xy9Var2;
        }
        return new u7e(xy9Var, new ira(xy9Var, ((Integer) trfVar.c(b)).intValue()));
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        return true;
    }
}
