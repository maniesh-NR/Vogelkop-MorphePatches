package defpackage;

import android.content.res.ColorStateList;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class jv2 extends i {
    public final ov0 b;
    public final xj c;
    public final so3 d;
    public pc e;

    public jv2(ov0 ov0Var, xj xjVar, so3 so3Var, li liVar) {
        super((RelativeLayout) ov0Var.b);
        this.b = ov0Var;
        this.c = xjVar;
        this.d = so3Var;
        AppCompatImageView appCompatImageView = (StylingImageView) ov0Var.c;
        u7 u7Var = new u7(this, (byte) 13);
        dll dllVarS = q9n.s(appCompatImageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, appCompatImageView, u7Var);
        }
        ((i) this).itemView.setOnTouchListener(new tj7(liVar, this));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void U() {
        xc xcVarH;
        ColorStateList colorStateListL;
        pc pcVar = this.e;
        if (pcVar == null || (xcVarH = ((va2) this.d.invoke()).h(pcVar)) == null) {
            return;
        }
        ov0 ov0Var = this.b;
        OperaTextView operaTextView = (OperaTextView) ov0Var.d;
        ?? r1 = (StylingImageView) ov0Var.c;
        operaTextView.setText(xcVarH.b.a(operaTextView.getResources()));
        r1.setImageDrawable(this.c.b(xcVarH));
        rm5 rm5Var = xcVarH.f;
        if ((rm5Var instanceof wc) || rm5Var.equals(uc.m)) {
            colorStateListL = j7h.l(2130969288, r1.getContext());
        } else {
            if (!rm5Var.equals(vc.m)) {
                h9o.p();
                return;
            }
            colorStateListL = null;
        }
        r1.c(colorStateListL);
    }
}
