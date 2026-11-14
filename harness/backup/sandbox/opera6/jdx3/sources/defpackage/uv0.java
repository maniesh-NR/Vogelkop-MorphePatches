package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.List;

/* loaded from: classes.dex */
public final class uv0 {
    public final SettingsManager a;
    public final x5f b;
    public final x5f c;
    public final wth d;
    public final et3 e;

    public uv0(SettingsManager settingsManager, x5f x5fVar, x5f x5fVar2, wth wthVar, et3 et3Var) {
        this.a = settingsManager;
        this.b = x5fVar;
        this.c = x5fVar2;
        this.d = wthVar;
        this.e = et3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.uv0 r2, java.lang.String r3, int r4, defpackage.b2l r5, boolean r6, boolean r7, defpackage.oc2 r8, int r9) {
        /*
            r0 = r9 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r9 = r9 & 32
            if (r9 == 0) goto Lb
            r8 = r1
        Lb:
            r9 = 2
            r0 = 1
            if (r7 == 0) goto L14
            r2.getClass()
        L12:
            r2 = r9
            goto L27
        L14:
            com.opera.android.settings.SettingsManager r2 = r2.a
            q7j r2 = r2.C()
            int r2 = r2.ordinal()
            if (r2 == 0) goto L26
            if (r2 == r0) goto L12
            h9o.p()
            return
        L26:
            r2 = r0
        L27:
            lqm r7 = defpackage.lqm.y
            r1 = 0
            vx3 r3 = defpackage.ay3.a(r3, r7, r1)
            r3.c(r0)
            r3.f = r6
            r3.c = r4
            r3.d = r2
            int r4 = vep.A(r2)
            if (r4 == 0) goto L48
            if (r4 == r0) goto L45
            if (r4 == r9) goto L45
            h9o.p()
            return
        L45:
            n3l r4 = defpackage.n3l.d
            goto L4a
        L48:
            n3l r4 = defpackage.n3l.e
        L4a:
            r3.e = r4
            if (r5 == 0) goto L55
            tv0 r4 = new tv0
            r4.<init>(r5, r1)
            r3.k = r4
        L55:
            if (r2 == r0) goto L5c
            if (r8 == 0) goto L5c
            r8.invoke()
        L5c:
            am2.v(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv0.b(uv0, java.lang.String, int, b2l, boolean, boolean, oc2, int):void");
    }

    public final void a(int i, int i2, String str, boolean z) {
        et3 et3Var = this.e;
        if (i2 == 1) {
            eri eriVar = (eri) et3Var.invoke();
            q6e q6eVar = eti.a;
            boolean z2 = eriVar == null ? false : eriVar instanceof f1a;
            String strL = eriVar.l();
            n60 n60Var = new n60(2443, -1, 3);
            n60Var.e(0);
            n60Var.r(1, 1, !z2);
            this.c.v(strL, n60Var);
        }
        this.d.K(str, 3, z, i, false, (eri) et3Var.invoke());
    }

    public final void c(List list, int i, String str, boolean z, b2l b2lVar) {
        int i2;
        int iA;
        if (list.isEmpty()) {
            return;
        }
        if (z) {
            i2 = 2;
        } else {
            int iOrdinal = this.a.C().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                i2 = 2;
            } else {
                i2 = 1;
            }
        }
        vx3 vx3Var = new vx3(lqm.y);
        boolean z2 = false;
        list.forEach(new ux3(vx3Var, false));
        vx3Var.c(true);
        vx3Var.f = false;
        vx3Var.c = i;
        if (list.size() > 1 || (iA = vep.A(i2)) == 0) {
            z2 = true;
        } else if (iA != 1 && iA != 2) {
            h9o.p();
            return;
        }
        vx3Var.e = new n3l(z2, true, 31);
        vx3Var.i = new v4l(str, true, true);
        vx3Var.d = i2;
        if (b2lVar != null) {
            vx3Var.k = new tv0(b2lVar, (byte) 1);
        }
        am2.v(vx3Var);
        this.b.S(30);
    }
}
