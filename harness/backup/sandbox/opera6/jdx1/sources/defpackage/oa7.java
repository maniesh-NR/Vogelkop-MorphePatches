package defpackage;

import ads_mobile_sdk.p22;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.preference.PreferenceManager;
import android.view.textclassifier.TextClassifier;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class oa7 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public long v;
    public Object w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa7(long j, hnc hncVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 2;
        this.v = j;
        this.y = hncVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa7(long j, Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = j;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa7(p22 p22Var, long j, Network network, NetworkCapabilities networkCapabilities, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 5;
        this.w = p22Var;
        this.v = j;
        this.x = network;
        this.y = networkCapabilities;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa7(Context context, Context context2, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 6;
        this.x = context;
        this.y = context2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa7(spi spiVar, long j, mqh mqhVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 4;
        this.x = spiVar;
        this.v = j;
        this.y = mqhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa7(wgg wggVar, String str, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.x = wggVar;
        this.y = str;
        this.v = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return new oa7(this.v, (ra7) this.w, (gg6) this.x, (ua7) obj2, mt5Var, (byte) 0);
            case 1:
                return new oa7(this.v, (dg9) this.w, (zrm) this.x, (cd5) obj2, mt5Var, (byte) 1);
            case 2:
                oa7 oa7Var = new oa7(this.v, (hnc) obj2, mt5Var);
                oa7Var.x = obj;
                return oa7Var;
            case 3:
                oa7 oa7Var2 = new oa7((wgg) this.x, (String) obj2, this.v, mt5Var);
                oa7Var2.w = obj;
                return oa7Var2;
            case 4:
                oa7 oa7Var3 = new oa7((spi) this.x, this.v, (mqh) obj2, mt5Var);
                oa7Var3.w = obj;
                return oa7Var3;
            case 5:
                return new oa7((p22) this.w, this.v, (Network) this.x, (NetworkCapabilities) obj2, mt5Var);
            default:
                oa7 oa7Var4 = new oa7((Context) this.x, (Context) obj2, mt5Var);
                oa7Var4.w = obj;
                return oa7Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.t) {
            case 2:
                create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        dnc dncVar;
        RealWebSocket realWebSocket;
        SharedPreferences defaultSharedPreferences;
        Long q0iVar;
        long jLongValue;
        Object objA;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    long j = this.v;
                    s71 s71Var = new s71((ra7) this.w, (gg6) this.x, (ua7) this.y, (mt5) null, (byte) 11);
                    this.u = true;
                    if (uyg.w(j, s71Var, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    long j2 = this.v;
                    this.u = true;
                    if (nb6.p(j2, this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                dg9 dg9Var = (dg9) this.w;
                zrm zrmVar = (zrm) this.x;
                cd5 cd5Var = (cd5) this.y;
                dg9Var.getClass();
                cd5Var.B0(new gc4("Cancelled by cancelFocusAndMetering()"));
                hak hakVar = dg9Var.c;
                synchronized (hakVar.d) {
                    hakVar.l = null;
                }
                hakVar.f();
                zrmVar.e();
                return Unit.a;
            case 2:
                hnc hncVar = (hnc) this.y;
                long j3 = this.v;
                z1h z1hVar = (z1h) this.x;
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    dnc dncVar2 = new dnc(NotificationCompat.CATEGORY_EVENT, j3);
                    z1hVar.b((Object) null);
                    try {
                        enc encVar = new enc(j3, hncVar, z1hVar);
                        HashMap map = hncVar.g;
                        boolean zIsEmpty = map.isEmpty();
                        if (zIsEmpty) {
                            hncVar.b();
                        }
                        pr prVar = hncVar.m;
                        if (prVar != null) {
                            orb orbVar = new orb();
                            orbVar.p(NotificationCompat.CATEGORY_EVENT, "envelope_type");
                            orbVar.o(j3, "id");
                            prVar.e("observe", Collections.singletonList(orbVar), null);
                        }
                        this.x = null;
                        this.w = dncVar2;
                        this.u = true;
                        nb6.f(this);
                        return px5Var3;
                    } catch (Throwable th) {
                        th = th;
                        dncVar = dncVar2;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dncVar = (dnc) this.w;
                    try {
                        ybh.y(obj);
                        throw new pxb();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                hncVar.f.remove(Long.valueOf(dncVar.b));
                HashMap map2 = hncVar.g;
                if (((enc) map2.remove(dncVar)) != null) {
                    if (hncVar.m != null && map2.isEmpty()) {
                        hncVar.d.p(new ug(hncVar.h, (byte) 26));
                        ewn ewnVar = hncVar.n;
                        if (ewnVar != null && (realWebSocket = ewnVar.c) != null) {
                            realWebSocket.cancel();
                        }
                        hncVar.a(false);
                    }
                    pr prVar2 = hncVar.m;
                    if (prVar2 != null) {
                        orb orbVar2 = new orb();
                        orbVar2.p(dncVar.a, "envelope_type");
                        orbVar2.o(dncVar.b, "id");
                        prVar2.e("stop_observing", Collections.singletonList(orbVar2), null);
                    }
                }
                throw th;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    TextClassifier textClassifier = (TextClassifier) this.w;
                    wgg wggVar = (wgg) this.x;
                    String str = (String) this.y;
                    long j4 = this.v;
                    this.u = true;
                    if (wggVar.a(str, j4, textClassifier, this) == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 4:
                spi spiVar = (spi) this.x;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    qpi qpiVar = (qpi) this.w;
                    float fH = spiVar.h(this.v);
                    g9 g9Var = new g9((mqh) this.y, spiVar, qpiVar, (byte) 26);
                    this.u = true;
                    if (mfh.g(fH, null, g9Var, this, 12) == px5Var5) {
                        return px5Var5;
                    }
                } else {
                    if (!z5) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    p22 p22Var = (p22) this.w;
                    long j5 = this.v;
                    Network network = (Network) this.x;
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) this.y;
                    this.u = true;
                    if (p22Var.a(j5, network, networkCapabilities, false, this) == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    Context context = (Context) this.x;
                    List list = r8p.a;
                    defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Context context2 = (Context) this.x;
                    try {
                        p0i p0iVar = t0i.b;
                        q0iVar = new Long(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).lastUpdateTime);
                    } catch (Throwable th3) {
                        p0i p0iVar2 = t0i.b;
                        q0iVar = new q0i(th3);
                    }
                    Long l = new Long(0L);
                    if (q0iVar instanceof q0i) {
                        q0iVar = l;
                    }
                    jLongValue = q0iVar.longValue();
                    if (defaultSharedPreferences.getLong("opera.ads.sdk.install_referrer_lut", -1L) == jLongValue) {
                        zlp.a = true;
                        return Unit.a;
                    }
                    Context context3 = (Context) this.x;
                    this.w = defaultSharedPreferences;
                    this.v = jLongValue;
                    this.u = true;
                    objA = zlp.a(context3, this);
                    if (objA == px5Var7) {
                        return px5Var7;
                    }
                } else {
                    if (!z7) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j6 = this.v;
                    SharedPreferences sharedPreferences = (SharedPreferences) this.w;
                    ybh.y(obj);
                    jLongValue = j6;
                    defaultSharedPreferences = sharedPreferences;
                    objA = obj;
                }
                ReferrerDetails referrerDetails = (ReferrerDetails) objA;
                if (referrerDetails != null) {
                    SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
                    editorEdit.putLong("opera.ads.sdk.install_referrer_lut", jLongValue);
                    editorEdit.commit();
                    zlp.a = true;
                    Context context4 = (Context) this.y;
                    String installReferrer = referrerDetails.getInstallReferrer();
                    if (installReferrer == null || installReferrer.length() <= 0) {
                        installReferrer = null;
                    }
                    Long l2 = new Long(referrerDetails.getReferrerClickTimestampSeconds());
                    Long l3 = l2.longValue() > 0 ? l2 : null;
                    Long l4 = new Long(referrerDetails.getInstallBeginTimestampSeconds());
                    Long l5 = l4.longValue() > 0 ? l4 : null;
                    Long l6 = new Long(referrerDetails.getReferrerClickTimestampServerSeconds());
                    Long l7 = l6.longValue() > 0 ? l6 : null;
                    Long l8 = new Long(referrerDetails.getInstallBeginTimestampServerSeconds());
                    p8p.a(new fnp(installReferrer, l3, l5, l7, l8.longValue() > 0 ? l8 : null, Boolean.valueOf(referrerDetails.getGooglePlayInstantParam()), yro.c(context4), jLongValue, yro.b(context4)));
                }
                return Unit.a;
        }
    }
}
