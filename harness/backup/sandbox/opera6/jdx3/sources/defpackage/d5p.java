package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class d5p {

    @NotNull
    public static final c5p Companion = new c5p();
    public final String a;

    public d5p(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            x7d.I(i, 1, b5p.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5p) && Intrinsics.a(this.a, ((d5p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o18.p(new StringBuilder("Title(text="), this.a, ')');
    }
}
