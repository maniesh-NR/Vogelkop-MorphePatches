package ads_mobile_sdk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class z6 {
    public final qm1 a;

    public z6(qm1 qm1Var) {
        new TaskCompletionSource().getTask();
        this.a = qm1Var;
    }

    public final void a(int i, long j, Exception exc) {
        this.a.a(i, j, exc, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }
}
