package defpackage;

import ads_mobile_sdk.bw2;
import ads_mobile_sdk.lf2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.usercentrics.sdk.SectionAlignment;
import com.usercentrics.sdk.ui.components.UCTextView;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class xvg {
    public final /* synthetic */ byte a;

    public static final void a(ctn ctnVar, c8e c8eVar, ih5 ih5Var, int i) {
        ctn ctnVar2;
        vt9 vt9Var;
        c8e c8eVar2;
        zpa zpaVar;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1159017269);
        int i2 = (vt9Var2.f(ctnVar) ? 4 : 2) | i | 48;
        if (vt9Var2.N(i2 & 1, (i2 & 19) != 18)) {
            sun sunVar = (sun) dyg.h(((ftn) ctnVar).i, vt9Var2).getValue();
            ftn ftnVar = (ftn) ctnVar;
            bpb bpbVar = (bpb) ftnVar.j.getValue();
            ftnVar.f.getClass();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objK = vt9Var2.K();
            zpa zpaVar2 = hh5.a;
            if (z || objK == zpaVar2) {
                zpaVar = zpaVar2;
                cfn cfnVar = new cfn(0, ctnVar, ctn.class, "onBack", "onBack()V", 0, (byte) 5);
                vt9Var2.g0(cfnVar);
                objK = cfnVar;
            } else {
                zpaVar = zpaVar2;
            }
            Function0 function0 = (mtb) objK;
            boolean z2 = i3 == 4;
            Object objK2 = vt9Var2.K();
            if (z2 || objK2 == zpaVar) {
                objK2 = new lrk(1, ctnVar, ctn.class, "onInterceptUrlRequest", "onInterceptUrlRequest(Lcom/multiplatform/webview/request/WebRequest;)Z", 0, (byte) 21);
                ctnVar2 = ctnVar;
                vt9Var2.g0(objK2);
            } else {
                ctnVar2 = ctnVar;
            }
            c8eVar2 = z7e.b;
            vt9Var = vt9Var2;
            b(sunVar, bpbVar, function0, (mtb) objK2, c8eVar2, vt9Var, 196672);
        } else {
            ctnVar2 = ctnVar;
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new oyj(ctnVar2, c8eVar2, i, (byte) 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c7, code lost:
    
        if (r11 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e2, code lost:
    
        if (r11 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r11.close();
        r11 = android.net.Uri.parse("file:///android_asset/composeResources/com.opera.momi.clientsdk.ui.generated.resources/files/webview/js_bridge.html");
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee A[Catch: all -> 0x00f4, FileNotFoundException -> 0x00f6, TRY_ENTER, TryCatch #4 {FileNotFoundException -> 0x00f6, blocks: (B:73:0x00de, B:76:0x00ee, B:77:0x00f3), top: B:147:0x00de }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.sun r23, defpackage.bpb r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function1 r26, defpackage.c8e r27, defpackage.ih5 r28, int r29) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvg.b(sun, bpb, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, c8e, ih5, int):void");
    }

    public static int c(int i) {
        if (i == -1) {
            return -1;
        }
        if (i == -101) {
            return -101;
        }
        if (i == 1 || i == 2 || i == 4 || i == 7 || i == 11) {
            return 1;
        }
        if (i == 3 || i == 5 || i == 6 || i == 8 || i == 9 || i == 10 || i == 12 || i == 14 || i == 15) {
            return 2;
        }
        if (i == 13) {
            return 3;
        }
        return i == 20 ? 4 : 0;
    }

    public static int d(Context context) {
        ConnectivityManager connectivityManager;
        int iC = 0;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    iC = -101;
                } else if (type == 0) {
                    if (Build.VERSION.SDK_INT > 29) {
                        iC = c(activeNetworkInfo.getSubtype());
                    } else {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager != null) {
                            List list = sjo.a;
                            boolean z = nb6.h(context, "android.permission.READ_PHONE_STATE") == 0;
                            iC = z ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                        }
                    }
                }
            } else {
                iC = -1;
            }
            iC = c(iC);
        }
        if (iC == -101) {
            return 1;
        }
        int i = 2;
        if (iC != 1) {
            if (iC == 2) {
                return 3;
            }
            i = 4;
            if (iC != 3) {
                return iC != 4 ? 6 : 5;
            }
        }
        return i;
    }

    public static lf2 e(prb prbVar) {
        LinkedHashMap linkedHashMap;
        try {
            prb prbVar2 = (prb) new m5a().b(prb.class, bw2.a(prbVar, "extra_query_params", "{}"));
            linkedHashMap = new LinkedHashMap();
            egc it = prbVar2.a.entrySet().iterator();
            while (it.hasNext()) {
                ggc ggcVarA = it.a();
                linkedHashMap.put((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).n());
            }
        } catch (Exception e) {
            ArrayList arrayList = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = n08.a;
        }
        return new lf2(bw2.a(prbVar, "enable_prewarming", false), bw2.a(prbVar, "prefetch_url", ""), bw2.a(prbVar, "skip_offline_notification_flow", false), bw2.a(prbVar, "enable_hsdp_service", false), bw2.a(prbVar, "target_package", ""), bw2.a(prbVar, "hsdp_invocation_callback_bitmask", 0), bw2.a(prbVar, "referrer", ""), linkedHashMap);
    }

    public static final Integer f(prb prbVar, String str) {
        prb prbVarW;
        if (prbVar != null) {
            try {
                prbVarW = prbVar.w(str);
            } catch (Exception unused) {
            }
        } else {
            prbVarW = null;
        }
        if (prbVarW == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.rgb(prbVarW.u("r").f(), prbVarW.u("g").f(), prbVarW.u("b").f()));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final void g(afc afcVar, ufm ufmVar, zdm zdmVar, Integer num) throws Resources.NotFoundException {
        UCTextView uCTextView = new UCTextView(afcVar.getContext(), (AttributeSet) null);
        uCTextView.s(zdmVar.b().a, zdmVar.b().g, new lrk(1, zdmVar, zdm.class, "onHtmlLinkClick", "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0, (byte) 6));
        UCTextView.t(uCTextView, ufmVar, 14);
        uCTextView.setMovementMethod(LinkMovementMethod.getInstance());
        t(zdmVar, uCTextView);
        zec zecVar = new zec(-1, -2);
        int dimensionPixelOffset = afcVar.getResources().getDimensionPixelOffset(2131167765);
        zecVar.setMarginStart(dimensionPixelOffset);
        zecVar.setMarginEnd(dimensionPixelOffset);
        if (num != null) {
            ((LinearLayout.LayoutParams) zecVar).topMargin = num.intValue();
        }
        afcVar.addView((View) uCTextView, (ViewGroup.LayoutParams) zecVar);
        String str = (String) zdmVar.n.getValue();
        if (str != null) {
            zec zecVar2 = new zec(-1, -2);
            int dimensionPixelOffset2 = afcVar.getResources().getDimensionPixelOffset(2131167765);
            zecVar2.setMarginStart(dimensionPixelOffset2);
            zecVar2.setMarginEnd(dimensionPixelOffset2);
            UCTextView uCTextView2 = new UCTextView(afcVar.getContext(), (AttributeSet) null);
            afcVar.addView((View) uCTextView2, (ViewGroup.LayoutParams) zecVar2);
            uCTextView2.setText(str);
            UCTextView.u(uCTextView2, ufmVar, true, 12);
            j14.C(uCTextView2, false);
            uCTextView2.setOnClickListener(new tig(zdmVar, afcVar, uCTextView2, uCTextView, (byte) 2));
        }
        String str2 = (String) zdmVar.b.b.k;
        if (str2 == null) {
            return;
        }
        zec zecVar3 = new zec(-1, -2);
        int dimensionPixelOffset3 = afcVar.getResources().getDimensionPixelOffset(2131167765);
        zecVar3.setMarginStart(dimensionPixelOffset3);
        zecVar3.setMarginEnd(dimensionPixelOffset3);
        ((LinearLayout.LayoutParams) zecVar3).topMargin = afcVar.getResources().getDimensionPixelOffset(2131167763);
        UCTextView uCTextView3 = new UCTextView(afcVar.getContext(), (AttributeSet) null);
        uCTextView3.setText(str2);
        UCTextView.u(uCTextView3, ufmVar, false, 22);
        afcVar.addView((View) uCTextView3, (ViewGroup.LayoutParams) zecVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.opi r10, float r11, defpackage.xe1 r12, defpackage.wi6 r13, defpackage.itj r14, nt5 r15) {
        /*
            boolean r0 = r15 instanceof otj
            if (r0 == 0) goto L13
            r0 = r15
            otj r0 = (otj) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            otj r0 = new otj
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.w
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            float r11 = r0.t
            mqh r10 = r0.v
            xe1 r12 = r0.u
            defpackage.ybh.y(r15)
            goto L69
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L34:
            defpackage.ybh.y(r15)
            mqh r6 = new mqh
            r6.<init>()
            java.lang.Object r15 = r12.b()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4d
            r15 = r3
            goto L4e
        L4d:
            r15 = 0
        L4e:
            r15 = r15 ^ r3
            ntj r4 = new ntj
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.u = r12
            r0.v = r6
            r0.t = r5
            r0.x = r3
            java.lang.Object r10 = defpackage.mfh.h(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L67
            return r1
        L67:
            r11 = r5
            r10 = r6
        L69:
            te1 r13 = new te1
            float r10 = r10.a
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvg.h(opi, float, xe1, wi6, itj, nt5):java.lang.Object");
    }

    public static final void i(ve1 ve1Var, opi opiVar, itj itjVar, float f) {
        float fA;
        try {
            fA = opiVar.a(f);
        } catch (CancellationException unused) {
            ve1Var.a();
            fA = 0.0f;
        }
        itjVar.invoke(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            ve1Var.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.opi r16, float r17, float r18, defpackage.xe1 r19, defpackage.a2k r20, kotlin.jvm.functions.Function1 r21, nt5 r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof ptj
            if (r2 == 0) goto L18
            r2 = r1
            ptj r2 = (ptj) r2
            int r3 = r2.y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.y = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            ptj r2 = new ptj
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.x
            px5 r2 = px5.a
            int r3 = r8.y
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L38
            float r0 = r8.u
            float r2 = r8.t
            mqh r3 = r8.w
            xe1 r4 = r8.v
            defpackage.ybh.y(r1)
            r1 = r0
            r0 = r2
            goto L90
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            r0 = 0
            return r0
        L3f:
            defpackage.ybh.y(r1)
            mqh r12 = new mqh
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L66
            r5 = r4
            goto L67
        L66:
            r5 = 0
        L67:
            r6 = r5 ^ 1
            ntj r10 = new ntj
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.v = r3
            r8.w = r12
            r8.t = r0
            r8.u = r1
            r8.y = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = defpackage.mfh.i(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8d
            return r2
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = m(r2, r1)
            te1 r2 = new te1
            float r3 = r3.a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            xe1 r0 = defpackage.cs5.u(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvg.j(opi, float, float, xe1, a2k, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    public static final int k(long j, long j2, long j3, long j4, boolean z, boolean z2, int i) {
        if (j2 >= j3) {
            return 1;
        }
        if (!z) {
            if (i == 2) {
                return 4;
            }
            if (i == 6) {
                return 5;
            }
            if (j < j3 + j4 && !z2) {
                return 3;
            }
        }
        return 6;
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final float m(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static void n(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr, 0, 4096);
            if (i < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static final gz2 o(Iterable iterable) {
        Object objPrevious;
        List listC0 = CollectionsKt.c0(new w8l((byte) 8), iterable);
        ListIterator listIterator = listC0.listIterator(listC0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            fz2 fz2Var = ((gz2) objPrevious).c;
            xtb xtbVar = gz2.h[0];
            if (((Boolean) ((a7f) fz2Var).b).booleanValue()) {
                break;
            }
        }
        return (gz2) objPrevious;
    }

    public static ir p(Context context, Drawable drawable, int i, int i2, cyj cyjVar, gr grVar) {
        int iK = cyjVar.b.k(context);
        rxj rxjVar = cyjVar.d;
        return new ir(iK, rxjVar.c.a(context), rxjVar.d.a(context), rxjVar.e.k(context), 0, drawable, new unl(context, i, i2), grVar, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float q(defpackage.p1d r16, boolean r17, defpackage.pga[] r18, float r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvg.q(p1d, boolean, pga[], float):float");
    }

    public static final mtj r(xef xefVar, vt9 vt9Var) {
        Object obj = (n27) vt9Var.j(mi5.h);
        wi6 wi6VarA = m0k.a(vt9Var);
        boolean zF = vt9Var.f(xefVar) | vt9Var.f(wi6VarA) | vt9Var.f(obj);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            Object mtjVar = new mtj(xefVar, wi6VarA, rm5.R(0.0f, 400.0f, null, 5));
            vt9Var.g0(mtjVar);
            objK = mtjVar;
        }
        return (mtj) objK;
    }

    public static ir s(Context context, yni yniVar, cyj cyjVar) {
        zni zniVar = new zni(yniVar, cyjVar.b.l(context));
        Bitmap bitmap = yniVar.a;
        return p(context, zniVar, bitmap.getWidth(), bitmap.getHeight() - zed.b(bitmap.getHeight() * yniVar.b), cyjVar, new hr(zniVar));
    }

    public static final void t(zdm zdmVar, UCTextView uCTextView) {
        SectionAlignment sectionAlignment = zdmVar.b().d;
        if (sectionAlignment != null) {
            SectionAlignment.Companion.getClass();
            uCTextView.setGravity(ovi.a(sectionAlignment));
        }
        Typeface typeface = zdmVar.b().b;
        if (typeface != null) {
            uCTextView.setTypeface(typeface);
        }
        Float f = zdmVar.b().c;
        if (f != null) {
            uCTextView.setTextSize(2, f.floatValue());
        }
        Integer num = zdmVar.b().e;
        if (num != null) {
            uCTextView.setTextColor(num.intValue());
        }
        Integer num2 = zdmVar.b().f;
        if (num2 != null) {
            uCTextView.setLinkTextColor(num2.intValue());
        }
    }

    public static final Rect u(ccb ccbVar) {
        return new Rect(ccbVar.a, ccbVar.b, ccbVar.c, ccbVar.d);
    }

    public static final RectF v(voh vohVar) {
        return new RectF(vohVar.a, vohVar.b, vohVar.c, vohVar.d);
    }

    public static final voh w(RectF rectF) {
        return new voh(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final wvg x(i7b i7bVar, long j, boolean z, long j2, long j3, boolean z2, boolean z3) {
        a0f a0fVar;
        ck8 ck8Var;
        if (i7bVar == null) {
            return wvg.l;
        }
        String str = i7bVar.a;
        f1p f1pVar = i7bVar.g;
        hf7 hf7Var = (hf7) f1pVar.a;
        long j4 = i7bVar.c;
        long j5 = i7bVar.d;
        long j6 = i7bVar.f;
        int iK = k(j, j4, j5, j3, z, z2, i7bVar.e);
        if (hf7Var != null) {
            a0fVar = new a0f(hf7Var.c, j2, hf7Var.a, hf7Var.b, z3);
        } else {
            a0fVar = null;
        }
        h7b h7bVar = (h7b) f1pVar.b;
        if (h7bVar == null) {
            ck8Var = null;
        } else {
            ck8Var = new ck8(h7bVar.c, j2, "krn::iam::opera:subscription:".concat(str), h7bVar.b, z3);
        }
        return new wvg(str, j4, j5, j6, iK, a0fVar, ck8Var, i7bVar.h, i7bVar.i, i7bVar.j);
    }

    public static String y(InputStream inputStream, Charset charset) throws Throwable {
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, charset);
            try {
                char[] cArr = new char[4096];
                while (true) {
                    int i = inputStreamReader2.read(cArr);
                    if (i == -1) {
                        l(inputStreamReader2);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader = inputStreamReader2;
                l(inputStreamReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String z(InputStream inputStream) {
        try {
            String strY = y(inputStream, Charset.forName("UTF-8"));
            l(inputStream);
            return strY;
        } catch (UnsupportedEncodingException | IllegalCharsetNameException unused) {
            l(inputStream);
            return "";
        } catch (Throwable th) {
            l(inputStream);
            throw th;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 3:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 3:
                return uqh.a(getClass()).c();
            default:
                return super.toString();
        }
    }
}
