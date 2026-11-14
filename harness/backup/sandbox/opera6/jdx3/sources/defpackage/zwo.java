package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class zwo {

    @NotNull
    public static final ywo Companion = new ywo();
    public final String a;

    public zwo(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            x7d.I(i, 1, xwo.b);
            throw null;
        }
    }

    public zwo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zwo) && Intrinsics.a(this.a, ((zwo) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return o18.p(new StringBuilder("UserExt(abGroup="), this.a, ')');
    }
}
