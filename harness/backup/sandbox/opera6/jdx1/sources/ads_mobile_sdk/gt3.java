package ads_mobile_sdk;

import defpackage.jyo;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Optional;

/* loaded from: classes.dex */
public final class gt3 {
    public final ArrayDeque a;

    public gt3(byte b) {
        switch (b) {
            case 1:
                this.a = new ArrayDeque();
                break;
            default:
                int[] iArr = {114723506, 151129280, 1368781114, 134385090, 816173334, -1981646764, 34563124, 1737518944, 282828202};
                int i = iArr[7] % iArr[8];
                this.a = new ArrayDeque();
                break;
        }
    }

    public final dt3 a() {
        return (dt3) Optional.ofNullable((dt3) this.a.peek()).orElseThrow(ct3.b);
    }

    public final void a(long j, long j2, long j3) throws jyo {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        dt3 dt3Var = new dt3(j, j2, j3);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() >= iA) {
            throw new jyo();
        }
        arrayDeque.push(dt3Var);
    }

    public final void a(hr hrVar) {
        if (!hrVar.b()) {
            if (!(hrVar instanceof zx2)) {
                qp2.o("Has a new type of ByteString been created? Found ".concat(String.valueOf(hrVar.getClass())));
                return;
            }
            zx2 zx2Var = (zx2) hrVar;
            a(zx2Var.e);
            a(zx2Var.f);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(zx2.i, hrVar.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iC = zx2.c(iBinarySearch + 1);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty() || ((hr) arrayDeque.peek()).size() >= iC) {
            arrayDeque.push(hrVar);
            return;
        }
        int iC2 = zx2.c(iBinarySearch);
        hr zx2Var2 = (hr) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((hr) arrayDeque.peek()).size() < iC2) {
            zx2Var2 = new zx2((hr) arrayDeque.pop(), zx2Var2);
        }
        zx2 zx2Var3 = new zx2(zx2Var2, hrVar);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(zx2.i, zx2Var3.d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((hr) arrayDeque.peek()).size() >= zx2.c(iBinarySearch2 + 1)) {
                break;
            } else {
                zx2Var3 = new zx2((hr) arrayDeque.pop(), zx2Var3);
            }
        }
        arrayDeque.push(zx2Var3);
    }
}
