package defpackage;

/* loaded from: classes.dex */
public final class v1c {
    public static final v1c a;

    static {
        v1c v1cVar = new v1c();
        if (gh7.a(0.0f, 0.0f) < 0 || gh7.a(0.0f, 0.0f) < 0 || gh7.a(0.0f, 0.0f) < 0 || gh7.a(0.0f, 0.0f) < 0) {
            z7b.a("Layer outsets must be non-negative");
        }
        a = v1cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof v1c) && gh7.b(0.0f, 0.0f) && gh7.b(0.0f, 0.0f) && gh7.b(0.0f, 0.0f) && gh7.b(0.0f, 0.0f);
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        String strC = gh7.c(0.0f);
        String strC2 = gh7.c(0.0f);
        return sko.n(z1m.n("LayerOutsets(left=", strC, ", top=", strC2, ", right="), gh7.c(0.0f), ", bottom=", gh7.c(0.0f), ")");
    }
}
