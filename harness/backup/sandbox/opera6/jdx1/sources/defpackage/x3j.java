package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x3j {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final Executor d;
    public final dk4 e;
    public final int f;
    public final LinkedHashMap g;

    public x3j(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, dk4 dk4Var, int i2, LinkedHashMap linkedHashMap) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = executor;
        this.e = dk4Var;
        this.f = i2;
        this.g = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3j)) {
            return false;
        }
        x3j x3jVar = (x3j) obj;
        return this.a == x3jVar.a && Intrinsics.a(this.b, x3jVar.b) && this.c.equals(x3jVar.c) && Intrinsics.a(this.d, x3jVar.d) && Intrinsics.a(this.e, x3jVar.e) && this.f == x3jVar.f && this.g.equals(x3jVar.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        ArrayList arrayList = this.b;
        return (this.g.hashCode() + rfp.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + z1m.g(this.c, (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31)) * 31)) * 31, 31)) * 31;
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.e + ", sessionTemplateId=" + this.f + ", sessionParameters=" + this.g + ", sessionColorSpace=null)";
    }
}
