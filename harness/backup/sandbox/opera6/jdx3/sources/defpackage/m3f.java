package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class m3f {

    @NotNull
    public static final l3f Companion = new l3f();
    public final j3f a;
    public final j3f b;

    public m3f(int i, j3f j3fVar, j3f j3fVar2) {
        this.a = (i & 1) == 0 ? new j3f(l08.a) : j3fVar;
        if ((i & 2) == 0) {
            this.b = new j3f(l08.a);
        } else {
            this.b = j3fVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3f)) {
            return false;
        }
        m3f m3fVar = (m3f) obj;
        return Intrinsics.a(this.a, m3fVar.a) && Intrinsics.a(this.b, m3fVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
