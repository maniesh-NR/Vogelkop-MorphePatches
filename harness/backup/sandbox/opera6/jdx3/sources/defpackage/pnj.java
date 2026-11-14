package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pnj extends onj {
    public final String a;
    public final lnj b;
    public final Function1 c;

    public pnj(String str, lnj lnjVar, Function1 function1) {
        this.a = str;
        this.b = lnjVar;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnj)) {
            return false;
        }
        pnj pnjVar = (pnj) obj;
        return this.a.equals(pnjVar.a) && this.b.equals(pnjVar.b) && Intrinsics.a(this.c, pnjVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Function1 function1 = this.c;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        return "";
    }
}
