package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class m3d extends FutureTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3d(Object obj, Callable callable, byte b) {
        super(callable);
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                n3d n3dVar = (n3d) obj;
                if (!isCancelled()) {
                    try {
                        n3dVar.c((l3d) get());
                        break;
                    } catch (InterruptedException | ExecutionException e) {
                        n3dVar.c(new l3d(e));
                        return;
                    }
                }
                break;
            default:
                ie2 ie2Var = (ie2) obj;
                AtomicBoolean atomicBoolean = ie2Var.d;
                try {
                    Object obj2 = get();
                    if (!atomicBoolean.get()) {
                        ie2Var.a(obj2);
                        break;
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (CancellationException unused2) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    ie2Var.a(null);
                    return;
                } catch (ExecutionException e2) {
                    h9o.s("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    h9o.s("An error occurred while executing doInBackground()", th);
                    return;
                }
                break;
        }
    }
}
