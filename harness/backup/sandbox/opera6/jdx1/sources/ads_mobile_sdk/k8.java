package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import defpackage.avj;
import defpackage.bql;
import defpackage.cpj;
import defpackage.cs5;
import defpackage.dvj;
import defpackage.fbp;
import defpackage.ia6;
import defpackage.jip;
import defpackage.n7p;
import defpackage.p3p;
import defpackage.prb;
import defpackage.ugp;
import defpackage.vtp;
import defpackage.xdp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class k8 extends k61 {
    public final Context c;
    public final qr0 d;
    public final ax0 e;
    public final g0 f;
    public final qw g;
    public final String h;
    public final ux2 i;
    public e7 j;

    public k8(Context context, qr0 qr0Var, ax0 ax0Var, g0 g0Var, qw qwVar, String str, ux2 ux2Var) {
        super(fw0.CUI_NAME_SDKINIT_INIT_SPAM, 2);
        this.c = context;
        this.d = qr0Var;
        this.e = ax0Var;
        this.f = g0Var;
        this.g = qwVar;
        this.h = str;
        this.i = ux2Var;
    }

    public final Uri a(Uri uri, View view) {
        String strA = a(view, Collections.singletonList(uri));
        if (StringsKt.N(strA)) {
            return uri;
        }
        dvj dvjVar = ax0.f;
        return dvj.a(uri, strA);
    }

    public final String a(cy0 cy0Var, ve2 ve2Var, v31 v31Var) {
        String strA = a(cy0Var);
        long j = ve2Var != null ? ve2Var.a.get() : 0L;
        String str = null;
        if (v31Var != null) {
            ji jiVar = v31Var.a;
            xtb xtbVar = v31.b[0];
            Map map = (Map) jiVar.getValue(v31Var);
            Object obj = map != null ? map.get("targetPackageName") : null;
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        prb prbVar = new prb();
        prbVar.r("ms", strA);
        if (j > 0) {
            prbVar.p(Long.valueOf(j), "plcmtid");
        }
        qr0 qr0Var = this.d;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:enable_impression_data:enabled", Boolean.TRUE, fo.a)).booleanValue() && str != null && str.length() != 0) {
            prbVar.r("subpn", str);
        }
        return prbVar.toString();
    }

    public final String a(View view, String str) {
        e7 e7Var = this.j;
        if (e7Var == null) {
            e7Var = null;
        }
        return ((h7) e7Var.a).a(c(), str, view, this.f.b());
    }

    public final String a(View view, List list) {
        String queryParameter;
        if ((list instanceof Collection) && list.isEmpty()) {
            return "";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            ax0 ax0Var = this.e;
            ax0Var.getClass();
            if (ax0Var.b(uri) && ax0Var.a(uri) && ((queryParameter = uri.getQueryParameter("ms")) == null || StringsKt.N(queryParameter))) {
                ux2 ux2Var = this.i;
                fw0 fw0Var = fw0.CUI_NAME_CLICK_SIGNALS;
                l08 l08Var = l08.a;
                kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                if (hh3.b().a == null) {
                    wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                    try {
                        e7 e7Var = this.j;
                        String strA = ((h7) (e7Var != null ? e7Var : null).a).a(c(), a(list), view, this.f.b());
                        wk2VarA.close();
                        return strA;
                    } catch (Throwable th) {
                        try {
                            wk2VarA.b(th);
                            if (th instanceof iyo) {
                                throw th;
                            }
                            wk2VarA.a(th);
                            if (th instanceof kql) {
                                throw new uw0((kql) th);
                            }
                            if (th instanceof CancellationException) {
                                throw new ou0(th);
                            }
                            if (th instanceof mv0) {
                                throw th;
                            }
                            throw new tu0(th);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                vtp.v(wk2VarA, th2);
                                throw th3;
                            }
                        }
                    }
                }
                rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                try {
                    e7 e7Var2 = this.j;
                    String strA2 = ((h7) (e7Var2 != null ? e7Var2 : null).a).a(c(), a(list), view, this.f.b());
                    rg3VarA.close();
                    return strA2;
                } catch (Throwable th4) {
                    try {
                        rg3VarA.b(th4);
                        if (th4 instanceof iyo) {
                            throw th4;
                        }
                        rg3VarA.a(th4);
                        if (th4 instanceof kql) {
                            throw new uw0((kql) th4);
                        }
                        if (th4 instanceof CancellationException) {
                            throw new ou0(th4);
                        }
                        if (th4 instanceof mv0) {
                            throw th4;
                        }
                        throw new tu0(th4);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            vtp.v(rg3VarA, th5);
                            throw th6;
                        }
                    }
                }
            }
        }
        return "";
    }

    public final String a(ViewGroup viewGroup) {
        e7 e7Var = this.j;
        if (e7Var == null) {
            e7Var = null;
        }
        return ((h7) e7Var.a).b(c(), null, viewGroup, this.f.b());
    }

    public final String a(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Uri uri = (Uri) next;
            if (this.e.b(uri) && uri.getQueryParameter("ai") != null) {
                break;
            }
        }
        Uri uri2 = (Uri) next;
        if (uri2 == null) {
            return null;
        }
        return uri2.getQueryParameter("ai");
    }

    public final String b(View view, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (this.e.b((Uri) obj)) {
                ux2 ux2Var = this.i;
                fw0 fw0Var = fw0.CUI_NAME_VIEW_SIGNALS;
                l08 l08Var = l08.a;
                kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                if (hh3.b().a == null) {
                    wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                    try {
                        e7 e7Var = this.j;
                        String strB = ((h7) (e7Var != null ? e7Var : null).a).b(c(), a(arrayList), view, this.f.b());
                        wk2VarA.close();
                        return strB;
                    } catch (Throwable th) {
                        try {
                            wk2VarA.b(th);
                            if (th instanceof iyo) {
                                throw th;
                            }
                            wk2VarA.a(th);
                            if (th instanceof kql) {
                                throw new uw0((kql) th);
                            }
                            if (th instanceof CancellationException) {
                                throw new ou0(th);
                            }
                            if (th instanceof mv0) {
                                throw th;
                            }
                            throw new tu0(th);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                vtp.v(wk2VarA, th2);
                                throw th3;
                            }
                        }
                    }
                }
                rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                try {
                    e7 e7Var2 = this.j;
                    String strB2 = ((h7) (e7Var2 != null ? e7Var2 : null).a).b(c(), a(arrayList), view, this.f.b());
                    rg3VarA.close();
                    return strB2;
                } catch (Throwable th4) {
                    try {
                        rg3VarA.b(th4);
                        if (th4 instanceof iyo) {
                            throw th4;
                        }
                        rg3VarA.a(th4);
                        if (th4 instanceof kql) {
                            throw new uw0((kql) th4);
                        }
                        if (th4 instanceof CancellationException) {
                            throw new ou0(th4);
                        }
                        if (th4 instanceof mv0) {
                            throw th4;
                        }
                        throw new tu0(th4);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            vtp.v(rg3VarA, th5);
                            throw th6;
                        }
                    }
                }
            }
        }
        return "";
    }

    public final void b(List list) {
        e7 e7Var = this.j;
        if (e7Var == null) {
            e7Var = null;
        }
        da3 da3Var = ((h7) e7Var.a).c.b;
        synchronized (da3Var) {
            da3Var.a.clear();
            da3Var.a.addAll(list);
        }
    }

    public final Context c() {
        Activity activityB = this.f.b();
        return activityB != null ? activityB : this.c;
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        e7 e7Var;
        Context context = this.c;
        s9e s9eVar = this.g.d;
        xdp xdpVar = this.d.u;
        n7p n7pVarN = l7.N();
        n7pVarN.b$1();
        l7 l7Var = (l7) n7pVarN.b;
        l7Var.getClass();
        l7Var.hostType_ = p3p.b(2);
        l7Var.bitField0_ |= 64;
        xdpVar.getClass();
        Boolean bool = Boolean.TRUE;
        fo foVar = fo.a;
        boolean zBooleanValue = ((Boolean) xdpVar.a("gads:ad_spam_gass_call:enabled", bool, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var2 = (l7) n7pVarN.b;
        l7Var2.bitField0_ |= NotificationCompat.FLAG_HIGH_PRIORITY;
        l7Var2.enableGassClient_ = zBooleanValue;
        boolean zBooleanValue2 = ((Boolean) xdpVar.a("gads:as_af:enabled", bool, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var3 = (l7) n7pVarN.b;
        l7Var3.bitField0_ |= 4;
        l7Var3.allowFallback_ = zBooleanValue2;
        Boolean bool2 = Boolean.FALSE;
        boolean zBooleanValue3 = ((Boolean) xdpVar.a("gads:as_afsp:enabled", bool2, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var4 = (l7) n7pVarN.b;
        l7Var4.bitField0_ |= 8;
        l7Var4.allowFallbackToStaticProgram_ = zBooleanValue3;
        boolean zBooleanValue4 = ((Boolean) xdpVar.a("gads:as_fisp:enabled", bool2, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var5 = (l7) n7pVarN.b;
        l7Var5.bitField0_ |= 16;
        l7Var5.forceInitializeWithStaticProgram_ = zBooleanValue4;
        boolean zBooleanValue5 = ((Boolean) xdpVar.a("gads:as_spuwsp:enabled", bool2, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var6 = (l7) n7pVarN.b;
        l7Var6.bitField0_ |= 33554432;
        l7Var6.skipProgramUpdateWithStaticProgram_ = zBooleanValue5;
        fo foVar2 = fo.a$11;
        int i_a$2 = sko._a$2(((Number) xdpVar.a("gads:as_rav", (Object) 2, (Function1) foVar2)).intValue());
        if (i_a$2 == 0) {
            i_a$2 = 2;
        }
        n7pVarN.b$1();
        l7 l7Var7 = (l7) n7pVarN.b;
        l7Var7.getClass();
        l7Var7.requestedAdshieldVersion_ = sko.b(i_a$2);
        l7Var7.bitField0_ |= 1;
        int i_a$22 = sko._a$2(((Number) xdpVar.a("gads:as_fav", (Object) 1, (Function1) foVar2)).intValue());
        if (i_a$22 == 0) {
            i_a$22 = 2;
        }
        n7pVarN.b$1();
        l7 l7Var8 = (l7) n7pVarN.b;
        l7Var8.getClass();
        l7Var8.fallbackAdshieldVersion_ = sko.b(i_a$22);
        l7Var8.bitField0_ |= 2;
        boolean zBooleanValue6 = ((Boolean) xdpVar.a("gads:as_emcs:enabled", bool2, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var9 = (l7) n7pVarN.b;
        l7Var9.bitField0_ |= 16777216;
        l7Var9.enableMinimalCerSignal_ = zBooleanValue6;
        ugp ugpVarT = tm1.t();
        fo foVar3 = fo.a$23;
        String str = (String) xdpVar.a("gads:as_rcs", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", foVar3);
        ugpVarT.b$1();
        ((tm1) ugpVarT.b).b(str);
        float fFloatValue = ((Number) xdpVar.a("gads:as_lsr", Float.valueOf(0.01f), fo.a$10)).floatValue();
        ugpVarT.b$1();
        tm1 tm1Var = (tm1) ugpVarT.b;
        tm1Var.bitField0_ |= 2;
        tm1Var.logSampleRate_ = fFloatValue;
        fo foVar4 = fo.a$16;
        long jLongValue = ((Number) xdpVar.a("gads:as_lbs", (Object) 1000L, (Function1) foVar4)).longValue();
        ugpVarT.b$1();
        tm1 tm1Var2 = (tm1) ugpVarT.b;
        tm1Var2.bitField0_ |= 4;
        tm1Var2.logBufferSize_ = jLongValue;
        on7 on7Var = pn7.b;
        un7 un7Var = un7.f;
        long jLongValue2 = ((Number) xdpVar.a("gads:as_li_ms", Long.valueOf(pn7.f(cs5.x0(1, un7Var))), foVar4)).longValue();
        ugpVarT.b$1();
        tm1 tm1Var3 = (tm1) ugpVarT.b;
        tm1Var3.bitField0_ |= 8;
        tm1Var3.logIntervalMs_ = jLongValue2;
        tm1 tm1Var4 = (tm1) ugpVarT.a();
        n7pVarN.b$1();
        ((l7) n7pVarN.b).a(tm1Var4);
        boolean zBooleanValue7 = ((Boolean) xdpVar.a("gads:as_vsb:enabled", bool2, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var10 = (l7) n7pVarN.b;
        l7Var10.bitField0_ |= NotificationCompat.FLAG_GROUP_SUMMARY;
        l7Var10.enableViewstringBinding_ = zBooleanValue7;
        un7 un7Var2 = un7.e;
        long jLongValue3 = ((Number) xdpVar.a("gads:as_st_ms", Long.valueOf(pn7.f(cs5.x0(1, un7Var2))), foVar4)).longValue();
        n7pVarN.b$1();
        l7 l7Var11 = (l7) n7pVarN.b;
        l7Var11.bitField0_ |= 2048;
        l7Var11.signalsTimeoutMs_ = jLongValue3;
        long jLongValue4 = ((Number) xdpVar.a("gads:as_asqs_ms", (Object) 100L, (Function1) foVar4)).longValue();
        n7pVarN.b$1();
        l7 l7Var12 = (l7) n7pVarN.b;
        l7Var12.bitField0_ |= 1024;
        l7Var12.appStartQuerySignalsTimeoutMs_ = jLongValue4;
        long jLongValue5 = ((Number) xdpVar.a("gads:as_asw_ms", Long.valueOf(pn7.f(cs5.x0(5, un7Var2))), foVar4)).longValue();
        n7pVarN.b$1();
        l7 l7Var13 = (l7) n7pVarN.b;
        l7Var13.bitField0_ |= 524288;
        l7Var13.appStartWindowMs_ = jLongValue5;
        boolean zBooleanValue8 = ((Boolean) xdpVar.a("gads:as_emassqs:enabled", bool, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var14 = (l7) n7pVarN.b;
        l7Var14.bitField0_ |= 1048576;
        l7Var14.enableMinimalAppStartQuerySignals_ = zBooleanValue8;
        long jLongValue6 = ((Number) xdpVar.a("gads:as_gst_ms", (Object) 200L, (Function1) foVar4)).longValue();
        n7pVarN.b$1();
        l7 l7Var15 = (l7) n7pVarN.b;
        l7Var15.bitField0_ |= 8192;
        l7Var15.gassSignalTimeoutMs_ = jLongValue6;
        long jLongValue7 = ((Number) xdpVar.a("gads:as_list_ms", (Object) 200L, (Function1) foVar4)).longValue();
        n7pVarN.b$1();
        l7 l7Var16 = (l7) n7pVarN.b;
        l7Var16.bitField0_ |= 16384;
        l7Var16.localIntSignalTimeoutMs_ = jLongValue7;
        long jLongValue8 = ((Number) xdpVar.a("gads:as_hrt_ms", Long.valueOf(pn7.f(cs5.x0(10, un7Var))), foVar4)).longValue();
        n7pVarN.b$1();
        l7 l7Var17 = (l7) n7pVarN.b;
        l7Var17.bitField0_ |= 32768;
        l7Var17.httpRequestTimeoutMs_ = jLongValue8;
        String str2 = (String) xdpVar.a("gads:as_pic", "", foVar3);
        n7pVarN.b$1();
        ((l7) n7pVarN.b).d(str2);
        String str3 = (String) xdpVar.a("gads:as_dic", "", foVar3);
        n7pVarN.b$1();
        ((l7) n7pVarN.b).b(str3);
        long jLongValue9 = ((Number) xdpVar.a("gads:as_mt_ms", Long.valueOf(pn7.f(cs5.x0(500, un7.d))), foVar4)).longValue();
        n7pVarN.b$1();
        l7 l7Var18 = (l7) n7pVarN.b;
        l7Var18.bitField0_ |= 262144;
        l7Var18.methodTimeoutMs_ = jLongValue9;
        boolean zBooleanValue9 = ((Boolean) xdpVar.a("gads:as_caau:enabled", bool, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var19 = (l7) n7pVarN.b;
        l7Var19.bitField0_ |= 2097152;
        l7Var19.clearDgArgsAfterUse_ = zBooleanValue9;
        boolean zBooleanValue10 = ((Boolean) xdpVar.a("gads:as_ls:enabled", bool2, foVar)).booleanValue();
        n7pVarN.b$1();
        l7 l7Var20 = (l7) n7pVarN.b;
        l7Var20.bitField0_ |= 8388608;
        l7Var20.enableLazyScheduler_ = zBooleanValue10;
        jip jipVarW = ul2.w();
        boolean zBooleanValue11 = ((Boolean) xdpVar.a("gads:as_ubi:enabled", bool2, foVar)).booleanValue();
        jipVarW.b$1();
        ul2 ul2Var = (ul2) jipVarW.b;
        ul2Var.bitField0_ |= 4;
        ul2Var.updateBeforeInitialization_ = zBooleanValue11;
        long jLongValue10 = ((Number) xdpVar.a("gads:as_aspud_ms", (Object) 0L, (Function1) foVar4)).longValue();
        jipVarW.b$1();
        ul2 ul2Var2 = (ul2) jipVarW.b;
        ul2Var2.bitField0_ |= 64;
        ul2Var2.appStartProgramUpdateDelayMs_ = jLongValue10;
        long jLongValue11 = ((Number) xdpVar.a("gads:as_pae_ms", Long.valueOf(pn7.f(cs5.x0(1, un7.g))), foVar4)).longValue();
        jipVarW.b$1();
        ul2 ul2Var3 = (ul2) jipVarW.b;
        ul2Var3.bitField0_ |= 16;
        ul2Var3.programAlmostExpiredMs_ = jLongValue11;
        String str4 = (String) xdpVar.a("gads:as_pru", "https://pagead2.googlesyndication.com/mads/asp", foVar3);
        jipVarW.b$1();
        ((ul2) jipVarW.b).b(str4);
        boolean zBooleanValue12 = ((Boolean) xdpVar.a("gads:as_rpd:enabled", bool2, foVar)).booleanValue();
        jipVarW.b$1();
        ul2 ul2Var4 = (ul2) jipVarW.b;
        ul2Var4.bitField0_ |= NotificationCompat.FLAG_HIGH_PRIORITY;
        ul2Var4.enableRetryDownload_ = zBooleanValue12;
        long jLongValue12 = ((Number) xdpVar.a("gads:as_mrpda", (Object) 5L, (Function1) foVar4)).longValue();
        jipVarW.b$1();
        ul2 ul2Var5 = (ul2) jipVarW.b;
        ul2Var5.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        ul2Var5.maxRetryCount_ = jLongValue12;
        long jLongValue13 = ((Number) xdpVar.a("gads:as_rbi_ms", (Object) 60000L, (Function1) foVar4)).longValue();
        jipVarW.b$1();
        ul2 ul2Var6 = (ul2) jipVarW.b;
        ul2Var6.bitField0_ |= NotificationCompat.FLAG_GROUP_SUMMARY;
        ul2Var6.retryBaseIntervalMs_ = jLongValue13;
        ul2 ul2Var7 = (ul2) jipVarW.a();
        n7pVarN.b$1();
        ((l7) n7pVarN.b).a(ul2Var7);
        n7p n7pVar = (n7p) ((l7) n7pVarN.a()).n();
        String str5 = this.h;
        n7pVar.b$1();
        ((l7) n7pVar.b).c(str5);
        l7 l7Var21 = (l7) n7pVar.a();
        synchronized (e7.b) {
            e7Var = e7.c;
            if (e7Var == null) {
                context.getClass();
                e7 e7Var2 = new e7(new ia6(new cpj((byte) 16), new ftj((byte) 11), new avj((byte) 12), s9eVar, context, l7Var21));
                e7.c = e7Var2;
                e7Var = e7Var2;
            }
        }
        this.j = e7Var;
        n61 n61Var = ((h7) e7Var.a).a;
        synchronized (n61Var) {
            if (n61Var.e == null) {
                Set set = (Set) n61Var.b.get();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((fbp) it.next()).a());
                }
                th3 th3Var = (th3) n61Var.d.get();
                fl0 fl0Var = fl0.EVENT_ID_INITIALIZATION;
                f7 f7VarI = g7.i(new a95(h1b.r(arrayList)), new bql((byte) 15), n61Var.c);
                th3Var.a(fl0Var, (ef9) f7VarI);
                n61Var.e = f7VarI;
                Iterator it2 = ((Set) n61Var.a.get()).iterator();
                while (it2.hasNext()) {
                    ((fbp) it2.next()).a();
                }
                n61Var.e.getClass();
            }
        }
        return new hv0(Unit.a);
    }
}
