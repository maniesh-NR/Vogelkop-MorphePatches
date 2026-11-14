package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t3j extends p3j {
    public final l5b j = new l5b();
    public boolean k = true;
    public final StringBuilder l = new StringBuilder();
    public boolean m = false;
    public final ArrayList n = new ArrayList();

    public final void a(u3j u3jVar) {
        pyl pylVar = this.b;
        HashSet hashSet = (HashSet) pylVar.c;
        ai4 ai4Var = u3jVar.g;
        wrf wrfVar = ai4Var.b;
        int i = ai4Var.c;
        if (i != -1) {
            this.m = true;
            int i2 = pylVar.b;
            List list = u3j.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            pylVar.b = i;
        }
        Range rangeA = ai4Var.a();
        Range range = to2.h;
        boolean zEquals = rangeA.equals(range);
        StringBuilder sb = this.l;
        if (!zEquals) {
            fee feeVar = (fee) pylVar.d;
            an2 an2Var = ai4.h;
            boolean zEquals2 = ((Range) feeVar.b(an2Var, range)).equals(range);
            fee feeVar2 = (fee) pylVar.d;
            if (zEquals2) {
                feeVar2.s(an2Var, rangeA);
            } else if (!((Range) feeVar2.b(an2Var, range)).equals(rangeA)) {
                this.k = false;
                sb.append("Different ExpectedFrameRateRange values; current = " + ((Range) ((fee) pylVar.d).b(an2Var, range)) + ", new = " + rangeA);
            }
        }
        an2 an2Var2 = qsm.Tp;
        Integer num = (Integer) wrfVar.b(an2Var2, 0);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0 && iIntValue != 0) {
            ((fee) pylVar.d).s(an2Var2, num);
        }
        an2 an2Var3 = qsm.Up;
        Integer num2 = (Integer) wrfVar.b(an2Var3, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        if (iIntValue2 != 0 && iIntValue2 != 0) {
            ((fee) pylVar.d).s(an2Var3, num2);
        }
        ((bfe) pylVar.f).a.putAll((Map) ai4Var.e.a);
        this.c.addAll(u3jVar.c);
        this.d.addAll(u3jVar.d);
        pylVar.c(ai4Var.d);
        this.e.addAll(u3jVar.e);
        s3j s3jVar = u3jVar.f;
        if (s3jVar != null) {
            this.n.add(s3jVar);
        }
        InputConfiguration inputConfiguration = u3jVar.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = u3jVar.a;
        LinkedHashSet<po2> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(ai4Var.a));
        ArrayList arrayList2 = new ArrayList();
        for (po2 po2Var : linkedHashSet) {
            arrayList2.add(po2Var.a);
            Iterator it = po2Var.b.iterator();
            while (it.hasNext()) {
                arrayList2.add((g07) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = u3jVar.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        po2 po2Var2 = u3jVar.b;
        if (po2Var2 != null) {
            po2 po2Var3 = this.i;
            if (po2Var3 == po2Var2 || po2Var3 == null) {
                this.i = po2Var2;
            } else {
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        pylVar.f(wrfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u3j b() {
        /*
            r12 = this;
            boolean r0 = r12.k
            r1 = 0
            if (r0 == 0) goto Leb
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.LinkedHashSet r0 = r12.a
            r3.<init>(r0)
            l5b r0 = r12.j
            boolean r2 = r0.b
            if (r2 == 0) goto L1a
            omj r2 = new omj
            r2.<init>(r0)
            java.util.Collections.sort(r3, r2)
        L1a:
            int r0 = r12.h
            r2 = 2
            pyl r4 = r12.b
            r5 = 1
            if (r0 != r5) goto Lb7
            int r0 = r3.size()
            if (r0 != r2) goto Lb7
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb7
            int r0 = r3.size()
            r5 = 0
        L33:
            if (r5 >= r0) goto Lb7
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            po2 r6 = (defpackage.po2) r6
            g07 r6 = r6.a
            java.lang.Class r6 = r6.j
            java.lang.Class<android.media.MediaCodec> r7 = android.media.MediaCodec.class
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r7)
            if (r6 == 0) goto L33
            java.lang.Object r0 = r4.c
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L6c
            java.util.Iterator r0 = r0.iterator()
        L57:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r0.next()
            g07 r5 = (defpackage.g07) r5
            java.lang.Class r5 = r5.j
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r5, r7)
            if (r5 == 0) goto L57
            goto Lb7
        L6c:
            java.lang.Object r0 = r4.d
            fee r0 = (defpackage.fee) r0
            an2 r5 = defpackage.ai4.h
            android.util.Range r6 = defpackage.to2.h
            java.lang.Object r0 = r0.b(r5, r6)
            android.util.Range r0 = (android.util.Range) r0
            if (r0 == 0) goto Lb7
            java.lang.Comparable r6 = r0.getUpper()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r7 = 120(0x78, float:1.68E-43)
            if (r6 < r7) goto L98
            java.lang.Comparable r6 = r0.getLower()
            java.lang.Comparable r7 = r0.getUpper()
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r7)
            if (r6 != 0) goto L99
        L98:
            r0 = r1
        L99:
            if (r0 == 0) goto Lb7
            android.util.Range r6 = new android.util.Range
            r7 = 30
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Comparable r8 = r0.getUpper()
            r6.<init>(r7, r8)
            r0.toString()
            r6.toString()
            java.lang.Object r0 = r4.d
            fee r0 = (defpackage.fee) r0
            r0.s(r5, r6)
        Lb7:
            java.util.ArrayList r0 = r12.n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc4
            awa r1 = new awa
            r1.<init>(r12, r2)
        Lc4:
            r8 = r1
            u3j r2 = new u3j
            r0 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList r1 = r12.c
            r4.<init>(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList r1 = r12.d
            r5.<init>(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList r1 = r12.e
            r6.<init>(r1)
            ai4 r7 = r0.j()
            android.hardware.camera2.params.InputConfiguration r9 = r12.g
            int r10 = r12.h
            po2 r11 = r12.i
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        Leb:
            java.lang.String r12 = "Unsupported session configuration combination"
            qp2.o(r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3j.b():u3j");
    }

    public final boolean c() {
        return this.m && this.k;
    }
}
