package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajc;
import defpackage.cs5;
import defpackage.o0g;
import defpackage.o94;
import defpackage.sx5;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lajc;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sx5", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ajc {
    public final WorkerParameters e;
    public final sx5 f;

    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = workerParameters;
        this.f = sx5.b;
    }

    @Override // defpackage.ajc
    public final ListenableFuture a() {
        ynb ynbVarE = o0g.e();
        sx5 sx5Var = this.f;
        sx5Var.getClass();
        return cs5.d0(e.a(sx5Var, ynbVarE), new tx5(this, null, (byte) 0));
    }

    @Override // defpackage.ajc
    public final o94 b() {
        sx5 sx5Var = sx5.b;
        cv6 cv6Var = this.f;
        if (Intrinsics.a(cv6Var, sx5Var)) {
            cv6Var = this.e.e;
        }
        ynb ynbVarE = o0g.e();
        cv6Var.getClass();
        return cs5.d0(e.a(cv6Var, ynbVarE), new tx5(this, null, (byte) 1));
    }

    public abstract Object c(nt5 nt5Var);
}
