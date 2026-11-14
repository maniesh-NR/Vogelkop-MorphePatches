package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pmf extends tc2 {
    public final boolean b;
    public final Function0 c;

    public pmf(boolean z, Function0 function0) {
        super(true);
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmf)) {
            return false;
        }
        pmf pmfVar = (pmf) obj;
        return this.b == pmfVar.b && Intrinsics.a(this.c, pmfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "";
    }
}
