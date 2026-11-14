package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qe2 {
    public final yyh a;

    public qe2(yyh yyhVar) {
        this.a = yyhVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof qe2) && Intrinsics.a(this.a, ((qe2) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
