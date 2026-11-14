package defpackage;

import android.os.Build;
import java.util.Set;

/* loaded from: classes.dex */
public final class rx7 extends o0g {
    public final /* synthetic */ sx7 i;

    public rx7(sx7 sx7Var) {
        this.i = sx7Var;
    }

    @Override // defpackage.o0g
    public final void t0(Throwable th) {
        this.i.c.h(th);
    }

    @Override // defpackage.o0g
    public final void u0(cyd cydVar) {
        sx7 sx7Var = this.i;
        sx7Var.b = cydVar;
        cyd cydVar2 = sx7Var.b;
        xx7 xx7Var = sx7Var.c;
        r16 r16Var = xx7Var.f;
        mq6 mq6Var = xx7Var.i;
        Set<int[]> setX = Build.VERSION.SDK_INT >= 34 ? k1g.x() : k1g.x();
        g77 g77Var = new g77();
        g77Var.a = r16Var;
        g77Var.b = cydVar2;
        g77Var.c = mq6Var;
        if (!setX.isEmpty()) {
            for (int[] iArr : setX) {
                String str = new String(iArr, 0, iArr.length);
                g77Var.z(str, 0, str.length(), 1, true, 2, 0, str, null);
            }
        }
        sx7Var.a = g77Var;
        sx7Var.c.i();
    }
}
