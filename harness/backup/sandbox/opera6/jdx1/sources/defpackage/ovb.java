package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ovb {
    public static final ovb g = new ovb(63, null);
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    public /* synthetic */ ovb(int i, Function1 function1) {
        this(null, null, null, null, null, (i & 32) != 0 ? null : function1);
    }

    public ovb(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
        this.e = function15;
        this.f = function16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovb)) {
            return false;
        }
        ovb ovbVar = (ovb) obj;
        return this.a == ovbVar.a && this.b == ovbVar.b && this.c == ovbVar.c && this.d == ovbVar.d && this.e == ovbVar.e && this.f == ovbVar.f;
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.b;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1 function13 = this.c;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1 function14 = this.d;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1 function15 = this.e;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1 function16 = this.f;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }
}
