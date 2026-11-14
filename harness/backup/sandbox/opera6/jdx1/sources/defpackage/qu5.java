package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class qu5 {
    public static final w37 A;
    public static final List f = Arrays.asList(2, 4, 3);
    public static final List g = Arrays.asList(2, 3);
    public static final List h = Arrays.asList(2, 6, 4, 5);
    public static final List i = Collections.singletonList(3);
    public static final List j = Collections.singletonList(3);
    public static final List k = Arrays.asList(4, 5);
    public static final List l = Arrays.asList(2, 4, 3);
    public static final List m = Arrays.asList(2, 3);
    public static final Map n;
    public static final Map o;
    public static final Map p;
    public static final Map q;
    public static final cd5 r;
    public static final List s;
    public static final List t;
    public static final List u;
    public static final Map v;
    public static final Map w;
    public static final Map x;
    public static final Map y;
    public static final Map z;
    public final e3a a;
    public final ge4 b;
    public final m3a c;
    public final djc d;
    public cd5 e;

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        n = Collections.singletonMap(key, 1);
        o = Collections.singletonMap(key, 2);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        p = Collections.singletonMap(key2, 1);
        q = rbd.c(new Pair[]{new Pair(key, 1), new Pair(key2, 1)});
        r = sfe.d(new r0i(4, null));
        s = Arrays.asList(0, 1, 2, 4);
        List listAsList = Arrays.asList(0, 3, 1, 2, 6);
        t = listAsList;
        u = Arrays.asList(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        v = Collections.singletonMap(key3, bool);
        w = rbd.c(new Pair[]{new Pair(key, 2), new Pair(key3, bool)});
        x = Collections.singletonMap(key3, Boolean.FALSE);
        y = Collections.singletonMap(key2, 2);
        z = rbd.c(new Pair[]{new Pair(key, 2), new Pair(key2, 2)});
        A = new w37(Collections.singletonMap(CaptureResult.CONTROL_AF_STATE, listAsList), (byte) 3);
    }

    public qu5(e3a e3aVar, ge4 ge4Var, m3a m3aVar, djc djcVar) {
        this.a = e3aVar;
        this.b = ge4Var;
        this.c = m3aVar;
        this.d = djcVar;
    }

    public static cd5 b(qu5 qu5Var, y10 y10Var, v40 v40Var, gw2 gw2Var, o79 o79Var, List list, List list2, List list3, int i2) {
        v40 v40Var2 = (i2 & 2) != 0 ? null : v40Var;
        gw2 gw2Var2 = (i2 & 4) != 0 ? null : gw2Var;
        o79 o79Var2 = (i2 & 8) != 0 ? null : o79Var;
        List list4 = (i2 & 16) != 0 ? null : list;
        List list5 = (i2 & 32) != 0 ? null : list2;
        List list6 = (i2 & 64) != 0 ? null : list3;
        if (qu5Var.a.c.l() == null) {
            m3a.b(qu5Var.c, y10Var, v40Var2, gw2Var2, o79Var2, list4, list5, list6, null, null, null, 896);
            qu5Var.a.e(qu5Var.c.a());
            return r;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (y10Var != null) {
        }
        if (v40Var2 != null) {
        }
        if (gw2Var2 != null) {
        }
        if (o79Var2 != null) {
        }
        s0i s0iVar = new s0i(rbd.i(linkedHashMap));
        qu5Var.d.d(s0iVar);
        m3a.b(qu5Var.c, y10Var, v40Var2, gw2Var2, o79Var2, list4, list5, list6, null, null, null, 896);
        qu5Var.a.e(qu5Var.c.a());
        cd5 cd5Var = s0iVar.d;
        synchronized (qu5Var) {
            Objects.toString(qu5Var.e);
            cd5 cd5Var2 = qu5Var.e;
            if (cd5Var2 != null) {
                cd5Var2.k(na2.a("A newer call for 3A state update initiated.", null));
            }
            qu5Var.e = cd5Var;
        }
        return cd5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r27, java.util.List r28, java.util.List r29, defpackage.jyc r30, defpackage.y10 r31, kotlin.jvm.functions.Function1 r32, int r33, java.lang.Long r34, java.lang.Long r35, nt5 r36) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu5.a(java.util.List, java.util.List, java.util.List, jyc, y10, kotlin.jvm.functions.Function1, int, java.lang.Long, java.lang.Long, nt5):java.lang.Object");
    }
}
