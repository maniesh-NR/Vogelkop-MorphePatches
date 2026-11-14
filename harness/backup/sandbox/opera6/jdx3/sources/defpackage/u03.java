package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import org.chromium.base.CommandLine;
import org.chromium.base.TraceEvent;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* loaded from: classes.dex */
public final class u03 implements t03 {
    public final v03 a;

    public u03(v03 v03Var) {
        this.a = v03Var;
    }

    public final void a(int i, Context context) {
        TraceEvent traceEventN = TraceEvent.n("BackgroundTaskScheduler.cancel", Integer.toString(i));
        try {
            ujp ujpVarL = ujp.l();
            int iN = ujp.n(i);
            ujpVarL.getClass();
            ujp.h(iN, "Android.BackgroundTaskScheduler.TaskCanceled");
            try {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(i);
            } catch (NullPointerException unused) {
            }
            if (traceEventN != null) {
                traceEventN.close();
            }
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final boolean b(Context context, TaskInfo taskInfo) {
        if (CommandLine.d.c("ignore-background-tasks")) {
            return true;
        }
        TraceEvent traceEventN = TraceEvent.n("BackgroundTaskScheduler.schedule", Integer.toString(taskInfo.a));
        try {
            tn tnVar = new tn(this, context, taskInfo);
            taskInfo.g.a(tnVar);
            boolean z = tnVar.a;
            ujp ujpVarL = ujp.l();
            int i = taskInfo.a;
            if (z) {
                int iN = ujp.n(i);
                ujpVarL.getClass();
                ujp.h(iN, "Android.BackgroundTaskScheduler.TaskScheduled.Success");
            } else {
                int iN2 = ujp.n(i);
                ujpVarL.getClass();
                ujp.h(iN2, "Android.BackgroundTaskScheduler.TaskScheduled.Failure");
            }
            if (traceEventN != null) {
                traceEventN.close();
            }
            return z;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
