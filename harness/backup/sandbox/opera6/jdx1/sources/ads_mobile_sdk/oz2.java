package ads_mobile_sdk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class oz2 implements Runnable {
    public final TaskCompletionSource a;

    public oz2() {
        this.a = null;
    }

    public oz2(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }
}
