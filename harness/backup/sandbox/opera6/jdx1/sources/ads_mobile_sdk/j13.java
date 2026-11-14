package ads_mobile_sdk;

import defpackage.prb;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j13 {
    public final ArrayList a;
    public final xv b;
    public final ArrayList c;
    public prb d;

    public j13(ArrayList arrayList, xv xvVar, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = xvVar;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j13)) {
            return false;
        }
        j13 j13Var = (j13) obj;
        return this.a.equals(j13Var.a) && this.b.equals(j13Var.b) && this.c.equals(j13Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ServerResponse(adConfigurations=" + this.a + ", commonConfiguration=" + this.b + ", actions=" + this.c + ")";
    }
}
