package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.a5o;
import defpackage.d7h;
import defpackage.m41;
import defpackage.t1h;
import defpackage.w4o;
import defpackage.w8k;
import defpackage.x4o;
import defpackage.x5i;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements dg8 {
    public static final /* synthetic */ int e = 0;
    public x4o a;
    public final HashMap b = new HashMap();
    public final x5i c = new x5i((byte) 1);
    public wzg d;

    static {
        qs7.B("SystemJobService");
    }

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        qp2.n(sko.k("Cannot invoke ", str, " on a background thread"));
    }

    public static w4o c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new w4o(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void a(w4o w4oVar, boolean z) {
        b("onExecuted");
        qs7 qs7VarX = qs7.x();
        String str = w4oVar.a;
        qs7VarX.getClass();
        JobParameters jobParameters = (JobParameters) this.b.remove(w4oVar);
        this.c.b(w4oVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            x4o x4oVarC = x4o.c(getApplicationContext());
            this.a = x4oVarC;
            t1h t1hVar = x4oVarC.f;
            this.d = new wzg(t1hVar, x4oVarC.d, (byte) 14);
            t1hVar.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                qs7.x().getClass();
            } else {
                h9o.m("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        x4o x4oVar = this.a;
        if (x4oVar != null) {
            x4oVar.f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        b("onStartJob");
        if (this.a == null) {
            qs7.x().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        w4o w4oVarC = c(jobParameters);
        if (w4oVarC == null) {
            qs7.x().getClass();
            return false;
        }
        HashMap map = this.b;
        if (map.containsKey(w4oVarC)) {
            qs7 qs7VarX = qs7.x();
            w4oVarC.toString();
            qs7VarX.getClass();
            return false;
        }
        qs7 qs7VarX2 = qs7.x();
        w4oVarC.toString();
        qs7VarX2.getClass();
        map.put(w4oVarC, jobParameters);
        d7h d7hVar = new d7h((byte) 14);
        if (jobParameters.getTriggeredContentUris() != null) {
            d7hVar.c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            d7hVar.b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        wzg wzgVar = this.d;
        ((a5o) wzgVar.c).a(new h4m(wzgVar, this.c.d(w4oVarC), d7hVar, (byte) 10));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        b("onStopJob");
        if (this.a == null) {
            qs7.x().getClass();
            return true;
        }
        w4o w4oVarC = c(jobParameters);
        if (w4oVarC == null) {
            qs7.x().getClass();
            return false;
        }
        qs7 qs7VarX = qs7.x();
        w4oVarC.toString();
        qs7VarX.getClass();
        this.b.remove(w4oVarC);
        w8k w8kVarB = this.c.b(w4oVarC);
        if (w8kVarB != null) {
            this.d.c(w8kVarB, Build.VERSION.SDK_INT >= 31 ? m41.u(jobParameters) : -512);
        }
        t1h t1hVar = this.a.f;
        String str = w4oVarC.a;
        synchronized (t1hVar.k) {
            zContains = t1hVar.i.contains(str);
        }
        return !zContains;
    }
}
