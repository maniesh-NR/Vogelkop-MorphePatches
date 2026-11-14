package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class pi5 extends esf implements Serializable {
    public final Comparator[] a;

    /* JADX WARN: Multi-variable type inference failed */
    public pi5(p24 p24Var, p24 p24Var2) {
        this.a = new Comparator[]{p24Var, p24Var2};
    }

    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pi5) {
            return Arrays.equals(this.a, ((pi5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return z1m.l(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
