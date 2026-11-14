package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3l implements u3l {
    public final Set d;

    public q3l(Set set) {
        this.d = set;
    }

    @Override // defpackage.u3l
    public final boolean a(b2l b2lVar) {
        return !this.d.contains(b2lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3l) && Intrinsics.a(this.d, ((q3l) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "";
    }
}
