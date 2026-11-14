package defpackage;

import ads_mobile_sdk.ae1;
import ads_mobile_sdk.ae3;
import ads_mobile_sdk.av0;
import ads_mobile_sdk.b82;
import ads_mobile_sdk.bl1;
import ads_mobile_sdk.bv0;
import ads_mobile_sdk.bw2;
import ads_mobile_sdk.cg0;
import ads_mobile_sdk.cp2;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.d91;
import ads_mobile_sdk.fs0;
import ads_mobile_sdk.gv2;
import ads_mobile_sdk.gx0;
import ads_mobile_sdk.h21;
import ads_mobile_sdk.hr1;
import ads_mobile_sdk.hv0;
import ads_mobile_sdk.iq3;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.iw1;
import ads_mobile_sdk.j21;
import ads_mobile_sdk.jp;
import ads_mobile_sdk.jx1;
import ads_mobile_sdk.jz2;
import ads_mobile_sdk.ks0;
import ads_mobile_sdk.mt0;
import ads_mobile_sdk.n5;
import ads_mobile_sdk.os2;
import ads_mobile_sdk.pn3;
import ads_mobile_sdk.qn2;
import ads_mobile_sdk.rf1;
import ads_mobile_sdk.ry0;
import ads_mobile_sdk.sb;
import ads_mobile_sdk.td1;
import ads_mobile_sdk.uo2;
import ads_mobile_sdk.vd1;
import ads_mobile_sdk.vs2;
import ads_mobile_sdk.xh3;
import ads_mobile_sdk.xu0;
import ads_mobile_sdk.yq3;
import ads_mobile_sdk.z2;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceRequest;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.webkit.Profile;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.AdError;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hkm extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hkm(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hkm(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkm(mt5 mt5Var, vd1 vd1Var, rap rapVar) {
        super(2, mt5Var);
        this.t = (byte) 26;
        this.v = vd1Var;
        this.w = rapVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                hkm hkmVar = new hkm((byte) 0, mt5Var, obj2);
                hkmVar.v = obj;
                return hkmVar;
            case 1:
                return new hkm((Function1) this.v, (cd5) obj2, mt5Var, (byte) 1);
            case 2:
                return new hkm((csm) this.v, (ArrayList) obj2, mt5Var, (byte) 2);
            case 3:
                return new hkm((f99) this.v, (man) obj2, mt5Var, (byte) 3);
            case 4:
                hkm hkmVar2 = new hkm((byte) 4, mt5Var, obj2);
                hkmVar2.v = obj;
                return hkmVar2;
            case 5:
                return new hkm((hoh) this.v, (View) obj2, mt5Var, (byte) 5);
            case 6:
                return new hkm((f99) this.v, (h6o) obj2, mt5Var, (byte) 6);
            case 7:
                return new hkm((byte) 7, mt5Var, obj2);
            case 8:
                return new hkm((mt0) this.v, (RelativeLayout) obj2, mt5Var, (byte) 8);
            case 9:
                return new hkm((vs2) this.v, (cp2) obj2, mt5Var, (byte) 9);
            case 10:
                return new hkm((gx0) this.v, (ConsoleMessage) obj2, mt5Var, (byte) 10);
            case 11:
                return new hkm((sb) this.v, (LinkedHashSet) obj2, mt5Var, (byte) 11);
            case 12:
                return new hkm((vs2) this.v, (CancellationException) obj2, mt5Var, (byte) 12);
            case 13:
                return new hkm((jx1) this.v, (pqb) obj2, mt5Var, (byte) 13);
            case 14:
                return new hkm((jp) this.v, (pn3) obj2, mt5Var, (byte) 14);
            case 15:
                return new hkm((hr1) this.v, (h21) obj2, mt5Var, (byte) 15);
            case 16:
                return new hkm((iw1) this.v, (ViewGroup) obj2, mt5Var, (byte) 16);
            case 17:
                return new hkm((cg0) this.v, (um) obj2, mt5Var, (byte) 17);
            case 18:
                return new hkm((ks0) this.v, (y46) obj2, mt5Var, (byte) 18);
            case 19:
                return new hkm((ry0) this.v, (String) obj2, mt5Var, (byte) 19);
            case 20:
                return new hkm((ae3) this.v, (AdError) obj2, mt5Var, (byte) 20);
            case 21:
                return new hkm((rf1) this.v, (on) obj2, mt5Var, (byte) 21);
            case 22:
                return new hkm((y7h) this.v, (egp) obj2, mt5Var, (byte) 22);
            case 23:
                return new hkm((byte) 23, mt5Var, obj2);
            case 24:
                return new hkm((ks0) this.v, (RelativeLayout) obj2, mt5Var, (byte) 24);
            case 25:
                return new hkm((n5) this.v, (String) obj2, mt5Var, (byte) 25);
            case 26:
                return new hkm(mt5Var, (vd1) this.v, (rap) obj2);
            case 27:
                return new hkm((h07) this.v, (b82) obj2, mt5Var, (byte) 27);
            case 28:
                return new hkm((gdj) this.v, (d3k) obj2, mt5Var, (byte) 28);
            default:
                return new hkm((ry0) this.v, (WebResourceRequest) obj2, mt5Var, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws pxb {
        byte b = this.t;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                return create(obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((qpn) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return new hkm((mt0) this.v, (RelativeLayout) obj3, (mt5) obj2, (byte) 8).invokeSuspend(Unit.a);
            case 9:
                return new hkm((vs2) this.v, (cp2) obj3, (mt5) obj2, (byte) 9).invokeSuspend(Unit.a);
            case 10:
                return new hkm((gx0) this.v, (ConsoleMessage) obj3, (mt5) obj2, (byte) 10).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return new hkm((vs2) this.v, (CancellationException) obj3, (mt5) obj2, (byte) 12).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return new hkm((jp) this.v, (pn3) obj3, (mt5) obj2, (byte) 14).invokeSuspend(Unit.a);
            case 15:
                return new hkm((hr1) this.v, (h21) obj3, (mt5) obj2, (byte) 15).invokeSuspend(Unit.a);
            case 16:
                return new hkm((iw1) this.v, (ViewGroup) obj3, (mt5) obj2, (byte) 16).invokeSuspend(Unit.a);
            case 17:
                return new hkm((cg0) this.v, (um) obj3, (mt5) obj2, (byte) 17).invokeSuspend(Unit.a);
            case 18:
                return new hkm((ks0) this.v, (y46) obj3, (mt5) obj2, (byte) 18).invokeSuspend(Unit.a);
            case 19:
                return new hkm((ry0) this.v, (String) obj3, (mt5) obj2, (byte) 19).invokeSuspend(Unit.a);
            case 20:
                return new hkm((ae3) this.v, (AdError) obj3, (mt5) obj2, (byte) 20).invokeSuspend(Unit.a);
            case 21:
                return new hkm((rf1) this.v, (on) obj3, (mt5) obj2, (byte) 21).invokeSuspend(Unit.a);
            case 22:
                return new hkm((y7h) this.v, (egp) obj3, (mt5) obj2, (byte) 22).invokeSuspend(Unit.a);
            case 23:
                return new hkm((byte) 23, (mt5) obj2, obj3).invokeSuspend(Unit.a);
            case 24:
                return new hkm((ks0) this.v, (RelativeLayout) obj3, (mt5) obj2, (byte) 24).invokeSuspend(Unit.a);
            case 25:
                return new hkm((n5) this.v, (String) obj3, (mt5) obj2, (byte) 25).invokeSuspend(Unit.a);
            case 26:
                return new hkm((mt5) obj2, (vd1) this.v, (rap) obj3).invokeSuspend(Unit.a);
            case 27:
                return new hkm((h07) this.v, (b82) obj3, (mt5) obj2, (byte) 27).invokeSuspend(Unit.a);
            case 28:
                new hkm((gdj) this.v, (d3k) obj3, (mt5) obj2, (byte) 28).invokeSuspend(Unit.a);
                return px5.a;
            default:
                return new hkm((ry0) this.v, (WebResourceRequest) obj3, (mt5) obj2, (byte) 29).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public final Object invokeSuspend(Object obj) throws pxb {
        Context context;
        Object objA;
        String strM;
        mt5 mt5Var;
        byte b = 0;
        switch (this.t) {
            case 0:
                Object obj2 = this.v;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    l99 l99Var = (l99) this.w;
                    this.v = null;
                    this.u = true;
                    if (l99Var.emit(obj2, this) == px5Var) {
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
                    Function1 function1 = (Function1) this.v;
                    this.u = true;
                    obj = function1.invoke(this);
                    if (obj == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                p37.f0((h07) obj, (cd5) this.w);
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    csm csmVar = (csm) this.v;
                    this.u = true;
                    obj = csmVar.invoke(this);
                    if (obj == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                ArrayList arrayList = (ArrayList) this.w;
                for (Object obj3 : (Iterable) obj) {
                    ?? r1 = b + 1;
                    if (b < 0) {
                        j95.n();
                        throw null;
                    }
                    p37.f0((h07) obj3, (bd5) arrayList.get(b));
                    b = r1;
                }
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    f99 f99Var = (f99) this.v;
                    o71 o71Var = new o71((man) this.w, (byte) 18);
                    this.u = true;
                    if (f99Var.collect(o71Var, this) == px5Var4) {
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
                WeatherWidgetActivity weatherWidgetActivity = (WeatherWidgetActivity) this.w;
                qpn qpnVar = (qpn) this.v;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    ptl ptlVar = qpnVar.a;
                    n68 n68Var = qpnVar.c;
                    int i = WeatherWidgetActivity.e0;
                    weatherWidgetActivity.setTitle(ptlVar.a.a(weatherWidgetActivity.getResources()));
                    weatherWidgetActivity.F0(ptlVar.b);
                    pt1 pt1Var = weatherWidgetActivity.Y;
                    LayoutDirectionToolbar layoutDirectionToolbar = (LayoutDirectionToolbar) (pt1Var == null ? null : pt1Var).c;
                    if (pt1Var == null) {
                        pt1Var = null;
                    }
                    layoutDirectionToolbar.A(weatherWidgetActivity.l0(((LayoutDirectionToolbar) pt1Var.c).getContext()));
                    if (!qpnVar.b) {
                        pt1 pt1Var2 = weatherWidgetActivity.Y;
                        if (pt1Var2 == null) {
                            pt1Var2 = null;
                        }
                        ((b98) pt1Var2.e).b.setVisibility(8);
                        if (n68Var.equals(psp.c)) {
                            mt5 mt5Var2 = weatherWidgetActivity.Y;
                            ((v88) ((pt1) (mt5Var2 != null ? mt5Var2 : null)).d).b.setVisibility(8);
                        } else if (n68Var instanceof n68) {
                            mt5 mt5Var3 = weatherWidgetActivity.Y;
                            v88 v88Var = (v88) ((pt1) (mt5Var3 != null ? mt5Var3 : null)).d;
                            v88Var.b.setVisibility(0);
                            TextView textView = v88Var.e;
                            textView.setText(textView.getResources().getString(2132020523));
                            n68 n68Var2 = n68Var;
                            v88Var.c.setText(ynh.d(n68Var2.a, n68Var2.b));
                            p37.k0(new npn(v88Var, (byte) 0), v88Var.d);
                        } else {
                            if (!(n68Var instanceof o68)) {
                                h9o.p();
                                return null;
                            }
                            mt5 mt5Var4 = weatherWidgetActivity.Y;
                            v88 v88Var2 = (v88) ((pt1) (mt5Var4 != null ? mt5Var4 : null)).d;
                            v88Var2.b.setVisibility(0);
                            TextView textView2 = v88Var2.e;
                            textView2.setText(textView2.getResources().getString(2132017427));
                            o68 o68Var = (o68) n68Var;
                            v88Var2.c.setText(ynh.d(o68Var.a, o68Var.b));
                            p37.k0(new npn(v88Var2, (byte) 1), v88Var2.d);
                        }
                        return Unit.a;
                    }
                    this.v = null;
                    this.u = true;
                    if (nb6.p(200L, this) == px5Var5) {
                        return px5Var5;
                    }
                } else {
                    if (!z5) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                pt1 pt1Var3 = weatherWidgetActivity.Y;
                if (pt1Var3 == null) {
                    pt1Var3 = null;
                }
                ((b98) pt1Var3.e).b.setVisibility(0);
                mt5 mt5Var5 = weatherWidgetActivity.Y;
                ((v88) ((pt1) (mt5Var5 != null ? mt5Var5 : null)).d).b.setVisibility(8);
                return Unit.a;
            case 5:
                hoh hohVar = (hoh) this.v;
                View view = (View) this.w;
                Unit unit = px5.a;
                boolean z6 = this.u;
                try {
                    if (!z6) {
                        ybh.y(obj);
                        this.u = true;
                        ?? F = cs5.F(hohVar.u, new xf(2, (mt5) null, (byte) 21), this);
                        Unit unit2 = F;
                        if (F != unit) {
                            unit2 = Unit.a;
                        }
                        if (unit2 == unit) {
                            return unit;
                        }
                    } else {
                        if (!z6) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    if (z3o.a(view) == hohVar) {
                        view.setTag(2131362030, null);
                    }
                    return Unit.a;
                } finally {
                }
            case 6:
                px5 px5Var6 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    f99 f99Var2 = (f99) this.v;
                    o71 o71Var2 = new o71((h6o) this.w, (byte) 19);
                    this.u = true;
                    if (f99Var2.collect(o71Var2, this) == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z7) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 7:
                px5 px5Var7 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    TreeSet treeSet = jko.a;
                    if (treeSet.isEmpty()) {
                        treeSet = null;
                    }
                    List listK0 = treeSet != null ? CollectionsKt.k0(treeSet) : null;
                    Context context2 = (Context) this.w;
                    dx5 dx5Var = (dx5) jko.c.getValue();
                    my6 my6Var = new my6(listK0, (mt5) null, (byte) 1);
                    this.v = context2;
                    this.u = true;
                    obj = na2.Z(dx5Var, my6Var, this);
                    if (obj == px5Var7) {
                        return px5Var7;
                    }
                    context = context2;
                } else {
                    if (!z8) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) this.v;
                    ybh.y(obj);
                }
                ?? r14 = ((t0i) obj).a;
                mt5Var = r14 instanceof q0i ? null : r14;
                List list = r8p.a;
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                editorEdit.putString("opera.ads.sdk.blocked_ads", (String) mt5Var);
                editorEdit.apply();
                return Unit.a;
            case 8:
                px5 px5Var8 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    mt0 mt0Var = (mt0) this.v;
                    RelativeLayout relativeLayout = (RelativeLayout) this.w;
                    this.u = true;
                    if (mt0Var.a(relativeLayout, (mt5) this) == px5Var8) {
                        return px5Var8;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 9:
                px5 px5Var9 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    uo2 uo2Var = ((vs2) this.v).d;
                    if (uo2Var == null) {
                        uo2Var = null;
                    }
                    bv0 bv0Var = new bv0((cp2) this.w, ae1.k, null, 4);
                    this.u = true;
                    if (uo2Var.a((rap) bv0Var, (xzh) null, (nt5) this) == px5Var9) {
                        return px5Var9;
                    }
                } else {
                    if (!z10) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 10:
                ConsoleMessage consoleMessage = (ConsoleMessage) this.w;
                px5 px5Var10 = px5.a;
                boolean z11 = this.u;
                if (!z11) {
                    ybh.y(obj);
                    d91 d91Var = ((gx0) this.v).b;
                    if (d91Var != null) {
                        this.u = true;
                        obj = d91.a(d91Var, (mt5) this);
                        if (obj == px5Var10) {
                            return px5Var10;
                        }
                    }
                    return Unit.a;
                }
                if (!z11) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                if (((Boolean) obj).booleanValue()) {
                    String strMessage = consoleMessage.message();
                    if (strMessage == null) {
                        return Unit.a;
                    }
                    String strD = pik.D(1000, strMessage);
                    ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
                    String str = strD + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId();
                    int i2 = messageLevel == null ? -1 : gvo.a[messageLevel.ordinal()];
                    if (i2 == 1) {
                        xu0.a(str, (Exception) null);
                    } else if (i2 == 2) {
                        xu0.c(str, null);
                    } else if (i2 != 3) {
                        xu0.a(str, null, 6);
                    } else {
                        xu0.b(str, null);
                    }
                }
                return Unit.a;
            case 11:
                px5 px5Var11 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    sb sbVar = (sb) this.v;
                    LinkedHashSet linkedHashSet = (LinkedHashSet) this.w;
                    this.u = true;
                    if (sb.a(sbVar, linkedHashSet, (nt5) this) == px5Var11) {
                        return px5Var11;
                    }
                } else {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 12:
                px5 px5Var12 = px5.a;
                boolean z13 = this.u;
                if (!z13) {
                    ybh.y(obj);
                    uo2 uo2Var2 = ((vs2) this.v).d;
                    if (uo2Var2 == null) {
                        uo2Var2 = null;
                    }
                    bv0 bv0Var2 = new bv0((CancellationException) this.w, ae1.k, null, 4);
                    this.u = true;
                    if (uo2Var2.a((rap) bv0Var2, (xzh) null, (nt5) this) == px5Var12) {
                        return px5Var12;
                    }
                } else {
                    if (!z13) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 13:
                px5 px5Var13 = px5.a;
                boolean z14 = this.u;
                if (z14) {
                    if (z14) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                jx1 jx1Var = (jx1) this.v;
                prb prbVarA = bw2.a((pqb) this.w);
                this.u = true;
                Object objA2 = jx1Var.a(prbVarA, false, (nt5) this);
                return objA2 == px5Var13 ? px5Var13 : objA2;
            case 14:
                px5 px5Var14 = px5.a;
                boolean z15 = this.u;
                if (!z15) {
                    ybh.y(obj);
                    jp jpVar = (jp) this.v;
                    pn3 pn3Var = (pn3) this.w;
                    this.u = true;
                    if (jp.a(jpVar, pn3Var, this) == px5Var14) {
                        return px5Var14;
                    }
                } else {
                    if (!z15) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 15:
                px5 px5Var15 = px5.a;
                boolean z16 = this.u;
                if (!z16) {
                    ybh.y(obj);
                    vkp vkpVar = ((hr1) this.v).c;
                    h21 h21Var = (h21) this.w;
                    this.u = true;
                    obj = vkp.c(vkpVar, h21Var, null, this, 30);
                    if (obj == px5Var15) {
                        return px5Var15;
                    }
                } else {
                    if (!z16) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                rap rapVar = (rap) obj;
                if (rapVar instanceof hv0) {
                    gv2 gv2Var = ((j21) ((hv0) rapVar).b).d;
                    if (gv2Var != null) {
                        return gv2.a(gv2Var);
                    }
                    return null;
                }
                if (rapVar instanceof av0) {
                    return null;
                }
                h9o.p();
                return null;
            case 16:
                px5 px5Var16 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    iw1 iw1Var = (iw1) this.v;
                    boolean z18 = ((ViewGroup) this.w) != null;
                    this.u = true;
                    it1 it1Var = iw1Var.c;
                    if (it1Var.j == null || it1Var.a != 6 || (strM = iw1Var.g.m()) == null || (objA = iw1Var.f.a(this, strM, z18)) != px5Var16) {
                        objA = Unit.a;
                    }
                    if (objA == px5Var16) {
                        return px5Var16;
                    }
                } else {
                    if (!z17) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 17:
                px5 px5Var17 = px5.a;
                boolean z19 = this.u;
                if (!z19) {
                    ybh.y(obj);
                    cg0 cg0Var = (cg0) this.v;
                    String str2 = ((um) this.w).W;
                    this.u = true;
                    if (cg0.a(cg0Var, str2, (Activity) null, false, (nt5) this, 12) == px5Var17) {
                        return px5Var17;
                    }
                } else {
                    if (!z19) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 18:
                px5 px5Var18 = px5.a;
                boolean z20 = this.u;
                if (!z20) {
                    ybh.y(obj);
                    m7p m7pVar = ((ks0) this.v).F;
                    y46 y46Var = (y46) this.w;
                    fs0 fs0Var = fs0.a;
                    this.u = true;
                    if (m7pVar.a(y46Var, fs0Var, this) == px5Var18) {
                        return px5Var18;
                    }
                } else {
                    if (!z20) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 19:
                px5 px5Var19 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    bl1 bl1Var = ((ry0) this.v).a;
                    String str3 = (String) this.w;
                    this.u = true;
                    bl1Var.getClass();
                    if (bl1.a(bl1Var, str3, (nt5) this) == px5Var19) {
                        return px5Var19;
                    }
                } else {
                    if (!z21) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 20:
                AdError adError = (AdError) this.w;
                px5 px5Var20 = px5.a;
                boolean z22 = this.u;
                if (!z22) {
                    ybh.y(obj);
                    z2 z2Var = ((ae3) this.v).c;
                    xp9 xp9Var = new xp9(wp9.MEDIATION_SHOW_ERROR, "Error occurred to show a mediation Ad.", new nsd(adError.getCode(), adError.getMessage(), adError.getDomain()));
                    this.u = true;
                    if (z2Var.a(xp9Var, (mt5) this) == px5Var20) {
                        return px5Var20;
                    }
                } else {
                    if (!z22) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 21:
                px5 px5Var21 = px5.a;
                boolean z23 = this.u;
                if (!z23) {
                    ybh.y(obj);
                    rf1 rf1Var = (rf1) this.v;
                    on onVar = (on) this.w;
                    this.u = true;
                    if (rf1Var.a(onVar, (nt5) this) == px5Var21) {
                        return px5Var21;
                    }
                } else {
                    if (!z23) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 22:
                px5 px5Var22 = px5.a;
                boolean z24 = this.u;
                if (!z24) {
                    ybh.y(obj);
                    y7h y7hVar = (y7h) this.v;
                    rnp rnpVar = (rnp) ((qn2) ((egp) this.w)).a;
                    this.u = true;
                    if (y7hVar.a(rnpVar, this) == px5Var22) {
                        return px5Var22;
                    }
                } else {
                    if (!z24) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 23:
                yq3 yq3Var = (yq3) this.w;
                px5 px5Var23 = px5.a;
                boolean z25 = this.u;
                if (!z25) {
                    ybh.y(obj);
                    yq3Var.i.getClass();
                    if (!axn.b(WebViewFeature.MULTI_PROFILE)) {
                        xh3.a("MultiProfile is not supported", null, 6);
                        return Unit.a;
                    }
                    String str4 = ((Boolean) yq3Var.r.getValue()).booleanValue() ? "GMA_WEBVIEW_PROFILE" : "Default";
                    CoroutineContext coroutineContext = yq3Var.d;
                    iq3 iq3Var = new iq3(yq3Var, str4, mt5Var, b);
                    this.v = yq3Var;
                    this.u = true;
                    obj = na2.Z(coroutineContext, iq3Var, this);
                    if (obj == px5Var23) {
                        return px5Var23;
                    }
                } else {
                    if (!z25) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yq3Var = (yq3) this.v;
                    ybh.y(obj);
                }
                yq3Var.l = (Profile) obj;
                return Unit.a;
            case 24:
                px5 px5Var24 = px5.a;
                boolean z26 = this.u;
                if (!z26) {
                    ybh.y(obj);
                    m7p m7pVar2 = ((ks0) this.v).F;
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.w;
                    this.u = true;
                    if (m7pVar2.a(relativeLayout2, this) == px5Var24) {
                        return px5Var24;
                    }
                } else {
                    if (!z26) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 25:
                px5 px5Var25 = px5.a;
                boolean z27 = this.u;
                if (!z27) {
                    ybh.y(obj);
                    vkp vkpVar2 = ((n5) this.v).d;
                    URL url = new URL((String) this.w);
                    this.u = true;
                    obj = vkpVar2.a(url, this);
                    if (obj == px5Var25) {
                        return px5Var25;
                    }
                } else {
                    if (!z27) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                rap rapVar2 = (rap) obj;
                if (rapVar2 instanceof hv0) {
                    ((j21) ((hv0) rapVar2).b).getClass();
                }
                return Unit.a;
            case 26:
                px5 px5Var26 = px5.a;
                boolean z28 = this.u;
                if (!z28) {
                    ybh.y(obj);
                    vd1 vd1Var = (vd1) this.v;
                    if (vd1Var != null) {
                        rnp rnpVar2 = (rnp) ((hv0) ((rap) this.w)).b;
                        this.u = true;
                        if (vd1Var.a((td1) rnpVar2, (nt5) this) == px5Var26) {
                            return px5Var26;
                        }
                    }
                } else {
                    if (!z28) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 27:
                px5 px5Var27 = px5.a;
                boolean z29 = this.u;
                if (!z29) {
                    ybh.y(obj);
                    h07 h07Var = (h07) this.v;
                    this.u = true;
                    obj = h07Var.X(this);
                    if (obj == px5Var27) {
                        return px5Var27;
                    }
                } else {
                    if (!z29) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                cy0 cy0Var = (cy0) obj;
                if (cy0Var != null && (mt5Var = cy0Var.z) != null) {
                    mt5Var = mt5Var;
                }
                if (mt5Var != null) {
                    mt5Var.u = ((b82) this.w).h;
                }
                return Unit.a;
            case 28:
                px5 px5Var28 = px5.a;
                boolean z30 = this.u;
                if (!z30) {
                    ybh.y(obj);
                    gdj gdjVar = (gdj) this.v;
                    os2 os2Var = new os2((d3k) this.w, (byte) 0);
                    this.u = true;
                    if (gdjVar.collect(os2Var, this) == px5Var28) {
                        return px5Var28;
                    }
                } else {
                    if (!z30) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                t3p.v();
                return null;
            default:
                px5 px5Var29 = px5.a;
                boolean z31 = this.u;
                if (!z31) {
                    ybh.y(obj);
                    jz2 jz2Var = ((ry0) this.v).u;
                    if (jz2Var != null) {
                        String string = ((WebResourceRequest) this.w).getUrl().toString();
                        this.u = true;
                        if (jz2Var.b(string, this) == px5Var29) {
                            return px5Var29;
                        }
                    }
                } else {
                    if (!z31) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
