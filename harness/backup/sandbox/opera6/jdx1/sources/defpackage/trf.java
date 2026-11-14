package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class trf implements hub {
    public final v74 b = new v74(0);

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            v74 v74Var = this.b;
            if (i >= v74Var.c) {
                return;
            }
            mrf mrfVar = (mrf) v74Var.f(i);
            Object objK = this.b.k(i);
            krf krfVar = mrfVar.b;
            if (mrfVar.d == null) {
                mrfVar.d = mrfVar.c.getBytes(hub.a);
            }
            krfVar.a(mrfVar.d, objK, messageDigest);
            i++;
        }
    }

    public final Object c(mrf mrfVar) {
        v74 v74Var = this.b;
        return v74Var.containsKey(mrfVar) ? v74Var.get(mrfVar) : mrfVar.a;
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (obj instanceof trf) {
            return this.b.equals(((trf) obj).b);
        }
        return false;
    }

    @Override // defpackage.hub
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
