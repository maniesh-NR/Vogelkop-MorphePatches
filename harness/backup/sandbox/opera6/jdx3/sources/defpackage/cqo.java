package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cqo {
    public final /* synthetic */ long a;
    public final /* synthetic */ eqo b;

    public cqo(eqo eqoVar, long j) {
        this.a = j;
        Objects.requireNonNull(eqoVar);
        this.b = eqoVar;
    }

    public final Task a(uep uepVar) {
        ypo ypoVar = this.b.a;
        long j = this.a;
        ypoVar.a.b("requestExpressIntegrityToken(%s)", new Object[]{Long.valueOf(j)});
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ypoVar.f.c(new rpo(ypoVar, taskCompletionSource, uepVar, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
