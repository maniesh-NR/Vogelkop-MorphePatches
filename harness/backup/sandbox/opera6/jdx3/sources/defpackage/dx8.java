package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.widget.RoundedImageView;

/* loaded from: classes.dex */
public final class dx8 extends ou8 {
    public final kf k;

    public dx8(r9i r9iVar, View view) {
        super(r9iVar, view);
        FrameLayout frameLayout = (FrameLayout) view;
        int i = 2131362921;
        if (((RoundedImageView) w1h.j(2131362921, view)) != null) {
            i = 2131362922;
            View viewJ = w1h.j(2131362922, view);
            if (viewJ != null) {
                ov0.d(viewJ);
                i = 2131362925;
                OperaTextView operaTextViewJ = w1h.j(2131362925, view);
                if (operaTextViewJ != null) {
                    this.k = new kf((byte) 12, frameLayout, operaTextViewJ);
                    final byte b = 0;
                    r8n r8nVar = new r8n(this) { // from class: cx8
                        public final /* synthetic */ dx8 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.r8n
                        public final void a(View view2) {
                            byte b2 = b;
                            dx8 dx8Var = this.b;
                            switch (b2) {
                                case 0:
                                    dx8Var.e0();
                                    break;
                                default:
                                    dx8Var.f0();
                                    break;
                            }
                        }
                    };
                    dll dllVarS = q9n.s(frameLayout);
                    if (dllVarS != null) {
                        u8n.b(dllVarS, frameLayout, r8nVar);
                    }
                    final byte b2 = 1;
                    r8n r8nVar2 = new r8n(this) { // from class: cx8
                        public final /* synthetic */ dx8 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.r8n
                        public final void a(View view2) {
                            byte b22 = b2;
                            dx8 dx8Var = this.b;
                            switch (b22) {
                                case 0:
                                    dx8Var.e0();
                                    break;
                                default:
                                    dx8Var.f0();
                                    break;
                            }
                        }
                    };
                    dll dllVarS2 = q9n.s(operaTextViewJ);
                    if (dllVarS2 == null) {
                        return;
                    }
                    u8n.b(dllVarS2, operaTextViewJ, r8nVar2);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.ou8, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        ov0 ov0Var = this.i;
        if (ov0Var != null) {
            LinearLayout linearLayout = (LinearLayout) ov0Var.b;
            linearLayout.setOnClickListener(null);
            linearLayout.setForeground(null);
            linearLayout.setClickable(false);
            linearLayout.setFocusable(false);
        }
        e0();
        f0();
    }

    @Override // defpackage.lx8
    public final cmg c0() {
        return cmg.ROUNDUP_CAROUSEL_ITEM;
    }

    public final void e0() {
        xlg xlgVar;
        j82 j82Var = (j82) this.b;
        Object obj = j82Var != null ? ((pue) j82Var).c : null;
        d9i d9iVar = obj instanceof d9i ? (d9i) obj : null;
        if (d9iVar == null || (xlgVar = d9iVar.z) == null) {
            return;
        }
        kf kfVar = this.k;
        FrameLayout frameLayout = (FrameLayout) kfVar.b;
        wu5 wu5Var = e9i.f;
        String str = xlgVar.m;
        wu5Var.getClass();
        frameLayout.setBackgroundTintList(ColorStateList.valueOf(wu5.h(str).c.a(((FrameLayout) kfVar.b).getContext())));
    }

    public final void f0() {
        xlg xlgVar;
        j82 j82Var = (j82) this.b;
        Object obj = j82Var != null ? ((pue) j82Var).c : null;
        d9i d9iVar = obj instanceof d9i ? (d9i) obj : null;
        if (d9iVar == null || (xlgVar = d9iVar.z) == null) {
            return;
        }
        kf kfVar = this.k;
        OperaTextView operaTextView = (OperaTextView) kfVar.c;
        wu5 wu5Var = e9i.f;
        String str = xlgVar.m;
        wu5Var.getClass();
        operaTextView.setTextColor(wu5.h(str).b.a(((OperaTextView) kfVar.c).getContext()));
    }
}
