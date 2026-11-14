package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f18 {
    public final ChromiumContent a;
    public final gtj b;
    public final e18 c;
    public oml d;
    public final ig e;

    public f18(ChromiumContent chromiumContent, gtj gtjVar, e18 e18Var, oml omlVar, ig igVar) {
        this.a = chromiumContent;
        this.b = gtjVar;
        this.c = e18Var;
        this.d = omlVar;
        this.e = igVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f18) {
            f18 f18Var = (f18) obj;
            return this.a == f18Var.a && this.b == f18Var.b && this.c == f18Var.c && Intrinsics.a(this.d, f18Var.d) && this.e == f18Var.e;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        oml omlVar = this.d;
        return this.e.hashCode() + ((iHashCode + (omlVar == null ? 0 : omlVar.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
