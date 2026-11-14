package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l9i {
    public float a = 0.0f;
    public boolean b = true;
    public wxe c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9i)) {
            return false;
        }
        l9i l9iVar = (l9i) obj;
        return Float.compare(this.a, l9iVar.a) == 0 && this.b == l9iVar.b && Intrinsics.a(this.c, l9iVar.c);
    }

    public final int hashCode() {
        int iK = fki.k(Float.hashCode(this.a) * 31, 31, this.b);
        wxe wxeVar = this.c;
        return (iK + (wxeVar == null ? 0 : wxeVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
