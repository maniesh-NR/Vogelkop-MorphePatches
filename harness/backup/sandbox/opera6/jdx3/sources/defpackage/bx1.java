package defpackage;

import java.util.concurrent.Executor;
import org.chromium.base.ThreadUtils;
import org.chromium.net.Proxy;

/* loaded from: classes.dex */
public final /* synthetic */ class bx1 implements Executor {
    public final /* synthetic */ byte a;

    private final void a(Runnable runnable) {
    }

    private final void b(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                cx1.C().a.b.execute(runnable);
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                vml.c(runnable);
                break;
            case 4:
                ThreadUtils.a().post(runnable);
                break;
            case 5:
                Proxy.a(runnable);
                break;
            case 6:
                runnable.run();
                break;
        }
    }
}
