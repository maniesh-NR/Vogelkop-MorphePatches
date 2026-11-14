package defpackage;

import android.view.View;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final /* synthetic */ class ku2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lu2 b;

    public /* synthetic */ ku2(lu2 lu2Var, byte b) {
        this.a = b;
        this.b = lu2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        lu2 lu2Var = this.b;
        switch (b) {
            case 0:
                lu2Var.K0();
                break;
            case 1:
                lu2Var.K0();
                break;
            case 2:
                if ((lu2Var.H0().c.getInputType() & 144) != 144) {
                    yq1 yq1Var = lu2Var.H0().c;
                    mu2 mu2VarI0 = lu2Var.I0();
                    w3g w3gVar = lu2Var.z;
                    if (w3gVar == null) {
                        w3gVar = null;
                    }
                    a4g a4gVar = mu2VarI0.f;
                    yq1Var.setText((a4gVar != null ? a4gVar : null).c(w3gVar));
                    lu2Var.H0().e.setImageResource(2131232292);
                    c5g.a(lu2Var.H0().c, true);
                    break;
                } else {
                    lu2Var.J0();
                    break;
                }
            case 3:
                mu2 mu2VarI02 = lu2Var.I0();
                w3g w3gVar2 = lu2Var.z;
                if (w3gVar2 == null) {
                    w3gVar2 = null;
                }
                a4g a4gVar2 = mu2VarI02.f;
                String strC = (a4gVar2 != null ? a4gVar2 : null).c(w3gVar2);
                if (strC != null) {
                    lcp.F(lu2Var.requireContext(), strC.toString(), true);
                    break;
                }
                break;
            case 4:
                CharSequence text = ((StylingTextView) lu2Var.H0().h.b).getText();
                if (text != null) {
                    lcp.F(lu2Var.requireContext(), text.toString(), false);
                    break;
                }
                break;
            default:
                mu2 mu2VarI03 = lu2Var.I0();
                w3g w3gVar3 = lu2Var.z;
                if (w3gVar3 == null) {
                    w3gVar3 = null;
                }
                AutofillPasswordPickerActivity autofillPasswordPickerActivity = mu2VarI03.c;
                a4g a4gVar3 = mu2VarI03.f;
                autofillPasswordPickerActivity.G(w3gVar3, (a4gVar3 != null ? a4gVar3 : null).c(w3gVar3));
                break;
        }
    }
}
