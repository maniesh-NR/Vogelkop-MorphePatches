package defpackage;

import android.text.Layout;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class do3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ do3(long j, Serializable serializable, Serializable serializable2, Serializable serializable3, byte b) {
        this.a = b;
        this.b = j;
        this.c = serializable;
        this.d = serializable2;
        this.e = serializable3;
    }

    public /* synthetic */ do3(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public final Object invoke(Object obj) throws Throwable {
        long j;
        int i;
        boolean z;
        float fA;
        float fA2;
        long j2;
        byte b = this.a;
        long j3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                voh vohVar = (voh) obj4;
                pqh pqhVar = (pqh) obj3;
                long j4 = this.b;
                kh3 kh3Var = (kh3) obj2;
                o3c o3cVar = (o3c) obj;
                o3cVar.a();
                float f = vohVar.a;
                float f2 = vohVar.b;
                uh4 uh4Var = o3cVar.a;
                ((wth) uh4Var.b.a).P(f, f2);
                try {
                    mk7.e0(o3cVar, (j71) pqhVar.a, 0L, j4, 0L, 0.0f, kh3Var, 0, 890);
                    ((wth) uh4Var.b.a).P(-f, -f2);
                    return Unit.a;
                } catch (Throwable th) {
                    ((wth) uh4Var.b.a).P(-f, -f2);
                    throw th;
                }
            case 1:
                float[] fArr = (float[]) obj4;
                nqh nqhVar = (nqh) obj3;
                mqh mqhVar = (mqh) obj2;
                tzf tzfVar = (tzf) obj;
                int i2 = tzfVar.b;
                y81 y81Var = tzfVar.a;
                int iE = tzfVar.c;
                int iF = i2 > xjl.f(j3) ? tzfVar.b : xjl.f(j3);
                if (iE >= xjl.e(j3)) {
                    iE = xjl.e(j3);
                }
                long jC = upj.c(tzfVar.b(iF), tzfVar.b(iE));
                int i3 = nqhVar.a;
                ljl ljlVar = y81Var.d;
                int iF2 = xjl.f(jC);
                int iE2 = xjl.e(jC);
                Layout layout = ljlVar.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    b8b.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    b8b.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    b8b.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    b8b.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i3 < ((iE2 - iF2) << 2)) {
                    b8b.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG = ljlVar.g(iF2);
                int iG2 = ljlVar.g(iE2 - 1);
                nga ngaVar = new nga(ljlVar);
                if (iG <= iG2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG);
                        int iF3 = ljlVar.f(iG);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fI = ljlVar.i(iG);
                        float fE = ljlVar.e(iG);
                        j = jC;
                        boolean z2 = layout.getParagraphDirection(iG) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            boolean z3 = z2;
                            if (!z2) {
                                i = iMin;
                                z = false;
                                if (zIsRtlCharAt) {
                                    fA = ngaVar.a(false, false, true, iMax);
                                    fA2 = ngaVar.a(true, true, true, iMax + 1);
                                } else {
                                    fA2 = ngaVar.a(z, z, z, iMax);
                                    fA = ngaVar.a(true, true, z, iMax + 1);
                                }
                            } else if (!zIsRtlCharAt) {
                                fA2 = ngaVar.a(false, false, true, iMax);
                                i = iMin;
                                fA = ngaVar.a(true, true, true, iMax + 1);
                            } else if (zIsRtlCharAt) {
                                float fA3 = ngaVar.a(false, false, false, iMax);
                                i = iMin;
                                fA2 = ngaVar.a(true, true, false, iMax + 1);
                                fA = fA3;
                            } else {
                                i = iMin;
                                z = false;
                                fA2 = ngaVar.a(z, z, z, iMax);
                                fA = ngaVar.a(true, true, z, iMax + 1);
                            }
                            fArr[i3] = fA2;
                            fArr[i3 + 1] = fI;
                            fArr[i3 + 2] = fA;
                            fArr[i3 + 3] = fE;
                            i3 += 4;
                            iMax++;
                            z2 = z3;
                            iMin = i;
                        }
                        if (iG != iG2) {
                            iG++;
                            jC = j;
                        }
                    }
                } else {
                    j = jC;
                }
                int iD = nqhVar.a + (xjl.d(j) << 2);
                for (int i4 = nqhVar.a; i4 < iD; i4 += 4) {
                    int i5 = i4 + 1;
                    float f3 = fArr[i5];
                    float f4 = mqhVar.a;
                    fArr[i5] = f3 + f4;
                    int i6 = i4 + 3;
                    fArr[i6] = fArr[i6] + f4;
                }
                nqhVar.a = iD;
                mqhVar.a += y81Var.f;
                return Unit.a;
            case 2:
                long j5 = this.b;
                d91 d91Var = (d91) obj2;
                mk7 mk7Var = (mk7) obj;
                float fInvoke = ((u89) obj4).invoke();
                float fMax = (Math.max(Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fB = djh.b(Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fB - (((float) Math.pow(fB, 2.0d)) / 4.0f))) * 0.5f;
                float f5 = fPow * 360.0f;
                float f6 = ((0.8f * fMax) + fPow) * 360.0f;
                float fMin = Math.min(1.0f, fMax);
                f82 f82Var = new f82();
                f82Var.a = f6;
                f82Var.b = fMin;
                float fFloatValue = ((Number) ((iak) obj3).getValue()).floatValue();
                long jW0 = mk7Var.w0();
                d5o d5oVarS0 = mk7Var.s0();
                long jD = d5oVarS0.D();
                d5oVarS0.A().j();
                try {
                    ((wth) d5oVarS0.a).M(jW0, fPow);
                    float fO0 = (mk7Var.o0(2.5f) / 2.0f) + mk7Var.o0(5.5f);
                    long jO = mfh.o(mk7Var.e());
                    int i7 = (int) (jO >> 32);
                    int i8 = (int) (jO & 4294967295L);
                    voh vohVar2 = new voh(Float.intBitsToFloat(i7) - fO0, Float.intBitsToFloat(i8) - fO0, Float.intBitsToFloat(i7) + fO0, Float.intBitsToFloat(i8) + fO0);
                    try {
                        mk7.s(mk7Var, j5, f5, f6 - f5, vohVar2.d(), vohVar2.c(), fFloatValue, new qik(0, 0, mk7Var.o0(2.5f), 0.0f, 26), 768);
                        j2 = jD;
                        try {
                            lah.j(mk7Var, d91Var, vohVar2, j5, fFloatValue, f82Var);
                            am2.w(d5oVarS0, j2);
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            am2.w(d5oVarS0, j2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        j2 = jD;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j2 = jD;
                }
            default:
                wa1 wa1Var = (wa1) obj;
                wa1Var.x(0, Long.valueOf(j3));
                wa1Var.w(1, (String) obj4);
                wa1Var.x(2, (Long) obj3);
                wa1Var.w(3, (String) obj2);
                return Unit.a;
        }
    }
}
