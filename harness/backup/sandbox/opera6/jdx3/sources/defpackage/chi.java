package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class chi implements qmi {
    public final ScheduledFuture a;

    public chi(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.qmi
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.qmi
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }
}
