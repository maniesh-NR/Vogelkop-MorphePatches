package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class kqj {
    public static final iqj a(iqj iqjVar) throws pxb {
        if (!(iqjVar instanceof iqj)) {
            iqjVar = null;
        }
        if (iqjVar != null) {
            return iqjVar;
        }
        mh5.b("Inconsistent composition");
        t3p.v();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC >= 0 ? iC : -(iC + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((qt9) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iB = Intrinsics.b(i5, i);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        int i3 = (i * 5) + 1;
        iArr[i3] = (iArr[i3] & (-67108864)) | i2;
    }
}
