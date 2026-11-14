package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zrd {
    public final s4n a;

    public zrd(s4n s4nVar) {
        this.a = s4nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrd)) {
            return false;
        }
        if (!Intrinsics.a(this.a, ((zrd) obj).a)) {
            return false;
        }
        mh2 mh2Var = mh2.a;
        return mh2Var.equals(mh2Var);
    }

    public final int hashCode() {
        return Objects.hash(this.a, mh2.a, -1);
    }

    public final String toString() {
        return "MediaSpec{videoSpec=" + this.a + ", audioSpec=" + mh2.a + ", outputFormat=-1}";
    }
}
