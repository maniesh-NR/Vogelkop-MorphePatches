package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class mwo {

    @NotNull
    public static final kwo Companion = new kwo();
    public final qwo a;

    public mwo(int i, qwo qwoVar) {
        if (1 == (i & 1)) {
            this.a = qwoVar;
        } else {
            x7d.I(i, 1, jwo.b);
            throw null;
        }
    }

    public mwo(qwo qwoVar) {
        this.a = qwoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwo) && Intrinsics.a(this.a, ((mwo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Source(ext=" + this.a + ')';
    }
}
