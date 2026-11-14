package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public abstract class dwd extends dej {
    public final bf9 c;
    public final hb9 d;
    public ua7 e;
    public StylingImageView f;

    public dwd(mej mejVar, hb9 hb9Var) {
        super(mejVar);
        Context context = mejVar.getContext();
        String[] strArr = OperaApplication.K;
        this.c = ((OperaApplication) context.getApplicationContext()).s();
        this.d = hb9Var;
        this.a.b(new bwd(this));
    }

    public final void d(int i, int i2, Runnable runnable) {
        this.e.n(new cwd(i, i2, runnable));
    }

    public final void e() {
        this.e.n(new cwd(2132018535, 2131232064, new yqd(this, (byte) 1)));
    }

    public void f(View view) {
        AppCompatImageView appCompatImageView = this.f;
        if (appCompatImageView != null) {
            Context context = appCompatImageView.getContext();
            Drawable drawableF = sgb.F(2131231297, context);
            j14.n0(drawableF, f03.t(2130969315, context, 2131101243));
            appCompatImageView.setBackground(drawableF);
        }
    }

    public final void g(FrameLayout frameLayout, LinearLayout linearLayout) {
        this.e = new ua7(this, LayoutInflater.from(linearLayout.getContext()), linearLayout, false, (byte) 24);
        this.f = (StylingImageView) frameLayout.findViewById(2131362425);
        lzb lzbVar = new lzb(this, (byte) 13);
        dll dllVarS = q9n.s(frameLayout);
        if (dllVarS != null) {
            u8n.b(dllVarS, frameLayout, lzbVar);
        }
        lzbVar.a(frameLayout);
    }

    public void h(hb9 hb9Var) {
    }

    public void j() {
        this.f = null;
    }
}
