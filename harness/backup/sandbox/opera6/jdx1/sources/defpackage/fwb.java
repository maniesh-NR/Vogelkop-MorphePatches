package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fwb implements qn7 {
    public final ewb a;

    public fwb(ewb ewbVar) {
        this.a = ewbVar;
    }

    @Override // defpackage.we1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final d1n a(j8m j8mVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        ewb ewbVar = this.a;
        jde jdeVar = ewbVar.b;
        ide ideVar = new ide(jdeVar.e + 2);
        jde jdeVar2 = new jde(jdeVar.e);
        int[] iArr3 = jdeVar.b;
        Object[] objArr3 = jdeVar.c;
        long[] jArr = jdeVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            dwb dwbVar = (dwb) objArr3[i6];
                            ideVar.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            jdeVar2.i(i7, new c1n((if1) j8mVar.a.invoke(dwbVar.a), dwbVar.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!jdeVar.b(0)) {
            int i8 = ideVar.b;
            if (i8 < 0) {
                zwg.u("Index must be between 0 and size");
                throw null;
            }
            ideVar.b(i8 + 1);
            int[] iArr4 = ideVar.a;
            int i9 = ideVar.b;
            if (i9 != 0) {
                b82.c(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            ideVar.b++;
        }
        if (!jdeVar.b(ewbVar.a)) {
            ideVar.a(ewbVar.a);
        }
        int i10 = ideVar.b;
        if (i10 != 0) {
            Arrays.sort(ideVar.a, 0, i10);
        }
        return new d1n(ideVar, jdeVar2, ewbVar.a, wq7.c);
    }
}
