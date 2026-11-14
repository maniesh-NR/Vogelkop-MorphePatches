package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yt9 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final jde e;
    public final zyk f;

    public yt9(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            bpg.a("Invalid start index");
        }
        this.d = new ArrayList();
        jde jdeVar = new jde();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            rub rubVar = (rub) this.a.get(i3);
            int i4 = rubVar.c;
            int i5 = rubVar.d;
            jdeVar.i(i4, new e5a(i3, i2, i5));
            i2 += i5;
        }
        this.e = jdeVar;
        this.f = z4c.b(new t2(this, (byte) 20));
    }

    public final boolean a(int i, int i2) {
        e5a e5aVar;
        int i3;
        int i4;
        jde jdeVar = this.e;
        e5a e5aVar2 = (e5a) jdeVar.e(i);
        if (e5aVar2 == null) {
            return false;
        }
        int i5 = e5aVar2.b;
        int i6 = i2 - e5aVar2.c;
        e5aVar2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = jdeVar.c;
        long[] jArr = jdeVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (e5aVar = (e5a) objArr[(i7 << 3) + i9]).b) >= i5 && e5aVar != e5aVar2 && (i4 = i3 + i6) >= 0) {
                        e5aVar.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
