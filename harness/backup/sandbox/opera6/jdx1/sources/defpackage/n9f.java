package defpackage;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class n9f implements MediationAdRequest {
    public boolean a;
    public int b;
    public int c;
    public final Object d;
    public final Object e;

    public n9f() {
        this.d = new o9f();
        this.e = new g1g(new byte[65025], 0);
        this.b = -1;
    }

    public n9f(HashSet hashSet, boolean z, int i, int i2, String str) {
        this.d = hashSet;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.e = str;
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.c = 0;
        do {
            int i4 = this.c;
            int i5 = i + i4;
            o9f o9fVar = (o9f) this.d;
            if (i5 >= o9fVar.c) {
                break;
            }
            int[] iArr = o9fVar.f;
            this.c = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.lp6 r9) throws java.io.InterruptedIOException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            o9f r0 = (defpackage.o9f) r0
            java.lang.Object r1 = r8.e
            g1g r1 = (defpackage.g1g) r1
            r2 = 1
            r3 = 0
            if (r9 == 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r3
        Lf:
            defpackage.z4o.H(r4)
            boolean r4 = r8.a
            if (r4 == 0) goto L1b
            r8.a = r3
            r1.K(r3)
        L1b:
            boolean r4 = r8.a
            if (r4 != 0) goto L84
            int r4 = r8.b
            if (r4 >= 0) goto L4d
            r4 = -1
            boolean r4 = r0.b(r9, r4)
            if (r4 == 0) goto L7b
            boolean r4 = r0.a(r9, r2)
            if (r4 == 0) goto L7b
            int r4 = r0.d
            short r5 = r0.a
            r5 = r5 & r2
            if (r5 != r2) goto L44
            int r5 = r1.c
            if (r5 != 0) goto L44
            int r5 = r8.a(r3)
            int r4 = r4 + r5
            int r5 = r8.c
            goto L45
        L44:
            r5 = r3
        L45:
            r9.h(r4, r3)     // Catch: java.io.EOFException -> L4c
            r8.b = r5
            r4 = r5
            goto L4d
        L4c:
            return r3
        L4d:
            int r4 = r8.a(r4)
            int r5 = r8.b
            int r6 = r8.c
            int r5 = r5 + r6
            if (r4 <= 0) goto L7c
            int r6 = r1.c
            int r6 = r6 + r4
            r1.c(r6)
            byte[] r6 = r1.a
            int r7 = r1.c
            r9.readFully(r6, r7, r4, r3)     // Catch: java.io.EOFException -> L7b
            int r6 = r1.c
            int r6 = r6 + r4
            r1.M(r6)
            int[] r4 = r0.f
            int r6 = r5 + (-1)
            r4 = r4[r6]
            r6 = 255(0xff, float:3.57E-43)
            if (r4 == r6) goto L77
            r4 = r2
            goto L78
        L77:
            r4 = r3
        L78:
            r8.a = r4
            goto L7c
        L7b:
            return r3
        L7c:
            short r4 = r0.c
            if (r5 != r4) goto L81
            r5 = -1
        L81:
            r8.b = r5
            goto L1b
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9f.b(lp6):boolean");
    }

    public final Date getBirthday() {
        return null;
    }

    public final int getGender() {
        return 0;
    }

    public final Set getKeywords() {
        return (HashSet) this.d;
    }

    public final Location getLocation() {
        return null;
    }

    public final String getMaxAdContentRating() {
        return (String) this.e;
    }

    public final boolean isDesignedForFamilies() {
        return false;
    }

    public final boolean isTesting() {
        return this.a;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.b;
    }

    public final int taggedForUnderAgeTreatment() {
        return this.c;
    }
}
