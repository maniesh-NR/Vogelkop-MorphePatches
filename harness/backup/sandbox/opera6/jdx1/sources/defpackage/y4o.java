package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class y4o extends nr9 implements fr9 {
    public static final y4o a = new y4o(6, z4o.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        jl5 jl5Var = (jl5) obj2;
        a5o a5oVar = (a5o) obj3;
        t1h t1hVar = (t1h) obj6;
        int i = ymi.a;
        zzk zzkVar = new zzk(context, (WorkDatabase) obj4, jl5Var);
        pvf.a(context, SystemJobService.class, true);
        qs7.x().getClass();
        return Arrays.asList(zzkVar, new z3a(context, jl5Var, (azl) obj5, t1hVar, new wzg(t1hVar, a5oVar, (byte) 14), a5oVar));
    }
}
