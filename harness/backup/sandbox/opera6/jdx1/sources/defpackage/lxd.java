package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class lxd {
    public final jxd[] a;
    public final long b;

    public lxd(long j, jxd... jxdVarArr) {
        this.b = j;
        this.a = jxdVarArr;
    }

    public lxd(List list) {
        this((jxd[]) list.toArray(new jxd[0]));
    }

    public lxd(jxd... jxdVarArr) {
        this(-9223372036854775807L, jxdVarArr);
    }

    public final lxd a(jxd... jxdVarArr) {
        if (jxdVarArr.length == 0) {
            return this;
        }
        String str = tym.a;
        jxd[] jxdVarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(jxdVarArr2, jxdVarArr2.length + jxdVarArr.length);
        System.arraycopy(jxdVarArr, 0, objArrCopyOf, jxdVarArr2.length, jxdVarArr.length);
        return new lxd(this.b, (jxd[]) objArrCopyOf);
    }

    public final lxd b(lxd lxdVar) {
        return lxdVar == null ? this : a(lxdVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lxd.class == obj.getClass()) {
            lxd lxdVar = (lxd) obj;
            if (Arrays.equals(this.a, lxdVar.a) && this.b == lxdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        sb.append(j == -9223372036854775807L ? "" : p3p.l(j, ", presentationTimeUs="));
        return sb.toString();
    }
}
