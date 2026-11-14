package defpackage;

import android.hardware.camera2.CaptureResult;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qd4 implements sc4, AutoCloseable {
    public final qfe a;
    public final e3a b;
    public final qu5 c;
    public final od4 d;
    public final pd4 e;
    public final int f;

    public qd4(qfe qfeVar, e3a e3aVar, qu5 qu5Var, od4 od4Var, pd4 pd4Var) {
        this.a = qfeVar;
        this.b = e3aVar;
        this.c = qu5Var;
        this.d = od4Var;
        this.e = pd4Var;
        bf2 bf2Var = rd4.a;
        bf2Var.getClass();
        this.f = bf2.b.incrementAndGet(bf2Var);
    }

    public static Object k(qd4 qd4Var, List list, List list2, List list3, jyc jycVar, y10 y10Var, oz2 oz2Var, long j, long j2, nt5 nt5Var, int i) {
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            list3 = null;
        }
        if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) != 0) {
            y10Var = null;
        }
        if ((i & 1024) != 0) {
            oz2Var = null;
        }
        if (!qd4Var.a.a()) {
            return qd4Var.c.a(list, list2, list3, jycVar, y10Var, oz2Var, 60, new Long(j), new Long(j2), nt5Var);
        }
        kp5.b(qd4Var, " after close.", "Cannot call lock3A on ");
        return null;
    }

    public static cd5 l(qd4 qd4Var, final boolean z, final boolean z2, long j) {
        if (qd4Var.a.a()) {
            kp5.b(qd4Var, " after close.", "Cannot call lock3AForCapture on ");
            return null;
        }
        qu5 qu5Var = qd4Var.c;
        qu5Var.getClass();
        Map map = qu5.q;
        Map map2 = z ? map : qu5.p;
        final byte b = 0;
        Function1 function1 = new Function1() { // from class: ou5
            /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r8) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ou5.invoke(java.lang.Object):java.lang.Object");
            }
        };
        djc djcVar = qu5Var.d;
        cd5 cd5Var = qu5.r;
        e3a e3aVar = qu5Var.a;
        if (e3aVar.c.l() == null) {
            return cd5Var;
        }
        if (map2 != null) {
            map = map2;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Intrinsics.a(((Map.Entry) it.next()).getValue(), 1);
        }
        s0i s0iVar = new s0i(function1, 60, Long.valueOf(j));
        djcVar.d(s0iVar);
        if (e3aVar.d(map)) {
            e3aVar.e(qu5Var.c.a());
            return s0iVar.d;
        }
        djcVar.a.remove(s0iVar);
        return cd5Var;
    }

    public static cd5 p(qd4 qd4Var, long j, int i) {
        n08 n08Var;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (qd4Var.a.a()) {
            kp5.b(qd4Var, " after close.", "Cannot call unlock3A on ");
            return null;
        }
        qu5 qu5Var = qd4Var.c;
        Long l = new Long(j2);
        cd5 cd5Var = qu5.r;
        e3a e3aVar = qu5Var.a;
        fe4 fe4Var = ge4.Oo;
        ge4 ge4Var = qu5Var.b;
        fe4Var.getClass();
        Boolean bool4 = !fe4.a(ge4Var) ? null : bool;
        if (!Intrinsics.a(bool2, bool) && !Intrinsics.a(bool4, bool) && !Intrinsics.a(bool3, bool)) {
            return sfe.d(new r0i(0, null));
        }
        if (e3aVar.c.l() != null) {
            if (Intrinsics.a(bool4, bool)) {
                if (e3aVar.d(qu5.o)) {
                    m3a.b(qu5Var.c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
                }
            }
            boolean zA = Intrinsics.a(bool2, bool);
            boolean zA2 = Intrinsics.a(bool4, bool);
            boolean zA3 = Intrinsics.a(bool3, bool);
            if (zA || zA2 || zA3) {
                n08 linkedHashMap = new LinkedHashMap();
                if (zA) {
                    linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, qu5.s);
                }
                if (zA2) {
                    linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, qu5.t);
                }
                if (zA3) {
                    linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, qu5.u);
                }
                n08Var = linkedHashMap;
            } else {
                n08Var = n08.a;
            }
            s0i s0iVar = new s0i(new w37(n08Var, (byte) 3), 60, l);
            qu5Var.d.d(s0iVar);
            Boolean bool5 = Intrinsics.a(bool2, bool) ? Boolean.FALSE : null;
            Boolean bool6 = Intrinsics.a(bool3, bool) ? Boolean.FALSE : null;
            if (bool5 != null || bool6 != null) {
                m3a.b(qu5Var.c, null, null, null, null, null, null, null, bool5, null, bool6, 383);
            }
            e3aVar.e(qu5Var.c.a());
            return s0iVar.d;
        }
        return cd5Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d.a) {
        }
        synchronized (this.e.a) {
        }
        this.a.b();
    }

    public final cd5 m() {
        byte b;
        y10 y10Var = null;
        if (this.a.a()) {
            kp5.b(this, " after close.", "Cannot call setTorchOn on ");
            return null;
        }
        qu5 qu5Var = this.c;
        y10 y10Var2 = ((gak) qu5Var.c.a.a).a;
        List list = y10.b;
        if (y10Var2 == null || ((b = y10Var2.a) != 1 && b != 0)) {
            y10Var = new y10(1);
        }
        return qu5.b(qu5Var, y10Var, null, null, new o79(2), null, null, null, 118);
    }

    public final void n() {
        if (this.a.a()) {
            kp5.b(this, " after close.", "Cannot call stopRepeating on ");
        } else {
            this.b.c(null);
        }
    }

    public final void o(ArrayList arrayList) {
        Object obj;
        if (this.a.a()) {
            kp5.b(this, " after close.", "Cannot call submit on ");
            return;
        }
        if (arrayList.isEmpty()) {
            qp2.n("Cannot call submit with an empty list of Requests!");
            return;
        }
        e3a e3aVar = this.b;
        e3aVar.getClass();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((lvh) obj).f != null) {
                break;
            }
        }
        lvh lvhVar = (lvh) obj;
        if (lvhVar == null || e3aVar.b.d != null) {
            d3a d3aVar = e3aVar.c;
            if (d3aVar.g.b0(new s2a(arrayList))) {
                return;
            }
            d3aVar.h(arrayList);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot submit ");
        sb.append(lvhVar);
        f9b f9bVar = lvhVar.f;
        sb.append(" with input request ");
        sb.append(f9bVar);
        sb.append(" to ");
        sb.append(e3aVar);
        sb.append(" because CameraGraph was not configured to support reprocessing");
        throw new IllegalStateException(sb.toString().toString());
    }

    public final cd5 q(boolean z) {
        if (this.a.a()) {
            kp5.b(this, " after close.", "Cannot call unlock3APostCapture on ");
            return null;
        }
        cd5 cd5Var = qu5.r;
        qu5 qu5Var = this.c;
        e3a e3aVar = qu5Var.a;
        if (e3aVar.c.l() != null) {
            if (e3aVar.d(z ? qu5.z : qu5.y)) {
                s0i s0iVar = z ? new s0i(qu5.A, null, null) : new s0i(n08.a);
                qu5Var.d.d(s0iVar);
                e3aVar.e(qu5Var.c.a());
                return s0iVar.d;
            }
        }
        return cd5Var;
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f;
    }
}
