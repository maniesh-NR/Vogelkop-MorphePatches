package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.opera.android.browser.chromium.JavaScriptDialogManagerDelegate;
import com.opera.android.custom_views.CheckBox;

/* loaded from: classes.dex */
public abstract class lpb extends nz0 {
    public final qq6 a;
    public final boolean b;
    public final String c;
    public final String d;

    public lpb(qq6 qq6Var, boolean z, String str, String str2) {
        super(true, false);
        this.a = qq6Var;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public int b() {
        return 2132018111;
    }

    public int d() {
        return 2132020155;
    }

    public void e(az0 az0Var, LinearLayout linearLayout) {
        az0Var.setTitle(this.c);
        az0Var.a.f = this.d;
        az0Var.setView(linearLayout);
        if (this.b) {
            linearLayout.addView(phj.I(az0Var.getContext(), 2132019366, false, (av4) null));
        }
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(b());
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(d());
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        LinearLayout linearLayout = new LinearLayout(az0Var.getContext());
        linearLayout.setOrientation(1);
        e(az0Var, linearLayout);
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        bz0Var.setCanceledOnTouchOutside(false);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            N.MLhEAOiz(((JavaScriptDialogManagerDelegate) this.a.b).a.b);
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        if (this.b) {
        }
        N.MLhEAOiz(((JavaScriptDialogManagerDelegate) this.a.b).a.b);
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        TextView textView = (TextView) bz0Var.findViewById(2131362658);
        String string = textView != null ? textView.getText().toString() : "";
        boolean z = false;
        if (this.b) {
            CheckBox checkBox = (CheckBox) bz0Var.findViewById(2131362471);
            if (checkBox == null ? false : checkBox.n) {
                z = true;
            }
        }
        JavaScriptDialogManagerDelegate javaScriptDialogManagerDelegate = (JavaScriptDialogManagerDelegate) this.a.b;
        javaScriptDialogManagerDelegate.c = z;
        N.MC8l5OlC(javaScriptDialogManagerDelegate.a.b, string);
    }

    @Override // defpackage.nz0
    public void onShowDialog(bz0 bz0Var) {
        TextView textView;
        String str = this.c;
        if (!TextUtils.isEmpty(str) && (textView = (TextView) bz0Var.findViewById(2131362006)) != null) {
            na2.R(textView, new dkl(str), new wkl());
        }
        q9n.h(bz0Var.getContext());
    }

    @Override // defpackage.nz0
    public final boolean useTapStealingProtection() {
        return true;
    }
}
