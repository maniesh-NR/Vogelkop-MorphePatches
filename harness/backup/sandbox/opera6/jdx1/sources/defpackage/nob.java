package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class nob {
    public static final /* synthetic */ int a = 0;

    static {
        qs7.B("SystemJobScheduler");
    }

    public static final JobScheduler a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return Build.VERSION.SDK_INT >= 34 ? g8.j(jobScheduler) : jobScheduler;
    }
}
