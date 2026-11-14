package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class n3d {
    public static final ExecutorService e = Executors.newCachedThreadPool();
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile l3d d = null;

    public n3d(Callable callable, boolean z) {
        if (!z) {
            e.execute(new m3d(this, callable, (byte) 0));
            return;
        }
        try {
            c((l3d) callable.call());
        } catch (Throwable th) {
            c(new l3d(th));
        }
    }

    public final synchronized void a(j3d j3dVar) {
        Throwable th;
        l3d l3dVar = this.d;
        if (l3dVar != null && (th = l3dVar.b) != null) {
            j3dVar.onResult(th);
        }
        this.b.add(j3dVar);
    }

    public final synchronized void b(j3d j3dVar) {
        Object obj;
        l3d l3dVar = this.d;
        if (l3dVar != null && (obj = l3dVar.a) != null) {
            j3dVar.onResult(obj);
        }
        this.a.add(j3dVar);
    }

    public final void c(l3d l3dVar) {
        if (this.d != null) {
            qp2.n("A task may only be set once.");
        } else {
            this.d = l3dVar;
            this.c.post(new dnb(this, (byte) 17));
        }
    }
}
