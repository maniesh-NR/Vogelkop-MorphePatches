package defpackage;

import java.util.Arrays;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class rde {
    public long[] a;
    public int b;

    public /* synthetic */ rde() {
        this(16);
    }

    public rde(int i) {
        this.a = i == 0 ? i1d.a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArrCopyOf = this.a;
        if (jArrCopyOf.length < i) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (jArrCopyOf.length * 3) / 2));
            this.a = jArrCopyOf;
        }
        int i2 = this.b;
        jArrCopyOf[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rde) {
            rde rdeVar = (rde) obj;
            int i = rdeVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = rdeVar.a;
                IntRange intRangeJ = djh.j(0, i2);
                int i3 = ((a) intRangeJ).a;
                int i4 = ((a) intRangeJ).b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
