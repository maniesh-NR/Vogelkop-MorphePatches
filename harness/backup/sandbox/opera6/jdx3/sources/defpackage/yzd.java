package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yzd implements vzd {
    public final int a;
    public final ArrayList b;
    public final p6l c;
    public final long d;

    public yzd(int i, ArrayList arrayList, p6l p6lVar) {
        this.a = i;
        this.b = arrayList;
        this.c = p6lVar;
        cgm cgmVar = dgm.b;
        igm igmVar = jgm.b;
        this.d = (i & 4294967295L) | 8589934592L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzd)) {
            return false;
        }
        yzd yzdVar = (yzd) obj;
        return this.a == yzdVar.a && this.b.equals(yzdVar.b) && this.c == yzdVar.c;
    }

    @Override // defpackage.vzd
    public final long getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.g(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
