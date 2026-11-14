package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class as extends ss7 {
    public final gjm D;
    public String E;

    public as(gjm gjmVar) {
        super(-1, 0);
        this.D = gjmVar;
    }

    @Override // defpackage.ltl
    public final itl C0(itl itlVar) {
        itlVar.getClass();
        itlVar.a = new rxh(this.v == null ? 2132018051 : 2132018049);
        return itlVar;
    }

    @Override // defpackage.ss7
    public final al3 G0(al3 al3Var, String str) {
        al3 al3Var2 = this.v;
        if (al3Var2 != null && al3Var != null) {
            return kkj.k((ml3) al3Var, Intrinsics.a(al3Var2.getTitle(), str) ? al3Var.getTitle() : str, this.E);
        }
        return new kkj(-1L, str, this.E, false);
    }

    @Override // defpackage.ss7
    public final x80 H0() {
        return this.v == null ? x80.e : x80.d;
    }

    @Override // defpackage.ss7
    public final boolean J0() {
        Editable text = ((OperaTextInputEditText) this.t.d).getText();
        return (text == null || StringsKt.N(text) || I0(text)) ? false : true;
    }

    @Override // defpackage.ss7
    public final void K0() {
        super.K0();
        this.t.e.p(I0(((OperaTextInputEditText) this.t.d).getText()) ? getString(2132019125) : null);
    }

    public final void Q0() {
        this.E = null;
        ((ImageButton) this.t.m).setVisibility(8);
        ((ImageView) this.t.j).setImageDrawable(alo.A(2131231166, requireContext()));
        ((StylingTextView) this.t.b).setText(2132018039);
        ((LinearLayout) this.t.h).setContentDescription(getResources().getString(2132018039));
    }

    public final void R0(String str) {
        cr2 cr2Var = this.t;
        ((ImageView) cr2Var.j).setImageDrawable(alo.z(((LinearLayout) cr2Var.g).getContext(), str));
        ((ImageButton) this.t.m).setVisibility(0);
        ((ImageButton) this.t.m).setOnClickListener(new zr(this, (byte) 1));
        ((StylingTextView) this.t.b).setText(2132018040);
        ((LinearLayout) this.t.h).setContentDescription(getResources().getString(2132018040));
    }

    @Override // defpackage.ss7, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        CharSequence string;
        int i = 1;
        this.t.e.q(true);
        al3 al3Var = this.v;
        if (al3Var == null || (string = al3Var.getTitle()) == null) {
            string = getResources().getString(2132019121);
            while (I0(string)) {
                int i2 = i + 1;
                CharSequence string2 = getString(2132019122, new Object[]{Integer.valueOf(i)});
                i = i2;
                string = string2;
            }
        }
        ((OperaTextInputEditText) this.t.d).setText(string);
        ((OperaTextInputEditText) this.t.d).selectAll();
        byte b = 0;
        this.t.i.setVisibility(0);
        ml3 ml3Var = (ml3) this.v;
        String strB = ml3Var != null ? ml3Var.b() : null;
        if (strB != null) {
            R0(strB);
            this.E = strB;
        } else {
            Q0();
        }
        ((LinearLayout) this.t.h).setOnClickListener(new zr(this, b));
        super.onViewCreated(view, bundle);
    }
}
