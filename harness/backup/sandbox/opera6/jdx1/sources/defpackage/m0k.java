package defpackage;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class m0k {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final wi6 a(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        n27 n27Var = (n27) vt9Var.j(mi5.h);
        boolean zC = vt9Var.c(n27Var.b());
        Object objK = vt9Var.K();
        if (zC || objK == hh5.a) {
            objK = new wi6(new oji(n27Var));
            vt9Var.g0(objK);
        }
        return (wi6) objK;
    }
}
