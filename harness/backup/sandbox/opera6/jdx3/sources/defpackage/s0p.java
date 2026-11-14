package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class s0p {

    @NotNull
    public static final r0p Companion = new r0p();
    public final int a;

    public s0p(int i) {
        this.a = i;
    }

    public s0p(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            x7d.I(i, 1, q0p.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0p) && this.a == ((s0p) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.s(new StringBuilder("ImpExt(adtype="), this.a, ')');
    }
}
