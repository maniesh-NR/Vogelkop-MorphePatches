package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public abstract class rr2 extends ltl {
    public or2 r;
    public pq3 s;
    public String t;
    public String u;
    public final kdg v;
    public AutofillManager w;
    public tr2 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public rr2() {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132017660);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.k = 1;
        super(itlVar);
        this.v = new kdg();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rr2(int i) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132017810);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = i;
        itlVar.k = 1;
        super(itlVar);
        this.v = new kdg();
    }

    public void G0() {
        l5b l5bVar = q9n.c;
        q9n.u(getView());
        g0();
    }

    public void H0(String str, String str2, String str3) {
        this.w.a(new Address("", str, "", "", "", "", "", "", "", "", str2, str3, "", "", true), new va2(this, (byte) 6));
    }

    public final void I0(TextInputLayout textInputLayout, int i) {
        byte b = 4;
        if (i == 4) {
            EditText editText = textInputLayout.e;
            String str = this.u;
            String str2 = this.t;
            qr2 qr2Var = new qr2(textInputLayout, str);
            qr2Var.d = false;
            qr2Var.c = str2;
            editText.setOnFocusChangeListener(qr2Var);
        }
        textInputLayout.e.addTextChangedListener(new mj2(this, b));
    }

    public void J0() {
        I0((TextInputLayout) this.r.e, 1);
        I0((TextInputLayout) this.r.f, 2);
        I0((TextInputLayout) this.r.d, 4);
        ((TextInputLayout) this.r.f).e.addTextChangedListener(this.v);
    }

    public final void K0() {
        this.s.d.setEnabled((TextUtils.isEmpty(((TextInputLayout) this.r.e).e.getText()) && TextUtils.isEmpty(((TextInputLayout) this.r.f).e.getText()) && TextUtils.isEmpty(((TextInputLayout) this.r.d).e.getText())) ? false : true);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.r = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.u = getString(2132020410);
        this.t = getString(2132020390);
        ((StylingTextView) this.r.b).setVisibility(8);
        K0();
        J0();
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.s = pq3VarB;
        pq3VarB.d.setText(getString(2132020969));
        final byte b = 0;
        this.s.d.setOnClickListener(new View.OnClickListener(this) { // from class: pr2
            public final /* synthetic */ rr2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                rr2 rr2Var = this.b;
                switch (b2) {
                    case 0:
                        String string = ((TextInputLayout) rr2Var.r.e).e.getText().toString();
                        String string2 = ((TextInputLayout) rr2Var.r.f).e.getText().toString();
                        String string3 = ((TextInputLayout) rr2Var.r.d).e.getText().toString();
                        if (!TextUtils.isEmpty(string3) && !Patterns.EMAIL_ADDRESS.matcher(string3).matches()) {
                            ((TextInputLayout) rr2Var.r.d).p(rr2Var.t);
                            break;
                        } else {
                            rr2Var.H0(string, string2, string3);
                            l5b l5bVar = q9n.c;
                            q9n.u(rr2Var.getView());
                            rr2Var.g0();
                            break;
                        }
                        break;
                    default:
                        rr2Var.G0();
                        break;
                }
            }
        });
        this.s.c.setText(getString(2132018111));
        final byte b2 = 1;
        this.s.c.setOnClickListener(new View.OnClickListener(this) { // from class: pr2
            public final /* synthetic */ rr2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                rr2 rr2Var = this.b;
                switch (b22) {
                    case 0:
                        String string = ((TextInputLayout) rr2Var.r.e).e.getText().toString();
                        String string2 = ((TextInputLayout) rr2Var.r.f).e.getText().toString();
                        String string3 = ((TextInputLayout) rr2Var.r.d).e.getText().toString();
                        if (!TextUtils.isEmpty(string3) && !Patterns.EMAIL_ADDRESS.matcher(string3).matches()) {
                            ((TextInputLayout) rr2Var.r.d).p(rr2Var.t);
                            break;
                        } else {
                            rr2Var.H0(string, string2, string3);
                            l5b l5bVar = q9n.c;
                            q9n.u(rr2Var.getView());
                            rr2Var.g0();
                            break;
                        }
                        break;
                    default:
                        rr2Var.G0();
                        break;
                }
            }
        });
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558525, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362665;
        TextInputLayout textInputLayoutJ = w1h.j(2131362665, viewInflate);
        if (textInputLayoutJ != null) {
            i = 2131363644;
            TextInputLayout textInputLayoutJ2 = w1h.j(2131363644, viewInflate);
            if (textInputLayoutJ2 != null) {
                i = 2131363888;
                TextInputLayout textInputLayoutJ3 = w1h.j(2131363888, viewInflate);
                if (textInputLayoutJ3 != null) {
                    i = 2131364053;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364053, viewInflate);
                    if (stylingTextView != null) {
                        this.r = new or2(viewInflate, (Object) textInputLayoutJ, (Object) textInputLayoutJ2, (Object) textInputLayoutJ3, (Object) stylingTextView, (byte) 0);
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
