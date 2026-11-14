package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z6c implements vji, sji {
    public final wji a;
    public final uji b;
    public final tee c;

    public z6c(vji vjiVar, Map map, uji ujiVar) {
        nna nnaVar = new nna(vjiVar, (byte) 18);
        hp7 hp7Var = xji.a;
        this.a = new wji(map, nnaVar);
        this.b = ujiVar;
        tee teeVar = jmi.a;
        this.c = new tee();
    }

    @Override // defpackage.vji
    public final p8f a(String str, Function0 function0) {
        return this.a.a(str, function0);
    }

    @Override // defpackage.sji
    public final void b(Object obj, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-858296452);
        if ((i & 6) == 0) {
            i2 = (vt9Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(this) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            this.b.b(obj, ue5Var, vt9Var, i2 & 126);
            boolean zH = vt9Var.h(this) | vt9Var.h(obj);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new ry7(this, obj, (byte) 22);
                vt9Var.g0(objK);
            }
            rm5.b(obj, (Function1) objK, vt9Var);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(this, obj, ue5Var, i, (byte) 9);
        }
    }

    @Override // defpackage.vji
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // defpackage.vji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            r14 = this;
            tee r0 = r14.c
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            uji r11 = r14.b
            r11.a(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            wji r14 = r14.a
            java.util.Map r14 = r14.d()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6c.d():java.util.Map");
    }

    @Override // defpackage.vji
    public final Object e(String str) {
        return this.a.e(str);
    }
}
