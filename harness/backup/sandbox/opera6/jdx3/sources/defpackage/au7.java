package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final /* synthetic */ class au7 implements xjj, yjj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x77 b;

    public /* synthetic */ au7(x77 x77Var, byte b) {
        this.a = b;
        this.b = x77Var;
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        View viewN = j7c.n(viewGroup, 2131559173, viewGroup, false);
        int i = 2131362543;
        View viewJ = w1h.j(2131362543, viewN);
        if (viewJ != null) {
            b98 b98Var = new b98((FrameLayout) viewJ, (byte) 3);
            OperaTextView operaTextViewJ = w1h.j(2131364731, viewN);
            if (operaTextViewJ != null) {
                return new ju7(new ov0((FrameLayout) viewN, b98Var, operaTextViewJ, (byte) 27), this.b);
            }
            i = 2131364731;
        }
        t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        byte b = this.a;
        final x77 x77Var = this.b;
        switch (b) {
            case 0:
                ((b98) ((iu7) iVar).b.c).b.setOnClickListener(new jf7(x77Var, (eu7) obj, (byte) 3));
                break;
            default:
                final cu7 cu7Var = (cu7) obj;
                bu7 bu7Var = (bu7) iVar;
                final byte b2 = 1;
                ((b98) bu7Var.b.c).b.setOnClickListener(new View.OnClickListener() { // from class: zt7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        cu7 cu7Var2 = cu7Var;
                        x77 x77Var2 = x77Var;
                        switch (b3) {
                            case 0:
                                ((iy1) ((hd) ((wjh) x77Var2.c).e).f).h(cu7Var2.k);
                                break;
                            default:
                                x77Var2.m(cu7Var2.k);
                                break;
                        }
                    }
                });
                final byte b3 = 0;
                ((FrameLayout) bu7Var.b.d).setOnClickListener(new View.OnClickListener() { // from class: zt7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b3;
                        cu7 cu7Var2 = cu7Var;
                        x77 x77Var2 = x77Var;
                        switch (b32) {
                            case 0:
                                ((iy1) ((hd) ((wjh) x77Var2.c).e).f).h(cu7Var2.k);
                                break;
                            default:
                                x77Var2.m(cu7Var2.k);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
