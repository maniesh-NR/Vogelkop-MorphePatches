package defpackage;

import android.app.job.JobParameters;

/* loaded from: classes.dex */
public final class llf {
    public static String a(JobParameters jobParameters) {
        return jobParameters.getJobId() + ":" + jobParameters.getStopReason();
    }

    public static boolean b(JobParameters jobParameters) {
        return jobParameters.getStopReason() == 16;
    }
}
