package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class rnf {
    public static final u36 a = new u36(0.65f, 0.0f, 0.35f, 1.0f);

    public static final void a(final float f, final c8e c8eVar, final long j, final long j2, ih5 ih5Var, final int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-659600705);
        if ((i & 6) == 0) {
            i2 = (vt9Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.e(j) ? 256 : ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.e(j2) ? 2048 : 1024;
        }
        int i3 = i2;
        boolean z = true;
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            vt9Var.S();
            if ((i & 1) != 0 && !vt9Var.x()) {
                vt9Var.Q();
            }
            vt9Var.q();
            final iak iakVarB = md1.b(djh.b(f, 0.0f, 1.0f), rm5.X(700, 2, a), "paging-progress-bar", vt9Var, 3120, 20);
            boolean z2 = vt9Var.j(mi5.n) == d2c.b;
            c8e c8eVarI = mpj.i(c8eVar, 96.0f, 4.0f);
            boolean zF = ((((i3 & 896) ^ 384) > 256 && vt9Var.e(j)) || (i3 & 384) == 256) | vt9Var.f(iakVarB) | vt9Var.g(z2);
            if ((((i3 & 7168) ^ 3072) <= 2048 || !vt9Var.e(j2)) && (i3 & 3072) != 2048) {
                z = false;
            }
            boolean z3 = zF | z;
            Object objK = vt9Var.K();
            if (z3 || objK == hh5.a) {
                final boolean z4 = z2;
                Function1 function1 = new Function1() { // from class: onf
                    public final Object invoke(Object obj) {
                        mk7 mk7Var = (mk7) obj;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L)) / 2.0f) & 4294967295L);
                        mk7.O(mk7Var, j, 0L, 0L, jFloatToRawIntBits, (nk7) null, 246);
                        float fFloatValue = ((Number) iakVarB.getValue()).floatValue() * Float.intBitsToFloat((int) (mk7Var.e() >> 32));
                        mk7.O(mk7Var, j2, z4 ? Float.floatToRawIntBits(Float.intBitsToFloat((int) (mk7Var.e() >> 32)) - fFloatValue) << 32 : 0L, (Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L))) & 4294967295L), jFloatToRawIntBits, (nk7) null, 240);
                        return Unit.a;
                    }
                };
                vt9Var.g0(function1);
                objK = function1;
            }
            oup.H(c8eVarI, (Function1) objK, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: pnf
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rnf.a(f, c8eVar, j, j2, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, final c8e c8eVar, long j, long j2, ih5 ih5Var, final int i3) {
        final long j3;
        final long j4;
        int i4;
        long jC;
        long j5;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2050022281);
        int i5 = i3 | (vt9Var.d(i) ? 4 : 2) | (vt9Var.d(i2) ? 32 : 16) | (vt9Var.f(c8eVar) ? Constants.Crypt.KEY_LENGTH : ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) | 9216;
        if (vt9Var.N(i5 & 1, (i5 & 9363) != 9362)) {
            vt9Var.S();
            if ((i3 & 1) == 0 || vt9Var.x()) {
                unf unfVar = pof.a;
                i4 = i5 & (-64513);
                jC = pof.a(vt9Var).a.C();
                j5 = pof.a(vt9Var).a.j();
            } else {
                vt9Var.Q();
                i4 = i5 & (-64513);
                jC = j;
                j5 = j2;
            }
            vt9Var.q();
            a(i / i2, c8eVar, jC, j5, vt9Var, (i4 >> 3) & 8176);
            j3 = jC;
            j4 = j5;
        } else {
            vt9Var.Q();
            j3 = j;
            j4 = j2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(i, i2, c8eVar, j3, j4, i3) { // from class: qnf
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ c8e c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(1);
                    rnf.b(this.a, this.b, this.c, this.d, this.e, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }
}
