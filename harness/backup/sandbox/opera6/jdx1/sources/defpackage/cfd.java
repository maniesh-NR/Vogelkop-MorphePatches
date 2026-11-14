package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class cfd implements twi {
    public final xz4 a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public cfd(SparseArray sparseArray, long j, int i, long j2, long j3) {
        xz4 xz4Var;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            xz4Var = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                bfd bfdVar = (bfd) list.get(i4);
                jArrCopyOf3[i4] = bfdVar.a;
                jArrCopyOf[i4] = bfdVar.b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                w7d.K("Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            xz4Var = new xz4(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.a = xz4Var;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        xz4 xz4Var = this.a;
        if (xz4Var != null) {
            return xz4Var.getSeekPoints(j);
        }
        vwi vwiVar = vwi.c;
        return new swi(vwiVar, vwiVar);
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
