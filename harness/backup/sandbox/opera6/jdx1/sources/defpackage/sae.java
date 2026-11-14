package defpackage;

import android.view.ViewConfiguration;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class sae extends zm9 {
    public final u59 f;
    public final p04 g;
    public d3k h;

    public sae(spi spiVar, u59 u59Var, te5 te5Var, n27 n27Var) {
        super(spiVar, te5Var, n27Var);
        this.f = u59Var;
        this.g = xf8.h(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.sae r7, defpackage.pqh r8, defpackage.mqh r9, defpackage.spi r10, defpackage.pqh r11, long r12, nt5 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.rae
            if (r0 == 0) goto L13
            r0 = r14
            rae r0 = (defpackage.rae) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            rae r0 = new rae
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.y
            px5 r1 = px5.a
            int r2 = r0.z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            pqh r11 = r0.x
            spi r10 = r0.w
            mqh r9 = r0.v
            pqh r8 = r0.u
            sae r7 = r0.t
            defpackage.ybh.y(r14)
            goto L5e
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L38:
            defpackage.ybh.y(r14)
            r5 = 0
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 >= 0) goto L44
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L44:
            agb r14 = new agb
            r2 = 9
            r14.<init>(r2, r3, r7)
            r0.t = r7
            r0.u = r8
            r0.v = r9
            r0.w = r10
            r0.x = r11
            r0.z = r4
            java.lang.Object r14 = uyg.w(r12, r14, r0)
            if (r14 != r1) goto L5e
            return r1
        L5e:
            oae r14 = (defpackage.oae) r14
            if (r14 == 0) goto Lb5
            long r12 = r14.b
            long r0 = r14.a
            java.lang.Object r14 = r8.a
            oae r14 = (defpackage.oae) r14
            r14.getClass()
            oae r14 = new oae
            r14.<init>(r0, r12)
            r8.a = r14
            long r2 = r10.f(r0)
            float r8 = r10.j(r2)
            r9.a = r8
            r8 = 30
            r10 = 0
            xe1 r8 = defpackage.cs5.a(r8, r10, r10)
            r11.a = r8
            java.lang.Object r7 = r7.e
            pad r7 = (defpackage.pad) r7
            java.lang.Object r8 = r7.b
            k1n r8 = (defpackage.k1n) r8
            r10 = 32
            long r10 = r0 >> r10
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r8.a(r12, r10)
            java.lang.Object r7 = r7.c
            k1n r7 = (defpackage.k1n) r7
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r10
            int r8 = (int) r0
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r7.a(r12, r8)
            float r7 = r9.a
            boolean r7 = defpackage.p37.T(r7)
            r7 = r7 ^ r4
            goto Lb6
        Lb5:
            r7 = 0
        Lb6:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sae.h(sae, pqh, mqh, spi, pqh, long, nt5):java.lang.Object");
    }

    public static oae j(p04 p04Var) {
        oae oaeVar = null;
        k1j k1jVarA = t1j.a(new d((byte) 2, (mt5) null, new nae(p04Var, (byte) 0)));
        while (k1jVarA.hasNext()) {
            oae oaeVarA = (oae) k1jVarA.next();
            if (oaeVar != null) {
                oaeVarA = oaeVar.a(oaeVarA);
            }
            oaeVar = oaeVarA;
        }
        return oaeVar;
    }

    public final float f(qpi qpiVar, float f) {
        spi spiVar = (spi) ((zm9) this).b;
        long jI = spiVar.i(spiVar.e(f));
        spi spiVar2 = qpiVar.a;
        return spiVar.h(spiVar.f(spiVar2.d(spiVar2.k, jI, 1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x015b, code lost:
    
        if (r0.invoke(r1, r10) == r11) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.spi r21, defpackage.oae r22, float r23, float r24, nt5 r25) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sae.g(spi, oae, float, float, nt5):java.lang.Object");
    }

    public final boolean i(fmg fmgVar) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.b;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = fmgVar.a;
        y8f y8fVar = new y8f(0L);
        int size = list.size();
        boolean zD = false;
        int i = 0;
        while (true) {
            j = y8fVar.a;
            if (i >= size) {
                break;
            }
            y8fVar = new y8f(y8f.e(j, ((lmg) list.get(i)).j));
            i++;
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        spi spiVar = (spi) ((zm9) this).b;
        float fJ = spiVar.j(spiVar.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            kpi kpiVar = spiVar.a;
            zD = fJ > 0.0f ? kpiVar.d() : kpiVar.c();
        }
        if (zD) {
            return !(this.g.b(new oae(jFloatToRawIntBits, ((lmg) CollectionsKt.K(fmgVar.a)).b)) instanceof ns4);
        }
        return ((zm9) this).a;
    }
}
