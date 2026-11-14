package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.opera.android.custom_views.OperaEditText;

/* loaded from: classes.dex */
public final class mpb extends lpb {
    public final String e;

    public mpb(qq6 qq6Var, boolean z, String str, String str2, String str3) {
        super(qq6Var, z, str, str2);
        this.e = str3;
    }

    @Override // defpackage.lpb
    public final void e(az0 az0Var, LinearLayout linearLayout) {
        super.e(az0Var, linearLayout);
        ov0 ov0VarJ = ov0.j(LayoutInflater.from(az0Var.getContext()), linearLayout);
        bq1 bq1Var = (OperaEditText) ov0VarJ.c;
        linearLayout.addView((View) ov0VarJ.b, 0);
        CharSequence charSequence = this.e;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        bq1Var.setText(charSequence);
        bq1Var.selectAll();
    }

    @Override // defpackage.lpb, defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        super.onShowDialog(bz0Var);
        q9n.H(bz0Var.findViewById(2131363222));
    }
}
