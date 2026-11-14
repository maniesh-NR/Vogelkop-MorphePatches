package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class j5p {

    @NotNull
    public static final i5p Companion = new i5p();
    public final String a;

    public j5p(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            x7d.I(i, 1, h5p.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5p) && Intrinsics.a(this.a, ((j5p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o18.p(new StringBuilder("Video(vasttag="), this.a, ')');
    }
}
