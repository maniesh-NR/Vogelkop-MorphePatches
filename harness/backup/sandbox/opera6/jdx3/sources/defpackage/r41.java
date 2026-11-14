package defpackage;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import org.jetbrains.compose.resources.AndroidContextProvider;

/* loaded from: classes.dex */
public abstract class r41 {
    public static final void a(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1587247798);
        if (!vt9Var.N(i & 1, i != 0)) {
            vt9Var.Q();
        } else if (((Boolean) vt9Var.j(cab.a)).booleanValue()) {
            vt9Var.W(-1890697985);
            Context context = AndroidContextProvider.a;
            AndroidContextProvider.a = (Context) vt9Var.j(j41.b);
            vt9Var.p(false);
        } else {
            vt9Var.W(-1890623988);
            vt9Var.p(false);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ve5((byte) 14, i);
        }
    }

    public static final Context b() {
        return InstrumentationRegistry.getInstrumentation().getContext();
    }
}
