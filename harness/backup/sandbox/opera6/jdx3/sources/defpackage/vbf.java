package defpackage;

import J.N;
import android.content.res.Resources;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.settings.SettingsManager;
import com.opera.android.widget.UrlFieldEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class vbf implements upm, q9g {
    public static final String[] M = {"https://"};
    public static final String[] N = {"www."};
    public final xbf A;
    public final int B;
    public final int C;
    public final nrl D;
    public yqd E;
    public boolean F;
    public eri G;
    public final j25 H;
    public final vc7 I;
    public final igi J;
    public final pde K;
    public final d8d L;
    public final boolean a;
    public final SettingsManager b;
    public final k6l c;
    public final s9g d;
    public final ydn e;
    public final swf f;
    public final p8f g;
    public final sbf h;
    public final xg i;
    public final pbf j;
    public final rbf k;
    public final in3 l;
    public final qbf m;
    public final OmniBoxRoot n;
    public final boolean o;
    public final boolean p;
    public final v73 q;
    public final qfb r;
    public final UrlFieldEditText s;
    public final tbf t;
    public waf u;
    public final kze v;
    public final jl6 w;
    public final dbf x;
    public final dbf y;
    public final ubf z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnClickListener, android.view.View$OnKeyListener, android.view.View$OnLongClickListener, android.widget.TextView$OnEditorActionListener, ubf, z6f] */
    public vbf(int i, SettingsManager settingsManager, s9g s9gVar, k6l k6lVar, ydn ydnVar, swf swfVar, p8f p8fVar, xg xgVar, in3 in3Var, s28 s28Var, FrameLayout frameLayout, OmniBoxRoot omniBoxRoot, UrlFieldEditText urlFieldEditText, boolean z, boolean z2, v73 v73Var, dbf dbfVar, dbf dbfVar2, pt3 pt3Var, umi umiVar, mdh mdhVar, qdh qdhVar, cul culVar, igi igiVar, pde pdeVar, vx vxVar, wcd wcdVar, iuh iuhVar, wok wokVar) throws Resources.NotFoundException {
        sbf sbfVar = new sbf(this, (byte) 0);
        this.h = sbfVar;
        pbf pbfVar = new pbf(this);
        this.j = pbfVar;
        rbf rbfVar = new rbf(this);
        this.k = rbfVar;
        qbf qbfVar = new qbf(this);
        this.m = qbfVar;
        tbf tbfVar = new tbf();
        tbfVar.b = ypm.l;
        tbfVar.c = 3;
        tbfVar.d = qwi.a();
        List list = Collections.EMPTY_LIST;
        tbfVar.e = list;
        tbfVar.f = list;
        this.t = tbfVar;
        this.u = new a36();
        this.v = new kze(peg.a);
        this.D = new nrl(this);
        j25 j25Var = new j25(this, (byte) 2);
        this.H = j25Var;
        vc7 vc7Var = new vc7(this, (byte) 1);
        this.I = vc7Var;
        d8d d8dVar = new d8d(this, (byte) 16);
        this.L = d8dVar;
        this.a = i;
        this.b = settingsManager;
        this.c = k6lVar;
        this.d = s9gVar;
        this.e = ydnVar;
        this.f = swfVar;
        swfVar.g.b(rbfVar);
        this.g = p8fVar;
        this.i = xgVar;
        this.l = in3Var;
        this.n = omniBoxRoot;
        this.s = urlFieldEditText;
        this.o = z;
        this.p = z2;
        this.q = v73Var;
        this.x = dbfVar;
        this.J = igiVar;
        this.K = pdeVar;
        this.y = dbfVar2;
        wub wubVar = new wub(dbfVar);
        o8f o8fVar = new o8f(dbfVar, (byte) 2);
        bp bpVar = new bp();
        bpVar.b = o8fVar;
        this.r = new qfb(omniBoxRoot, wubVar, bpVar);
        Resources resources = urlFieldEditText.getResources();
        r(64L, true);
        final byte b = 0;
        ?? ubfVar = new ubf(this, umiVar, s28Var, pt3Var, mdhVar, qdhVar, culVar, wcdVar, iuhVar, wokVar);
        this.z = ubfVar;
        urlFieldEditText.setFocusable(false);
        urlFieldEditText.setFocusableInTouchMode(false);
        urlFieldEditText.clearFocus();
        t();
        u();
        urlFieldEditText.F(ubfVar);
        urlFieldEditText.setOnEditorActionListener(ubfVar);
        urlFieldEditText.setOnClickListener(ubfVar);
        urlFieldEditText.setOnLongClickListener(ubfVar);
        urlFieldEditText.setOnKeyListener(ubfVar);
        omniBoxRoot.setOnClickListener(ubfVar);
        omniBoxRoot.setFocusable(false);
        omniBoxRoot.setFocusableInTouchMode(false);
        final byte b2 = 1;
        final byte b3 = 2;
        this.A = new xbf(new esk(this) { // from class: obf
            public final /* synthetic */ vbf b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [android.widget.EditText, com.opera.android.widget.UrlFieldEditText] */
            public final Object get() {
                byte b4 = b;
                vbf vbfVar = this.b;
                switch (b4) {
                    case 0:
                        return vbfVar.G;
                    case 1:
                        ?? r2 = vbfVar.s;
                        String string = r2.q().toString();
                        return TextUtils.isEmpty(string) ? r2.getText().toString() : string;
                    default:
                        return vbfVar.z.f;
                }
            }
        }, new esk(this) { // from class: obf
            public final /* synthetic */ vbf b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [android.widget.EditText, com.opera.android.widget.UrlFieldEditText] */
            public final Object get() {
                byte b4 = b2;
                vbf vbfVar = this.b;
                switch (b4) {
                    case 0:
                        return vbfVar.G;
                    case 1:
                        ?? r2 = vbfVar.s;
                        String string = r2.q().toString();
                        return TextUtils.isEmpty(string) ? r2.getText().toString() : string;
                    default:
                        return vbfVar.z.f;
                }
            }
        }, new esk(this) { // from class: obf
            public final /* synthetic */ vbf b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [android.widget.EditText, com.opera.android.widget.UrlFieldEditText] */
            public final Object get() {
                byte b4 = b3;
                vbf vbfVar = this.b;
                switch (b4) {
                    case 0:
                        return vbfVar.G;
                    case 1:
                        ?? r2 = vbfVar.s;
                        String string = r2.q().toString();
                        return TextUtils.isEmpty(string) ? r2.getText().toString() : string;
                    default:
                        return vbfVar.z.f;
                }
            }
        }, new o5f((Object) this, (byte) 8), new kw3((byte) 18), dbfVar);
        this.w = new jl6(urlFieldEditText);
        this.B = resources.getDimensionPixelSize(2131167797) - frameLayout.getPaddingStart();
        this.C = omniBoxRoot.getResources().getDimensionPixelSize(2131167258);
        String string = urlFieldEditText.getContext().getString(2132022075);
        String string2 = urlFieldEditText.getContext().getString(2132022073);
        urlFieldEditText.g(string2);
        ow3 ow3Var = new ow3(this, vxVar, (byte) 5);
        urlFieldEditText.b0 = new wpg(urlFieldEditText, string, string2);
        urlFieldEditText.c0 = ow3Var;
        urlFieldEditText.D();
        urlFieldEditText.setHintTextColor(f03.W(z ? 2130971070 : 2130971076, urlFieldEditText.getContext()));
        settingsManager.F(j25Var);
        ydnVar.F(vc7Var);
        ((i7f) p8fVar.b).b(sbfVar);
        ((h7f) xgVar.b).b(pbfVar);
        ArrayList arrayListA = swfVar.a();
        q();
        tbfVar.e = arrayListA;
        s9gVar.F(this);
        lzb lzbVar = new lzb(this, (byte) 25);
        dll dllVarS = q9n.s(omniBoxRoot);
        if (dllVarS != null) {
            u8n.b(dllVarS, omniBoxRoot, lzbVar);
        }
        final int dimensionPixelSize = omniBoxRoot.getResources().getDimensionPixelSize(2131167256) * 3;
        final int dimensionPixelSize2 = omniBoxRoot.getResources().getDimensionPixelSize(2131167257);
        final int dimensionPixelSize3 = omniBoxRoot.getResources().getDimensionPixelSize(2131167263);
        omniBoxRoot.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nbf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                vbf vbfVar = this.a;
                tbf tbfVar2 = vbfVar.t;
                int i10 = i4 - i2;
                if (i8 - i6 != i10) {
                    vbfVar.q();
                    int i11 = i10 - dimensionPixelSize;
                    if (i11 < dimensionPixelSize2) {
                        tbfVar2.c = 1;
                    } else if (i11 < dimensionPixelSize3) {
                        tbfVar2.c = 2;
                    } else {
                        tbfVar2.c = 3;
                    }
                }
            }
        });
        in3Var.c.b(qbfVar);
        pdeVar.k(d8dVar);
        n();
    }

    @Override // defpackage.q9g
    public final void A() {
        b2l b2lVar = this.c.o;
        if (b2lVar != null) {
            s(b2lVar);
        }
    }

    @Override // defpackage.upm
    public final wpm a() {
        return this.s;
    }

    @Override // defpackage.czj
    public final void b() {
    }

    @Override // defpackage.upm
    public final void c() {
        k("");
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        b2l b2lVar = this.c.o;
        if (b2lVar != null) {
            s(b2lVar);
        }
    }

    @Override // defpackage.upm
    public final boolean e(int i) {
        return this.s.f(i);
    }

    @Override // defpackage.czj
    public final void f() {
    }

    @Override // defpackage.upm
    public final xbf g() {
        return this.A;
    }

    @Override // defpackage.upm
    public final void h() {
        q9n.u(this.s);
    }

    @Override // defpackage.czj
    public final boolean i() {
        return false;
    }

    @Override // defpackage.upm
    public final void j(pvb pvbVar) {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.EditText, android.widget.TextView, com.opera.android.widget.UrlFieldEditText] */
    @Override // defpackage.upm
    public final void k(String str) {
        q();
        ?? r2 = this.s;
        r2.B(str, str, 2, 0);
        if (p()) {
            Selection.setSelection(r2.getText(), r2.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r11 = this;
            tbf r0 = r11.t
            ypm r0 = r0.b
            zg r1 = r0.g
            java.lang.String r2 = r0.f
            java.lang.String r3 = r0.a
            java.lang.String r0 = r0.b
            r4 = 2
            com.opera.android.widget.UrlFieldEditText r5 = r11.s
            r6 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r11 = r1.b
            sre r11 = (defpackage.sre) r11
            java.lang.String r11 = r11.a()
            r5.B(r11, r11, r4, r6)
            return
        L1e:
            boolean r1 = r11.p()
            r7 = -1
            if (r1 == 0) goto L2b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L31
        L2b:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L34
        L31:
            r1 = r0
        L32:
            r0 = r7
            goto L6d
        L34:
            java.lang.String[] r1 = defpackage.vbf.M
            java.lang.String r1 = defpackage.aik.s(r3, r1)
            java.lang.String[] r3 = defpackage.vbf.N
            java.lang.String r1 = defpackage.aik.s(r1, r3)
            java.lang.String r1 = ehi.a(r1)
            fr r8 = defpackage.opm.a(r0)
            r9 = 0
            if (r8 == 0) goto L69
            int r10 = r8.b
            int r8 = r8.c
            java.lang.String r0 = r0.substring(r10, r8)
            java.lang.String r0 = defpackage.aik.s(r0, r3)
            int r3 = r1.indexOf(r0)
            if (r3 == r7) goto L69
            fr r9 = new fr
            int r0 = r0.length()
            int r0 = r0 + r3
            r8 = 26
            r9.<init>(r3, r0, r8)
        L69:
            if (r9 == 0) goto L32
            int r0 = r9.c
        L6d:
            if (r0 == r7) goto L74
            r11 = 1
            r5.B(r1, r2, r11, r0)
            return
        L74:
            boolean r11 = r11.p()
            if (r11 == 0) goto L7b
            r4 = r6
        L7b:
            r5.B(r1, r2, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbf.l():void");
    }

    public final lbf m(CharSequence charSequence) {
        String string = aik.t(charSequence).toString();
        if (string.isEmpty()) {
            return lbf.a;
        }
        if (!((wnh) xnh.t(this.s.getContext()).i()).b(2)) {
            String string2 = string.toString();
            String[] strArr = wqm.a;
            if (N.Mhh3b1$p(string2)) {
                return lbf.d;
            }
        }
        return wqm.x(string) ? lbf.c : lbf.b;
    }

    public final void n() {
        yqd yqdVar = this.E;
        if (yqdVar != null) {
            vml.a(yqdVar);
            this.E = null;
        }
        this.D.P(false);
        Iterator it = ((EnumMap) this.r.b).values().iterator();
        while (it.hasNext()) {
            ((OmniButtonView) it.next()).jumpDrawablesToCurrentState();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.EditText, com.opera.android.widget.UrlFieldEditText] */
    public final CharSequence o() {
        ?? r0 = this.s;
        if (r0.s()) {
            return r0.q();
        }
        tbf tbfVar = this.t;
        if (tbfVar.b(1L)) {
            return r0.getText().toString();
        }
        ypm ypmVar = tbfVar.b;
        zg zgVar = ypmVar.g;
        return zgVar != null ? ((sre) zgVar.b).a() : ypmVar.b;
    }

    public final boolean p() {
        return this.t.b(1L);
    }

    public final void q() {
        if (this.E != null) {
            return;
        }
        yqd yqdVar = new yqd(this, (byte) 25);
        this.E = yqdVar;
        vml.c(yqdVar);
    }

    public final void r(long j, boolean z) {
        tbf tbfVar = this.t;
        long j2 = tbfVar.a;
        if (z) {
            tbfVar.a = j2 | j;
        } else {
            tbfVar.a = j2 & (~j);
        }
    }

    public final void s(b2l b2lVar) {
        q();
        ypm ypmVar = new ypm(b2lVar);
        tbf tbfVar = this.t;
        tbfVar.b = ypmVar;
        r(16L, ((d7l) b2lVar).j.isLoading());
        d7l d7lVar = (d7l) b2lVar;
        r(64L, d7lVar.o0());
        r(1024L, d7lVar.j.r() || (d7lVar.j.c0() && !d7lVar.o0()));
        r(2048L, d7lVar.j.g());
        r(8192L, d7lVar.j.z());
        v();
        qwi qwiVarB0 = d7lVar.j.b0();
        q();
        tbfVar.d = qwiVarB0;
    }

    public final void t() {
        q();
        m(o());
        this.t.getClass();
        r(256L, TextUtils.isEmpty(aik.t(this.s.getText())));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.OperaEditText, com.opera.android.widget.UrlFieldEditText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r7 = this;
            java.lang.CharSequence r0 = r7.o()
            lbf r0 = r7.m(r0)
            r1 = 1
            tbf r3 = r7.t
            boolean r1 = r3.b(r1)
            r2 = 1
            lbf r4 = defpackage.lbf.b
            r5 = 0
            com.opera.android.widget.UrlFieldEditText r7 = r7.s
            if (r1 != 0) goto L43
            ypm r1 = r3.b
            java.lang.String r1 = r1.c
            boolean r1 = com.opera.android.browser.UrlMangler.c(r1)
            if (r1 != 0) goto L40
            ypm r1 = r3.b
            java.lang.String r1 = r1.c
            boolean r1 = com.opera.android.browser.UrlMangler.isOffline(r1)
            if (r1 != 0) goto L40
            ypm r1 = r3.b
            java.lang.String r1 = r1.c
            boolean r1 = com.opera.android.browser.UrlMangler.b(r1)
            if (r1 != 0) goto L40
            ypm r1 = r3.b
            java.lang.String r1 = r1.c
            boolean r1 = com.opera.android.browser.UrlMangler.d(r1)
            if (r1 == 0) goto L43
        L40:
            r1 = 2
        L41:
            r3 = r5
            goto L58
        L43:
            if (r0 == r4) goto L56
            lbf r1 = defpackage.lbf.d
            if (r0 == r1) goto L56
            android.text.Editable r1 = r7.getEditableText()
            java.lang.String r1 = r1.toString()
            int r1 = cs5.J(r1)
            goto L41
        L56:
            r3 = r2
            r1 = r5
        L58:
            l2c r6 = r7.j
            r6.d(r1)
            boolean r1 = r7.I
            if (r3 == r1) goto L73
            r7.I = r3
            boolean r1 = cs5.W(r7)
            boolean r3 = r7.I
            if (r3 != 0) goto L6f
            if (r1 == 0) goto L6f
            r1 = r2
            goto L70
        L6f:
            r1 = r5
        L70:
            r7.onRtlPropertiesChanged(r1)
        L73:
            boolean r1 = cs5.W(r7)
            if (r1 == 0) goto L7b
            r1 = 5
            goto L7c
        L7b:
            r1 = 3
        L7c:
            r1 = r1 | 16
            r7.setGravity(r1)
            if (r0 == r4) goto L84
            r2 = r5
        L84:
            r7.E(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbf.u():void");
    }

    public final void v() {
        q();
        r(128L, this.b.i("vpn_search_bypass") && this.e.t(BrowserUtils.getRendererUrl(this.t.b.c)));
    }
}
