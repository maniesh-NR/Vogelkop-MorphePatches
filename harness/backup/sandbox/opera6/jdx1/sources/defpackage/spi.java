package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class spi {
    public kpi a;
    public v51 b;
    public h89 c;
    public fsf d;
    public boolean e;
    public s9i f;
    public final jpi g;
    public final hpi h;
    public boolean i;
    public byte j = 1;
    public toi k = epi.a;
    public final qpi l = new qpi(this);
    public final tji m = new tji(this, (byte) 3);

    public spi(kpi kpiVar, v51 v51Var, h89 h89Var, fsf fsfVar, boolean z, s9i s9iVar, jpi jpiVar, hpi hpiVar) {
        this.a = kpiVar;
        this.b = v51Var;
        this.c = h89Var;
        this.d = fsfVar;
        this.e = z;
        this.f = s9iVar;
        this.g = jpiVar;
        this.h = hpiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, nt5 r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.npi
            if (r0 == 0) goto L13
            r0 = r14
            npi r0 = (defpackage.npi) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            npi r0 = new npi
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            oqh r12 = r0.t
            defpackage.ybh.y(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            r11 = 0
            return r11
        L36:
            defpackage.ybh.y(r14)
            oqh r7 = new oqh
            r7.<init>()
            r7.a = r12
            r11.i = r4
            gfe r14 = defpackage.gfe.a     // Catch: java.lang.Throwable -> L65
            ppi r5 = new ppi     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L62
            r0.t = r7     // Catch: java.lang.Throwable -> L62
            r0.w = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r11 = r6.g(r14, r5, r0)     // Catch: java.lang.Throwable -> L62
            if (r11 != r1) goto L57
            return r1
        L57:
            r12 = r7
        L58:
            r6.i = r3
            long r11 = r12.a
            i1n r13 = new i1n
            r13.<init>(r11)
            return r13
        L62:
            r0 = move-exception
        L63:
            r12 = r0
            goto L68
        L65:
            r0 = move-exception
            r6 = r11
            goto L63
        L68:
            r6.i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spi.a(long, nt5):java.lang.Object");
    }

    public final boolean b() {
        v51 v51Var;
        return this.a.d() || this.a.c() || ((v51Var = this.b) != null && v51Var.e());
    }

    public final Object c(long j, boolean z, kuk kukVar) {
        if (z) {
            h89 h89Var = this.c;
            cpi cpiVar = epi.a;
            if (h89Var instanceof sp6) {
                return Unit.a;
            }
        }
        long jA = i1n.a(j, 0.0f, 0.0f, this.d == fsf.b ? 1 : 2);
        rpi rpiVar = new rpi(this, null);
        v51 v51Var = this.b;
        if (v51Var != null && b()) {
            Object objB = v51Var.b(jA, rpiVar, kukVar);
            return objB == px5.a ? objB : Unit.a;
        }
        rpi rpiVar2 = new rpi(this, kukVar);
        rpiVar2.v = jA;
        Unit unit = Unit.a;
        Object objInvokeSuspend = rpiVar2.invokeSuspend(unit);
        return objInvokeSuspend == px5.a ? objInvokeSuspend : unit;
    }

    public final long d(toi toiVar, long j, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        hle hleVar = (hle) this.f.b;
        hle hleVarU0 = hleVar != null ? hleVar.U0() : null;
        long jV = hleVarU0 != null ? hleVarU0.v(i, j) : 0L;
        long jD = y8f.d(j, jV);
        long jF = f(i(toiVar.a(h(f(this.d == fsf.b ? y8f.a(jD, 1, 0.0f) : y8f.a(jD, 2, 0.0f))))));
        jpi jpiVar = this.g;
        if (jpiVar.n) {
            ViewTreeObserver viewTreeObserver = ui6.f0(jpiVar).getViewTreeObserver();
            try {
                Method declaredMethod = v31.L0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    v31.L0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jD2 = y8f.d(jD, jF);
        hle hleVar2 = (hle) this.f.b;
        hle hleVarU02 = hleVar2 != null ? hleVar2.U0() : null;
        return y8f.e(y8f.e(jV, jF), hleVarU02 != null ? hleVarU02.K(i, jF, jD2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? y8f.f(j, -1.0f) : j;
    }

    public final Object g(gfe gfeVar, Function2 function2, nt5 nt5Var) {
        Object objB = this.a.b(gfeVar, new mz9(this, function2, null, (byte) 22), nt5Var);
        return objB == px5.a ? objB : Unit.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == fsf.b ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.d == fsf.b ? Float.floatToRawIntBits(f) << 32 : Float.floatToRawIntBits(f) & 4294967295L;
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        fsf fsfVar = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (fsfVar == fsf.a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (fsfVar == fsf.b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
