package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fu2 {
    public final List a;
    public final cu2 b;

    public fu2(List list, cu2 cu2Var) {
        this.a = list;
        this.b = cu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2)) {
            return false;
        }
        fu2 fu2Var = (fu2) obj;
        return Intrinsics.a(this.a, fu2Var.a) && this.b.equals(fu2Var.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1228341;
    }

    public final String toString() {
        return "";
    }
}
