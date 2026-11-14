package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jf {
    public static final byte g;
    public final Function2 a;
    public final Function2 b;
    public final xc c;
    public final boolean d;
    public final pc e;
    public final boolean f;

    static {
        xc xcVar = xc.g;
        g = (byte) 8;
    }

    public jf(Function2 function2, Function2 function22, xc xcVar, boolean z, pc pcVar, boolean z2) {
        this.a = function2;
        this.b = function22;
        this.c = xcVar;
        this.d = z;
        this.e = pcVar;
        this.f = z2;
    }

    public /* synthetic */ jf(Function2 function2, Function2 function22, boolean z, boolean z2, int i) {
        this(function2, (i & 2) != 0 ? null : function22, null, (i & 8) != 0 ? true : z, null, (i & 32) != 0 ? true : z2);
    }

    public static jf a(jf jfVar, g9 g9Var, xc xcVar, pc pcVar, boolean z, int i) {
        Function2 function2 = g9Var;
        if ((i & 1) != 0) {
            function2 = jfVar.a;
        }
        Function2 function22 = function2;
        Function2 function23 = jfVar.b;
        if ((i & 4) != 0) {
            xcVar = jfVar.c;
        }
        xc xcVar2 = xcVar;
        boolean z2 = jfVar.d;
        if ((i & 16) != 0) {
            pcVar = jfVar.e;
        }
        pc pcVar2 = pcVar;
        if ((i & 32) != 0) {
            z = jfVar.f;
        }
        return new jf(function22, function23, xcVar2, z2, pcVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return Intrinsics.a(this.a, jfVar.a) && Intrinsics.a(this.b, jfVar.b) && Intrinsics.a(this.c, jfVar.c) && this.d == jfVar.d && this.e == jfVar.e && this.f == jfVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Function2 function2 = this.b;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        xc xcVar = this.c;
        int iK = fki.k((iHashCode2 + (xcVar == null ? 0 : xcVar.hashCode())) * 31, 31, this.d);
        pc pcVar = this.e;
        return Boolean.hashCode(this.f) + ((iK + (pcVar != null ? pcVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
