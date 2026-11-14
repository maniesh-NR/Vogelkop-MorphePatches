package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class jkf extends e63 implements Runnable {
    public final long a;
    public final ikf b;
    public final vdf c;

    public jkf(long j, ikf ikfVar, vdf vdfVar) {
        this.a = j;
        this.b = ikfVar;
        this.c = vdfVar;
        vml.d(this, 1000L);
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void f(re7 re7Var) {
        if (re7Var.o == this.a) {
            vml.a(this);
            Context context = t8.a;
            String[] strArr = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).m().a.u(this);
            this.b.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        vml.a(this);
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).m().a.u(this);
        this.c.run();
    }
}
