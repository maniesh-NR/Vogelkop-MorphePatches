package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i5o {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public i5o(Context context, umi umiVar, b59 b59Var, vx vxVar, esk eskVar, sy syVar, sy syVar2) {
        this.a = new iy(this);
        this.b = new jy(this, (byte) 0);
        this.c = new jy(this, (byte) 1);
        this.d = context.getApplicationContext();
        this.e = umiVar;
        this.f = b59Var;
        this.g = vxVar;
        this.h = eskVar;
        this.i = syVar;
        this.j = syVar2;
    }

    public i5o(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        byte b = 5;
        this.b = new b37(workDatabase_Impl, b);
        new uzk(workDatabase_Impl, (byte) 12);
        this.c = new uzk(workDatabase_Impl, (byte) 13);
        this.d = new uzk(workDatabase_Impl, (byte) 14);
        this.e = new uzk(workDatabase_Impl, (byte) 15);
        this.f = new uzk(workDatabase_Impl, (byte) 16);
        this.g = new uzk(workDatabase_Impl, (byte) 17);
        this.h = new uzk(workDatabase_Impl, (byte) 18);
        this.i = new uzk(workDatabase_Impl, (byte) 19);
        this.j = new uzk(workDatabase_Impl, (byte) 4);
        new uzk(workDatabase_Impl, b);
        this.k = new uzk(workDatabase_Impl, (byte) 6);
        this.l = new uzk(workDatabase_Impl, (byte) 7);
        this.m = new uzk(workDatabase_Impl, (byte) 8);
        new uzk(workDatabase_Impl, (byte) 9);
        new uzk(workDatabase_Impl, (byte) 10);
        this.n = new uzk(workDatabase_Impl, (byte) 11);
    }

    public final ArrayList a() throws Throwable {
        e6i e6iVar;
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        e6iVarE.T0(1, 200L);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iS12 = mkh.s(cursorS, "backoff_delay_duration");
            int iS13 = mkh.s(cursorS, "last_enqueue_time");
            int iS14 = mkh.s(cursorS, "minimum_retention_duration");
            e6iVar = e6iVarE;
            try {
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
                    i = i3;
                    int i4 = iS15;
                    long j7 = cursorS.getLong(i4);
                    iS15 = i4;
                    int i5 = iS16;
                    boolean z = cursorS.getInt(i5) != 0;
                    iS16 = i5;
                    int i6 = iS17;
                    int iQ = z7h.q(cursorS.getInt(i6));
                    iS17 = i6;
                    int i7 = iS18;
                    int i8 = cursorS.getInt(i7);
                    iS18 = i7;
                    int i9 = iS19;
                    int i10 = cursorS.getInt(i9);
                    iS19 = i9;
                    int i11 = iS20;
                    long j8 = cursorS.getLong(i11);
                    iS20 = i11;
                    int i12 = iS21;
                    int i13 = cursorS.getInt(i12);
                    iS21 = i12;
                    int i14 = iS22;
                    int i15 = cursorS.getInt(i14);
                    iS22 = i14;
                    int i16 = iS23;
                    String string4 = cursorS.isNull(i16) ? null : cursorS.getString(i16);
                    iS23 = i16;
                    int i17 = iS24;
                    int iP = z7h.p(cursorS.getInt(i17));
                    iS24 = i17;
                    int i18 = iS25;
                    koe koeVarX = z7h.x(cursorS.getBlob(i18));
                    iS25 = i18;
                    int i19 = iS26;
                    boolean z2 = cursorS.getInt(i19) != 0;
                    iS26 = i19;
                    int i20 = iS27;
                    boolean z3 = cursorS.getInt(i20) != 0;
                    iS27 = i20;
                    int i21 = iS28;
                    boolean z4 = cursorS.getInt(i21) != 0;
                    iS28 = i21;
                    int i22 = iS29;
                    boolean z5 = cursorS.getInt(i22) != 0;
                    iS29 = i22;
                    int i23 = iS30;
                    long j9 = cursorS.getLong(i23);
                    iS30 = i23;
                    int i24 = iS31;
                    long j10 = cursorS.getLong(i24);
                    iS31 = i24;
                    int i25 = iS32;
                    iS32 = i25;
                    arrayList.add(new h5o(string, iR, string2, string3, ib6VarA, ib6VarA2, j, j2, j3, new xo5(koeVarX, iP, z2, z3, z4, z5, j9, j10, z7h.e(cursorS.getBlob(i25))), i2, iO, j4, j5, j6, j7, z, iQ, i8, i10, j8, i13, i15, string4));
                }
                cursorS.close();
                e6iVar.release();
                return arrayList;
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

    public final ArrayList b() throws Throwable {
        e6i e6iVar;
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        e6iVarE.T0(1, 20L);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iS12 = mkh.s(cursorS, "backoff_delay_duration");
            int iS13 = mkh.s(cursorS, "last_enqueue_time");
            int iS14 = mkh.s(cursorS, "minimum_retention_duration");
            e6iVar = e6iVarE;
            try {
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
                    i = i3;
                    int i4 = iS15;
                    long j7 = cursorS.getLong(i4);
                    iS15 = i4;
                    int i5 = iS16;
                    boolean z = cursorS.getInt(i5) != 0;
                    iS16 = i5;
                    int i6 = iS17;
                    int iQ = z7h.q(cursorS.getInt(i6));
                    iS17 = i6;
                    int i7 = iS18;
                    int i8 = cursorS.getInt(i7);
                    iS18 = i7;
                    int i9 = iS19;
                    int i10 = cursorS.getInt(i9);
                    iS19 = i9;
                    int i11 = iS20;
                    long j8 = cursorS.getLong(i11);
                    iS20 = i11;
                    int i12 = iS21;
                    int i13 = cursorS.getInt(i12);
                    iS21 = i12;
                    int i14 = iS22;
                    int i15 = cursorS.getInt(i14);
                    iS22 = i14;
                    int i16 = iS23;
                    String string4 = cursorS.isNull(i16) ? null : cursorS.getString(i16);
                    iS23 = i16;
                    int i17 = iS24;
                    int iP = z7h.p(cursorS.getInt(i17));
                    iS24 = i17;
                    int i18 = iS25;
                    koe koeVarX = z7h.x(cursorS.getBlob(i18));
                    iS25 = i18;
                    int i19 = iS26;
                    boolean z2 = cursorS.getInt(i19) != 0;
                    iS26 = i19;
                    int i20 = iS27;
                    boolean z3 = cursorS.getInt(i20) != 0;
                    iS27 = i20;
                    int i21 = iS28;
                    boolean z4 = cursorS.getInt(i21) != 0;
                    iS28 = i21;
                    int i22 = iS29;
                    boolean z5 = cursorS.getInt(i22) != 0;
                    iS29 = i22;
                    int i23 = iS30;
                    long j9 = cursorS.getLong(i23);
                    iS30 = i23;
                    int i24 = iS31;
                    long j10 = cursorS.getLong(i24);
                    iS31 = i24;
                    int i25 = iS32;
                    iS32 = i25;
                    arrayList.add(new h5o(string, iR, string2, string3, ib6VarA, ib6VarA2, j, j2, j3, new xo5(koeVarX, iP, z2, z3, z4, z5, j9, j10, z7h.e(cursorS.getBlob(i25))), i2, iO, j4, j5, j6, j7, z, iQ, i8, i10, j8, i13, i15, string4));
                }
                cursorS.close();
                e6iVar.release();
                return arrayList;
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

    public final ArrayList c() throws Throwable {
        e6i e6iVar;
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iS12 = mkh.s(cursorS, "backoff_delay_duration");
            int iS13 = mkh.s(cursorS, "last_enqueue_time");
            int iS14 = mkh.s(cursorS, "minimum_retention_duration");
            e6iVar = e6iVarE;
            try {
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
                    i = i3;
                    int i4 = iS15;
                    long j7 = cursorS.getLong(i4);
                    iS15 = i4;
                    int i5 = iS16;
                    boolean z = cursorS.getInt(i5) != 0;
                    iS16 = i5;
                    int i6 = iS17;
                    int iQ = z7h.q(cursorS.getInt(i6));
                    iS17 = i6;
                    int i7 = iS18;
                    int i8 = cursorS.getInt(i7);
                    iS18 = i7;
                    int i9 = iS19;
                    int i10 = cursorS.getInt(i9);
                    iS19 = i9;
                    int i11 = iS20;
                    long j8 = cursorS.getLong(i11);
                    iS20 = i11;
                    int i12 = iS21;
                    int i13 = cursorS.getInt(i12);
                    iS21 = i12;
                    int i14 = iS22;
                    int i15 = cursorS.getInt(i14);
                    iS22 = i14;
                    int i16 = iS23;
                    String string4 = cursorS.isNull(i16) ? null : cursorS.getString(i16);
                    iS23 = i16;
                    int i17 = iS24;
                    int iP = z7h.p(cursorS.getInt(i17));
                    iS24 = i17;
                    int i18 = iS25;
                    koe koeVarX = z7h.x(cursorS.getBlob(i18));
                    iS25 = i18;
                    int i19 = iS26;
                    boolean z2 = cursorS.getInt(i19) != 0;
                    iS26 = i19;
                    int i20 = iS27;
                    boolean z3 = cursorS.getInt(i20) != 0;
                    iS27 = i20;
                    int i21 = iS28;
                    boolean z4 = cursorS.getInt(i21) != 0;
                    iS28 = i21;
                    int i22 = iS29;
                    boolean z5 = cursorS.getInt(i22) != 0;
                    iS29 = i22;
                    int i23 = iS30;
                    long j9 = cursorS.getLong(i23);
                    iS30 = i23;
                    int i24 = iS31;
                    long j10 = cursorS.getLong(i24);
                    iS31 = i24;
                    int i25 = iS32;
                    iS32 = i25;
                    arrayList.add(new h5o(string, iR, string2, string3, ib6VarA, ib6VarA2, j, j2, j3, new xo5(koeVarX, iP, z2, z3, z4, z5, j9, j10, z7h.e(cursorS.getBlob(i25))), i2, iO, j4, j5, j6, j7, z, iQ, i8, i10, j8, i13, i15, string4));
                }
                cursorS.close();
                e6iVar.release();
                return arrayList;
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

    public final ArrayList d() throws Throwable {
        e6i e6iVar;
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iS12 = mkh.s(cursorS, "backoff_delay_duration");
            int iS13 = mkh.s(cursorS, "last_enqueue_time");
            int iS14 = mkh.s(cursorS, "minimum_retention_duration");
            e6iVar = e6iVarE;
            try {
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
                    i = i3;
                    int i4 = iS15;
                    long j7 = cursorS.getLong(i4);
                    iS15 = i4;
                    int i5 = iS16;
                    boolean z = cursorS.getInt(i5) != 0;
                    iS16 = i5;
                    int i6 = iS17;
                    int iQ = z7h.q(cursorS.getInt(i6));
                    iS17 = i6;
                    int i7 = iS18;
                    int i8 = cursorS.getInt(i7);
                    iS18 = i7;
                    int i9 = iS19;
                    int i10 = cursorS.getInt(i9);
                    iS19 = i9;
                    int i11 = iS20;
                    long j8 = cursorS.getLong(i11);
                    iS20 = i11;
                    int i12 = iS21;
                    int i13 = cursorS.getInt(i12);
                    iS21 = i12;
                    int i14 = iS22;
                    int i15 = cursorS.getInt(i14);
                    iS22 = i14;
                    int i16 = iS23;
                    String string4 = cursorS.isNull(i16) ? null : cursorS.getString(i16);
                    iS23 = i16;
                    int i17 = iS24;
                    int iP = z7h.p(cursorS.getInt(i17));
                    iS24 = i17;
                    int i18 = iS25;
                    koe koeVarX = z7h.x(cursorS.getBlob(i18));
                    iS25 = i18;
                    int i19 = iS26;
                    boolean z2 = cursorS.getInt(i19) != 0;
                    iS26 = i19;
                    int i20 = iS27;
                    boolean z3 = cursorS.getInt(i20) != 0;
                    iS27 = i20;
                    int i21 = iS28;
                    boolean z4 = cursorS.getInt(i21) != 0;
                    iS28 = i21;
                    int i22 = iS29;
                    boolean z5 = cursorS.getInt(i22) != 0;
                    iS29 = i22;
                    int i23 = iS30;
                    long j9 = cursorS.getLong(i23);
                    iS30 = i23;
                    int i24 = iS31;
                    long j10 = cursorS.getLong(i24);
                    iS31 = i24;
                    int i25 = iS32;
                    iS32 = i25;
                    arrayList.add(new h5o(string, iR, string2, string3, ib6VarA, ib6VarA2, j, j2, j3, new xo5(koeVarX, iP, z2, z3, z4, z5, j9, j10, z7h.e(cursorS.getBlob(i25))), i2, iO, j4, j5, j6, j7, z, iQ, i8, i10, j8, i13, i15, string4));
                }
                cursorS.close();
                e6iVar.release();
                return arrayList;
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

    public final ArrayList e() {
        e6i e6iVar;
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iS12 = mkh.s(cursorS, "backoff_delay_duration");
            int iS13 = mkh.s(cursorS, "last_enqueue_time");
            int iS14 = mkh.s(cursorS, "minimum_retention_duration");
            e6iVar = e6iVarE;
            try {
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
                    i = i3;
                    int i4 = iS15;
                    long j7 = cursorS.getLong(i4);
                    iS15 = i4;
                    int i5 = iS16;
                    boolean z = cursorS.getInt(i5) != 0;
                    iS16 = i5;
                    int i6 = iS17;
                    int iQ = z7h.q(cursorS.getInt(i6));
                    iS17 = i6;
                    int i7 = iS18;
                    int i8 = cursorS.getInt(i7);
                    iS18 = i7;
                    int i9 = iS19;
                    int i10 = cursorS.getInt(i9);
                    iS19 = i9;
                    int i11 = iS20;
                    long j8 = cursorS.getLong(i11);
                    iS20 = i11;
                    int i12 = iS21;
                    int i13 = cursorS.getInt(i12);
                    iS21 = i12;
                    int i14 = iS22;
                    int i15 = cursorS.getInt(i14);
                    iS22 = i14;
                    int i16 = iS23;
                    String string4 = cursorS.isNull(i16) ? null : cursorS.getString(i16);
                    iS23 = i16;
                    int i17 = iS24;
                    int iP = z7h.p(cursorS.getInt(i17));
                    iS24 = i17;
                    int i18 = iS25;
                    koe koeVarX = z7h.x(cursorS.getBlob(i18));
                    iS25 = i18;
                    int i19 = iS26;
                    boolean z2 = cursorS.getInt(i19) != 0;
                    iS26 = i19;
                    int i20 = iS27;
                    boolean z3 = cursorS.getInt(i20) != 0;
                    iS27 = i20;
                    int i21 = iS28;
                    boolean z4 = cursorS.getInt(i21) != 0;
                    iS28 = i21;
                    int i22 = iS29;
                    boolean z5 = cursorS.getInt(i22) != 0;
                    iS29 = i22;
                    int i23 = iS30;
                    long j9 = cursorS.getLong(i23);
                    iS30 = i23;
                    int i24 = iS31;
                    long j10 = cursorS.getLong(i24);
                    iS31 = i24;
                    int i25 = iS32;
                    iS32 = i25;
                    arrayList.add(new h5o(string, iR, string2, string3, ib6VarA, ib6VarA2, j, j2, j3, new xo5(koeVarX, iP, z2, z3, z4, z5, j9, j10, z7h.e(cursorS.getBlob(i25))), i2, iO, j4, j5, j6, j7, z, iQ, i8, i10, j8, i13, i15, string4));
                }
                cursorS.close();
                e6iVar.release();
                return arrayList;
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

    public final int f(String str) {
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT state FROM workspec WHERE id=?");
        e6iVarE.w(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorS = workDatabase_Impl.s(e6iVarE);
        try {
            int iR = 0;
            if (cursorS.moveToFirst()) {
                Integer numValueOf = cursorS.isNull(0) ? null : Integer.valueOf(cursorS.getInt(0));
                if (numValueOf != null) {
                    iR = z7h.r(numValueOf.intValue());
                }
            }
            return iR;
        } finally {
            cursorS.close();
            e6iVarE.release();
        }
    }

    public final h5o g(String str) throws Throwable {
        e6i e6iVar;
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT * FROM workspec WHERE id=?");
        e6iVarE.w(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iS12 = mkh.s(cursorS, "backoff_delay_duration");
            int iS13 = mkh.s(cursorS, "last_enqueue_time");
            int iS14 = mkh.s(cursorS, "minimum_retention_duration");
            e6iVar = e6iVarE;
            try {
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
                h5o h5oVar = null;
                if (cursorS.moveToFirst()) {
                    h5oVar = new h5o(cursorS.getString(iS), z7h.r(cursorS.getInt(iS2)), cursorS.getString(iS3), cursorS.getString(iS4), ib6.a(cursorS.getBlob(iS5)), ib6.a(cursorS.getBlob(iS6)), cursorS.getLong(iS7), cursorS.getLong(iS8), cursorS.getLong(iS9), new xo5(z7h.x(cursorS.getBlob(iS25)), z7h.p(cursorS.getInt(iS24)), cursorS.getInt(iS26) != 0, cursorS.getInt(iS27) != 0, cursorS.getInt(iS28) != 0, cursorS.getInt(iS29) != 0, cursorS.getLong(iS30), cursorS.getLong(iS31), z7h.e(cursorS.getBlob(iS32))), cursorS.getInt(iS10), z7h.o(cursorS.getInt(iS11)), cursorS.getLong(iS12), cursorS.getLong(iS13), cursorS.getLong(iS14), cursorS.getLong(iS15), cursorS.getInt(iS16) != 0, z7h.q(cursorS.getInt(iS17)), cursorS.getInt(iS18), cursorS.getInt(iS19), cursorS.getLong(iS20), cursorS.getInt(iS21), cursorS.getInt(iS22), cursorS.isNull(iS23) ? null : cursorS.getString(iS23));
                }
                cursorS.close();
                e6iVar.release();
                return h5oVar;
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

    public final void h(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) this.l;
        ap9 ap9VarF = uzkVar.f();
        ap9VarF.T0(1, j);
        ap9VarF.w(2, str);
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

    public final void i() {
        if (((nz) this.k) == null || ((String) this.l) == null || ((String) this.m) == null || ((String) this.n) == null) {
            return;
        }
        ((iy) this.a).K();
    }

    public final void j(String str, ly lyVar) {
        try {
            new hy((t9f) ((jy) this.b).get(), str, lyVar, (byte) 2).g();
        } catch (IllegalArgumentException unused) {
            ks3.D(new ny(str));
        }
    }

    public final void k(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) this.k;
        ap9 ap9VarF = uzkVar.f();
        ap9VarF.w(1, str);
        ap9VarF.T0(2, i);
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

    public final void l(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) this.h;
        ap9 ap9VarF = uzkVar.f();
        ap9VarF.T0(1, j);
        ap9VarF.w(2, str);
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

    public final void m(String str, ib6 ib6Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) this.g;
        ap9 ap9VarF = uzkVar.f();
        ib6 ib6Var2 = ib6.b;
        ap9VarF.Z0(1, cqp.H0(ib6Var));
        ap9VarF.w(2, str);
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

    public final void n(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) this.d;
        ap9 ap9VarF = uzkVar.f();
        ap9VarF.T0(1, z7h.w(i));
        ap9VarF.w(2, str);
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

    public final void o(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) this.n;
        ap9 ap9VarF = uzkVar.f();
        ap9VarF.T0(1, i);
        ap9VarF.w(2, str);
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
}
