package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class glf {
    public final Context a;
    public boolean b;
    public short c;
    public final JobInfo d;
    public final JobScheduler e;

    public glf(Context context, ComponentName componentName, int i) {
        this.a = context.getApplicationContext();
        a(i);
        this.d = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        if (!this.b) {
            this.b = true;
            this.c = i;
        } else {
            if (this.c == i) {
                return;
            }
            h9o.q(this.c, p3p.o(i, "Given job ID ", " is different than previous "));
        }
    }
}
