package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class h61 implements igd, ylo {
    public final Context a;

    public h61(Context context) {
        this.a = context.getApplicationContext();
    }

    public final Object a() {
        return this.a;
    }

    public final int b(int i) {
        return f03.t(i, this.a, 2131101243);
    }

    public final jgd g(igi igiVar) {
        Context context;
        if (Build.VERSION.SDK_INT < 31 && ((context = this.a) == null || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new dvj((byte) 3).g(igiVar);
        }
        int i = dzd.i(((oj9) igiVar.d).n);
        w7d.G("Creating an asynchronous MediaCodec adapter for track type ".concat(tym.D(i)));
        rn9 rn9Var = new rn9(new se2((byte) 0, i), new se2((byte) 1, i));
        rn9Var.b = true;
        return rn9Var.g(igiVar);
    }
}
