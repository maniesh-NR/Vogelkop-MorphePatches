package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class az7 {
    public static final wkm[] c = {wkm.B0, wkm.D0, wkm.E0, wkm.F0, wkm.H0, wkm.I0, wkm.J0, wkm.K0, wkm.L0, wkm.N0, wkm.O0, wkm.P0, wkm.S0, wkm.i2, wkm.Y4, wkm.Z4, wkm.a5, wkm.d5, wkm.e5, wkm.f5, wkm.g5, wkm.h5, wkm.i5, wkm.j5, wkm.k5, wkm.l5, wkm.m5, wkm.n5};
    public final ArrayList a;
    public final String b;

    public az7(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < str.length()) {
            str.charAt(i2);
            int i4 = i3 + 1;
            int iCodePointAt = Character.codePointAt(str, i3);
            wkm[] wkmVarArr = c;
            int length = wkmVarArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z = (z && (wkm.W1.a.d(iCodePointAt) || wkm.b2.a.d(iCodePointAt) || wkm.y5.a.d(iCodePointAt) || iCodePointAt == 8205)) ? z : false;
                } else if (wkmVarArr[i5].a.d(iCodePointAt)) {
                    break;
                } else {
                    i5++;
                }
            }
            z = true;
            Integer numValueOf = z ? Integer.valueOf(i3) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i2++;
            i3 = i4;
        }
        this.a = arrayList;
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i7 = i6 + 1;
            if (!this.a.contains(Integer.valueOf(i6))) {
                sb.append(cCharAt);
            }
            i++;
            i6 = i7;
        }
        this.b = sb.toString();
    }
}
