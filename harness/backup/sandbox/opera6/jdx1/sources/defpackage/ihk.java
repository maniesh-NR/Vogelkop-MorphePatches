package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ihk {
    public final ArrayList a;

    public ihk(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ihk) && this.a.equals(((ihk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Array(items=" + this.a + ")";
    }
}
