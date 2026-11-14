package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class vj2 implements djn {
    public final umi a;
    public final jjn b;
    public final jjn c;
    public final t1 d;
    public final ArrayDeque e = new ArrayDeque();
    public long f;

    public vj2(Context context, umi umiVar, jjn jjnVar, jjn jjnVar2) {
        this.a = umiVar;
        this.b = jjnVar;
        this.c = jjnVar2;
        String[] strArr = OperaApplication.K;
        this.d = ((OperaApplication) context.getApplicationContext()).u;
    }

    @Override // defpackage.djn
    public final void a(Callback callback, Callback callback2) {
        ((djn) this.c.get()).b(new tj2(this, callback, callback2, (byte) 1), callback2);
    }

    @Override // defpackage.djn
    public final void b(Callback callback, Callback callback2) {
        ((djn) this.c.get()).b(new tj2(this, callback, callback2, (byte) 0), callback2);
    }

    public final void c(Runnable runnable, Runnable runnable2) {
        ArrayDeque arrayDeque = this.e;
        if (!arrayDeque.isEmpty()) {
            arrayDeque.addLast(new Pair(runnable, runnable2));
            return;
        }
        long j = this.f;
        if (j > 0) {
            if (j > SystemClock.uptimeMillis()) {
                runnable.run();
                return;
            }
            this.f = 0L;
        }
        fp1 fp1Var = this.b.b.a;
        int i = 0 > SystemClock.uptimeMillis() ? 2132020347 : 2132022044;
        arrayDeque.addLast(new Pair(runnable, runnable2));
        new kj2(this, (Activity) fp1Var, i, new eme(this)).e();
    }
}
