package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zzk implements vmi {
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final JobScheduler b;
    public final yzk c;
    public final WorkDatabase d;
    public final jl5 e;

    static {
        qs7.B("SystemJobScheduler");
    }

    public zzk(Context context, WorkDatabase workDatabase, jl5 jl5Var) {
        JobScheduler jobSchedulerA = nob.a(context);
        yzk yzkVar = new yzk(context, jl5Var.d);
        this.a = context;
        this.b = jobSchedulerA;
        this.c = yzkVar;
        this.d = workDatabase;
        this.e = jl5Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            qs7 qs7VarX = qs7.x();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            qs7VarX.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        int i = nob.a;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            qs7.x().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static w4o f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new w4o(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.vmi
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList arrayListD = d(context, jobScheduler);
        int i = 0;
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListD.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListD.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                w4o w4oVarF = f(jobInfo);
                if (w4oVarF != null && str.equals(w4oVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            a(jobScheduler, ((Integer) obj2).intValue());
        }
        vzk vzkVarZ = this.d.z();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) vzkVarZ.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) vzkVarZ.d;
        ap9 ap9VarF = uzkVar.f();
        ap9VarF.w(1, str);
        try {
            workDatabase_Impl.c();
            try {
                ap9VarF.h();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.p();
            }
        } finally {
            uzkVar.m(ap9VarF);
        }
    }

    @Override // defpackage.vmi
    public final void c(h5o... h5oVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.d;
        rua ruaVar = new rua(workDatabase);
        byte b = 0;
        for (h5o h5oVar : h5oVarArr) {
            workDatabase.c();
            try {
                h5o h5oVarG = workDatabase.C().g(h5oVar.a);
                if (h5oVarG == null) {
                    qs7.x().getClass();
                    workDatabase.v();
                } else if (h5oVarG.b != 1) {
                    qs7.x().getClass();
                    workDatabase.v();
                } else {
                    String str = h5oVar.a;
                    int i = h5oVar.t;
                    tzk tzkVarP = workDatabase.z().P(new w4o(str, i));
                    if (tzkVarP != null) {
                        iIntValue = tzkVarP.c;
                    } else {
                        jl5 jl5Var = this.e;
                        jl5Var.getClass();
                        iIntValue = ((Number) ruaVar.a.t(new qua(ruaVar, jl5Var.i, b))).intValue();
                    }
                    if (tzkVarP == null) {
                        workDatabase.z().Q(new tzk(str, i, iIntValue));
                    }
                    g(h5oVar, iIntValue);
                    workDatabase.v();
                }
                workDatabase.p();
            } catch (Throwable th) {
                workDatabase.p();
                throw th;
            }
        }
    }

    @Override // defpackage.vmi
    public final boolean e() {
        return true;
    }

    public final void g(h5o h5oVar, int i) {
        List<JobInfo> allPendingJobs;
        JobInfo jobInfoA = this.c.a(h5oVar, i);
        qs7.x().getClass();
        try {
            if (this.b.schedule(jobInfoA) == 0) {
                qs7.x().getClass();
                if (h5oVar.q && h5oVar.r == 1) {
                    h5oVar.q = false;
                    qs7.x().getClass();
                    g(h5oVar, i);
                }
            }
        } catch (IllegalStateException e) {
            int i2 = nob.a;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = i3 >= 31 ? 150 : 100;
            int size = this.d.C().e().size();
            Context context = this.a;
            String strP = "<faulty JobScheduler failed to getPendingJobs>";
            if (i3 >= 34) {
                JobScheduler jobSchedulerA = nob.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                } catch (Throwable unused) {
                    qs7.x().getClass();
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListD = d(context, jobSchedulerA);
                    int size2 = arrayListD != null ? allPendingJobs.size() - arrayListD.size() : 0;
                    String strG = size2 == 0 ? null : u35.g(size2, " of which are not owned by WorkManager");
                    ArrayList arrayListD2 = d(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = arrayListD2 != null ? arrayListD2.size() : 0;
                    strP = CollectionsKt.P(e82.p(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strG, size3 != 0 ? u35.g(size3, " from WorkManager in the default namespace") : null}), ",\n", (CharSequence) null, (String) null, 0, (Function1) null, 62);
                }
            } else {
                ArrayList arrayListD3 = d(context, nob.a(context));
                if (arrayListD3 != null) {
                    strP = arrayListD3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbP = p3p.p(i4, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strP, ".\nThere are ");
            sbP.append(size);
            sbP.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is 20.");
            this.e.getClass();
            String string = sbP.toString();
            qs7.x().getClass();
            h9o.m(string, e);
        } catch (Throwable unused2) {
            qs7 qs7VarX = qs7.x();
            h5oVar.toString();
            qs7VarX.getClass();
        }
    }
}
