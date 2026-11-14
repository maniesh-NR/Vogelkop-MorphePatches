package org.chromium.components.background_task_scheduler.internal;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.r03;
import defpackage.v03;
import defpackage.zcl;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class BackgroundTaskJobService extends JobService {
    public final uac a = new uac((byte) 16);
    public final HashMap b = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r2 >= (r4.getLong("_background_task_end_time") + r5)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r9 < r7) goto L36;
     */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.getApplicationContext()
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto Lb4
            r13.getJobId()
            java.util.Locale r0 = java.util.Locale.US
            int r0 = r13.getJobId()
            i06 r2 = p37.h
            r2.getClass()
            r2 = 1
            if (r0 == r2) goto L38
            r3 = 102(0x66, float:1.43E-43)
            if (r0 == r3) goto L32
            r3 = 105(0x69, float:1.47E-43)
            if (r0 == r3) goto L2c
            r0 = 0
            goto L3d
        L2c:
            p03 r0 = new p03
            r0.<init>(r2)
            goto L3d
        L32:
            p03 r0 = new p03
            r0.<init>(r1)
            goto L3d
        L38:
            as9 r0 = new as9
            r0.<init>()
        L3d:
            boolean r2 = r0 instanceof defpackage.p03
            if (r2 == 0) goto L4d
            r2 = r0
            p03 r2 = (defpackage.p03) r2
            ix5 r3 = new ix5
            r4 = 22
            r3.<init>(r4)
            r2.c = r3
        L4d:
            if (r0 != 0) goto L5f
            t03 r12 = p37.J()
            android.content.Context r0 = t8.a
            int r13 = r13.getJobId()
            u03 r12 = (defpackage.u03) r12
            r12.a(r13, r0)
            return r1
        L5f:
            uac r2 = r12.a
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            android.os.PersistableBundle r4 = r13.getExtras()
            if (r4 == 0) goto Lb5
            java.lang.String r5 = "_background_task_schedule_time"
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto Lb5
            long r5 = r4.getLong(r5)
            java.lang.String r7 = "_background_task_end_time"
            boolean r8 = r4.containsKey(r7)
            if (r8 == 0) goto L8c
            long r7 = r4.getLong(r7)
            long r7 = r7 + r5
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto Lb5
            goto Lb4
        L8c:
            java.lang.String r7 = "_background_task_interval_time"
            long r7 = r4.getLong(r7)
            long r9 = android.app.job.JobInfo.getMinPeriodMillis()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L9e
            long r7 = android.app.job.JobInfo.getMinPeriodMillis()
        L9e:
            java.lang.String r9 = "_background_task_flex_time"
            long r10 = android.app.job.JobInfo.getMinFlexMillis()
            long r9 = r4.getLong(r9, r10)
            long r2 = r2 - r5
            long r2 = r2 % r7
            long r4 = r7 - r9
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto Lb5
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r1
        Lb5:
            int r1 = r13.getJobId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r2 = r12.b
            r2.put(r1, r0)
            zcl r1 = defpackage.v03.a(r13)
            ujp r3 = ujp.l()
            int r4 = r1.a
            int r4 = ujp.n(r4)
            r3.getClass()
            java.lang.String r3 = "Android.BackgroundTaskScheduler.TaskStarted"
            ujp.h(r4, r3)
            android.content.Context r3 = t8.a
            bx7 r4 = new bx7
            r4.<init>(r12, r0, r13)
            boolean r12 = r0.a(r3, r1, r4)
            if (r12 != 0) goto Lf0
            int r13 = r13.getJobId()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2.remove(r13)
        Lf0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (getApplicationContext().getClass().equals(Application.class)) {
            return true;
        }
        jobParameters.getJobId();
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(jobParameters.getJobId());
        HashMap map = this.b;
        if (!map.containsKey(numValueOf)) {
            jobParameters.getJobId();
            return false;
        }
        r03 r03Var = (r03) map.get(Integer.valueOf(jobParameters.getJobId()));
        zcl zclVarA = v03.a(jobParameters);
        ujp ujpVarL = ujp.l();
        int iN = ujp.n(zclVarA.a);
        ujpVarL.getClass();
        ujp.h(iN, "Android.BackgroundTaskScheduler.TaskStopped");
        boolean zB = r03Var.b(t8.a, zclVarA);
        map.remove(Integer.valueOf(jobParameters.getJobId()));
        return zB;
    }
}
