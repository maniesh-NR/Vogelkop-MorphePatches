package defpackage;

import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.ThemeSelector;

/* loaded from: classes.dex */
public final class av1 extends i {
    public final cq3 b;
    public f7j c;
    public final /* synthetic */ bv1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public av1(bv1 bv1Var, cq3 cq3Var) {
        this.d = bv1Var;
        ThemeSelector themeSelector = (ThemeSelector) cq3Var.b;
        super(themeSelector);
        this.b = cq3Var;
        u7 u7Var = new u7(this, (byte) 11);
        dll dllVarS = q9n.s(themeSelector);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, themeSelector, u7Var);
    }

    public final void U(f7j f7jVar, ThemeSelector themeSelector) {
        int iT;
        int i;
        if (f7jVar == f7j.DARK || (f7jVar == f7j.FOLLOW_SYSTEM && this.d.b)) {
            iT = f03.t(2130969285, themeSelector.getContext(), 2131101243);
            i = 2131233263;
        } else {
            iT = f03.t(2130969287, themeSelector.getContext(), 2131101243);
            i = 2131233264;
        }
        themeSelector.setBackground(sgb.F(i, themeSelector.getContext()));
        themeSelector.c.setTextColor(iT);
    }
}
