package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.StylingImageView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y00 extends g10 {
    public boolean H;

    @Override // defpackage.xv8, defpackage.bu8, android.view.View.OnClickListener
    public final void onClick(View view) {
        aoo aooVar;
        if (view != this.x) {
            super.onClick(view);
            return;
        }
        x10 x10VarE0 = e0();
        if (x10VarE0 != null) {
            x10VarE0.n();
            cie cieVar = f0().u;
            if (this.H) {
                cs5.q0(cieVar, 4);
                jsd jsdVar = cieVar.P;
                if (jsdVar == null || (aooVar = cieVar.w0) == null) {
                    return;
                }
                aooVar.j(jsdVar);
                return;
            }
            cs5.q0(cieVar, 7);
            Context context = view.getContext();
            i16 i16Var = new i16((byte) 3, (Object) this, (Object) cieVar, false);
            int i = cieVar.x0;
            if (i == 0) {
                i = 2;
            }
            int iA = vep.A(i);
            if (iA == 0) {
                ((ll9) context.getSystemService("com.opera.android.ui.FRAGMENT_CONTROLLER_SERVICE")).b(new zhj(new wzg(new f9c(cieVar, i16Var), f9c.class, (byte) 4), null, 1, -1, null, false, Arrays.asList(new n6h[0])));
            } else if (iA == 1) {
                z77 z77VarU = sfe.U(context);
                hy4 hy4Var = new hy4(cieVar, i16Var);
                z77VarU.getClass();
                z77VarU.b(hy4Var, ijm.b);
            }
        }
    }

    @Override // defpackage.g10
    public final void q0(Bundle bundle) {
        this.H = bundle.getBoolean("submitted", false);
        cie cieVar = f0().u;
        if (this.H) {
            t0(cieVar);
            return;
        }
        LinearLayout linearLayout = this.E;
        linearLayout.removeAllViews();
        String str = cieVar.o;
        if (!TextUtils.isEmpty(str)) {
            AppCompatImageView stylingImageView = new StylingImageView(linearLayout.getContext(), null);
            linearLayout.addView(stylingImageView);
            if (!TextUtils.isEmpty(str)) {
                gu8.h0(str, stylingImageView, this.k, false, new nv6(stylingImageView));
            }
        }
        TextView textView = this.x;
        textView.setVisibility(0);
        textView.setText(cieVar.E);
        TextView textView2 = this.n;
        textView2.setVisibility(0);
        i0();
        FrameLayout frameLayout = this.j;
        g10.n0(frameLayout);
        int id = frameLayout.getId();
        TextView textView3 = this.m;
        g10.p0(id, textView3);
        g10.p0(frameLayout.getId(), this.i);
        g10.p0(textView3.getId(), textView2);
    }

    @Override // defpackage.g10
    public final void r0(Bundle bundle) {
        bundle.putBoolean("submitted", this.H);
    }

    public final void t0(cie cieVar) {
        this.E.removeAllViews();
        w06 w06Var = cieVar.d;
        w06 w06Var2 = w06.f;
        TextView textView = this.x;
        if (w06Var == w06Var2) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(cieVar.J ? 0 : 8);
            textView.setText(cieVar.K);
        }
        TextView textView2 = this.n;
        textView2.setVisibility(8);
        this.q.setVisibility(8);
        TextView textView3 = this.m;
        g10.n0(textView3);
        g10.n0(this.i);
        int id = textView3.getId();
        FrameLayout frameLayout = this.j;
        g10.p0(id, frameLayout);
        g10.p0(frameLayout.getId(), textView2);
        s0(cieVar);
    }
}
