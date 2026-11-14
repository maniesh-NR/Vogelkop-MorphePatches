package defpackage;

import ads_mobile_sdk.pm0;
import ads_mobile_sdk.vf3;
import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.widget.ImageView;
import com.opera.android.BrowserActivity;
import com.opera.android.vpn.VpnReceiver;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class upj implements wpj {
    public final /* synthetic */ byte a;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(kotlin.jvm.functions.Function1 r4, nt5 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.vym
            if (r0 == 0) goto L13
            r0 = r5
            vym r0 = (defpackage.vym) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            vym r0 = new vym
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            p0i r5 = t0i.b     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            r0.u = r3     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            java.lang.Object r5 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            if (r5 != r1) goto L3c
            return r1
        L3c:
            p0i r4 = t0i.b     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            return r5
        L3f:
            r4 = move-exception
            p0i r5 = t0i.b
            q0i r5 = new q0i
            r5.<init>(r4)
            return r5
        L48:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upj.A(kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    public static Object B(wuk wukVar, Function2 function2, mt5 mt5Var) {
        Object objF0 = ((n1) wukVar).F0(function2, mt5Var);
        return objF0 == px5.a ? objF0 : Unit.a;
    }

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            b8b.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (i << 32) | (i2 & 4294967295L);
        int i3 = xjl.c;
        return j;
    }

    public static vf3 d(prb prbVar) {
        pm0 pm0Var;
        if (prbVar != null) {
            pqb pqbVarU = prbVar.u("fill_definition");
            int iF = pqbVarU != null ? pqbVarU.f() : 0;
            pm0.b.getClass();
            pm0[] pm0VarArrValues = pm0.values();
            int length = pm0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    pm0Var = null;
                    break;
                }
                pm0Var = pm0VarArrValues[i];
                if (pm0Var.a == iF) {
                    break;
                }
                i++;
            }
            if (pm0Var == null) {
                pm0Var = pm0.INVALID;
            }
            pm0 pm0Var2 = pm0Var;
            if (pm0Var2 != pm0.INVALID) {
                pqb pqbVarU2 = prbVar.u("nofill_retention_time_ms");
                long j = pqbVarU2 != null ? pqbVarU2.j() : 0L;
                pqb pqbVarU3 = prbVar.u("callback_delay_ms");
                long j2 = pqbVarU3 != null ? pqbVarU3.j() : 50L;
                pqb pqbVarU4 = prbVar.u("nofills_before_throttle");
                int iF2 = pqbVarU4 != null ? pqbVarU4.f() : 0;
                pqb pqbVarU5 = prbVar.u("post_throttle_nofills_before_throttle");
                Integer numValueOf = pqbVarU5 != null ? Integer.valueOf(pqbVarU5.f()) : null;
                on7 on7Var = pn7.b;
                un7 un7Var = un7.d;
                return new vf3(iF2, numValueOf, cs5.y0(j, un7Var), cs5.y0(j2, un7Var), pm0Var2);
            }
        }
        return null;
    }

    public static Activity e(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static View f(Context context, View view) {
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null) {
            WeakHashMap weakHashMap = r5n.a;
            view.isAttachedToWindow();
            View rootView = view.getRootView();
            if (rootView != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
                viewFindViewById = rootView;
            }
        }
        return viewFindViewById2 != null ? viewFindViewById2 : viewFindViewById;
    }

    public static void g(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        gxo gxoVar = gxo.c;
        if (webView != null) {
            j(webView);
            webView.destroy();
        }
        String.format(Locale.US, "onRenderProcessGone: Webview: %s, didCrash: %s, rendererPriority: %s", webView, Boolean.valueOf(renderProcessGoneDetail.didCrash()), Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
    }

    public static void h(ImageView imageView, Bitmap bitmap, Drawable drawable) {
        HashMap map = fip.a;
        if (drawable instanceof AnimatedImageDrawable) {
            imageView.setImageDrawable(drawable);
            ((AnimatedImageDrawable) drawable).start();
        } else if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static final LinkedHashMap i(ArrayList arrayList) {
        String str = w6g.b;
        w6g w6gVarO = s16.o("/", false);
        LinkedHashMap linkedHashMapD = rbd.d(new Pair[]{new Pair(w6gVarO, new yco(w6gVarO, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))});
        for (yco ycoVar : CollectionsKt.c0(new w8l((byte) 12), arrayList)) {
            if (((yco) linkedHashMapD.put(ycoVar.a, ycoVar)) == null) {
                while (true) {
                    w6g w6gVar = ycoVar.a;
                    w6g w6gVarC = w6gVar.c();
                    if (w6gVarC == null) {
                        break;
                    }
                    yco ycoVar2 = (yco) linkedHashMapD.get(w6gVarC);
                    if (ycoVar2 != null) {
                        ycoVar2.q.add(w6gVar);
                        break;
                    }
                    yco ycoVar3 = new yco(w6gVarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapD.put(w6gVarC, ycoVar3);
                    ycoVar3.q.add(w6gVar);
                    ycoVar = ycoVar3;
                }
            }
        }
        return linkedHashMapD;
    }

    public static void j(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static final long k(int i, long j) {
        int i2 = xjl.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : c(i4, i);
    }

    public static StaticLayout l(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            b8b.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            b8b.a("invalid end value");
        }
        if (i3 < 0) {
            b8b.a("invalid maxLines value");
        }
        if (i < 0) {
            b8b.a("invalid width value");
        }
        if (i4 < 0) {
            b8b.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            t8.X(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            kg1.c(builderObtain);
        }
        return builderObtain.build();
    }

    public static PendingIntent m(Context context, g1o g1oVar, int i) {
        if (i == 0) {
            int i2 = eif.a;
            byte b = g1oVar.e;
            return PendingIntent.getBroadcast(context, 0, VpnReceiver.b(context, !(b == 1 || b == 2)), 201326592);
        }
        if (i != 1) {
            int i3 = eif.a;
            Intent intentR = kfo.R(context, "com.opera.android.action.VPN_PRO_WIDGET_OPEN_OFA");
            intentR.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
            return PendingIntent.getActivity(context, 0, intentR, 201326592);
        }
        int i4 = eif.a;
        Intent intentR2 = kfo.R(context, "com.opera.android.action.VPN_PRO_WIDGET_OPEN_OFA");
        intentR2.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
        return PendingIntent.getActivity(context, 0, intentR2, 201326592);
    }

    public static final String n(int i) {
        return "0x" + Integer.toString(i, CharsKt.checkRadix(16));
    }

    public static final SpannableString o(Context context, long j, boolean z) {
        String str = NumberFormat.getInstance().format(j);
        SpannableString spannableString = new SpannableString(sko.j("ICON ", str));
        int iL = StringsKt.L(spannableString, "ICON", 0, false, 6);
        spannableString.setSpan(new ImageSpan(context, 2131232510, 2), iL, iL + 4, 17);
        if (z) {
            int iL2 = StringsKt.L(spannableString, str, 0, false, 6);
            spannableString.setSpan(new StyleSpan(1), iL2, str.length() + iL2, 17);
        }
        return spannableString;
    }

    public static final bxi p(Object obj) {
        if (obj != alo.e) {
            return (bxi) obj;
        }
        qp2.n("Does not contain segment");
        return null;
    }

    public static final int q(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] r(Object obj, Object obj2, Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length + 2];
        b82.g(objArr, 0, objArr2, i, 6);
        System.arraycopy(objArr, i, objArr2, i + 2, objArr.length - i);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean s(Object obj) {
        return obj == alo.e;
    }

    public static final void t(BrowserActivity browserActivity, BrowserActivity browserActivity2, umi umiVar, u0a u0aVar) {
        u0aVar.a.j(browserActivity2, new iwa(new nfh(browserActivity, umiVar, (byte) 0), (byte) 20));
    }

    public static final zco u(w6g w6gVar, g29 g29Var, Function1 function1) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        int iM;
        i19 i19VarOpenReadOnly = g29Var.openReadOnly(w6gVar);
        try {
            long size = i19VarOpenReadOnly.size();
            long j = size - 22;
            if (j < 0) {
                throw new IOException("not a zip: size=" + i19VarOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                tlh tlhVar = new tlh(i19VarOpenReadOnly.p(j));
                try {
                    if (tlhVar.m() == 101010256) {
                        int iO = tlhVar.o() & 65535;
                        int iO2 = tlhVar.o() & 65535;
                        long jO = tlhVar.o() & 65535;
                        if (jO != (tlhVar.o() & 65535) || iO != 0 || iO2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        tlhVar.skip(4L);
                        int iO3 = tlhVar.o() & 65535;
                        rr3 rr3Var = new rr3(jO, 4294967295L & tlhVar.m(), iO3);
                        tlhVar.B0(iO3);
                        tlhVar.close();
                        long j2 = j - 20;
                        if (j2 > 0) {
                            tlhVar = new tlh(i19VarOpenReadOnly.p(j2));
                            try {
                                if (tlhVar.m() == 117853008) {
                                    int iM2 = tlhVar.m();
                                    long jN = tlhVar.n();
                                    if (tlhVar.m() != 1 || iM2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    tlhVar = new tlh(i19VarOpenReadOnly.p(jN));
                                    try {
                                        iM = tlhVar.m();
                                    } catch (Throwable th4) {
                                        try {
                                        } catch (Throwable th5) {
                                            wf8.a(th4, th5);
                                        }
                                        th3 = th4;
                                    }
                                    if (iM != 101075792) {
                                        throw new IOException("bad zip: expected " + n(101075792) + " but was " + n(iM));
                                    }
                                    tlhVar.skip(12L);
                                    int iM3 = tlhVar.m();
                                    int iM4 = tlhVar.m();
                                    long jN2 = tlhVar.n();
                                    if (jN2 != tlhVar.n() || iM3 != 0 || iM4 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    tlhVar.skip(8L);
                                    try {
                                        th3 = null;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                    }
                                    rr3Var = new rr3(jN2, tlhVar.n(), iO3);
                                    if (th3 != null) {
                                        throw th3;
                                    }
                                }
                                try {
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                } catch (Throwable th9) {
                                    wf8.a(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        tlhVar = new tlh(i19VarOpenReadOnly.p(rr3Var.c));
                        try {
                            long j3 = rr3Var.b;
                            for (long j4 = 0; j4 < j3; j4++) {
                                yco ycoVarV = v(tlhVar);
                                if (ycoVarV.h >= rr3Var.c) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) function1.invoke(ycoVarV)).booleanValue()) {
                                    arrayList.add(ycoVarV);
                                }
                            }
                            try {
                                th = null;
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        } catch (Throwable th11) {
                            try {
                            } catch (Throwable th12) {
                                wf8.a(th11, th12);
                            }
                            th = th11;
                        }
                        if (th != null) {
                            throw th;
                        }
                        zco zcoVar = new zco(w6gVar, g29Var, i(arrayList));
                        try {
                            i19VarOpenReadOnly.close();
                        } catch (Throwable unused) {
                        }
                        return zcoVar;
                    }
                    tlhVar.close();
                    j--;
                } finally {
                    tlhVar.close();
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static final yco v(final tlh tlhVar) throws IOException {
        int iM = tlhVar.m();
        if (iM != 33639248) {
            throw new IOException("bad zip: expected " + n(33639248) + " but was " + n(iM));
        }
        tlhVar.skip(4L);
        short sO = tlhVar.o();
        int i = sO & 65535;
        if ((sO & 1) != 0) {
            s49.m("unsupported zip: general purpose bit flag=".concat(n(i)));
            return null;
        }
        int iO = tlhVar.o() & 65535;
        int iO2 = tlhVar.o() & 65535;
        int iO3 = tlhVar.o() & 65535;
        long jM = tlhVar.m() & 4294967295L;
        final oqh oqhVar = new oqh();
        oqhVar.a = tlhVar.m() & 4294967295L;
        final oqh oqhVar2 = new oqh();
        oqhVar2.a = tlhVar.m() & 4294967295L;
        int iO4 = tlhVar.o() & 65535;
        int iO5 = tlhVar.o() & 65535;
        int iO6 = tlhVar.o() & 65535;
        tlhVar.skip(8L);
        final oqh oqhVar3 = new oqh();
        oqhVar3.a = tlhVar.m() & 4294967295L;
        String strB0 = tlhVar.B0(iO4);
        if (StringsKt.F(strB0, (char) 0)) {
            s49.m("bad zip: filename contains 0x00");
            return null;
        }
        long j = oqhVar2.a == 4294967295L ? 8L : 0L;
        if (oqhVar.a == 4294967295L) {
            j += 8;
        }
        if (oqhVar3.a == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final pqh pqhVar = new pqh();
        final pqh pqhVar2 = new pqh();
        final pqh pqhVar3 = new pqh();
        final lqh lqhVar = new lqh();
        w(tlhVar, iO5, new Function2() { // from class: bdo
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                tlh tlhVar2 = tlhVar;
                if (iIntValue == 1) {
                    lqh lqhVar2 = lqhVar;
                    if (lqhVar2.a) {
                        s49.m("bad zip: zip64 extra repeated");
                        return null;
                    }
                    lqhVar2.a = true;
                    if (jLongValue < j2) {
                        s49.m("bad zip: zip64 extra too short");
                        return null;
                    }
                    oqh oqhVar4 = oqhVar2;
                    long jN = oqhVar4.a;
                    if (jN == 4294967295L) {
                        jN = tlhVar2.n();
                    }
                    oqhVar4.a = jN;
                    oqh oqhVar5 = oqhVar;
                    oqhVar5.a = oqhVar5.a == 4294967295L ? tlhVar2.n() : 0L;
                    oqh oqhVar6 = oqhVar3;
                    oqhVar6.a = oqhVar6.a == 4294967295L ? tlhVar2.n() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        s49.m("bad zip: NTFS extra too short");
                        return null;
                    }
                    tlhVar2.skip(4L);
                    upj.w(tlhVar2, (int) (jLongValue - 4), new ado(pqhVar, tlhVar2, pqhVar2, pqhVar3));
                }
                return Unit.a;
            }
        });
        if (j2 > 0 && !lqhVar.a) {
            s49.m("bad zip: zip64 extra required but absent");
            return null;
        }
        String strB02 = tlhVar.B0(iO6);
        String str = w6g.b;
        return new yco(s16.o("/", false).e(strB0), c.l(strB0, "/", false), strB02, jM, oqhVar.a, oqhVar2.a, iO, oqhVar3.a, iO3, iO2, (Long) pqhVar.a, (Long) pqhVar2.a, (Long) pqhVar3.a, 57344);
    }

    public static final void w(tlh tlhVar, int i, Function2 function2) {
        d04 d04Var = tlhVar.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                s49.m("bad zip: truncated header in extra field");
                return;
            }
            int iO = tlhVar.o() & 65535;
            long jO = tlhVar.o() & 65535;
            long j2 = j - 4;
            if (j2 < jO) {
                s49.m("bad zip: truncated value in extra field");
                return;
            }
            tlhVar.v(jO);
            long j3 = d04Var.b;
            function2.invoke(Integer.valueOf(iO), Long.valueOf(jO));
            long j4 = (d04Var.b + jO) - j3;
            if (j4 < 0) {
                s49.m(sko.i(iO, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    d04Var.skip(j4);
                }
                j = j2 - jO;
            }
        }
    }

    public static final yco x(tlh tlhVar, yco ycoVar) throws IOException {
        int iM = tlhVar.m();
        if (iM != 67324752) {
            throw new IOException("bad zip: expected " + n(67324752) + " but was " + n(iM));
        }
        tlhVar.skip(2L);
        short sO = tlhVar.o();
        int i = sO & 65535;
        if ((sO & 1) != 0) {
            s49.m("unsupported zip: general purpose bit flag=".concat(n(i)));
            return null;
        }
        tlhVar.skip(18L);
        int iO = tlhVar.o() & 65535;
        tlhVar.skip(tlhVar.o() & 65535);
        if (ycoVar == null) {
            tlhVar.skip(iO);
            return null;
        }
        pqh pqhVar = new pqh();
        pqh pqhVar2 = new pqh();
        pqh pqhVar3 = new pqh();
        w(tlhVar, iO, new ado(tlhVar, pqhVar, pqhVar2, pqhVar3));
        return new yco(ycoVar.a, ycoVar.b, ycoVar.c, ycoVar.d, ycoVar.e, ycoVar.f, ycoVar.g, ycoVar.h, ycoVar.i, ycoVar.j, ycoVar.k, ycoVar.l, ycoVar.m, (Integer) pqhVar.a, (Integer) pqhVar2.a, (Integer) pqhVar3.a);
    }

    public static final Object[] y(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        b82.g(objArr, 0, objArr2, i, 6);
        int i2 = i + 2;
        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
        return objArr2;
    }

    public static final Object[] z(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        b82.g(objArr, 0, objArr2, i, 6);
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
        return objArr2;
    }

    @Override // defpackage.wpj
    public final float a(ViewGroup viewGroup, View view) {
        return view.getTranslationY();
    }

    @Override // defpackage.wpj
    public final float b(ViewGroup viewGroup, View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
            case 2:
                break;
            default:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
        }
        return view.getTranslationX() + viewGroup.getWidth();
    }
}
