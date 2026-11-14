package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;
import com.usercentrics.sdk.UsercentricsOptions;
import com.usercentrics.sdk.UsercentricsReadyStatus;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes.dex */
public final /* synthetic */ class hv implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hv(byte b, Object obj, Object obj2, String str) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = str;
    }

    public /* synthetic */ hv(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ hv(vt9 vt9Var, lr4 lr4Var, hqj hqjVar, uae uaeVar) {
        this.a = (byte) 15;
        this.c = vt9Var;
        this.b = lr4Var;
        this.d = hqjVar;
    }

    public final Object invoke() {
        int i;
        List listClean;
        voh vohVar;
        voh vohVarW;
        voh vohVarW2;
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 1;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((hd) obj3).a((String) obj2, (jv) obj);
                return Unit.a;
            case 1:
                SharedPreferences.Editor editorEdit = ((SharedPreferences) ((a12) obj3).b.get()).edit();
                editorEdit.putString((String) obj2, (String) obj);
                editorEdit.apply();
                return Unit.a;
            case 2:
                return new qb7(new vk6((dx3) obj3, (umi) obj2), (wth) obj);
            case 3:
                s62 s62Var = (s62) obj3;
                return new p62((ole) s62Var.w.e, s62Var.f(), s62Var.x, s62Var.c, (a52) obj2, (Function1) obj);
            case 4:
                ((fw2) obj3).a();
                cf2 cf2Var = (cf2) ((wjh) obj2).d;
                int i2 = ((nqh) obj).a;
                do {
                    i = cf2Var.get();
                } while (!cf2Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return Unit.a;
            case 5:
                ztl ztlVar = (ztl) obj3;
                nx5 nx5Var = (nx5) obj2;
                afe afeVar = (afe) obj;
                if (ztlVar.b()) {
                    na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new bz1(b3, vohVar, ztlVar), 3);
                    afeVar.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 6:
                us3 us3Var = (us3) obj3;
                voh vohVarT0 = us3.T0(us3Var, (wye) obj2, (gb3) obj);
                if (vohVarT0 == null) {
                    return null;
                }
                mq5 mq5Var = us3Var.o;
                if (gcb.a(mq5Var.v, -1L)) {
                    d8b.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return vohVarT0.i(mq5Var.X0(vohVarT0, mq5Var.U0(), 0L) ^ (-9223372034707292160L));
            case 7:
                List list = (List) obj;
                String str = (String) obj2;
                CertificateChainCleaner certificateChainCleaner = ((nq4) obj3).b;
                if (certificateChainCleaner != null && (listClean = certificateChainCleaner.clean(list, str)) != null) {
                    list = listClean;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            case 8:
                ((r65) obj3).i((UsercentricsReadyStatus) obj2, (UsercentricsOptions) obj, null);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ConnectPlan.a((nq4) obj3, (i7a) obj2, (xv) obj);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                mq5 mq5Var2 = (mq5) obj3;
                vnm vnmVar = (vnm) obj2;
                xs3 xs3Var = (xs3) obj;
                wth wthVar = mq5Var2.t;
                while (true) {
                    dfe dfeVar = (dfe) wthVar.b;
                    int i3 = dfeVar.c;
                    if (i3 != 0) {
                        if (i3 == 0) {
                            h9o.h("MutableVector is empty.");
                            return null;
                        }
                        voh vohVar2 = (voh) ((jq5) dfeVar.a[i3 - 1]).a.invoke();
                        if (vohVar2 == null ? true : mq5.V0(mq5Var2, vohVar2, 0L, 0L, 3)) {
                            dfe dfeVar2 = (dfe) wthVar.b;
                            nh4 nh4Var = ((jq5) dfeVar2.l(dfeVar2.c - 1)).b;
                            Unit unit = Unit.a;
                            p0i p0iVar = t0i.b;
                            nh4Var.resumeWith(unit);
                        }
                    }
                }
                if (mq5Var2.u && (vohVar = (voh) mq5Var2.s.invoke()) != null && mq5.V0(mq5Var2, vohVar, 0L, 0L, 3)) {
                    mq5Var2.u = false;
                }
                vnmVar.e = mq5Var2.T0(xs3Var, 0L);
                return Unit.a;
            case 11:
                tt5 tt5Var = (tt5) obj3;
                return new cu5(tt5Var.f, tt5Var.k, tt5Var.l, (tsd) obj2, tt5Var.m, new q2(0, (x5f) obj, orm.class, "logContinueOnBookingImpression", "logContinueOnBookingImpression()V", 0, (byte) 22));
            case 12:
                return new pn6((auj) obj3, (oji) obj2, (w6j) obj);
            case 13:
                na2.B((nx5) obj3, (CoroutineContext) null, (rx5) null, new vr((g31) obj, (String) obj2, (mt5) null, (byte) 26), 3);
                return Unit.a;
            case 14:
                ts8 ts8Var = (ts8) obj3;
                return new rs8(ha2.M(ts8Var.d, ts8Var.c, 0), ts8Var.e, ts8Var.f, ts8Var.g, ts8Var.k, ts8Var.l, ts8Var.m, ts8Var.n, ts8Var.o, ts8Var.p, ts8Var.j, (pde) obj2, (p6l) obj, new ps8(ts8Var, (byte) 1));
            case 15:
                vt9 vt9Var = (vt9) obj3;
                lr4 lr4Var = (lr4) obj2;
                hqj hqjVar = (hqj) obj;
                jh5 jh5Var = vt9Var.M;
                lr4 lr4Var2 = jh5Var.b;
                try {
                    jh5Var.b = lr4Var;
                    hqj hqjVar2 = vt9Var.G;
                    int[] iArr = vt9Var.o;
                    jde jdeVar = vt9Var.v;
                    vt9Var.o = null;
                    vt9Var.v = null;
                    try {
                        vt9Var.G = hqjVar;
                        boolean z = jh5Var.e;
                        try {
                            jh5Var.e = false;
                            vt9Var.B((oag) null, (Object) null);
                            jh5Var.b = lr4Var2;
                            return Unit.a;
                        } finally {
                            jh5Var.e = z;
                        }
                    } finally {
                        vt9Var.G = hqjVar2;
                        vt9Var.o = iArr;
                        vt9Var.v = jdeVar;
                    }
                } catch (Throwable th) {
                    jh5Var.b = lr4Var2;
                    throw th;
                }
            case 16:
                return new nxa(((owa) obj3).a, (dll) obj2, (kze) obj);
            case 17:
                return new gxf((dr9) ((afe) obj3).getValue(), (Function1) ((afe) obj2).getValue(), ((Number) ((Function0) obj).invoke()).intValue());
            case SizeUtil.textSize0_1 /* 18 */:
                u6c u6cVar = (u6c) obj2;
                h6c h6cVar = (h6c) ((i37) obj3).getValue();
                return new i6c(u6cVar, h6cVar, (y4c) obj, new ro9((IntRange) ((o5c) u6cVar.e.f).getValue(), h6cVar));
            case 19:
                ((tjc) obj3).h((s3g) obj2, (ve9) obj);
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                ((tjc) obj3).f((q3g) obj2, (tu) obj);
                return Unit.a;
            case 21:
                tjc tjcVar = (tjc) obj3;
                s3g s3gVar = (s3g) obj2;
                su suVar = (su) obj;
                String str2 = s3gVar.a;
                if (str2 == null) {
                    str2 = s3gVar.d;
                }
                tjcVar.e(str2, s3gVar.b, false, new y0a(suVar, b2));
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                r3g r3gVar = (r3g) obj2;
                ((tjc) obj3).e(r3gVar.R0(), r3gVar.o(), true, (hu5) obj);
                return Unit.a;
            case 23:
                return ((Function2) obj3).invoke(((ekc) obj2).g(), ((ekc) obj).g());
            case SizeUtil.textSize2 /* 24 */:
                return ((Function2) obj3).invoke(((ikc) obj2).g(), ((pde) obj).g());
            case 25:
                ekc ekcVar = (ekc) obj2;
                ekc ekcVar2 = (ekc) obj;
                if (((ekc) obj3).i() && ekcVar.i() && ekcVar2.i()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                return new vpc(dj9.t((Context) obj3), (SettingsManager) ((j4c) obj2).get(), new onc((j4c) obj, b3));
            case 27:
                Function2 function2 = (Function2) obj3;
                pga pgaVar = (pga) obj;
                o1d o1dVar = (o1d) ((pqh) obj2).a;
                see seeVar = o1dVar.m;
                if (seeVar == null) {
                    long[] jArr = imi.a;
                    seeVar = new see();
                    o1dVar.m = seeVar;
                }
                Object objG = seeVar.g(pgaVar);
                if (objG == null) {
                    objG = new m1d(o1dVar);
                    seeVar.m(pgaVar, objG);
                }
                m1d m1dVar = (m1d) objG;
                m1dVar.a = false;
                function2.invoke(m1dVar, pgaVar);
                return Unit.a;
            case 28:
                nx5 nx5Var2 = (nx5) obj2;
                pej pejVar = (pej) obj;
                if (((Boolean) ((Function1) ((pej) obj3).d.d).invoke(qej.b)).booleanValue()) {
                    na2.B(nx5Var2, (CoroutineContext) null, (rx5) null, new c7e(pejVar, (mt5) null, (byte) 6), 3);
                }
                return Boolean.TRUE;
            default:
                wye wyeVar = (wye) obj2;
                lqh lqhVar = (lqh) obj;
                m1i m1iVar = wye.W;
                ((Function1) obj3).invoke(m1iVar);
                boolean zA = Intrinsics.a(wyeVar.J, m1iVar.o);
                z = wyeVar.M != m1iVar.p;
                w7d w7dVarA = m1iVar.o.a(m1iVar.r, m1iVar.u, m1iVar.t);
                m1iVar.x = w7dVarA;
                boolean zA2 = Intrinsics.a(wyeVar.L, w7dVarA != null ? w7dVarA.w() : null);
                lqhVar.a = !zA2;
                if (!zA || z || !zA2) {
                    wyeVar.J = m1iVar.o;
                    wyeVar.M = m1iVar.p;
                    w7d w7dVar = m1iVar.x;
                    voh vohVar3 = voh.e;
                    if (w7dVar == null || (vohVarW = w7dVar.w()) == null) {
                        vohVarW = vohVar3;
                    }
                    wyeVar.L = vohVarW;
                    w7d w7dVar2 = m1iVar.x;
                    if (w7dVar2 != null && (vohVarW2 = w7dVar2.w()) != null) {
                        ccb ccbVarF0 = f03.f0(vohVarW2);
                        vohVar3 = new voh(ccbVarF0.a, ccbVarF0.b, ccbVarF0.c, ccbVarF0.d);
                    }
                    wyeVar.K = vohVar3;
                    if (wyeVar.N && (z || (wyeVar.M && !zA))) {
                        wyeVar.u.F();
                    }
                }
                wyeVar.N = true;
                return Unit.a;
        }
    }
}
