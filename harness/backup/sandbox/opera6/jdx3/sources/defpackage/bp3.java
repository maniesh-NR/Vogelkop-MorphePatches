package defpackage;

import J.N;
import android.graphics.Color;
import android.util.Range;
import android.util.TypedValue;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.tabui2.FadeoutRecyclerView;
import com.opera.android.tabui2.TabUiRootFrameLayout;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content.browser.accessibility.captioning.CaptioningController;

/* loaded from: classes.dex */
public final class bp3 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public bp3() {
        this.a = (byte) 2;
        this.j = new HashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bp3(BrowserActivity browserActivity, BrowserActivity browserActivity2, BottomBar bottomBar, pde pdeVar, dll dllVar, r22 r22Var, st3 st3Var) {
        this.a = (byte) 0;
        this.c = browserActivity2;
        this.d = bottomBar;
        this.e = pdeVar;
        this.f = r22Var;
        this.g = st3Var;
        this.j = new s8n(browserActivity2, 2130969943);
        byte b = 2;
        pdeVar.j(browserActivity, new pb(new bo3(this, b), (byte) 23));
        aib.A(dllVar, browserActivity.getLifecycle(), new rw0(this, b), new oc2(this, (byte) 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0214, code lost:
    
        if (r11 == 3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0216, code lost:
    
        if (r11 != 4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0218, code lost:
    
        r11 = "UHD recording quality";
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x021b, code lost:
    
        h9o.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021f, code lost:
    
        r11 = "JPEG_R output format";
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0222, code lost:
    
        r11 = "stabilization";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0225, code lost:
    
        r11 = "60 FPS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0228, code lost:
    
        r11 = "HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022a, code lost:
    
        r10.append(r11);
        r10.append(" is required, instead set ");
        r11 = r4.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0236, code lost:
    
        if (r11 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0238, code lost:
    
        if (r11 == 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023a, code lost:
    
        if (r11 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023c, code lost:
    
        if (r11 == 3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023e, code lost:
    
        if (r11 == 4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0240, code lost:
    
        h9o.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0243, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0244, code lost:
    
        r11 = "GroupableFeatures.UHD_RECORDING";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0247, code lost:
    
        r11 = "GroupableFeature.IMAGE_ULTRA_HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024a, code lost:
    
        r11 = "GroupableFeature.PREVIEW_STABILIZATION";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024d, code lost:
    
        r11 = "GroupableFeature.FPS_60";
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0250, code lost:
    
        r11 = "GroupableFeature.HDR_HLG10";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0252, code lost:
    
        defpackage.bxl.d(z1m.l(r10, r11, " as either a required or preferred feature."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a6, code lost:
    
        r4 = (vt8) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a8, code lost:
    
        if (r4 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01aa, code lost:
    
        r10 = new java.lang.StringBuilder("A ");
        r10.append(r4.name());
        r10.append(" value is set to ");
        r10.append(r1);
        r10.append(" despite using feature groups. Do not use APIs like ");
        r11 = r4.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c9, code lost:
    
        if (r11 == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01cb, code lost:
    
        if (r11 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cd, code lost:
    
        if (r11 == 2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01cf, code lost:
    
        if (r11 == 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d1, code lost:
    
        if (r11 != 4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d3, code lost:
    
        r11 = "Recorder.Builder.setQualitySelector";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d6, code lost:
    
        h9o.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01da, code lost:
    
        r11 = r1.concat(".Builder.setOutputFormat");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
    
        if (z7h.t(r12) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e7, code lost:
    
        r11 = r1.concat(".Builder.setVideoStabilizationEnabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
    
        r11 = r1.concat(".Builder.setPreviewStabilizationEnabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f5, code lost:
    
        r11 = r1.concat(".Builder.setTargetFrameRateRange");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fc, code lost:
    
        r11 = r1.concat(".Builder.setDynamicRange");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0202, code lost:
    
        r10.append(r11);
        r10.append(" while using feature groups. If, for example, ");
        r11 = r4.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020e, code lost:
    
        if (r11 == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0210, code lost:
    
        if (r11 == 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0212, code lost:
    
        if (r11 == 2) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bp3(java.util.List r11, k8n r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp3.<init>(java.util.List, k8n, java.util.List):void");
    }

    public bp3(pde pdeVar, z9j z9jVar, k6l k6lVar, u4l u4lVar, pde pdeVar2, pde pdeVar3, v8a v8aVar, s9i s9iVar, gal galVar, FadeoutRecyclerView fadeoutRecyclerView, yhe yheVar, RecyclerView recyclerView, TabUiRootFrameLayout tabUiRootFrameLayout, rgh rghVar, yqa yqaVar) {
        this.a = (byte) 4;
        this.e = pdeVar;
        this.c = z9jVar;
        this.d = pdeVar2;
        this.f = recyclerView;
        pde pdeVar4 = new pde(og.a);
        this.g = pdeVar4;
        i0e i0eVar = new i0e(rghVar, this);
        this.h = i0eVar;
        c5l c5lVar = new c5l(recyclerView);
        recyclerView.B0(c5lVar);
        b0e b0eVar = new b0e(pdeVar4, k6lVar, u4lVar, pdeVar3, v8aVar, s9iVar, pdeVar2, yheVar, c5lVar.x, new g0e(this, (byte) 1), yqaVar, i0eVar);
        this.i = new m0e(pdeVar4, pdeVar2, galVar, fadeoutRecyclerView, yheVar, recyclerView, b0eVar, tabUiRootFrameLayout);
        ou1 ou1Var = new ou1();
        this.j = ou1Var;
        recyclerView.y0(b0eVar);
        recyclerView.t = true;
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager(0, false));
        recyclerView.m(ou1Var);
    }

    public bp3(r9l r9lVar, c9l c9lVar, zg zgVar, d4l d4lVar, d4l d4lVar2, d4l d4lVar3) {
        this.a = (byte) 1;
        this.c = r9lVar;
        this.d = c9lVar;
        this.e = zgVar;
        this.f = d4lVar;
        this.g = d4lVar2;
        this.h = d4lVar3;
    }

    public static String a(Integer num) {
        if (num == null) {
            return "";
        }
        String str = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US)).format(Color.alpha(num.intValue()) / 255.0d);
        int iRed = Color.red(num.intValue());
        int iGreen = Color.green(num.intValue());
        int iBlue = Color.blue(num.intValue());
        StringBuilder sbO = sko.o(iRed, iGreen, "rgba(", ", ", ", ");
        sbO.append(iBlue);
        sbO.append(", ");
        sbO.append(str);
        sbO.append(")");
        return sbO.toString();
    }

    public final int b() {
        return 0;
    }

    public final boolean c() {
        return this.b;
    }

    public final void d(CaptioningController captioningController) {
        boolean z = this.b;
        if (!z) {
            long j = captioningController.b;
            if (j != 0) {
                N.MM3_AH7F(j, false, "", "", "", "", "", "", "");
                return;
            }
            return;
        }
        String str = (String) this.c;
        String str2 = (String) this.d;
        String str3 = (String) this.e;
        String str4 = (String) this.f;
        String str5 = (String) this.g;
        String str6 = (String) this.h;
        String str7 = (String) this.i;
        long j2 = captioningController.b;
        if (j2 != 0) {
            N.MM3_AH7F(j2, z, Objects.toString(str, ""), Objects.toString(str2, ""), Objects.toString(str3, ""), Objects.toString(str4, ""), Objects.toString(str5, ""), Objects.toString(str6, ""), Objects.toString(str7, ""));
        }
    }

    public final void e() {
        Iterator it = ((HashSet) this.j).iterator();
        while (it.hasNext()) {
            CaptioningController captioningController = (CaptioningController) ((WeakReference) it.next()).get();
            if (captioningController != null) {
                d(captioningController);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.wjh r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r14.e
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r0 = a(r0)
            r13.g = r0
            java.lang.Object r0 = r14.b
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r0 = a(r0)
            r13.c = r0
            java.lang.Object r0 = r14.c
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r0 = a(r0)
            java.lang.Object r1 = r14.d
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r2 = ""
            if (r1 == 0) goto L40
            int r1 = r1.intValue()
            r3 = 1
            if (r1 == r3) goto L3d
            r3 = 2
            if (r1 == r3) goto L3a
            r3 = 3
            if (r1 == r3) goto L37
            r3 = 4
            if (r1 != r3) goto L40
            java.lang.String r1 = "%2$s %2$s 0 %1$s"
            goto L41
        L37:
            java.lang.String r1 = "-%2$s -%2$s 0 %1$s"
            goto L41
        L3a:
            java.lang.String r1 = "%1$s %2$s %2$s 0.1em"
            goto L41
        L3d:
            java.lang.String r1 = "%2$s %2$s 0 %1$s, -%2$s -%2$s 0 %1$s, %2$s -%2$s 0 %1$s, -%2$s %2$s 0 %1$s"
            goto L41
        L40:
            r1 = r2
        L41:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L49
            java.lang.String r0 = "silver"
        L49:
            java.lang.String r3 = "0.05em"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r13.h = r0
            java.lang.Object r14 = r14.f
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            if (r14 == 0) goto L8b
            java.lang.String r11 = "sans-serif-smallcaps"
            java.lang.String r12 = "monospace"
            java.lang.String r3 = ""
            java.lang.String r4 = "sans-serif"
            java.lang.String r5 = "sans-serif-condensed"
            java.lang.String r6 = "sans-serif-monospace"
            java.lang.String r7 = "serif"
            java.lang.String r8 = "serif-monospace"
            java.lang.String r9 = "casual"
            java.lang.String r10 = "cursive"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            r1 = 0
        L74:
            r3 = 10
            if (r1 >= r3) goto L8b
            r3 = r0[r1]
            int r4 = r14.getStyle()
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r3, r4)
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L8c
            int r1 = r1 + 1
            goto L74
        L8b:
            r3 = r2
        L8c:
            r13.d = r3
            if (r14 == 0) goto L9b
            boolean r14 = r14.isItalic()
            if (r14 == 0) goto L9b
            java.lang.String r14 = "italic"
            r13.e = r14
            goto L9d
        L9b:
            r13.e = r2
        L9d:
            r13.f = r2
            r13.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp3.f(wjh):void");
    }

    public final void g() {
        pde pdeVar = (pde) this.e;
        final byte b = 0;
        pdeVar.k(new iwa(new g0e(this, (byte) 0), (byte) 10));
        a26.T((z9j) this.c, pdeVar, new f7f(this) { // from class: h0e
            public final /* synthetic */ bp3 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                bp3 bp3Var = this.b;
                switch (b2) {
                    case 0:
                        bp3Var.j();
                        break;
                    default:
                        bp3Var.j();
                        RecyclerView recyclerView = (RecyclerView) bp3Var.f;
                        txj txjVar = ((eyj) ((pde) bp3Var.d).g()).l;
                        int iK = txjVar != null ? txjVar.f.k(recyclerView.getContext()) : 0;
                        ou1 ou1Var = (ou1) bp3Var.j;
                        if (iK != ou1Var.b) {
                            ou1Var.b = iK;
                            recyclerView.a0();
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T((pde) this.d, pdeVar, new f7f(this) { // from class: h0e
            public final /* synthetic */ bp3 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                bp3 bp3Var = this.b;
                switch (b22) {
                    case 0:
                        bp3Var.j();
                        break;
                    default:
                        bp3Var.j();
                        RecyclerView recyclerView = (RecyclerView) bp3Var.f;
                        txj txjVar = ((eyj) ((pde) bp3Var.d).g()).l;
                        int iK = txjVar != null ? txjVar.f.k(recyclerView.getContext()) : 0;
                        ou1 ou1Var = (ou1) bp3Var.j;
                        if (iK != ou1Var.b) {
                            ou1Var.b = iK;
                            recyclerView.a0();
                            break;
                        }
                        break;
                }
            }
        });
        ((RecyclerView) this.f).postOnAnimationDelayed(new yqd(this, (byte) 4), 100L);
    }

    public final void h(uz3 uz3Var) {
        qz3 qz3Var;
        rz3 rz3Var = (rz3) this.i;
        if (rz3Var != null) {
            boolean z = false;
            if (uz3Var != null) {
                if (((rz3Var == null || (qz3Var = rz3Var.j) == null) ? null : qz3Var.p) == uz3Var) {
                    z = true;
                }
            }
            this.i = null;
            rz3Var.a(z);
        }
    }

    public final void i(boolean z) {
        ap3 ap3Var;
        Integer num;
        q8l q8lVar = (q8l) ((pde) this.e).g();
        uyg uygVar = q8lVar.b;
        TypedValue typedValue = new TypedValue();
        BottomBar bottomBar = (BottomBar) this.d;
        bottomBar.getContext().getTheme().resolveAttribute(2130969943, typedValue, true);
        int i = typedValue.resourceId;
        if (z || (num = (Integer) this.i) == null || num.intValue() != i) {
            this.i = Integer.valueOf(i);
            this.j = new s8n((BrowserActivity) this.c, 2130969943);
        }
        n8l n8lVar = n8l.a;
        if (uygVar.equals(n8lVar)) {
            this.b = false;
        } else {
            if (!(uygVar instanceof o8l)) {
                h9o.p();
                return;
            }
            o8l o8lVar = (o8l) uygVar;
            boolean zU0 = p37.u0(p37.r(o8lVar.a, p37.a0(o8lVar.b, f03.t(2130969093, (s8n) this.j, 2131101243))));
            i = zU0 ? 2132083094 : 2132083093;
            this.b = !zU0;
        }
        Integer num2 = (Integer) this.h;
        if (num2 == null || num2.intValue() != i) {
            this.h = Integer.valueOf(i);
            u8n.d(i, bottomBar);
        }
        uyg uygVar2 = q8lVar.b;
        int iT = f03.t(2130969093, (s8n) this.j, 2131101243);
        if (uygVar2.equals(n8lVar)) {
            ap3Var = new ap3(new zo3(iT), true, this.b);
        } else {
            if (!(uygVar2 instanceof o8l)) {
                h9o.p();
                return;
            }
            ap3Var = new ap3(new zo3(p37.a0(((o8l) uygVar2).b, iT)), false, this.b);
        }
        ((r22) this.f).N(ap3Var);
        ((st3) this.g).invoke(Boolean.valueOf(ap3Var.b));
    }

    public final void j() {
        boolean z = this.b;
        Object obj = ng.a;
        boolean z2 = z && ((z9j) this.c).g() == b3c.d && Intrinsics.a(((pde) this.e).g(), obj) && ((eyj) ((pde) this.d).g()).l != null;
        pde pdeVar = (pde) this.g;
        if (!z2) {
            obj = og.a;
        }
        xf8.F0(pdeVar, obj);
        ((RecyclerView) this.f).setVisibility(z2 ? 0 : 8);
    }

    public final String toString() {
        switch (this.a) {
            case 3:
                return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + ((List) this.h) + ", frameRateRange=" + ((Range) this.e) + ", requiredFeatureGroup=" + ((Set) this.f) + ", preferredFeatureGroup=" + ((List) this.g) + ", effects=" + ((List) this.d) + ", viewPort=" + ((k8n) this.c) + '}';
            default:
                return super.toString();
        }
    }
}
