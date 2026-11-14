package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.work.Worker;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class xvo extends ozb implements Function0 {
    public static final xvo j;
    public static final xvo k;
    public static final xvo l;
    public static final xvo m;
    public static final xvo n;
    public static final xvo o;
    public static final xvo p;
    public static final xvo q;
    public static final xvo r;
    public static final xvo s;
    public static final xvo t;
    public static final xvo u;
    public final /* synthetic */ byte i;

    static {
        int i = 0;
        j = new xvo((byte) 0, i);
        k = new xvo((byte) 1, i);
        l = new xvo((byte) 2, i);
        m = new xvo((byte) 3, i);
        n = new xvo((byte) 4, i);
        o = new xvo((byte) 5, i);
        p = new xvo((byte) 6, i);
        q = new xvo((byte) 7, i);
        r = new xvo((byte) 8, i);
        s = new xvo((byte) 9, i);
        t = new xvo((byte) 10, i);
        u = new xvo((byte) 11, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvo(byte b, int i) {
        super(i);
        this.i = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvo(Worker worker) {
        super(0);
        this.i = (byte) 12;
    }

    public final Object invoke() {
        switch (this.i) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return new ong(uqh.a(f4p.class), new Annotation[0]);
            case 2:
                return new yqi("com.opera.ads.internal.analytics.TrackEventImpl", uqh.a(p8p.class), new itb[]{uqh.a(xjo.class), uqh.a(soo.class), uqh.a(rro.class), uqh.a(qxo.class), uqh.a(izo.class), uqh.a(i1p.class), uqh.a(x2p.class), uqh.a(r5p.class), uqh.a(b9p.class), uqh.a(cap.class), uqh.a(ebp.class), uqh.a(bdp.class), uqh.a(tep.class), uqh.a(wfp.class), uqh.a(fnp.class), uqh.a(nio.class), uqh.a(c1p.class), uqh.a(n8p.class), uqh.a(acp.class), uqh.a(xcp.class), uqh.a(rdp.class), uqh.a(qep.class), uqh.a(qfp.class)}, new KSerializer[]{mgo.a, kmo.a, lqo.a, svo.a, oyo.a, d0p.a, b2p.a, v3p.a, c8p.a, k9p.a, uap.a, rcp.a, hep.a, ifp.a, bnp.a, jio.a, z0p.a, l8p.a, ybp.a, vcp.a, odp.a, mep.a, nfp.a}, new Annotation[0]);
            case 3:
                return Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            case 4:
                cv6 cv6Var = bb7.a;
                mr6 mr6Var = mr6.b;
                return e.a(kmm.b.K(1, (String) null), zch.a());
            case 5:
                pfp.b();
                return new z8p();
            case 6:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                ejo ejoVar = fko.a;
                fko.b.add(new lmo(new qqo(concurrentHashMap, (byte) 15), (byte) 0));
                return concurrentHashMap;
            case 7:
                Regex regex = esd.e;
                return wyh.x("application/json; charset=utf-8");
            case 8:
                return phj.o(rpb.d, p9p.k);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return UUID.randomUUID().toString();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                EnumSet enumSetOf = EnumSet.of(wlp.WEBVIEW_RECEIVED_ERROR, wlp.WEBVIEW_RECEIVED_HTTP_ERROR, wlp.WEBVIEW_RECEIVED_SSL_ERROR, wlp.WEBVIEW_RENDER_PROCESS_GONE, wlp.WEBVIEW_RENDER_PROCESS_UNRESPONSIVE, wlp.AD_LOAD_IN_WEBVIEW);
                ArrayList arrayList = new ArrayList(k95.o(enumSetOf, 10));
                Iterator it = enumSetOf.iterator();
                while (it.hasNext()) {
                    arrayList.add(((wlp) it.next()).a);
                }
                return CollectionsKt.n0(arrayList);
            case 11:
                return Bitmap.createBitmap(new int[]{0}, 1, 1, Bitmap.Config.ARGB_8888);
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }
}
