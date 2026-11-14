package com.opera.android.browser.dialog;

import J.N;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.opera.android.browser.chromium.AuthenticationDialogDelegate;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingTextView;
import defpackage.nz0;
import defpackage.wth;

/* loaded from: classes.dex */
public final class AuthenticationDialog extends nz0 {
    public final String a;
    public final String b;
    public String c;
    public String d;
    public final wth e;
    public bz0 f;

    public AuthenticationDialog(String str, String str2, wth wthVar) {
        super(true, false);
        this.a = str;
        this.b = str2;
        this.e = wthVar;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132019560);
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131558668, (ViewGroup) null, false);
        int i = 2131363784;
        yq1 yq1Var = (StylingTextView) w1h.j(2131363784, viewInflate);
        if (yq1Var != null) {
            i = 2131363525;
            yq1 yq1Var2 = (DialogTitle) w1h.j(2131363525, viewInflate);
            if (yq1Var2 != null) {
                yq1Var2.setText(2132017650);
                yq1Var.setText(this.a);
                wy0 wy0Var = az0Var.a;
                wy0Var.e = (LayoutDirectionLinearLayout) viewInflate;
                wy0Var.f = this.b;
                View viewInflate2 = LayoutInflater.from(az0Var.getContext()).inflate(2131558510, (ViewGroup) null, false);
                int i2 = 2131362075;
                TextInputEditText textInputEditText = (OperaTextInputEditText) w1h.j(2131362075, viewInflate2);
                if (textInputEditText != null) {
                    i2 = 2131362076;
                    TextInputEditText textInputEditText2 = (OperaTextInputEditText) w1h.j(2131362076, viewInflate2);
                    if (textInputEditText2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate2;
                        textInputEditText.setTypeface(Typeface.DEFAULT);
                        CharSequence charSequence = this.c;
                        if (charSequence != null && this.d != null) {
                            textInputEditText2.setText(charSequence);
                            textInputEditText.setText(this.d);
                        }
                        az0Var.setView(linearLayout);
                        return;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        bz0Var.setCanceledOnTouchOutside(false);
        this.f = bz0Var;
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            N.McS1AktT(((AuthenticationDialogDelegate) this.e.b).a);
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        N.McS1AktT(((AuthenticationDialogDelegate) this.e.b).a);
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        EditText editText = (EditText) bz0Var.findViewById(2131362076);
        EditText editText2 = (EditText) bz0Var.findViewById(2131362075);
        N.M8q7bnnG(((AuthenticationDialogDelegate) this.e.b).a, editText.getText().toString(), editText2.getText().toString());
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        phj.Q(bz0Var, false);
    }
}
