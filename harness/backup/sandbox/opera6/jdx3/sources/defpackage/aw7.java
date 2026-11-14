package defpackage;

import J.N;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class aw7 extends h53 implements View.OnClickListener {
    public final boolean t;
    public final dg7 u;
    public final yt7 v;
    public final yu2 w;
    public rf2 x;
    public i4d y;

    /* JADX WARN: Illegal instructions before constructor call */
    public aw7(boolean z, yu2 yu2Var) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132018748);
        super((itl) u7kVarF.a, true);
        this.u = new dg7(this, (byte) 6);
        this.v = new yt7((byte) 6);
        this.t = z;
        this.w = yu2Var;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.v;
    }

    public final void H0() {
        rf2 rf2Var = this.x;
        rf2Var.h.setEnabled((rf2Var.k.k.q || rf2Var.g.k.q) ? false : true);
    }

    public final void I0(boolean z) {
        CharSequence charSequence;
        Drawable drawable;
        CharSequence charSequenceW;
        String strC;
        CharSequence charSequence2;
        if (this.x != null) {
            i4d i4dVar = this.y;
            if (i4dVar != null) {
                q4g q4gVar = (q4g) i4dVar.b;
                drawable = q4gVar.F;
                w3g w3gVar = q4gVar.v;
                charSequence = w3gVar.c;
                charSequenceW = cqp.W(w3gVar);
                q4g q4gVar2 = (q4g) this.y.b;
                w3g w3gVar2 = q4gVar2.v;
                charSequence2 = w3gVar2.f;
                strC = z ? q4gVar2.u.c(w3gVar2) : "fakepass";
            } else {
                charSequence = "";
                drawable = null;
                charSequenceW = "";
                strC = charSequenceW;
                charSequence2 = strC;
            }
            ((StylingImageView) this.x.c).setImageDrawable(drawable);
            ((StylingTextView) this.x.d).setText(charSequence);
            ((StylingTextView) ((or2) this.x.i).b).setText(charSequenceW);
            ((OperaTextInputEditText) this.x.j).setText(charSequence2);
            ((OperaTextInputEditText) this.x.f).setText(strC);
            if (z) {
                return;
            }
            c5g.a((OperaTextInputEditText) this.x.f, false);
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (!vtp.M(this)) {
            l5b l5bVar = q9n.c;
            q9n.u(getView());
        }
        super.l0(z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() != 2131364118) {
            if (view.getId() == 2131362247) {
                l0(false);
                return;
            }
            return;
        }
        i4d i4dVar = this.y;
        if (i4dVar != null) {
            Editable text = ((OperaTextInputEditText) this.x.j).getText();
            String string = text != null ? text.toString() : null;
            Editable text2 = ((OperaTextInputEditText) this.x.f).getText();
            String string2 = text2 != null ? text2.toString() : null;
            q4g q4gVar = (q4g) i4dVar.b;
            a4g a4gVar = q4gVar.u;
            w3g w3gVar = q4gVar.v;
            N.MjE4dyB7(a4gVar.b, w3g.a(a4gVar.a, w3gVar), string, string2, new eof((Object) i4dVar, (Object) this.u, (byte) 5));
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.x = null;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        r5n.n((ScrollView) this.x.b, 8);
        this.x.e.setOnClickListener(this);
        this.x.h.setOnClickListener(this);
        ((OperaTextInputEditText) this.x.j).addTextChangedListener(new vp2(this));
        ((OperaTextInputEditText) this.x.f).addTextChangedListener(new mj2(this, (byte) 7));
        wi2.i.d.j(getViewLifecycleOwner(), new ks6(this, (byte) 4));
        c5g.a((OperaTextInputEditText) this.x.f, this.t);
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        View viewInflate = layoutInflater.inflate(2131558681, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362247;
        MaterialButton materialButtonJ = w1h.j(2131362247, viewInflate);
        if (materialButtonJ != null) {
            i = 2131362594;
            AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, viewInflate);
            if (appCompatImageView != null) {
                i = 2131363859;
                TextInputEditText textInputEditText = (OperaTextInputEditText) w1h.j(2131363859, viewInflate);
                if (textInputEditText != null) {
                    i = 2131363861;
                    TextInputLayout textInputLayoutJ = w1h.j(2131363861, viewInflate);
                    if (textInputLayoutJ != null) {
                        i = 2131364118;
                        MaterialButton materialButtonJ2 = w1h.j(2131364118, viewInflate);
                        if (materialButtonJ2 != null) {
                            i = 2131364458;
                            View viewJ = w1h.j(2131364458, viewInflate);
                            if (viewJ != null) {
                                or2 or2VarA = or2.a(viewJ);
                                i = 2131364511;
                                if (((Space) w1h.j(2131364511, viewInflate)) != null) {
                                    i = 2131363525;
                                    yq1 yq1Var = (StylingTextView) w1h.j(2131363525, viewInflate);
                                    if (yq1Var != null) {
                                        i = 2131364984;
                                        TextInputEditText textInputEditText2 = (OperaTextInputEditText) w1h.j(2131364984, viewInflate);
                                        if (textInputEditText2 != null) {
                                            i = 2131364985;
                                            TextInputLayout textInputLayoutJ2 = w1h.j(2131364985, viewInflate);
                                            if (textInputLayoutJ2 != null) {
                                                this.x = new rf2((ScrollView) viewInflate, materialButtonJ, appCompatImageView, textInputEditText, textInputLayoutJ, materialButtonJ2, or2VarA, yq1Var, textInputEditText2, textInputLayoutJ2, (byte) 2);
                                                this.w.getClass();
                                                boolean z = Build.VERSION.SDK_INT >= 30;
                                                rf2 rf2Var = this.x;
                                                if (z) {
                                                    ((StylingTextView) ((or2) rf2Var.i).f).setText(2132018743);
                                                    return;
                                                } else {
                                                    ((StylingTextView) ((or2) rf2Var.i).f).setText(2132018745);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
