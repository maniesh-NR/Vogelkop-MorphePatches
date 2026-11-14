package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pwf {
    public final List a;
    public final owf b;

    public pwf(List list, owf owfVar) {
        this.a = list;
        this.b = owfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwf)) {
            return false;
        }
        pwf pwfVar = (pwf) obj;
        return Intrinsics.a(this.a, pwfVar.a) && this.b == pwfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
