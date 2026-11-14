package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class s5p {

    @NotNull
    public static final h4p Companion = new h4p();
    public final c4p a;

    public s5p(int i, c4p c4pVar) {
        if (1 == (i & 1)) {
            this.a = c4pVar;
        } else {
            x7d.I(i, 1, w3p.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5p) && Intrinsics.a(this.a, ((s5p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NativeAdm(native=" + this.a + ')';
    }
}
