package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class v3f {

    @NotNull
    public static final u3f Companion = new u3f();
    public static final l4c[] f = {null, z4c.a(f7c.b, new vme(16)), null, null, null};
    public final String a;
    public final swh b;
    public final long c;
    public final long d;
    public final m3f e;

    public /* synthetic */ v3f(int i, String str, swh swhVar, long j, long j2, m3f m3fVar) {
        if (31 != (i & 31)) {
            x7d.I(i, 31, t3f.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = swhVar;
        this.c = j;
        this.d = j2;
        this.e = m3fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3f)) {
            return false;
        }
        v3f v3fVar = (v3f) obj;
        return Intrinsics.a(this.a, v3fVar.a) && this.b == v3fVar.b && this.c == v3fVar.c && this.d == v3fVar.d && Intrinsics.a(this.e, v3fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z1m.e(z1m.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
