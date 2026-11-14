package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public abstract class f73 extends ab2 {
    public final owc d;
    public final tah e;
    public r8n f;
    public e73 g;

    public f73(owc owcVar, tah tahVar) {
        super(owcVar.b);
        this.d = owcVar;
        this.e = tahVar;
        AppCompatImageView appCompatImageView = owcVar.f;
        d73 d73Var = new d73(this, (byte) 0);
        dll dllVarS = q9n.s(appCompatImageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, appCompatImageView, d73Var);
        }
        AppCompatImageView appCompatImageView2 = owcVar.c;
        d73 d73Var2 = new d73(this, (byte) 1);
        dll dllVarS2 = q9n.s(appCompatImageView2);
        if (dllVarS2 == null) {
            return;
        }
        u8n.b(dllVarS2, appCompatImageView2, d73Var2);
    }

    @Override // defpackage.ab2
    public final void X(boolean z) {
        View.OnClickListener onClickListener;
        fdn fdnVarC0 = c0();
        ac1 ac1VarB0 = b0();
        owc owcVar = this.d;
        yq1 yq1Var = owcVar.e;
        AppCompatImageView appCompatImageView = owcVar.f;
        LinearLayout linearLayout = owcVar.d;
        View view = owcVar.i;
        FrameLayout frameLayout = owcVar.g;
        CharSequence charSequence = (CharSequence) ac1VarB0.c;
        int i = ac1VarB0.a;
        yq1Var.setText(charSequence);
        CharSequence charSequence2 = (CharSequence) ac1VarB0.d;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
        yq1 yq1Var2 = owcVar.h;
        if (zIsEmpty) {
            yq1Var2.setVisibility(8);
        } else {
            yq1Var2.setText(charSequence2);
            yq1Var2.setVisibility(0);
        }
        this.g = new e73(this, fdnVarC0, (byte) 0);
        tah tahVar = this.e;
        boolean z2 = (((ydn) tahVar.d).c.isEnabled() || fdnVarC0.e || ((Boolean) ((jjg) tahVar.j).get()).booleanValue()) ? false : true;
        boolean z3 = (z2 || i == 0) ? false : true;
        if (z2) {
            this.f = new d73(this, (byte) 2);
            frameLayout.setVisibility(0);
            owcVar.b.setOnClickListener(new gf(this, fdnVarC0));
            view.setVisibility(8);
            frameLayout.setBackground(null);
            linearLayout.setBackground(null);
        } else if (i != 0) {
            appCompatImageView.setImageResource(i);
            frameLayout.setVisibility(0);
            view.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
            view.setVisibility(8);
        }
        if (!z2) {
            linearLayout.setOnClickListener(new nf(this, fdnVarC0, (byte) 12));
        }
        if (z3 && (onClickListener = (View.OnClickListener) ac1VarB0.e) != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
        if (z3 && ac1VarB0.b != 0) {
            this.f = new e73(this, ac1VarB0, (byte) 1);
        }
        r8n r8nVar = this.f;
        if (r8nVar != null) {
            r8nVar.a(appCompatImageView);
        }
        e73 e73Var = this.g;
        if (e73Var != null) {
            e73Var.a(owcVar.c);
        }
    }

    @Override // defpackage.ab2
    public final void Y() {
        this.f = null;
        this.g = null;
    }

    public abstract ac1 b0();

    public abstract fdn c0();
}
