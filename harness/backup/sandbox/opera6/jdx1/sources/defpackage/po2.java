package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class po2 {
    public final g07 a;
    public final List b;
    public final int c;
    public final int d;
    public final ip7 e;

    public po2(g07 g07Var, List list, int i, int i2, ip7 ip7Var) {
        this.a = g07Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = ip7Var;
    }

    public static wjh a(g07 g07Var) {
        wjh wjhVar = new wjh((byte) 9);
        if (g07Var == null) {
            t3p.q("Null surface");
            return null;
        }
        wjhVar.b = g07Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            t3p.q("Null sharedSurfaces");
            return null;
        }
        wjhVar.c = list;
        wjhVar.d = -1;
        wjhVar.e = -1;
        wjhVar.f = ip7.d;
        return wjhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof po2)) {
            return false;
        }
        po2 po2Var = (po2) obj;
        return this.a.equals(po2Var.a) && this.b.equals(po2Var.b) && this.c == po2Var.c && this.d == po2Var.d && this.e.equals(po2Var.e);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
