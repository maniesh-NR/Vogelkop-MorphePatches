package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vfp implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    public vfp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vfp vfpVar = (vfp) obj;
        Function1[] function1Arr = {hfp.b, lfp.b, mfp.b};
        for (int i = 0; i < 3; i++) {
            Function1 function1 = function1Arr[i];
            int iA = ad5.a((Comparable) function1.invoke(this), (Comparable) function1.invoke(vfpVar));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfp)) {
            return false;
        }
        vfp vfpVar = (vfp) obj;
        return this.a == vfpVar.a && this.b == vfpVar.b && this.c == vfpVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateVersion(major=");
        sb.append(this.a);
        sb.append(", minor=");
        sb.append(this.b);
        sb.append(", patch=");
        return fki.s(sb, this.c, ')');
    }
}
