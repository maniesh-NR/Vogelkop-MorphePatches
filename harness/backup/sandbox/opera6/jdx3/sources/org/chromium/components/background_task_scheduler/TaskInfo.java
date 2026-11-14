package org.chromium.components.background_task_scheduler;

import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class TaskInfo {
    public final int a;
    public final PersistableBundle b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final TimingInfo g;

    public interface TimingInfo {
        void a(ycl yclVar);
    }

    public TaskInfo(a aVar) {
        this.a = aVar.a;
        PersistableBundle persistableBundle = aVar.b;
        this.b = persistableBundle == null ? new PersistableBundle() : persistableBundle;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
    }

    public final String toString() {
        return "{taskId: " + this.a + ", extras: " + this.b + ", requiredNetworkType: " + this.c + ", requiresCharging: " + this.d + ", userInitiated: false, isPersisted: " + this.e + ", updateCurrent: " + this.f + ", timingInfo: " + this.g + "}";
    }
}
