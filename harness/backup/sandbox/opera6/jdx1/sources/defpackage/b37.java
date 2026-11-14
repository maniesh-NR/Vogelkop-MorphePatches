package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class b37 extends sc {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b37(y5i y5iVar, byte b) {
        super(y5iVar);
        this.d = b;
    }

    public final String j() {
        switch (this.d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void o(ap9 ap9Var, Object obj) throws IOException {
        int i;
        int i2;
        int[] iArrJ0;
        int[] iArrJ02;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.d) {
            case 0:
                x27 x27Var = (x27) obj;
                ap9Var.w(1, x27Var.a);
                ap9Var.w(2, x27Var.b);
                return;
            case 1:
                dsg dsgVar = (dsg) obj;
                ap9Var.w(1, dsgVar.a);
                ap9Var.T0(2, dsgVar.b.longValue());
                return;
            case 2:
                ap9Var.w(1, ((tzk) obj).a);
                ap9Var.T0(2, r13.b);
                ap9Var.T0(3, r13.c);
                return;
            case 3:
                b5o b5oVar = (b5o) obj;
                ap9Var.w(1, b5oVar.a);
                ap9Var.w(2, b5oVar.b);
                return;
            case 4:
                throw new ClassCastException();
            case 5:
                h5o h5oVar = (h5o) obj;
                ap9Var.w(1, h5oVar.a);
                ap9Var.T0(2, z7h.w(h5oVar.b));
                ap9Var.w(3, h5oVar.c);
                ap9Var.w(4, h5oVar.d);
                ib6 ib6Var = h5oVar.e;
                ib6 ib6Var2 = ib6.b;
                ap9Var.Z0(5, cqp.H0(ib6Var));
                ap9Var.Z0(6, cqp.H0(h5oVar.f));
                ap9Var.T0(7, h5oVar.g);
                ap9Var.T0(8, h5oVar.h);
                ap9Var.T0(9, h5oVar.i);
                ap9Var.T0(10, h5oVar.k);
                int iA = vep.A(h5oVar.l);
                if (iA == 0) {
                    i = 0;
                } else {
                    if (iA != 1) {
                        h9o.p();
                        return;
                    }
                    i = 1;
                }
                ap9Var.T0(11, i);
                ap9Var.T0(12, h5oVar.m);
                ap9Var.T0(13, h5oVar.n);
                ap9Var.T0(14, h5oVar.o);
                ap9Var.T0(15, h5oVar.p);
                ap9Var.T0(16, h5oVar.q ? 1L : 0L);
                int iA2 = vep.A(h5oVar.r);
                if (iA2 == 0) {
                    i2 = 0;
                } else {
                    if (iA2 != 1) {
                        h9o.p();
                        return;
                    }
                    i2 = 1;
                }
                ap9Var.T0(17, i2);
                ap9Var.T0(18, h5oVar.s);
                ap9Var.T0(19, h5oVar.t);
                ap9Var.T0(20, h5oVar.u);
                ap9Var.T0(21, h5oVar.v);
                ap9Var.T0(22, h5oVar.w);
                String str = h5oVar.x;
                if (str == null) {
                    ap9Var.j1(23);
                } else {
                    ap9Var.w(23, str);
                }
                xo5 xo5Var = h5oVar.j;
                int i4 = xo5Var.a;
                int iA3 = vep.A(i4);
                if (iA3 == 0) {
                    i3 = 0;
                } else if (iA3 == 1) {
                    i3 = 1;
                } else if (iA3 == 2) {
                    i3 = 2;
                } else if (iA3 != 3) {
                    if (iA3 == 4) {
                        i3 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                            uac.k(j7c.t(i4), " to int", "Could not convert ");
                            return;
                        }
                        i3 = 5;
                    }
                }
                ap9Var.T0(24, i3);
                NetworkRequest networkRequest = xo5Var.b.a;
                if (networkRequest == null) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            if (Build.VERSION.SDK_INT >= 31) {
                                iArrJ0 = m41.O(networkRequest);
                            } else {
                                int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                ArrayList arrayList = new ArrayList();
                                for (int i5 = 0; i5 < 10; i5++) {
                                    int i6 = iArr[i5];
                                    if (networkRequest.hasTransport(i6)) {
                                        arrayList.add(Integer.valueOf(i6));
                                    }
                                }
                                iArrJ0 = CollectionsKt.j0(arrayList);
                            }
                            if (Build.VERSION.SDK_INT >= 31) {
                                iArrJ02 = m41.a(networkRequest);
                            } else {
                                int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                ArrayList arrayList2 = new ArrayList();
                                for (int i7 = 0; i7 < 30; i7++) {
                                    int i8 = iArr2[i7];
                                    if (networkRequest.hasCapability(i8)) {
                                        arrayList2.add(Integer.valueOf(i8));
                                    }
                                }
                                iArrJ02 = CollectionsKt.j0(arrayList2);
                            }
                            objectOutputStream.writeInt(iArrJ0.length);
                            for (int i9 : iArrJ0) {
                                objectOutputStream.writeInt(i9);
                            }
                            objectOutputStream.writeInt(iArrJ02.length);
                            for (int i10 : iArrJ02) {
                                objectOutputStream.writeInt(i10);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                ap9Var.Z0(25, byteArray);
                ap9Var.T0(26, xo5Var.c ? 1L : 0L);
                ap9Var.T0(27, xo5Var.d ? 1L : 0L);
                ap9Var.T0(28, xo5Var.e ? 1L : 0L);
                ap9Var.T0(29, xo5Var.f ? 1L : 0L);
                ap9Var.T0(30, xo5Var.g);
                ap9Var.T0(31, xo5Var.h);
                Set<wo5> set = xo5Var.i;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (wo5 wo5Var : set) {
                                objectOutputStream2.writeUTF(wo5Var.a.toString());
                                objectOutputStream2.writeBoolean(wo5Var.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                        } finally {
                        }
                    } finally {
                    }
                }
                ap9Var.Z0(32, byteArray2);
                return;
            default:
                j5o j5oVar = (j5o) obj;
                ap9Var.w(1, j5oVar.a);
                ap9Var.w(2, j5oVar.b);
                return;
        }
    }

    public final void p(Object obj) {
        ap9 ap9VarF = f();
        try {
            o(ap9VarF, obj);
            ap9VarF.b.executeInsert();
        } finally {
            m(ap9VarF);
        }
    }
}
