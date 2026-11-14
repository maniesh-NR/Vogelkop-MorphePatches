package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lk4 extends na2 {
    public final ArrayList o;

    public lk4(ArrayList arrayList) {
        this.o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof lk4) && this.o.equals(((lk4) obj).o);
        }
        return true;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "";
    }
}
