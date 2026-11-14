package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
import org.chromium.base.task.PostTask;

/* loaded from: classes.dex */
public final class e2j implements oxc {
    public final ArrayDeque a = new ArrayDeque();
    public Pair b;

    public final synchronized void a() {
        Pair pair = (Pair) this.a.poll();
        this.b = pair;
        if (pair != null) {
            de2 de2Var = fe2.e;
            Runnable runnable = (Runnable) pair.first;
            if (pair.second != null) {
                throw new ClassCastException();
            }
            PostTask.b(1, runnable, 0L);
        }
    }

    public final synchronized void r(Runnable runnable) {
        this.a.offer(new Pair(new jri(this, runnable, (byte) 7), null));
        if (this.b == null) {
            a();
        }
    }
}
