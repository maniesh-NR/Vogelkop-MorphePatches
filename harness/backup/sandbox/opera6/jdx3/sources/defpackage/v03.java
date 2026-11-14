package defpackage;

import android.app.job.JobParameters;
import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class v03 {
    public static zcl a(JobParameters jobParameters) {
        zcl zclVar = new zcl(jobParameters.getJobId());
        PersistableBundle persistableBundle = jobParameters.getExtras().getPersistableBundle("_background_task_extras");
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putAll(persistableBundle);
        zclVar.b = persistableBundle2;
        return new zcl(zclVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.content.Context r6, org.chromium.components.background_task_scheduler.TaskInfo r7) {
        /*
            r5 = this;
            android.os.PersistableBundle r5 = new android.os.PersistableBundle
            r5.<init>()
            android.os.PersistableBundle r0 = r7.b
            java.lang.String r1 = "_background_task_extras"
            r5.putPersistableBundle(r1, r0)
            android.app.job.JobInfo$Builder r0 = new android.app.job.JobInfo$Builder
            int r1 = r7.a
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Class<org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService> r3 = org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService.class
            r2.<init>(r6, r3)
            r0.<init>(r1, r2)
            boolean r2 = r7.e
            android.app.job.JobInfo$Builder r0 = r0.setPersisted(r2)
            boolean r2 = r7.d
            android.app.job.JobInfo$Builder r0 = r0.setRequiresCharging(r2)
            int r2 = r7.c
            android.app.job.JobInfo$Builder r0 = r0.setRequiredNetworkType(r2)
            boolean r2 = z04.c()
            r3 = 0
            if (r2 == 0) goto L36
            r0.setUserInitiated(r3)
        L36:
            esg r2 = new esg
            r4 = 5
            r2.<init>(r4, r0, r5, r3)
            org.chromium.components.background_task_scheduler.TaskInfo$TimingInfo r5 = r7.g
            r5.a(r2)
            android.app.job.JobInfo r5 = r0.build()
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.app.job.JobScheduler r6 = (android.app.job.JobScheduler) r6
            boolean r7 = r7.f
            r0 = 1
            if (r7 != 0) goto L6d
            java.util.List r7 = r6.getAllPendingJobs()
            java.util.Iterator r7 = r7.iterator()
        L5a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r7.next()
            android.app.job.JobInfo r2 = (android.app.job.JobInfo) r2
            int r2 = r2.getId()
            if (r2 != r1) goto L5a
            goto L73
        L6d:
            int r5 = r6.schedule(r5)     // Catch: java.lang.Exception -> L74
            if (r5 != r0) goto L74
        L73:
            return r0
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v03.b(android.content.Context, org.chromium.components.background_task_scheduler.TaskInfo):boolean");
    }
}
