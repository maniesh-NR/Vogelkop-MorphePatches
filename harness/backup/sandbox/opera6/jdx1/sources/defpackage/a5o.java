package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class a5o {
    public final op1 a;
    public final dx5 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final eba d = new eba(this);

    public a5o(ExecutorService executorService) {
        op1 op1Var = new op1(executorService);
        this.a = op1Var;
        this.b = fr3.I(op1Var);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
