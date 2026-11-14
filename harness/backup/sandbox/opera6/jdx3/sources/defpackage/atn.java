package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class atn {
    public final String a;
    public final ArrayList b;

    public atn(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atn)) {
            return false;
        }
        atn atnVar = (atn) obj;
        return this.a.equals(atnVar.a) && this.b.equals(atnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
