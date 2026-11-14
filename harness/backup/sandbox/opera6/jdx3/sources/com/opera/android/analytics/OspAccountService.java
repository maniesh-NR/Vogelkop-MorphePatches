package com.opera.android.analytics;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import defpackage.nzc;

/* loaded from: classes.dex */
public class OspAccountService extends nzc {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (sfe.g0(this)) {
            return false;
        }
        xf8.E(getApplicationContext(), true);
        JobScheduler jobScheduler = (JobScheduler) getApplicationContext().getSystemService("jobscheduler");
        jobScheduler.cancel(1010);
        jobScheduler.cancel(1011);
        return false;
    }
}
