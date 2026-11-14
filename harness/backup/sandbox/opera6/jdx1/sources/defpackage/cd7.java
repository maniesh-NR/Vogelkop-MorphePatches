package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class cd7 implements j0n {
    public static final cd7 a = new cd7();
    public static final z8b b = z8b.G("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.j0n
    public final Object n(esb esbVar, float f) {
        esbVar.k();
        String strS = null;
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        float fQ4 = 0.0f;
        int iR = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zP = true;
        int i = 3;
        String strS2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (esbVar.o()) {
            switch (esbVar.E(b)) {
                case 0:
                    strS = esbVar.s();
                    break;
                case 1:
                    strS2 = esbVar.s();
                    break;
                case 2:
                    fQ = (float) esbVar.q();
                    break;
                case 3:
                    int iR2 = esbVar.r();
                    if (iR2 <= 2 && iR2 >= 0) {
                        i = vep.B(3)[iR2];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                    break;
                case 4:
                    iR = esbVar.r();
                    break;
                case 5:
                    fQ2 = (float) esbVar.q();
                    break;
                case 6:
                    fQ3 = (float) esbVar.q();
                    break;
                case 7:
                    iA = xsb.a(esbVar);
                    break;
                case 8:
                    iA2 = xsb.a(esbVar);
                    break;
                case 9:
                    fQ4 = (float) esbVar.q();
                    break;
                case 10:
                    zP = esbVar.p();
                    break;
                case 11:
                    esbVar.h();
                    pointF = new PointF(((float) esbVar.q()) * f, ((float) esbVar.q()) * f);
                    esbVar.l();
                    break;
                case 12:
                    esbVar.h();
                    pointF = pointF;
                    pointF2 = new PointF(((float) esbVar.q()) * f, ((float) esbVar.q()) * f);
                    esbVar.l();
                    break;
                default:
                    esbVar.G();
                    esbVar.H();
                    break;
            }
        }
        esbVar.m();
        bd7 bd7Var = new bd7();
        bd7Var.a = strS;
        bd7Var.b = strS2;
        bd7Var.c = fQ;
        bd7Var.d = i;
        bd7Var.e = iR;
        bd7Var.f = fQ2;
        bd7Var.g = fQ3;
        bd7Var.h = iA;
        bd7Var.i = iA2;
        bd7Var.j = fQ4;
        bd7Var.k = zP;
        bd7Var.l = pointF;
        bd7Var.m = pointF2;
        return bd7Var;
    }
}
