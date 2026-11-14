package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nsm {
    public final vsm a;
    public final fel b;
    public cd5 d;
    public boolean g;
    public wwh l;
    public y10 m;
    public v40 n;
    public gw2 o;
    public final Object c = new Object();
    public final bf2 e = c26.j(0);
    public final i72 f = new i72();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashSet j = new LinkedHashSet();
    public final LinkedHashSet k = new LinkedHashSet();
    public final jsm p = new jsm(this);
    public final bf2 q = c26.j(0);

    public nsm(vsm vsmVar, fel felVar) {
        this.a = vsmVar;
        this.b = felVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsm.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(qd4 qd4Var, Map map) {
        y10 y10VarZ;
        v40 v40Var;
        Object next;
        gw2 gw2Var = null;
        Object obj = map != null ? map.get(CaptureRequest.CONTROL_AE_MODE) : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            int iIntValue = num.intValue();
            List list = y10.b;
            y10VarZ = wxe.z(iIntValue);
        } else {
            y10VarZ = null;
        }
        Object obj2 = map != null ? map.get(CaptureRequest.CONTROL_AF_MODE) : null;
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it = v40.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((v40) next).a == iIntValue2) {
                        break;
                    }
                }
            }
            v40Var = (v40) next;
        } else {
            v40Var = null;
        }
        Object obj3 = map != null ? map.get(CaptureRequest.CONTROL_AWB_MODE) : null;
        Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            Iterator it2 = gw2.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((gw2) next2).a == iIntValue3) {
                    gw2Var = next2;
                    break;
                }
            }
            gw2Var = gw2Var;
        }
        gw2 gw2Var2 = gw2Var;
        boolean z = false;
        boolean z2 = (y10VarZ == null || y10VarZ.equals(this.m)) ? false : true;
        boolean z3 = (v40Var == null || v40Var.equals(this.n)) ? false : true;
        if (gw2Var2 != null && !gw2Var2.equals(this.o)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (gyg.G(3, "CXCP")) {
                Objects.toString(y10VarZ);
                Objects.toString(v40Var);
                Objects.toString(gw2Var2);
            }
            sc4.h(qd4Var, y10VarZ, v40Var, gw2Var2, null, null, null, 56);
            if (y10VarZ != null) {
                this.m = y10VarZ;
            }
            if (v40Var != null) {
                this.n = v40Var;
            }
            if (gw2Var2 != null) {
                this.o = gw2Var2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.LinkedHashMap r7, java.util.Map r8, java.util.LinkedHashSet r9, defpackage.wwh r10, java.util.Set r11, nt5 r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.msm
            if (r0 == 0) goto L13
            r0 = r12
            msm r0 = (defpackage.msm) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            msm r0 = new msm
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            pqh r6 = r0.t
            defpackage.ybh.y(r12)
            goto La5
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L31:
            pqh r12 = sko.f(r12)
            java.lang.Object r2 = r6.c
            monitor-enter(r2)
            java.lang.String r4 = "CXCP"
            r5 = 3
            boolean r4 = defpackage.gyg.G(r5, r4)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L4d
            java.util.Objects.toString(r7)     // Catch: java.lang.Throwable -> La8
            java.util.Objects.toString(r8)     // Catch: java.lang.Throwable -> La8
            java.util.Objects.toString(r9)     // Catch: java.lang.Throwable -> La8
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> La8
        L4d:
            if (r7 == 0) goto L59
            java.util.LinkedHashMap r4 = r6.h     // Catch: java.lang.Throwable -> La8
            r4.clear()     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashMap r4 = r6.h     // Catch: java.lang.Throwable -> La8
            r4.putAll(r7)     // Catch: java.lang.Throwable -> La8
        L59:
            if (r8 == 0) goto L65
            java.util.LinkedHashMap r7 = r6.i     // Catch: java.lang.Throwable -> La8
            r7.clear()     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashMap r7 = r6.i     // Catch: java.lang.Throwable -> La8
            r7.putAll(r8)     // Catch: java.lang.Throwable -> La8
        L65:
            if (r9 == 0) goto L71
            java.util.LinkedHashSet r7 = r6.j     // Catch: java.lang.Throwable -> La8
            r7.clear()     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashSet r7 = r6.j     // Catch: java.lang.Throwable -> La8
            r7.addAll(r9)     // Catch: java.lang.Throwable -> La8
        L71:
            if (r10 == 0) goto L75
            r6.l = r10     // Catch: java.lang.Throwable -> La8
        L75:
            if (r11 == 0) goto L83
            java.util.LinkedHashSet r7 = r6.k     // Catch: java.lang.Throwable -> La8
            r7.clear()     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashSet r7 = r6.k     // Catch: java.lang.Throwable -> La8
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.Throwable -> La8
            r7.addAll(r11)     // Catch: java.lang.Throwable -> La8
        L83:
            cd5 r7 = r6.d     // Catch: java.lang.Throwable -> La8
            if (r7 != 0) goto L8e
            cd5 r7 = new cd5     // Catch: java.lang.Throwable -> La8
            r7.<init>()     // Catch: java.lang.Throwable -> La8
            r6.d = r7     // Catch: java.lang.Throwable -> La8
        L8e:
            boolean r8 = r6.g     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto L94
            monitor-exit(r2)
            return r7
        L94:
            r6.g = r3     // Catch: java.lang.Throwable -> La8
            r12.a = r7     // Catch: java.lang.Throwable -> La8
            monitor-exit(r2)
            r0.t = r12
            r0.w = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto La4
            return r1
        La4:
            r6 = r12
        La5:
            java.lang.Object r6 = r6.a
            return r6
        La8:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsm.c(java.util.LinkedHashMap, java.util.Map, java.util.LinkedHashSet, wwh, java.util.Set, nt5):java.lang.Object");
    }
}
