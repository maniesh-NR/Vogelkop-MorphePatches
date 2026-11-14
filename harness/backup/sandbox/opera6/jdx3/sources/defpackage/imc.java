package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class imc extends v0g {
    public final jmc a;
    public final List b;

    public imc(jmc jmcVar, List list) {
        this.a = jmcVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imc)) {
            return false;
        }
        imc imcVar = (imc) obj;
        return this.a.equals(imcVar.a) && Intrinsics.a(this.b, imcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
