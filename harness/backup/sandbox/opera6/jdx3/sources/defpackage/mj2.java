package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.ScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.OperaTextInputEditText;

/* loaded from: classes.dex */
public final class mj2 extends ca3 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj2(Object obj, byte b) {
        super((byte) 0);
        this.b = b;
        this.c = obj;
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 1:
                iq2 iq2Var = ((xp2) obj).c;
                iq2Var.I = editable.toString();
                iq2Var.N0();
                break;
            case 2:
                String string = editable.toString();
                aq2 aq2Var = (aq2) obj;
                iq2 iq2Var2 = aq2Var.c;
                if (!string.equals(iq2Var2.H)) {
                    iq2Var2.H = editable.toString();
                    iq2Var2.J = null;
                    aq2Var.b.p((CharSequence) null);
                    iq2Var2.N0();
                    break;
                }
                break;
            case 3:
                ((mr2) obj).M0();
                break;
            case 4:
                ((rr2) obj).K0();
                break;
            case 5:
                ((f9c) obj).G0();
                break;
            case 6:
                ss7 ss7Var = (ss7) obj;
                ss7Var.z = true;
                ss7Var.K0();
                break;
            case 7:
                aw7 aw7Var = (aw7) obj;
                boolean z = editable != null && editable.length() > 0;
                rf2 rf2Var = aw7Var.x;
                if ((!rf2Var.g.k.q) != z) {
                    h3m.a((ScrollView) rf2Var.b, (y2m) null);
                    if (z) {
                        aw7Var.x.g.q(false);
                    } else {
                        i4d i4dVar = aw7Var.y;
                        String strW = i4dVar != null ? cqp.W(((q4g) i4dVar.b).v) : "";
                        aw7Var.x.g.p(strW.isEmpty() ? null : aw7Var.getString(2132018744, new Object[]{strW}));
                    }
                    aw7Var.H0();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                fge fgeVar = (fge) obj;
                boolean z2 = !aik.t(editable).toString().isEmpty();
                fgeVar.B.setEnabled(z2);
                fgeVar.B.setActivated(z2);
                break;
            case 11:
                ((pq3) ((f9c) obj).t).d.setEnabled(!((OperaTextInputEditText) ((or2) r5.s).f).getText().toString().isEmpty());
                break;
            case 13:
                ((mrn) obj).p.f(new jrn(editable.toString()));
                break;
        }
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                pj2 pj2Var = (pj2) obj;
                pj2Var.u.setEnabled(!TextUtils.isEmpty(pj2Var.s.getText()));
                pj2Var.r.setVisibility(8);
                break;
            case 8:
                ((l18) obj).g.p((CharSequence) null);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((TextInputLayout) ((w48) ((v48) obj).b).d.d).p((CharSequence) null);
                break;
            case 12:
                ((TextInputLayout) ((f0i) ((v48) obj).b).g.f).p((CharSequence) null);
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
        }
    }
}
