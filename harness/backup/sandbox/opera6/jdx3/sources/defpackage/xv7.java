package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.opera.android.widget.UrlFieldEditText;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xv7 implements spm, ppm, TextView.OnEditorActionListener, View.OnClickListener, View.OnLongClickListener, View.OnKeyListener {
    public yl2 a;
    public final lgf b;
    public final jh c;
    public String d;
    public final /* synthetic */ yv7 e;

    public xv7(yv7 yv7Var) {
        this.e = yv7Var;
        Context context = yv7Var.b;
        sv7 sv7Var = new sv7(yv7Var, (byte) 3);
        hz4 hz4Var = yv7Var.c;
        this.b = new lgf(context, sv7Var, (pt3) hz4Var.k, this, (mdh) hz4Var.l, (qdh) hz4Var.m, (cul) hz4Var.n, (wcd) hz4Var.q, (iuh) hz4Var.r, (wok) hz4Var.s, (s28) hz4Var.i);
        this.c = new jh((byte) 6);
        this.d = "";
        oup.l0(yv7Var.a.b, (Function1) null, new tu7((Object) this, (byte) 3), (Function1) null, (Function1) null, 13);
    }

    @Override // defpackage.ppm
    public final void a(yl2 yl2Var) {
        if (k()) {
            yv7 yv7Var = this.e;
            String string = yv7Var.l.r().toString();
            if (yl2Var != null) {
                if ((yl2Var.a() || yv7Var.m) && yl2Var.g(string)) {
                    b();
                    String string2 = yv7Var.l.r().toString();
                    if (yl2Var.j(yv7Var.l.q().toString())) {
                        return;
                    }
                    yv7Var.l.x(string2, yl2Var.d().subSequence(string2.length(), yl2Var.d().length()));
                    this.a = yl2Var;
                    yl2Var.i();
                    pde pdeVar = yv7Var.i;
                    xf8.F0(pdeVar, uv7.a((uv7) pdeVar.g(), false, null, yv7.d(yv7Var, null, yl2Var, null, 5), yl2Var, null, 19));
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        this.e.o();
    }

    public final void b() {
        yl2 yl2Var = this.a;
        if (yl2Var == null) {
            return;
        }
        aua auaVarB = yl2Var.b();
        yv7 yv7Var = this.e;
        Editable text = yv7Var.l.getText();
        if (auaVarB != null && text != null) {
            int spanStart = text.getSpanStart(auaVarB);
            int spanEnd = text.getSpanEnd(auaVarB);
            if (spanStart >= 0 && spanEnd >= 0) {
                text.delete(spanStart, spanEnd);
            }
            text.removeSpan(auaVarB);
        }
        this.a = null;
        pde pdeVar = yv7Var.i;
        xf8.F0(pdeVar, uv7.a((uv7) pdeVar.g(), false, null, yv7.d(yv7Var, null, null, null, 5), null, null, 19));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r10, int r11) {
        /*
            r9 = this;
            yv7 r9 = r9.e
            pde r0 = r9.i
            java.lang.Object r1 = r0.g()
            r2 = r1
            uv7 r2 = (defpackage.uv7) r2
            if (r11 <= r10) goto L28
            com.opera.android.widget.UrlFieldEditText r9 = r9.l
            l5b r10 = defpackage.q9n.c
            int r10 = r9.getSelectionStart()
            if (r10 != 0) goto L28
            int r10 = r9.getSelectionEnd()
            java.lang.CharSequence r9 = r9.getText()
            int r9 = r9.length()
            if (r10 != r9) goto L28
            r9 = 1
        L26:
            r3 = r9
            goto L2a
        L28:
            r9 = 0
            goto L26
        L2a:
            r7 = 0
            r8 = 30
            r4 = 0
            r5 = 0
            r6 = 0
            uv7 r9 = defpackage.uv7.a(r2, r3, r4, r5, r6, r7, r8)
            xf8.F0(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv7.d(int, int):void");
    }

    public final void e() {
        dbf dbfVar = (dbf) this.e.c.d;
        dbfVar.A(qk0.P);
        gbf gbfVar = dbfVar.a.a.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        gbfVar.m(true);
    }

    public final void f(boolean z) {
        yv7 yv7Var = this.e;
        hz4 hz4Var = yv7Var.c;
        boolean z2 = owe.c.a.get() && hz4Var.b.i("night_mode_overlay_keyboard") && hz4Var.b.i("night_mode_switch_theme");
        Activity activity = (Activity) q9n.l(yv7Var.l.getContext(), Activity.class);
        if (!z2 && z && !hz4Var.a) {
            vtp.W(activity.getWindow(), 2);
        }
        if (z) {
            yv7Var.f.invoke();
        } else {
            Selection.setSelection(yv7Var.l.getText(), 0);
            if (yv7Var.l.s()) {
                UrlFieldEditText urlFieldEditText = yv7Var.l;
                urlFieldEditText.x(urlFieldEditText.q(), "");
            }
        }
        yv7Var.m(z);
        ((dbf) hz4Var.d).x(z);
        if (!z && !hz4Var.a) {
            new oml(((umi) hz4Var.j).d(new au3(activity.getWindow(), (byte) 1))).b(null, 200L, TimeUnit.MILLISECONDS, null);
        }
        yv7Var.o();
    }

    public final void g() {
        yl2 yl2Var = this.a;
        yv7 yv7Var = this.e;
        if (yl2Var != null) {
            aua auaVarB = yl2Var.b();
            if (!yv7Var.l.s() && auaVarB != null) {
                auaVarB.d.setColor(0);
            }
        }
        j(yv7Var.l.r());
    }

    public final void h() {
        this.c.a = true;
    }

    public final void i() {
        yv7 yv7Var = this.e;
        Editable text = yv7Var.l.getText();
        if (text != null) {
            this.c.e(text, new wv7(yv7Var.l, (byte) 0));
        }
    }

    public final void j(CharSequence charSequence) {
        yv7 yv7Var = this.e;
        boolean zS = yv7Var.l.s();
        String string = (zS ? yv7Var.l.r() : charSequence).toString();
        String string2 = zS ? yv7Var.l.q().toString() : string;
        yv7Var.n();
        if (k()) {
            this.b.k(charSequence.toString());
        }
        if (Intrinsics.a(this.d, string)) {
            return;
        }
        yl2 yl2Var = this.a;
        if (yl2Var != null && (!yl2Var.j(string2) || (!yl2Var.a() && !yv7Var.m))) {
            b();
        }
        this.d = string;
        ((dbf) yv7Var.c.d).q.b.getClass();
    }

    public final boolean k() {
        yv7 yv7Var = this.e;
        return yv7Var.c.b.i("autocomplete_omnibar") && yv7Var.l.C() && !yv7Var.l.s();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && !oup.g0(keyEvent) && i != 6 && !oup.g0(keyEvent)) {
            return false;
        }
        yv7 yv7Var = this.e;
        if (((Boolean) yv7Var.g.invoke()).booleanValue()) {
            return false;
        }
        xbf xbfVar = yv7Var.j;
        sko.s(((esk) xbfVar.e).get());
        wbf wbfVar = new wbf(xbfVar, qkk.b, 0, lqm.a);
        dbf dbfVar = (dbf) yv7Var.c.p;
        int iOrdinal = wbfVar.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                dbfVar.A(qk0.d);
            } else if (iOrdinal == 2) {
                dbfVar.A(qk0.e);
            } else {
                if (iOrdinal != 3) {
                    h9o.p();
                    return false;
                }
                dbfVar.A(qk0.o);
            }
        }
        wbfVar.b();
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
        return ((dbf) this.e.c.d).y();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c.i(charSequence, i, i2, i3);
        j(charSequence);
    }
}
