package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public interface yb4 {
    default void a(xg8 xg8Var) {
        int i;
        ArrayList arrayList = xg8Var.a;
        int iC = c();
        if (iC == 1) {
            return;
        }
        int iA = vep.A(iC);
        if (iA == 1) {
            i = 32;
        } else if (iA == 2) {
            i = 0;
        } else {
            if (iA != 3) {
                if (iC != 1 && iC != 2 && iC != 3 && iC != 4) {
                    throw null;
                }
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            xg8Var.c("LightSource", String.valueOf(4), arrayList);
        }
        xg8Var.c("Flash", String.valueOf(i), arrayList);
    }

    int c();

    hbl d();

    long e();

    vb4 p();

    wb4 q();

    ub4 t();
}
