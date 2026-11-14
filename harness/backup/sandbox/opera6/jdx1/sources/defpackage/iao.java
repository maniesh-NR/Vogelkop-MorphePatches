package defpackage;

import ads_mobile_sdk.fl0;
import ads_mobile_sdk.qm1;
import android.os.SystemClock;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class iao {
    public long a;
    public long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public Serializable g;

    public iao(fl0 fl0Var, mip mipVar, qm1 qm1Var) {
        this.f = new AtomicBoolean(false);
        this.a = -1L;
        this.b = -1L;
        this.g = null;
        this.c = fl0Var;
        this.d = qm1Var;
        this.e = mipVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iao(q0 q0Var, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = q0Var;
        this.a = j;
        this.b = j2;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
    }

    public final void a() {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
        if (atomicBoolean.getAndSet(true)) {
            qp2.n("Finished trace.");
            return;
        }
        ((mip) this.e).getClass();
        this.b = SystemClock.uptimeMillis();
        ((qm1) this.d).a(((fl0) this.c).a, atomicBoolean.get() ? this.b - this.a : -1L, (Throwable) this.g, null);
    }

    public final void a(Throwable th) {
        if (((AtomicBoolean) this.f).get()) {
            qp2.n("Finished trace.");
        } else {
            this.g = th;
        }
    }

    public final void b() {
        if (((AtomicBoolean) this.f).get()) {
            qp2.n("Finished trace.");
        } else {
            ((mip) this.e).getClass();
            this.a = SystemClock.uptimeMillis();
        }
    }
}
