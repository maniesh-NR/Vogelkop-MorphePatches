package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.aoh;
import defpackage.e6i;
import defpackage.h5o;
import defpackage.i5o;
import defpackage.ib6;
import defpackage.ioj;
import defpackage.koe;
import defpackage.mkh;
import defpackage.n77;
import defpackage.x4o;
import defpackage.xo5;
import defpackage.yic;
import defpackage.z7h;
import defpackage.zic;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zic c() throws Throwable {
        e6i e6iVar;
        vzk vzkVar;
        c5o c5oVar;
        k5o k5oVar;
        x4o x4oVarC = x4o.c(this.a);
        WorkDatabase workDatabase = x4oVarC.c;
        i5o i5oVarC = workDatabase.C();
        c5o c5oVarA = workDatabase.A();
        k5o k5oVarD = workDatabase.D();
        vzk vzkVarZ = workDatabase.z();
        ioj iojVar = x4oVarC.b.d;
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        i5oVarC.getClass();
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        e6iVarE.T0(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) i5oVarC.a;
        workDatabase_Impl.b();
        Cursor cursorS = workDatabase_Impl.s(e6iVarE);
        try {
            int iS = mkh.s(cursorS, "id");
            int iS2 = mkh.s(cursorS, "state");
            int iS3 = mkh.s(cursorS, "worker_class_name");
            int iS4 = mkh.s(cursorS, "input_merger_class_name");
            int iS5 = mkh.s(cursorS, "input");
            int iS6 = mkh.s(cursorS, "output");
            int iS7 = mkh.s(cursorS, "initial_delay");
            int iS8 = mkh.s(cursorS, "interval_duration");
            int iS9 = mkh.s(cursorS, "flex_duration");
            int iS10 = mkh.s(cursorS, "run_attempt_count");
            int iS11 = mkh.s(cursorS, "backoff_policy");
            e6iVar = e6iVarE;
            try {
                int iS12 = mkh.s(cursorS, "backoff_delay_duration");
                int iS13 = mkh.s(cursorS, "last_enqueue_time");
                int iS14 = mkh.s(cursorS, "minimum_retention_duration");
                int iS15 = mkh.s(cursorS, "schedule_requested_at");
                int iS16 = mkh.s(cursorS, "run_in_foreground");
                int iS17 = mkh.s(cursorS, "out_of_quota_policy");
                int iS18 = mkh.s(cursorS, "period_count");
                int iS19 = mkh.s(cursorS, "generation");
                int iS20 = mkh.s(cursorS, "next_schedule_time_override");
                int iS21 = mkh.s(cursorS, "next_schedule_time_override_generation");
                int iS22 = mkh.s(cursorS, "stop_reason");
                int iS23 = mkh.s(cursorS, "trace_tag");
                int iS24 = mkh.s(cursorS, "required_network_type");
                int iS25 = mkh.s(cursorS, "required_network_request");
                int iS26 = mkh.s(cursorS, "requires_charging");
                int iS27 = mkh.s(cursorS, "requires_device_idle");
                int iS28 = mkh.s(cursorS, "requires_battery_not_low");
                int iS29 = mkh.s(cursorS, "requires_storage_not_low");
                int iS30 = mkh.s(cursorS, "trigger_content_update_delay");
                int iS31 = mkh.s(cursorS, "trigger_max_content_delay");
                int iS32 = mkh.s(cursorS, "content_uri_triggers");
                int i = iS14;
                ArrayList arrayList = new ArrayList(cursorS.getCount());
                while (cursorS.moveToNext()) {
                    String string = cursorS.getString(iS);
                    int iR = z7h.r(cursorS.getInt(iS2));
                    String string2 = cursorS.getString(iS3);
                    String string3 = cursorS.getString(iS4);
                    ib6 ib6VarA = ib6.a(cursorS.getBlob(iS5));
                    ib6 ib6VarA2 = ib6.a(cursorS.getBlob(iS6));
                    long j = cursorS.getLong(iS7);
                    long j2 = cursorS.getLong(iS8);
                    long j3 = cursorS.getLong(iS9);
                    int i2 = cursorS.getInt(iS10);
                    int iO = z7h.o(cursorS.getInt(iS11));
                    long j4 = cursorS.getLong(iS12);
                    long j5 = cursorS.getLong(iS13);
                    int i3 = i;
                    long j6 = cursorS.getLong(i3);
                    int i4 = iS10;
                    int i5 = iS15;
                    long j7 = cursorS.getLong(i5);
                    iS15 = i5;
                    int i6 = iS16;
                    boolean z = cursorS.getInt(i6) != 0;
                    iS16 = i6;
                    int i7 = iS17;
                    int iQ = z7h.q(cursorS.getInt(i7));
                    iS17 = i7;
                    int i8 = iS18;
                    int i9 = cursorS.getInt(i8);
                    iS18 = i8;
                    int i10 = iS19;
                    int i11 = cursorS.getInt(i10);
                    iS19 = i10;
                    int i12 = iS20;
                    long j8 = cursorS.getLong(i12);
                    iS20 = i12;
                    int i13 = iS21;
                    int i14 = cursorS.getInt(i13);
                    iS21 = i13;
                    int i15 = iS22;
                    int i16 = cursorS.getInt(i15);
                    iS22 = i15;
                    int i17 = iS23;
                    String string4 = cursorS.isNull(i17) ? null : cursorS.getString(i17);
                    iS23 = i17;
                    int i18 = iS24;
                    int iP = z7h.p(cursorS.getInt(i18));
                    iS24 = i18;
                    int i19 = iS25;
                    koe koeVarX = z7h.x(cursorS.getBlob(i19));
                    iS25 = i19;
                    int i20 = iS26;
                    boolean z2 = cursorS.getInt(i20) != 0;
                    iS26 = i20;
                    int i21 = iS27;
                    boolean z3 = cursorS.getInt(i21) != 0;
                    iS27 = i21;
                    int i22 = iS28;
                    boolean z4 = cursorS.getInt(i22) != 0;
                    iS28 = i22;
                    int i23 = iS29;
                    boolean z5 = cursorS.getInt(i23) != 0;
                    iS29 = i23;
                    int i24 = iS30;
                    long j9 = cursorS.getLong(i24);
                    iS30 = i24;
                    int i25 = iS31;
                    long j10 = cursorS.getLong(i25);
                    iS31 = i25;
                    int i26 = iS32;
                    iS32 = i26;
                    arrayList.add(new h5o(string, iR, string2, string3, ib6VarA, ib6VarA2, j, j2, j3, new xo5(koeVarX, iP, z2, z3, z4, z5, j9, j10, z7h.e(cursorS.getBlob(i26))), i2, iO, j4, j5, j6, j7, z, iQ, i9, i11, j8, i14, i16, string4));
                    iS10 = i4;
                    i = i3;
                }
                cursorS.close();
                e6iVar.release();
                ArrayList arrayListD = i5oVarC.d();
                ArrayList arrayListA = i5oVarC.a();
                if (arrayList.isEmpty()) {
                    vzkVar = vzkVarZ;
                    c5oVar = c5oVarA;
                    k5oVar = k5oVarD;
                } else {
                    qs7 qs7VarX = qs7.x();
                    int i27 = n77.a;
                    qs7VarX.getClass();
                    qs7 qs7VarX2 = qs7.x();
                    vzkVar = vzkVarZ;
                    c5oVar = c5oVarA;
                    k5oVar = k5oVarD;
                    n77.a(c5oVar, k5oVar, vzkVar, arrayList);
                    qs7VarX2.getClass();
                }
                if (!arrayListD.isEmpty()) {
                    qs7 qs7VarX3 = qs7.x();
                    int i28 = n77.a;
                    qs7VarX3.getClass();
                    qs7 qs7VarX4 = qs7.x();
                    n77.a(c5oVar, k5oVar, vzkVar, arrayListD);
                    qs7VarX4.getClass();
                }
                if (!arrayListA.isEmpty()) {
                    qs7 qs7VarX5 = qs7.x();
                    int i29 = n77.a;
                    qs7VarX5.getClass();
                    qs7 qs7VarX6 = qs7.x();
                    n77.a(c5oVar, k5oVar, vzkVar, arrayListA);
                    qs7VarX6.getClass();
                }
                return new yic();
            } catch (Throwable th) {
                th = th;
                cursorS.close();
                e6iVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e6iVar = e6iVarE;
        }
    }
}
