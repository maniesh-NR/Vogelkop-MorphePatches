package defpackage;

/* loaded from: classes.dex */
public final class tdc extends l7n {
    public final jde b;

    public tdc() {
        jde jdeVar = xbb.a;
        this.b = new jde();
    }

    @Override // defpackage.l7n
    public final void e() {
        jde jdeVar = this.b;
        int[] iArr = jdeVar.b;
        Object[] objArr = jdeVar.c;
        long[] jArr = jdeVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        dee deeVar = (dee) objArr[i4];
                        Object[] objArr2 = deeVar.a;
                        int i6 = deeVar.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            sdc sdcVar = (sdc) objArr2[i7];
                            ph4 ph4Var = sdcVar.d;
                            if (ph4Var != null) {
                                ph4Var.cancel();
                            }
                            sdcVar.d = null;
                            hu3 hu3Var = (hu3) sdcVar.a.b;
                            hu3Var.b = true;
                            hu3Var.a = false;
                            hu3Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
