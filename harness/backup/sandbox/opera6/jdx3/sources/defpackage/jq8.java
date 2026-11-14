package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jq8 {
    public final List a;
    public final List b;

    public jq8(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq8)) {
            return false;
        }
        jq8 jq8Var = (jq8) obj;
        return Intrinsics.a(this.a, jq8Var.a) && Intrinsics.a(this.b, jq8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
