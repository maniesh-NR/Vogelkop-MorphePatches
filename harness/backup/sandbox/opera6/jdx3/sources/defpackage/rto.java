package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class rto {

    @NotNull
    public static final pto Companion = new pto();
    public final String a;

    public rto(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            x7d.I(i, 1, oto.b);
            throw null;
        }
    }

    public rto(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rto) && Intrinsics.a(this.a, ((rto) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return o18.p(new StringBuilder("AppExt(installer="), this.a, ')');
    }
}
