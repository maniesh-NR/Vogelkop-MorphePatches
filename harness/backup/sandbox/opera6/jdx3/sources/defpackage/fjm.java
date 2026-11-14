package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fjm {
    public final oje a;
    public final djm b;

    public fjm(oje ojeVar, djm djmVar) {
        this.a = ojeVar;
        this.b = djmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fjm) {
            return Intrinsics.a(this.a.a, ((fjm) obj).a.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
