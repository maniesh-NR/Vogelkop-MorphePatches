package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kw extends sfe {
    public final ArrayList h;

    public kw(ArrayList arrayList) {
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof kw) && this.h.equals(((kw) obj).h);
        }
        return true;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "";
    }
}
