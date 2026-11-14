package defpackage;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class op1 implements Executor {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;

    public op1(Executor executor) {
        this.a = (byte) 2;
        this.e = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public /* synthetic */ op1(Executor executor, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, TaskCompletionSource taskCompletionSource) {
        this.a = (byte) 3;
        this.d = executor;
        this.b = cancellationToken;
        this.e = cancellationTokenSource;
        this.c = taskCompletionSource;
    }

    public op1(ExecutorService executorService) {
        this.a = (byte) 1;
        this.e = executorService;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public op1(n97 n97Var) {
        this.a = (byte) 0;
        this.d = new Object();
        this.b = new ArrayDeque();
        this.e = n97Var;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    Runnable runnable = (Runnable) ((ArrayDeque) this.b).poll();
                    this.c = runnable;
                    if (runnable != null) {
                        ((n97) this.e).execute(runnable);
                    }
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) ((ArrayDeque) this.b).poll();
                this.c = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.e).execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.d) {
                    Object objPoll = ((ArrayDeque) this.b).poll();
                    Runnable runnable3 = (Runnable) objPoll;
                    this.c = runnable3;
                    if (objPoll != null) {
                        ((Executor) this.e).execute(runnable3);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    ((ArrayDeque) this.b).add(new xa(this, runnable, (byte) 17));
                    if (((Runnable) this.c) == null) {
                        a();
                    }
                }
                return;
            case 1:
                synchronized (this.d) {
                    ((ArrayDeque) this.b).add(new vr9(this, runnable, (byte) 19));
                    if (((Runnable) this.c) == null) {
                        a();
                    }
                }
                return;
            case 2:
                synchronized (this.d) {
                    ((ArrayDeque) this.b).offer(new npl(runnable, this, (byte) 9));
                    if (((Runnable) this.c) == null) {
                        a();
                    }
                }
                return;
            default:
                try {
                    ((Executor) this.d).execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((CancellationToken) this.b).isCancellationRequested()) {
                        ((CancellationTokenSource) this.e).cancel();
                    } else {
                        ((TaskCompletionSource) this.c).setException(e);
                    }
                    throw e;
                }
        }
    }
}
