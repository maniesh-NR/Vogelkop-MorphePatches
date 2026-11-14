package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pi4 {
    public final ArrayList a;
    public final int b;
    public final eb4 c;

    public pi4(ArrayList arrayList, int i, eb4 eb4Var) {
        this.a = arrayList;
        this.b = i;
        this.c = eb4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi4)) {
            return false;
        }
        pi4 pi4Var = (pi4) obj;
        return Intrinsics.a(this.a, pi4Var.a) && this.b == pi4Var.b && Intrinsics.a(this.c, pi4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MainCaptureParams(configs=" + this.a + ", requestTemplate=" + ((Object) wwh.b(this.b)) + ", sessionConfigOptions=" + this.c + ')';
    }
}
