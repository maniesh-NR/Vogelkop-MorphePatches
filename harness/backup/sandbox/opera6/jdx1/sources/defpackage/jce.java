package defpackage;

/* loaded from: classes.dex */
public final class jce {
    public final see a;

    public static final Object a(see seeVar) {
        Object objG = seeVar.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof dee)) {
            seeVar.k(null);
            return objG;
        }
        dee deeVar = (dee) objG;
        if (deeVar.i()) {
            h9o.h("List is empty.");
            return null;
        }
        int i = deeVar.b - 1;
        Object objG2 = deeVar.g(i);
        deeVar.l(i);
        if (deeVar.i()) {
            seeVar.k(null);
        }
        if (deeVar.b == 1) {
            seeVar.m(null, deeVar.f());
        }
        return objG2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jce) {
            return this.a.equals(((jce) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
