package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class n7o {

    @NotNull
    public static final m7o Companion = new m7o();
    public final long a;

    public /* synthetic */ n7o(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            x7d.I(i, 1, l7o.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7o) && this.a == ((n7o) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
