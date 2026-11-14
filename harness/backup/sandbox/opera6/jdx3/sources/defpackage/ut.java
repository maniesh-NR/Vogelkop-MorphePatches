package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ut extends vt {
    public final ArrayList a;

    public ut(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ut) && this.a.equals(((ut) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
