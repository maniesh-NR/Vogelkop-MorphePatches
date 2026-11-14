package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c85 implements smh {
    public final m4l a;
    public final ArrayList b;
    public final long c;

    static {
        l4l l4lVar = m4l.Companion;
    }

    public c85(m4l m4lVar, ArrayList arrayList) {
        this.a = m4lVar;
        this.b = arrayList;
        int i = m4lVar.a;
        cgm cgmVar = dgm.b;
        this.c = (i & 4294967295L) | 8589934592L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c85)) {
            return false;
        }
        c85 c85Var = (c85) obj;
        return this.a.equals(c85Var.a) && this.b.equals(c85Var.b);
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
