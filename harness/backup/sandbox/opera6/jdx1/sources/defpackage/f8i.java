package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class f8i {
    public final c8i b;
    public final Object a = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public volatile int d = -1;

    public f8i(Context context) {
        this.b = new c8i(context, this);
    }

    public final void a(crk crkVar, ScheduledExecutorService scheduledExecutorService) {
        synchronized (this.a) {
            if (this.b.canDetectOrientation()) {
                e8i e8iVar = new e8i(crkVar, scheduledExecutorService);
                this.c.put(crkVar, e8iVar);
                if (this.d != -1) {
                    int i = this.d;
                    if (e8iVar.c.get()) {
                        try {
                            scheduledExecutorService.execute(new br(e8iVar, i, (byte) 22));
                        } catch (RejectedExecutionException unused) {
                        }
                    }
                }
                if (this.c.size() == 1) {
                    this.b.enable();
                }
            }
        }
    }

    public final void b(crk crkVar) {
        synchronized (this.a) {
            e8i e8iVar = (e8i) this.c.get(crkVar);
            if (e8iVar != null) {
                e8iVar.c.set(false);
                this.c.remove(crkVar);
            }
            if (this.c.isEmpty()) {
                this.b.disable();
                this.d = -1;
            }
        }
    }
}
