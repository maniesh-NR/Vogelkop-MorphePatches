package org.chromium.components.background_task_scheduler;

import android.os.PersistableBundle;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* loaded from: classes.dex */
public final class a {
    public final int a;
    public PersistableBundle b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final TaskInfo.TimingInfo g;

    public a(int i, TaskInfo.TimingInfo timingInfo) {
        this.a = i;
        this.g = timingInfo;
    }
}
