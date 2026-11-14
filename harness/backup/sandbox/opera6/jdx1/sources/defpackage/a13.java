package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a13 implements h28 {
    public final /* synthetic */ byte c = 0;
    public final HashMap d = new HashMap();
    public final h28 e;
    public final Object f;

    public a13(a13 a13Var, v3n v3nVar) {
        this.e = a13Var;
        this.f = v3nVar;
    }

    public a13(h28 h28Var, ip7 ip7Var) {
        this.e = h28Var;
        this.f = ip7Var;
    }

    public a13(h28 h28Var, ygh yghVar) {
        this.e = h28Var;
        this.f = yghVar;
    }

    @Override // defpackage.h28
    public final boolean a(int i) {
        byte b = this.c;
        h28 h28Var = this.e;
        switch (b) {
            case 0:
                if (!((a13) h28Var).a(i) || c(i) == null) {
                    break;
                }
                break;
            case 1:
                if (!h28Var.a(i) || d(i) == null) {
                    break;
                }
                break;
            default:
                if (!h28Var.a(i) || e(i) == null) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.h28
    public final j28 b(int i) {
        switch (this.c) {
            case 0:
                return c(i);
            case 1:
                return d(i);
            default:
                return e(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j28 c(int r24) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a13.c(int):j28");
    }

    public final j28 d(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.d;
        if (map.containsKey(numValueOf)) {
            return (j28) map.get(Integer.valueOf(i));
        }
        h28 h28Var = this.e;
        gn2 gn2VarE = null;
        if (h28Var.a(i)) {
            j28 j28VarB = h28Var.b(i);
            ip7 ip7Var = (ip7) this.f;
            if (j28VarB != null) {
                ArrayList arrayList = new ArrayList();
                for (hn2 hn2Var : j28VarB.b()) {
                    if (op7.a(hn2Var, ip7Var)) {
                        arrayList.add(hn2Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    gn2VarE = gn2.e(j28VarB.d(), arrayList, j28VarB.a(), j28VarB.c());
                }
            }
            map.put(Integer.valueOf(i), gn2VarE);
        }
        return gn2VarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j28 e(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r3 = r0.d
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L1b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r3.get(r0)
            j28 r0 = (defpackage.j28) r0
            return r0
        L1b:
            h28 r2 = r0.e
            boolean r4 = r2.a(r1)
            if (r4 == 0) goto Lc8
            j28 r2 = r2.b(r1)
            java.util.Objects.requireNonNull(r2)
            java.lang.Object r0 = r0.f
            ygh r0 = (defpackage.ygh) r0
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r4 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r0 = r0.c(r4)
            int r4 = r0.size()
            r6 = 0
        L39:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r0.get(r6)
            int r6 = r6 + 1
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r7 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r7
            if (r7 == 0) goto L39
            r0 = 4
            if (r1 == r0) goto L62
            r0 = 5
            if (r1 == r0) goto L58
            r0 = 6
            if (r1 != r0) goto L6c
            android.util.Size r0 = new android.util.Size
            r4 = 1440(0x5a0, float:2.018E-42)
            r6 = 1080(0x438, float:1.513E-42)
            r0.<init>(r4, r6)
            goto L6d
        L58:
            android.util.Size r0 = new android.util.Size
            r4 = 960(0x3c0, float:1.345E-42)
            r6 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r4, r6)
            goto L6d
        L62:
            android.util.Size r0 = new android.util.Size
            r4 = 640(0x280, float:8.97E-43)
            r6 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r4, r6)
            goto L6d
        L6c:
            r0 = 0
        L6d:
            if (r0 != 0) goto L71
            r5 = r2
            goto Lc9
        L71:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r6 = r2.b()
            java.util.Iterator r6 = r6.iterator()
        L7e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb1
            java.lang.Object r7 = r6.next()
            hn2 r7 = (defpackage.hn2) r7
            int r9 = r7.a
            java.lang.String r10 = r7.b
            int r11 = r7.c
            int r12 = r7.d
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            int r15 = r7.g
            int r8 = r7.h
            int r5 = r7.i
            int r7 = r7.j
            r16 = r8
            hn2 r8 = new hn2
            r17 = r5
            r18 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r8)
            goto L7e
        Lb1:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lc8
            int r0 = r2.a()
            int r5 = r2.c()
            java.util.List r2 = r2.d()
            gn2 r5 = defpackage.gn2.e(r2, r4, r0, r5)
            goto Lc9
        Lc8:
            r5 = 0
        Lc9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a13.e(int):j28");
    }
}
