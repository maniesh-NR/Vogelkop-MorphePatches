package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tf extends i {
    public static final /* synthetic */ int i = 0;
    public final cq3 b;
    public final r2 c;
    public final xj d;
    public final so3 e;
    public pc f;
    public xj7 g;
    public sf h;

    /* JADX WARN: Illegal instructions before constructor call */
    public tf(cq3 cq3Var, kze kzeVar, r2 r2Var, xj xjVar, so3 so3Var, li liVar) {
        AppCompatImageView appCompatImageView = (StylingImageView) cq3Var.b;
        super(appCompatImageView);
        this.b = cq3Var;
        this.c = r2Var;
        this.d = xjVar;
        this.e = so3Var;
        this.g = uj7.a;
        this.h = sf.a;
        u7 u7Var = new u7(this, (byte) 2);
        dll dllVarS = q9n.s(appCompatImageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, appCompatImageView, u7Var);
        }
        ((i) this).itemView.setOnTouchListener(new tj7(liVar, this));
        a26.T(kzeVar, p37.z(((i) this).itemView), new pb(this, (byte) 1));
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void U() {
        ColorStateList colorStateListL;
        pc pcVar = this.f;
        if (pcVar == null) {
            return;
        }
        xj7 xj7Var = this.g;
        if (Intrinsics.a(xj7Var, uj7.a) || Intrinsics.a(xj7Var, vj7.a)) {
            V(sf.a);
        } else {
            if (!(xj7Var instanceof wj7)) {
                h9o.p();
                return;
            }
            V(((Boolean) this.c.invoke(pcVar)).booleanValue() ? Intrinsics.a(((wj7) xj7Var).c, this) ? sf.c : sf.b : sf.a);
        }
        xc xcVarH = ((va2) this.e.invoke()).h(pcVar);
        ?? r1 = (StylingImageView) this.b.b;
        r1.setContentDescription(xcVarH.c.a(r1.getResources()));
        r1.setImageDrawable(this.d.b(xcVarH));
        rm5 rm5Var = xcVarH.f;
        if ((rm5Var instanceof wc) || rm5Var.equals(uc.m)) {
            colorStateListL = j7h.l(this.h == sf.c ? 2130969303 : 2130969288, r1.getContext());
        } else {
            if (!rm5Var.equals(vc.m)) {
                h9o.p();
                return;
            }
            colorStateListL = null;
        }
        r1.c(colorStateListL);
    }

    public final void V(sf sfVar) {
        if (this.h == sfVar) {
            return;
        }
        this.h = sfVar;
        int iOrdinal = sfVar.ordinal();
        cq3 cq3Var = this.b;
        if (iOrdinal == 0) {
            ((StylingImageView) cq3Var.b).setForeground(null);
            return;
        }
        if (iOrdinal == 1) {
            AppCompatImageView appCompatImageView = (StylingImageView) cq3Var.b;
            appCompatImageView.setForeground(j14.i0(2131231214, appCompatImageView.getContext()));
        } else if (iOrdinal != 2) {
            h9o.p();
        } else {
            AppCompatImageView appCompatImageView2 = (StylingImageView) cq3Var.b;
            appCompatImageView2.setForeground(j14.i0(2131231213, appCompatImageView2.getContext()));
        }
    }
}
