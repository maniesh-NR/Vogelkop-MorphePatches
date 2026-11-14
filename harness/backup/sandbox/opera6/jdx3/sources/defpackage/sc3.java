package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class sc3 implements rsf {
    public final f1p a;
    public final t56 b;

    public sc3(f1p f1pVar, t56 t56Var) {
        this.a = f1pVar;
        this.b = t56Var;
    }

    @Override // defpackage.rsf
    public final int a() {
        return 0;
    }

    @Override // defpackage.rsf
    public final void b(long j, boolean z) {
        this.b.p(3, -1, System.currentTimeMillis());
    }

    @Override // defpackage.rsf
    public final void c() {
        this.b.p(7, 1, 969L);
    }

    @Override // defpackage.rsf
    public final void d(rsf rsfVar) {
        t56 t56Var = ((sc3) rsfVar).b;
        t56 t56Var2 = this.b;
        if (t56Var2.n(4) != null) {
            t56Var.q(4, -1, (Integer) t56Var2.n(4));
        }
        if (t56Var2.n(5) != null) {
            pf0 pf0Var = (pf0) t56Var2.n(5);
            pf0 pf0Var2 = new pf0(2169, 1, 3);
            if (pf0Var.n(0) != null) {
                pf0Var2.q(0, 1, (String) pf0Var.n(0));
            }
            if (pf0Var.n(1) != null) {
                pf0Var2.q(1, 1, (String) pf0Var.n(1));
            }
            if (pf0Var.n(2) != null) {
                pf0Var2.q(2, 1, (String) pf0Var.n(2));
            }
            t56Var.q(5, 1, pf0Var2);
        }
        if (t56Var2.n(6) != null) {
            t56Var.q(6, 1, (Long) t56Var2.n(6));
        }
        if (t56Var2.n(8) != null) {
            t56Var.q(8, 1, (Long) t56Var2.n(8));
        }
        if (t56Var2.n(9) != null) {
            t56Var.q(9, 1, (Long) t56Var2.n(9));
        }
        if (t56Var2.n(10) != null) {
            da0 da0Var = (da0) t56Var2.n(10);
            da0 da0Var2 = new da0(2169, 1, 10);
            if (da0Var.n(0) != null) {
                da0Var2.q(0, 1, (Boolean) da0Var.n(0));
            }
            if (da0Var.n(1) != null) {
                da0Var2.q(1, 1, (Boolean) da0Var.n(1));
            }
            if (da0Var.n(2) != null) {
                da0Var2.q(2, 1, (Boolean) da0Var.n(2));
            }
            if (da0Var.n(3) != null) {
                da0Var2.q(3, 1, (Boolean) da0Var.n(3));
            }
            if (da0Var.n(4) != null) {
                da0Var2.q(4, 1, (Boolean) da0Var.n(4));
            }
            if (da0Var.n(5) != null) {
                da0Var2.q(5, 1, (Boolean) da0Var.n(5));
            }
            if (da0Var.n(6) != null) {
                da0Var2.q(6, 1, (Boolean) da0Var.n(6));
            }
            if (da0Var.n(7) != null) {
                da0Var2.q(7, 1, (Boolean) da0Var.n(7));
            }
            if (da0Var.n(8) != null) {
                da0Var2.q(8, 1, (Boolean) da0Var.n(8));
            }
            if (da0Var.n(9) != null) {
                da0Var2.q(9, 1, (Boolean) da0Var.n(9));
            }
            t56Var.q(10, 1, da0Var2);
        }
    }

    @Override // defpackage.rsf
    public final rsf e(rsf rsfVar) {
        t56 t56Var = ((sc3) rsfVar).b;
        t56 t56Var2 = this.b;
        t56Var2.m(t56Var);
        return new sc3(this.a, t56Var2);
    }

    @Override // defpackage.rsf
    public final String f() {
        return (String) this.b.n(0);
    }

    @Override // defpackage.rsf
    public final void g(int i, int i2, int i3) {
    }

    @Override // defpackage.rsf
    public final void h(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        this.b.t(byteArrayOutputStream, j);
    }

    @Override // defpackage.rsf
    public final void i(int i, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        t56 t56Var = this.b;
        t56Var.p(3, -1, jCurrentTimeMillis);
        t56Var.o(4, -1, 0);
        qsf.a.getClass();
        t56Var.p(6, 1, 969L);
        qsf.a.getClass();
        t56Var.p(8, 1, 104L);
        qsf.a.getClass();
        t56Var.p(9, 1, 0L);
        Context context = (Context) this.a.a;
        AdvertisingIdClient.Info advertisingIdInfo = null;
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            } catch (IOException | GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException | SecurityException unused) {
            }
        }
        if (advertisingIdInfo != null) {
            if (!TextUtils.isEmpty(advertisingIdInfo.getId())) {
                pf0 pf0Var = (pf0) t56Var.n(5);
                if (pf0Var == null) {
                    t56Var.q(5, 1, new pf0(2169, 1, 3));
                    pf0Var = (pf0) t56Var.n(5);
                }
                pf0Var.x(0, advertisingIdInfo.getId());
            }
            da0 da0Var = (da0) t56Var.n(10);
            if (da0Var == null) {
                t56Var.q(10, 1, new da0(2169, 1, 10));
                da0Var = (da0) t56Var.n(10);
            }
            da0Var.r(7, 1, !advertisingIdInfo.isLimitAdTrackingEnabled());
        }
    }

    @Override // defpackage.rsf
    public final boolean isEmpty() {
        t56 t56Var = this.b;
        Map map = (Map) t56Var.n(11);
        Map mapUnmodifiableMap = map != null ? Collections.unmodifiableMap(map) : null;
        if (mapUnmodifiableMap != null && !mapUnmodifiableMap.isEmpty()) {
            return false;
        }
        Map map2 = (Map) t56Var.n(12);
        Map mapUnmodifiableMap2 = map2 != null ? Collections.unmodifiableMap(map2) : null;
        if (mapUnmodifiableMap2 != null && !mapUnmodifiableMap2.isEmpty()) {
            return false;
        }
        Map map3 = (Map) t56Var.n(13);
        Map mapUnmodifiableMap3 = map3 != null ? Collections.unmodifiableMap(map3) : null;
        if (mapUnmodifiableMap3 != null && !mapUnmodifiableMap3.isEmpty()) {
            return false;
        }
        Map map4 = (Map) t56Var.n(14);
        Map mapUnmodifiableMap4 = map4 != null ? Collections.unmodifiableMap(map4) : null;
        if (mapUnmodifiableMap4 != null && !mapUnmodifiableMap4.isEmpty()) {
            return false;
        }
        Map map5 = (Map) t56Var.n(15);
        Map mapUnmodifiableMap5 = map5 != null ? Collections.unmodifiableMap(map5) : null;
        if (mapUnmodifiableMap5 != null && !mapUnmodifiableMap5.isEmpty()) {
            return false;
        }
        List list = (List) t56Var.n(16);
        List listUnmodifiableList = list != null ? Collections.unmodifiableList(list) : null;
        if (listUnmodifiableList != null && !listUnmodifiableList.isEmpty()) {
            return false;
        }
        Map map6 = (Map) t56Var.n(17);
        Map mapUnmodifiableMap6 = map6 != null ? Collections.unmodifiableMap(map6) : null;
        if (mapUnmodifiableMap6 != null && !mapUnmodifiableMap6.isEmpty()) {
            return false;
        }
        Map map7 = (Map) t56Var.n(19);
        Map mapUnmodifiableMap7 = map7 != null ? Collections.unmodifiableMap(map7) : null;
        if (mapUnmodifiableMap7 != null && !mapUnmodifiableMap7.isEmpty()) {
            return false;
        }
        Map map8 = (Map) t56Var.n(20);
        Map mapUnmodifiableMap8 = map8 != null ? Collections.unmodifiableMap(map8) : null;
        return (mapUnmodifiableMap8 == null || mapUnmodifiableMap8.isEmpty()) && ((eh0) t56Var.n(18)) == null;
    }

    @Override // defpackage.rsf
    public final void j(String str) {
        this.b.q(0, str == null ? 0 : 1, str);
    }
}
