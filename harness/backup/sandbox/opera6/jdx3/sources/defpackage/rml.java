package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rml {
    public final Object a;
    public final tcl b;

    public rml(Object obj, tcl tclVar) {
        this.a = obj;
        this.b = tclVar;
    }

    public final plk a(Function1 function1) {
        return aoh.k(this.b, this.a, new qml(this, function1, (byte) 0));
    }

    public final plk b(Function1 function1) {
        return aoh.k(this.b, this.a, new qml(this, function1, (byte) 1));
    }

    public final plk c(Function1 function1) {
        return aoh.k(this.b, this.a, new qml(this, function1, (byte) 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rml)) {
            return false;
        }
        rml rmlVar = (rml) obj;
        return Intrinsics.a(this.a, rmlVar.a) && Intrinsics.a(this.b, rmlVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "";
    }
}
