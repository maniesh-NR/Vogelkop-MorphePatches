package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o0k extends a73 {
    public final PointF i;
    public final PointF j;
    public final t89 k;
    public final t89 l;
    public ua7 m;
    public ua7 n;

    public o0k(t89 t89Var, t89 t89Var2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = t89Var;
        this.l = t89Var2;
        i(this.d);
    }

    @Override // defpackage.a73
    public final Object e() {
        return k(0.0f);
    }

    @Override // defpackage.a73
    public final /* bridge */ /* synthetic */ Object f(zvb zvbVar, float f) {
        return k(f);
    }

    @Override // defpackage.a73
    public final void i(float f) {
        t89 t89Var = this.k;
        t89Var.i(f);
        t89 t89Var2 = this.l;
        t89Var2.i(f);
        this.i.set(((Float) t89Var.e()).floatValue(), ((Float) t89Var2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((x63) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF k(float r12) {
        /*
            r11 = this;
            ua7 r0 = r11.m
            r1 = 0
            if (r0 == 0) goto L36
            t89 r0 = r11.k
            y63 r2 = r0.c
            zvb r2 = r2.h()
            if (r2 == 0) goto L36
            float r10 = r0.c()
            java.lang.Float r0 = r2.h
            ua7 r3 = r11.m
            float r4 = r2.g
            if (r0 != 0) goto L1d
            r5 = r4
            goto L22
        L1d:
            float r0 = r0.floatValue()
            r5 = r0
        L22:
            java.lang.Object r0 = r2.b
            r6 = r0
            java.lang.Float r6 = (java.lang.Float) r6
            java.lang.Object r0 = r2.c
            r7 = r0
            java.lang.Float r7 = (java.lang.Float) r7
            r9 = r12
            r8 = r12
            java.lang.Object r12 = r3.z(r4, r5, r6, r7, r8, r9, r10)
            r7 = r8
            java.lang.Float r12 = (java.lang.Float) r12
            goto L38
        L36:
            r7 = r12
            r12 = r1
        L38:
            ua7 r0 = r11.n
            if (r0 == 0) goto L6c
            t89 r0 = r11.l
            y63 r2 = r0.c
            zvb r2 = r2.h()
            if (r2 == 0) goto L6c
            float r9 = r0.c()
            java.lang.Float r0 = r2.h
            r1 = r2
            ua7 r2 = r11.n
            float r3 = r1.g
            if (r0 != 0) goto L55
            r4 = r3
            goto L5a
        L55:
            float r0 = r0.floatValue()
            r4 = r0
        L5a:
            java.lang.Object r0 = r1.b
            r5 = r0
            java.lang.Float r5 = (java.lang.Float) r5
            java.lang.Object r0 = r1.c
            r6 = r0
            java.lang.Float r6 = (java.lang.Float) r6
            r8 = r7
            java.lang.Object r0 = r2.z(r3, r4, r5, r6, r7, r8, r9)
            r1 = r0
            java.lang.Float r1 = (java.lang.Float) r1
        L6c:
            r0 = 0
            android.graphics.PointF r2 = r11.i
            android.graphics.PointF r11 = r11.j
            if (r12 != 0) goto L79
            float r12 = r2.x
            r11.set(r12, r0)
            goto L80
        L79:
            float r12 = r12.floatValue()
            r11.set(r12, r0)
        L80:
            if (r1 != 0) goto L8a
            float r12 = r11.x
            float r0 = r2.y
            r11.set(r12, r0)
            return r11
        L8a:
            float r12 = r11.x
            float r0 = r1.floatValue()
            r11.set(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0k.k(float):android.graphics.PointF");
    }
}
