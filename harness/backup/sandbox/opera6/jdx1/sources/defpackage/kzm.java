package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class kzm {
    public static final long a = ap5.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final opj a(kr5 kr5Var, ih5 ih5Var) {
        Object obj;
        boolean zEquals = kr5Var.equals(jr5.e);
        vt9 vt9Var = (vt9) ih5Var;
        boolean zG = vt9Var.g(zEquals);
        Object objK = vt9Var.K();
        if (zG || objK == hh5.a) {
            if (zEquals) {
                obj = opj.a;
            } else {
                cp5 cp5Var = new cp5();
                cp5Var.b = a;
                cp5Var.c = new ArrayList();
                obj = cp5Var;
            }
            objK = obj;
            vt9Var.g0(objK);
        }
        return (opj) objK;
    }

    public static final long b(long j) {
        return (zed.b(Float.intBitsToFloat((int) (j >> 32))) << 32) | (zed.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L);
    }

    public static void c(String str) {
        throw new IllegalArgumentException(p3p.w("Unsupported type: ", str, ". ", sko.k("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
