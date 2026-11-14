package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.opera.android.widget.UrlFieldEditText;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ubf implements spm, ppm, TextView.OnEditorActionListener, View.OnClickListener, View.OnLongClickListener, View.OnKeyListener {
    public final umi a;
    public final lgf b;
    public final x77 c;
    public final jh d = new jh((byte) 6);
    public String e = "";
    public yl2 f;
    public final /* synthetic */ vbf g;

    public ubf(vbf vbfVar, umi umiVar, s28 s28Var, pt3 pt3Var, mdh mdhVar, qdh qdhVar, cul culVar, wcd wcdVar, iuh iuhVar, wok wokVar) {
        this.g = vbfVar;
        this.a = umiVar;
        bq1 bq1Var = vbfVar.s;
        this.b = new lgf(bq1Var.getContext(), new vx(bq1Var, (byte) 27), pt3Var, this, mdhVar, qdhVar, culVar, wcdVar, iuhVar, wokVar, s28Var);
        this.c = new x77(umiVar, bq1Var, (byte) 29);
    }

    @Override // defpackage.ppm
    public final void a(yl2 yl2Var) {
        if (k()) {
            vbf vbfVar = this.g;
            String string = vbfVar.s.r().toString();
            if (yl2Var == null || !yl2Var.g(string)) {
                return;
            }
            b();
            UrlFieldEditText urlFieldEditText = vbfVar.s;
            String string2 = urlFieldEditText.r().toString();
            if (yl2Var.j(urlFieldEditText.q().toString())) {
                return;
            }
            urlFieldEditText.x(string2, yl2Var.d().subSequence(string2.length(), yl2Var.d().length()));
            this.f = yl2Var;
            yl2Var.i();
            l(yl2Var);
        }
    }

    public final void afterTextChanged(Editable editable) {
        this.g.u();
    }

    public final void b() {
        yl2 yl2Var = this.f;
        if (yl2Var == null) {
            return;
        }
        aua auaVarB = yl2Var.b();
        if (auaVarB != null) {
            vbf vbfVar = this.g;
            bq1 bq1Var = vbfVar.s;
            bq1 bq1Var2 = vbfVar.s;
            int spanStart = bq1Var.getText().getSpanStart(auaVarB);
            int spanEnd = bq1Var2.getText().getSpanEnd(auaVarB);
            if (spanStart >= 0 && spanEnd >= 0) {
                bq1Var2.getText().delete(spanStart, spanEnd);
            }
            bq1Var2.getText().removeSpan(auaVarB);
        }
        this.f = null;
        l(null);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void d(int i, int i2) {
        vbf vbfVar = this.g;
        vbfVar.q();
        bq1 bq1Var = vbfVar.s;
        l5b l5bVar = q9n.c;
        vbfVar.r(8L, bq1Var.getSelectionStart() == 0 && bq1Var.getSelectionEnd() == bq1Var.getText().length());
    }

    public final void e() {
        dbf dbfVar = this.g.x;
        dbfVar.A(qk0.P);
        gbf gbfVar = dbfVar.a.a.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        gbfVar.m(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.EditText, com.opera.android.widget.UrlFieldEditText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            owe r2 = defpackage.owe.c
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.a
            boolean r2 = r2.get()
            r3 = 1
            r4 = 0
            vbf r5 = r0.g
            if (r2 == 0) goto L28
            com.opera.android.settings.SettingsManager r2 = r5.b
            java.lang.String r6 = "night_mode_overlay_keyboard"
            boolean r2 = r2.i(r6)
            if (r2 == 0) goto L28
            com.opera.android.settings.SettingsManager r2 = r5.b
            java.lang.String r6 = "night_mode_switch_theme"
            boolean r2 = r2.i(r6)
            if (r2 == 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r4
        L29:
            com.opera.android.widget.UrlFieldEditText r6 = r5.s
            com.opera.android.widget.UrlFieldEditText r7 = r5.s
            boolean r8 = r5.a
            android.content.Context r6 = r6.getContext()
            java.lang.Class<android.app.Activity> r9 = android.app.Activity.class
            android.content.Context r6 = defpackage.q9n.l(r6, r9)
            android.app.Activity r6 = (android.app.Activity) r6
            if (r2 != 0) goto L49
            if (r1 == 0) goto L49
            if (r8 != 0) goto L49
            android.view.Window r2 = r6.getWindow()
            r9 = 2
            vtp.W(r2, r9)
        L49:
            if (r1 != 0) goto L61
            android.text.Editable r2 = r7.getText()
            android.text.Selection.setSelection(r2, r4)
            boolean r2 = r7.s()
            if (r2 == 0) goto L61
            java.lang.CharSequence r2 = r7.q()
            java.lang.String r4 = ""
            r7.x(r2, r4)
        L61:
            x77 r2 = r0.c
            java.lang.Object r4 = r2.d
            oml r4 = (defpackage.oml) r4
            if (r4 == 0) goto L6f
            r4.cancel(r3)
            r4 = 0
            r2.d = r4
        L6f:
            r9 = 0
            if (r1 == 0) goto L79
            if (r8 != 0) goto L79
            r11 = 150(0x96, double:7.4E-322)
            r15 = r11
            goto L7a
        L79:
            r15 = r9
        L7a:
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L91
            java.lang.Object r4 = r2.c
            android.view.View r4 = (android.view.View) r4
            if (r1 == 0) goto L8b
            boolean r4 = defpackage.q9n.H(r4)
            if (r4 == 0) goto L91
            goto Lb2
        L8b:
            boolean r4 = defpackage.q9n.u(r4)
            if (r4 != 0) goto Lb2
        L91:
            java.lang.Object r4 = r2.b
            umi r4 = (defpackage.umi) r4
            kqd r7 = new kqd
            r9 = 14
            r7.<init>(r2, r9)
            nml r4 = r4.f(r7)
            oml r13 = new oml
            r13.<init>(r4)
            r2.d = r13
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS
            r18 = 0
            r13.b(r14, r15, r17, r18)
        Lb2:
            dbf r2 = r5.x
            r2.x(r1)
            if (r1 != 0) goto Ld8
            if (r8 != 0) goto Ld8
            android.view.Window r1 = r6.getWindow()
            au3 r2 = new au3
            r2.<init>(r1, r3)
            umi r0 = r0.a
            nml r0 = r0.d(r2)
            oml r1 = new oml
            r1.<init>(r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6 = 0
            r2 = 0
            r3 = 200(0xc8, double:9.9E-322)
            r1.b(r2, r3, r5, r6)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubf.f(boolean):void");
    }

    public final void g() {
        yl2 yl2Var;
        vbf vbfVar = this.g;
        if (!vbfVar.s.s() && (yl2Var = this.f) != null && yl2Var.b() != null) {
            this.f.b().d.setColor(0);
        }
        j(vbfVar.s.r());
    }

    public final void h() {
        this.d.a = true;
    }

    public final void i() {
        vbf vbfVar = this.g;
        Editable text = vbfVar.s.getText();
        if (text != null) {
            UrlFieldEditText urlFieldEditText = vbfVar.s;
            Objects.requireNonNull(urlFieldEditText);
            this.d.e(text, new wv7(urlFieldEditText, (byte) 1));
        }
    }

    public final void j(CharSequence charSequence) {
        vbf vbfVar = this.g;
        UrlFieldEditText urlFieldEditText = vbfVar.s;
        UrlFieldEditText urlFieldEditText2 = vbfVar.s;
        boolean zS = urlFieldEditText.s();
        String string = (zS ? urlFieldEditText2.r() : charSequence).toString();
        String string2 = zS ? urlFieldEditText2.q().toString() : string;
        vbfVar.t();
        if (k()) {
            this.b.k(charSequence.toString());
        }
        if (this.e.equals(string)) {
            return;
        }
        yl2 yl2Var = this.f;
        if (yl2Var != null && !yl2Var.j(string2)) {
            b();
        }
        this.e = string;
        vbfVar.x.q.b.getClass();
    }

    public final boolean k() {
        vbf vbfVar = this.g;
        return vbfVar.b.i("autocomplete_omnibar") && vbfVar.s.C() && !vbfVar.s.s();
    }

    public final void l(yl2 yl2Var) {
        vbf vbfVar = this.g;
        vbfVar.q();
        if (yl2Var == null || !yl2Var.e(new rn9(this, yl2Var))) {
            vbfVar.r(4096L, false);
            vbfVar.q.p(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dbf dbfVar = this.g.x;
        hbf hbfVar = hbf.b;
        gbf gbfVar = dbfVar.q;
        gbfVar.l(null, hbfVar);
        zqi zqiVar = (zqi) gbfVar.s.get();
        mrk mrkVar = zqiVar.b;
        mrk mrkVar2 = zqiVar.b;
        if (mrkVar.d() || mrkVar2.C.y.size() == 0) {
            return;
        }
        mrkVar2.h(null);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            vbf vbfVar = this.g;
            xbf xbfVar = vbfVar.A;
            dbf dbfVar = vbfVar.y;
            xbfVar.getClass();
            sko.s(((esk) xbfVar.e).get());
            wbf wbfVar = new wbf(xbfVar, qkk.b, 0, lqm.a);
            int iOrdinal = wbfVar.d.ordinal();
            if (iOrdinal == 1) {
                dbfVar.A(qk0.d);
            } else if (iOrdinal == 2) {
                dbfVar.A(qk0.e);
            } else if (iOrdinal == 3) {
                dbfVar.A(qk0.o);
            }
            wbfVar.b();
        }
        return true;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!fr3.H(0, keyEvent) || i != 111) {
            return false;
        }
        e();
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return this.g.x.y();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d.i(charSequence, i, i2, i3);
        j(charSequence);
    }
}
