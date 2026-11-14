package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zck {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final cd5 d;

    public zck(ArrayList arrayList, int i, int i2, cd5 cd5Var) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = cd5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zck) {
            zck zckVar = (zck) obj;
            return this.a.equals(zckVar.a) && this.b == zckVar.b && this.c == zckVar.c && this.d == zckVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CaptureRequest(captureConfigs=" + this.a + ", captureMode=" + this.b + ", flashType=" + this.c + ", result=" + this.d + ')';
    }
}
