package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ofd implements jxd {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ofd(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                z4o.w(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                z4o.w(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                z4o.w(z);
                break;
            case "auxiliary.tracks.map":
                z4o.w(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        z4o.G("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ofd.class != obj.getClass()) {
            return false;
        }
        ofd ofdVar = (ofd) obj;
        return this.a.equals(ofdVar.a) && Arrays.equals(this.b, ofdVar.b) && this.c == ofdVar.c && this.d == ofdVar.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + z1m.f(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            r0 = 3
            java.lang.String r1 = r9.a
            byte[] r2 = r9.b
            int r3 = r9.d
            if (r3 == 0) goto L80
            r9 = 1
            if (r3 == r9) goto L76
            r4 = 23
            r5 = 2
            java.lang.String r6 = "array too small: %s < %s"
            r7 = 4
            r8 = 0
            if (r3 == r4) goto L57
            r4 = 67
            if (r3 == r4) goto L3c
            r9 = 75
            if (r3 == r9) goto L30
            r9 = 78
            if (r3 != r9) goto Lad
            g1g r9 = new g1g
            r9.<init>(r2)
            long r2 = r9.G()
            java.lang.String r9 = java.lang.String.valueOf(r2)
            goto Lb9
        L30:
            r9 = r2[r8]
            int r9 = java.lang.Byte.toUnsignedInt(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            goto Lb9
        L3c:
            int r3 = r2.length
            if (r3 < r7) goto L41
            r3 = r9
            goto L42
        L41:
            r3 = r8
        L42:
            int r4 = r2.length
            defpackage.z4o.s(r4, r7, r6, r3)
            r3 = r2[r8]
            r9 = r2[r9]
            r4 = r2[r5]
            r0 = r2[r0]
            int r9 = defpackage.sgb.C(r3, r9, r4, r0)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            goto Lb9
        L57:
            int r3 = r2.length
            if (r3 < r7) goto L5c
            r3 = r9
            goto L5d
        L5c:
            r3 = r8
        L5d:
            int r4 = r2.length
            defpackage.z4o.s(r4, r7, r6, r3)
            r3 = r2[r8]
            r9 = r2[r9]
            r4 = r2[r5]
            r0 = r2[r0]
            int r9 = defpackage.sgb.C(r3, r9, r4, r0)
            float r9 = java.lang.Float.intBitsToFloat(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            goto Lb9
        L76:
            java.lang.String r9 = defpackage.tym.a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r9.<init>(r2, r0)
            goto Lb9
        L80:
            java.lang.String r3 = "auxiliary.tracks.map"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto Lad
            java.util.ArrayList r9 = r9.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "track types = "
            r2.append(r3)
            r40 r3 = new r40
            r4 = 44
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4, r0)
            java.util.Iterator r9 = r9.iterator()
            r3.a(r2, r9)
            java.lang.String r9 = r2.toString()
            goto Lb9
        Lad:
            java.lang.String r9 = defpackage.tym.a
            j63 r9 = n63.c
            n63 r9 = r9.g()
            java.lang.String r9 = r9.c(r2)
        Lb9:
            java.lang.String r0 = "mdta: key="
            java.lang.String r2 = ", value="
            java.lang.String r9 = defpackage.p3p.w(r0, r1, r2, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofd.toString():java.lang.String");
    }
}
