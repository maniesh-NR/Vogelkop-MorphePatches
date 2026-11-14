package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hj8 implements smh {
    public final m4l a;
    public final ArrayList b;
    public final long c;

    static {
        l4l l4lVar = m4l.Companion;
    }

    public hj8(m4l m4lVar, ArrayList arrayList) {
        this.a = m4lVar;
        this.b = arrayList;
        int i = m4lVar.a;
        cgm cgmVar = dgm.b;
        this.c = (i & 4294967295L) | 17179869184L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj8)) {
            return false;
        }
        hj8 hj8Var = (hj8) obj;
        return this.a.equals(hj8Var.a) && this.b.equals(hj8Var.b);
    }

    @Override // defpackage.smh
    public final long getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
