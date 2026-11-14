package defpackage;

import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.AccentSelector;

/* loaded from: classes.dex */
public final class zu1 extends i {
    public final cq3 b;
    public g7j c;
    public final /* synthetic */ dt1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public zu1(dt1 dt1Var, cq3 cq3Var) {
        this.d = dt1Var;
        AccentSelector accentSelector = (AccentSelector) cq3Var.b;
        super(accentSelector);
        this.b = cq3Var;
        u7 u7Var = new u7(this, (byte) 10);
        dll dllVarS = q9n.s(accentSelector);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, accentSelector, u7Var);
    }

    public static void U(g7j g7jVar, AccentSelector accentSelector) {
        accentSelector.c.setColor(f03.t(g7jVar.a, accentSelector.getContext(), 2131101243));
        accentSelector.invalidate();
        int iT = f03.t(g7jVar.b, accentSelector.getContext(), 2131101243);
        accentSelector.d.setColor(iT);
        accentSelector.f.setColor(iT);
        accentSelector.invalidate();
        accentSelector.e.setColor(f03.t(g7jVar.c, accentSelector.getContext(), 2131101243));
        accentSelector.invalidate();
    }
}
