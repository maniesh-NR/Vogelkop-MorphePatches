package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class a7n extends ab2 implements ev8 {
    public final ViewGroup d;
    public final pde e;
    public final gjm f;

    public a7n(ViewGroup viewGroup, TextView textView, TextView textView2, pde pdeVar, gjm gjmVar, pde pdeVar2) {
        super(viewGroup);
        this.d = viewGroup;
        this.e = pdeVar;
        this.f = gjmVar;
        kze kzeVarZ = p37.z(viewGroup);
        final byte b = 0;
        a26.T(pdeVar, kzeVarZ, new f7f(this) { // from class: j6n
            public final /* synthetic */ a7n b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                a7n a7nVar = this.b;
                switch (b2) {
                    case 0:
                        ((Integer) obj).getClass();
                        a7nVar.b0();
                        break;
                    default:
                        f6k f6kVar = (f6k) obj;
                        if (f6kVar != null) {
                            zch zchVar = f6kVar.a;
                            if (!(zchVar instanceof g6k)) {
                                if (!zchVar.equals(h6k.a)) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                p37.l0(((g6k) zchVar).a, a7nVar.d);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        textView.setText(textView.getContext().getString(2132020563, textView.getContext().getString(2132017591)));
        phj.b0(textView2, textView2.getContext().getString(2132020564), new ilm(this, (byte) 6));
        final byte b2 = 1;
        a26.T(pdeVar2, kzeVarZ, new f7f(this) { // from class: j6n
            public final /* synthetic */ a7n b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                a7n a7nVar = this.b;
                switch (b22) {
                    case 0:
                        ((Integer) obj).getClass();
                        a7nVar.b0();
                        break;
                    default:
                        f6k f6kVar = (f6k) obj;
                        if (f6kVar != null) {
                            zch zchVar = f6kVar.a;
                            if (!(zchVar instanceof g6k)) {
                                if (!zchVar.equals(h6k.a)) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                p37.l0(((g6k) zchVar).a, a7nVar.d);
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void b0() {
        pde pdeVar = this.e;
        p37.o0(this.d, ((Number) pdeVar.g()).intValue(), 0, ((Number) pdeVar.g()).intValue(), 0, 10);
    }

    public final int c0(bz3 bz3Var) {
        int iMakeMeasureSpec;
        b0();
        ViewGroup viewGroup = this.d;
        int i = viewGroup.getLayoutParams().width;
        if (i == -2 || i == -1) {
            int i2 = bz3Var.a;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2 - (marginLayoutParams == null ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin), Integer.MIN_VALUE);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getLayoutParams().width, 1073741824);
        }
        viewGroup.measure(iMakeMeasureSpec, 0);
        return p37.D0(viewGroup) + viewGroup.getMeasuredHeight();
    }
}
