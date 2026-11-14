package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.opera.android.PushedContentHandler;
import java.io.ByteArrayInputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class no7 implements mch, w6f {
    public static final SparseArray j = new SparseArray();
    public final Context a;
    public final int c;
    public final String d;
    public boolean f;
    public int g;
    public volatile Object i;
    public final ko7 b = new ko7(this, vml.d);
    public final i7f e = new i7f();
    public final CountDownLatch h = new CountDownLatch(1);

    public no7(Context context, int i, String str) {
        this.a = context.getApplicationContext();
        this.c = i;
        this.d = str;
    }

    public static no7 n(Context context, io7 io7Var, lo7 lo7Var) {
        no7 no7VarX;
        SparseArray sparseArray = j;
        synchronized (sparseArray) {
            no7VarX = (no7) sparseArray.get(io7Var.a);
            if (no7VarX == null) {
                no7VarX = lo7Var.x(context);
                sparseArray.put(io7Var.a, no7VarX);
                no7VarX.b.h();
            }
        }
        return no7VarX;
    }

    @Override // defpackage.mch
    public final void a(io7 io7Var, int i, nch nchVar, jch jchVar) {
        this.g = i;
        try {
            byte[] bArr = nchVar.a;
            if (bArr.length == 0) {
                this.i = h();
            } else {
                this.i = q(bArr);
            }
            r(this.i);
            i7f i7fVar = this.e;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((mo7) g7fVarC.next()).o(false);
            }
            this.b.g(nchVar.a);
            jchVar.run(Boolean.TRUE);
        } catch (Throwable unused) {
            jchVar.run(Boolean.FALSE);
        }
    }

    @Override // defpackage.mch
    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            this.e.b(new p1((byte) 5, this, runnable, false));
        }
    }

    @Override // defpackage.mch
    public final sa2 c() {
        return new sa2((byte) 9, this.g, false);
    }

    @Override // defpackage.mch
    public void e(PushedContentHandler pushedContentHandler) {
    }

    @Override // defpackage.mch
    public final void f() {
    }

    @Override // defpackage.w6f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void F(mo7 mo7Var) {
        if (this.e.b(mo7Var) && this.f) {
            mo7Var.o(true);
        }
    }

    public Object h() {
        return new q1(false, null, null, null, true);
    }

    public final Object i() {
        try {
            s();
            return this.i;
        } catch (InterruptedException e) {
            rqd.p(e);
            return null;
        }
    }

    public final boolean j() {
        try {
            return this.h.await(0L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ Object k(izd izdVar) {
        return v1.z(izdVar);
    }

    public void l(Object obj) {
        this.h.countDown();
    }

    public void m(Object obj) {
    }

    public void o() {
    }

    @Override // defpackage.w6f
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void H(mo7 mo7Var) {
        this.e.c(mo7Var);
    }

    public Object q(byte[] bArr) {
        return v1.z(new izd(new ByteArrayInputStream(bArr)));
    }

    public void r(Object obj) {
    }

    public final void s() {
        if (this.h.await(60L, TimeUnit.SECONDS)) {
            return;
        }
        h9o.r("");
    }
}
