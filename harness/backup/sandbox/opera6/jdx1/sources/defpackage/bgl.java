package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bgl {
    public static final bgl b = new bgl(0);
    public static final bgl c = new bgl(1);
    public static final bgl d = new bgl(2);
    public final int a;

    public bgl(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bgl) {
            return this.a == ((bgl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        return arrayList.size() == 1 ? rfp.o(arrayList.get(0), "TextDecoration.") : sko.k("TextDecoration[", tic.a(arrayList, ", ", null, 62), "]");
    }
}
