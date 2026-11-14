package defpackage;

import android.app.Activity;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class we3 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final /* synthetic */ Object f;

    public we3(af3 af3Var, lh4 lh4Var, cf3 cf3Var, nsh nshVar, lf3 lf3Var) {
        this.a = (byte) 0;
        Objects.requireNonNull(af3Var);
        this.f = af3Var;
        this.b = lh4Var;
        this.c = cf3Var;
        this.d = nshVar;
        this.e = lf3Var;
    }

    public /* synthetic */ we3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: l3e */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.a) {
            case 0:
                lh4 lh4Var = (lh4) this.b;
                cf3 cf3Var = (cf3) this.c;
                af3 af3Var = (af3) this.f;
                if (cf3Var.b(af3Var.a, (lf3) this.e).a != 0) {
                    lh4Var.run(new ff3(new gf3(), jf3.c));
                    return;
                } else {
                    af3Var.e.add(new xe3((nsh) this.d, lh4Var));
                    return;
                }
            case 1:
                ((spp) this.b).f.c();
                ((Activity) this.c).startActivityForResult(y4h.t((String) this.d, (String) this.e, (Map) this.f), 0);
                return;
            default:
                mtp mtpVar = (mtp) this.b;
                CancellationToken cancellationToken = (CancellationToken) this.c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
                Callable callable = (Callable) this.e;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f;
                try {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    }
                    try {
                        if (!mtpVar.c.get()) {
                            synchronized (mtpVar) {
                                try {
                                    mtpVar.i = mtpVar.e.zzc();
                                } finally {
                                }
                            }
                            mtpVar.c.set(true);
                        }
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        }
                        Object objCall = callable.call();
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        } else {
                            taskCompletionSource.setResult(objCall);
                            return;
                        }
                    } catch (RuntimeException e) {
                        throw new l3e("Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e2) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    } else {
                        taskCompletionSource.setException(e2);
                        return;
                    }
                }
        }
    }
}
