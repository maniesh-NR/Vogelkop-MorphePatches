package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ob1 extends dx5 {
    public static final zyk l = z4c.b(new lb((byte) 14));
    public static final f30 m = new f30(4);
    public final Choreographer b;
    public final Handler c;
    public boolean h;
    public boolean i;
    public final qb1 k;
    public final Object d = new Object();
    public final i72 e = new i72();
    public ArrayList f = new ArrayList();
    public ArrayList g = new ArrayList();
    public final nb1 j = new nb1(this);

    public ob1(Choreographer choreographer, Handler handler) {
        this.b = choreographer;
        this.c = handler;
        this.k = new qb1(choreographer, this);
    }

    public final void D(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.d) {
            this.e.addLast(runnable);
            if (!this.h) {
                this.h = true;
                this.c.post(this.j);
                if (!this.i) {
                    this.i = true;
                    this.b.postFrameCallback(this.j);
                }
            }
        }
    }

    public final void P() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.d) {
                i72 i72Var = this.e;
                runnable = (Runnable) (i72Var.isEmpty() ? null : i72Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.d) {
                    i72 i72Var2 = this.e;
                    runnable = (Runnable) (i72Var2.isEmpty() ? null : i72Var2.removeFirst());
                }
            }
            synchronized (this.d) {
                if (this.e.isEmpty()) {
                    z = false;
                    this.h = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
