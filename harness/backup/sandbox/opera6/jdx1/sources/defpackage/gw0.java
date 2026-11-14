package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gw0 {
    public final t70 a;
    public final fw0 b;
    public final ArrayList c;

    public gw0(t70 t70Var, fw0 fw0Var, ArrayList arrayList) {
        this.a = t70Var;
        this.b = fw0Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gw0) {
            gw0 gw0Var = (gw0) obj;
            if (this.a == gw0Var.a && Intrinsics.a(this.b, gw0Var.b) && this.c.equals(gw0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fw0 fw0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (fw0Var == null ? 0 : fw0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
