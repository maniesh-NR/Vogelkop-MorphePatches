package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nb7 {
    public final String a;
    public final erl b;
    public final Function0 c;

    public nb7(String str, erl erlVar, Function0 function0) {
        this.a = str;
        this.b = erlVar;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb7)) {
            return false;
        }
        nb7 nb7Var = (nb7) obj;
        return Intrinsics.a(this.a, nb7Var.a) && Intrinsics.a(this.b, nb7Var.b) && Intrinsics.a(this.c, nb7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        erl erlVar = this.b;
        return this.c.hashCode() + ((iHashCode + (erlVar == null ? 0 : erlVar.hashCode())) * 31);
    }

    public final String toString() {
        return "DisplayToast(message=" + this.a + ", icon=" + this.b + ", onShown=" + this.c + ")";
    }
}
