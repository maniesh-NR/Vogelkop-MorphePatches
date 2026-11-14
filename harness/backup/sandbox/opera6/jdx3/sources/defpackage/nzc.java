package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* loaded from: classes.dex */
public abstract class nzc extends JobService {
    public static mlf a;

    public boolean a(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        mlf mlfVar = a;
        if (mlfVar != null) {
            mlfVar.g(jobParameters);
        }
        return a(jobParameters);
    }
}
