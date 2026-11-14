package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.media.CaptureDevicesDialogDelegate;
import java.util.List;

/* loaded from: classes.dex */
public final class gi4 extends nz0 {
    public final List a;
    public final List b;
    public final u59 c;
    public String d;
    public String e;
    public boolean f;

    public gi4(List list, List list2, u59 u59Var) {
        super(true, false);
        this.a = list;
        this.b = list2;
        this.c = u59Var;
    }

    public final void b(TextInputLayout textInputLayout, int i, List list, tj9 tj9Var) {
        ro9 ro9Var = new ro9(textInputLayout, tj9Var);
        ((AutoCompleteTextView) ro9Var.d).setAdapter(new ei4(this, textInputLayout.getContext(), nb6.W(new b10((byte) 2), list), ro9Var, (byte) 0));
        ro9Var.a0(0, ((fi4) list.get(0)).b);
        textInputLayout.b.b(i != 0 ? sgb.F(i, textInputLayout.getContext()) : null);
        textInputLayout.setVisibility(0);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132018586);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.TextView, com.opera.android.custom_views.CheckBox] */
    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        List list = this.a;
        boolean zIsEmpty = list.isEmpty();
        List list2 = this.b;
        az0Var.a((zIsEmpty || list2.isEmpty()) ? 2132021529 : 2132019964);
        View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131558579, (ViewGroup) null, false);
        int i = 2131362244;
        View viewJ = w1h.j(2131362244, viewInflate);
        if (viewJ != null) {
            hi4 hi4VarA = hi4.a(viewJ);
            View viewJ2 = w1h.j(2131363514, viewInflate);
            if (viewJ2 != null) {
                hi4 hi4VarA2 = hi4.a(viewJ2);
                View viewJ3 = w1h.j(2131364045, viewInflate);
                if (viewJ3 != null) {
                    kf kfVarA = kf.a(viewJ3);
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    TextInputLayout textInputLayout = hi4VarA.c;
                    if (!list.isEmpty()) {
                        b(textInputLayout, 2131232013, list, new di4(this, (byte) 1));
                        this.d = ((fi4) list.get(0)).a;
                    }
                    TextInputLayout textInputLayout2 = hi4VarA2.c;
                    if (!list2.isEmpty()) {
                        b(textInputLayout2, 2131232137, list2, new di4(this, (byte) 2));
                        this.e = ((fi4) list2.get(0)).a;
                    }
                    ?? r0 = (CheckBox) kfVarA.c;
                    r0.setText(2132020887);
                    r0.m = new di4(this, (byte) 0);
                    this.f = r0.n;
                    az0Var.setView(linearLayout);
                    return;
                }
                i = 2131364045;
            } else {
                i = 2131363514;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        bz0Var.setCanceledOnTouchOutside(false);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            N.Mhlly_d7(((CaptureDevicesDialogDelegate) this.c.b).a, (Object) null, (Object) null, false);
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        N.Mhlly_d7(((CaptureDevicesDialogDelegate) this.c.b).a, this.d, this.e, this.f);
    }
}
