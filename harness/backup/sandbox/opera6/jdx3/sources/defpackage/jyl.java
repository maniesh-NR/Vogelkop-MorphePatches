package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class jyl {
    public final int a;
    public final bj8[] b;
    public int c;

    public jyl(bj8... bj8VarArr) {
        this.b = bj8VarArr;
        this.a = bj8VarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jyl.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((jyl) obj).b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = 527 + Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }
}
