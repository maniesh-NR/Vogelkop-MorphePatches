package defpackage;

import ads_mobile_sdk.r83;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class qua implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qua(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = ((rua) obj).a;
                Long lT = workDatabase.y().t("next_job_scheduler_id");
                int i2 = 0;
                int iLongValue = lT != null ? (int) lT.longValue() : 0;
                workDatabase.y().w(new dsg("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > i) {
                    workDatabase.y().w(new dsg("next_job_scheduler_id", 1L));
                } else {
                    i2 = iLongValue;
                }
                return Integer.valueOf(i2);
            case 1:
                n2d n2dVar = (n2d) obj;
                boolean z = n2dVar.i;
                Context context = n2dVar.getContext();
                return z ? u2d.f(context, i, u2d.j(i, context)) : u2d.f(context, i, null);
            default:
                r83 r83Var = (r83) obj;
                int iA = vep.A(i);
                if (iA == 1) {
                    return (edp) r83Var.a.get();
                }
                if (iA == 2) {
                    return (edp) r83Var.b.get();
                }
                if (iA == 3) {
                    return (edp) r83Var.c.get();
                }
                hai.d();
                return null;
        }
    }
}
