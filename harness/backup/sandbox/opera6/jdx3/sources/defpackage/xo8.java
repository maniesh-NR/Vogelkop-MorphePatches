package defpackage;

import android.animation.LayoutTransition;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class xo8 {
    public static final long j;
    public static final long k;
    public static final /* synthetic */ int l = 0;
    public final xj a;
    public final so3 b;
    public final FrameLayout c;
    public final RelativeLayout d;
    public final RelativeLayout e;
    public final OperaTextView f;
    public final StylingImageView g;
    public wo8 h;
    public pc i;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        j = cs5.x0(150, un7Var);
        k = cs5.x0(100, un7Var);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public xo8(ov0 ov0Var, xj xjVar, so3 so3Var) {
        this.a = xjVar;
        this.b = so3Var;
        this.c = (FrameLayout) ov0Var.b;
        this.d = (RelativeLayout) ((ov0) ov0Var.c).b;
        ov0 ov0Var2 = (ov0) ov0Var.d;
        RelativeLayout relativeLayout = (RelativeLayout) ov0Var2.b;
        this.e = relativeLayout;
        OperaTextView operaTextView = (OperaTextView) ov0Var2.d;
        this.f = operaTextView;
        ?? r3 = (StylingImageView) ov0Var2.c;
        this.g = r3;
        this.h = wo8.a;
        pc5 pc5Var = new pc5(this, (byte) 12);
        dll dllVarS = q9n.s(r3);
        if (dllVarS != null) {
            u8n.b(dllVarS, r3, pc5Var);
        }
        operaTextView.setVisibility(8);
        relativeLayout.setBackground(null);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        relativeLayout.setLayoutTransition(layoutTransition);
        c(wo8.b);
    }

    public final void a() {
        c(wo8.b);
        this.d.animate().setDuration(pn7.f(j)).scaleX(0.9f).scaleY(0.9f).translationZ(0.0f).withEndAction(new eg(this, (byte) 2));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void b() {
        xc xcVarH;
        ColorStateList colorStateListL;
        pc pcVar = this.i;
        if (pcVar == null || (xcVarH = ((va2) this.b.invoke()).h(pcVar)) == null) {
            return;
        }
        rxh rxhVar = xcVarH.b;
        OperaTextView operaTextView = this.f;
        operaTextView.setText(rxhVar.a(operaTextView.getResources()));
        pxh pxhVar = xcVarH.c;
        ?? r2 = this.g;
        r2.setContentDescription(pxhVar.a(r2.getResources()));
        r2.setImageDrawable(this.a.b(xcVarH));
        rm5 rm5Var = xcVarH.f;
        if ((rm5Var instanceof wc) || rm5Var.equals(uc.m)) {
            colorStateListL = j7h.l(2130969288, r2.getContext());
        } else {
            if (!rm5Var.equals(vc.m)) {
                h9o.p();
                return;
            }
            colorStateListL = null;
        }
        r2.c(colorStateListL);
    }

    public final void c(wo8 wo8Var) {
        if (this.h == wo8Var) {
            return;
        }
        this.h = wo8Var;
        int iOrdinal = wo8Var.ordinal();
        OperaTextView operaTextView = this.f;
        if (iOrdinal == 0) {
            operaTextView.setVisibility(0);
        } else if (iOrdinal == 1) {
            operaTextView.setVisibility(8);
        } else {
            h9o.p();
        }
    }
}
