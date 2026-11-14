package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ks1 {
    public final ArrayList a;
    public final boolean b;

    public ks1(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks1)) {
            return false;
        }
        ks1 ks1Var = (ks1) obj;
        return this.a.equals(ks1Var.a) && this.b == ks1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
