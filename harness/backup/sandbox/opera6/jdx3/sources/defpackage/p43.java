package defpackage;

import com.opera.api.Callback;
import java.io.IOException;
import java.util.Objects;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public abstract class p43 implements f94, ih4 {
    public final Callback a;
    public final q65 b;
    public final byte c;
    public v84 d;
    public boolean e;
    public int f;
    public long g;
    public final /* synthetic */ s43 h;

    public p43(s43 s43Var, Callback callback) {
        Objects.requireNonNull(s43Var);
        this.h = s43Var;
        this.b = new q65(new fv2(this, (byte) 5), (byte) 4);
        this.g = 100L;
        this.a = callback;
        this.c = (byte) 3;
        RealCall realCallB = b();
        this.d = realCallB;
        realCallB.enqueue(this);
    }

    public final void a(q43 q43Var) {
        if (this.a == null) {
            return;
        }
        e(new bi2(this, q43Var, (byte) 9));
    }

    public abstract RealCall b();

    public q43 c(pzh pzhVar) {
        return new q43(pzhVar);
    }

    @Override // defpackage.ih4
    public final void cancel() {
        this.e = true;
        this.b.S();
        v84 v84Var = this.d;
        if (v84Var != null) {
            v84Var.cancel();
        }
    }

    public boolean d(pzh pzhVar) {
        return pzhVar.d == 200;
    }

    public final void e(Runnable runnable) {
        this.h.b.d(new bi2(this, runnable, (byte) 10)).a(null);
    }

    public abstract void f(pzh pzhVar);

    public final void onFailure(v84 v84Var, IOException iOException) {
        int i = this.f;
        if (i >= this.c) {
            a(new q43(-2, iOException.getMessage()));
            return;
        }
        this.f = i + 1;
        long j = this.g;
        this.g = j << 1;
        e(new oi2(this, j, (byte) 1));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        if (d(pzhVar)) {
            try {
                f(pzhVar);
            } catch (IOException e) {
                a(new q43(-2, e.getMessage()));
            }
        } else {
            a(c(pzhVar));
        }
        pzhVar.close();
    }
}
