package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jdh {
    public final idh a;
    public final ArrayList b;

    public jdh(idh idhVar, ArrayList arrayList) {
        this.a = idhVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdh)) {
            return false;
        }
        jdh jdhVar = (jdh) obj;
        return this.a == jdhVar.a && this.b.equals(jdhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
