package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wt5 extends l53 {
    public final View c;
    public final j8f d;
    public final pjn e;

    public wt5(View view, j8f j8fVar, pjn pjnVar) {
        this.c = view;
        this.d = j8fVar;
        this.e = pjnVar;
    }

    @Override // defpackage.pz3
    public final lz3 c(ViewGroup viewGroup) {
        ixh ixhVar = new ixh(8.0f);
        View view = this.c;
        final byte b = 0;
        final byte b2 = 1;
        exd exdVar = new exd(viewGroup, new l11(3, ixhVar.k(view.getContext()), 48, view), Arrays.asList(new gtd(new rxh(2132020200), null, new View.OnClickListener(this) { // from class: ut5
            public final /* synthetic */ wt5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b;
                wt5 wt5Var = this.b;
                switch (b3) {
                    case 0:
                        pjn pjnVar = wt5Var.e;
                        ((tt5) pjnVar.b).i.N(wt5Var.d, true);
                        break;
                    default:
                        ((tt5) wt5Var.e.b).h.b.a.V(0, "enable_continue_booking");
                        break;
                }
            }
        }), new gtd(new rxh(2132019234), null, new View.OnClickListener(this) { // from class: ut5
            public final /* synthetic */ wt5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                wt5 wt5Var = this.b;
                switch (b3) {
                    case 0:
                        pjn pjnVar = wt5Var.e;
                        ((tt5) pjnVar.b).i.N(wt5Var.d, true);
                        break;
                    default:
                        ((tt5) wt5Var.e.b).h.b.a.V(0, "enable_continue_booking");
                        break;
                }
            }
        })));
        exdVar.a(new vt5(this, (byte) 0));
        return exdVar;
    }
}
