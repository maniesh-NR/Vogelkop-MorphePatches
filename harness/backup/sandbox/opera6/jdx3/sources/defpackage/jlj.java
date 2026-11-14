package defpackage;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.DialogTitle;

/* loaded from: classes.dex */
public abstract class jlj extends qkj {
    public final lxh g;

    public jlj(vql vqlVar, wwd wwdVar, rxh rxhVar, rxh rxhVar2, lxh lxhVar, int i) {
        super(vqlVar, wwdVar, rxhVar, (i & 8) != 0 ? new qxh("") : rxhVar2, 2132083343);
        this.g = lxhVar;
    }

    @Override // defpackage.b63
    public final void a() {
        c(true);
    }

    @Override // defpackage.b63
    public final void b(boolean z) {
        pt1 pt1Var = this.f;
        if (pt1Var == null) {
            pt1Var = null;
        }
        Drawable[] compoundDrawables = ((DialogTitle) pt1Var.b).getCompoundDrawables();
        int length = compoundDrawables.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (compoundDrawables[i] != null) {
                z2 = true;
                break;
            }
            i++;
        }
        if (z != z2) {
            pt1 pt1Var2 = this.f;
            ((ConstraintLayout) (pt1Var2 != null ? pt1Var2 : null).e).post(new gh2((byte) 11, this, z));
        }
    }

    public final void c(boolean z) {
        Drawable drawableF;
        pt1 pt1Var = this.f;
        DialogTitle dialogTitle = (DialogTitle) (pt1Var != null ? pt1Var : null).b;
        lxh lxhVar = z ? this.g : null;
        if (lxhVar != null) {
            if (pt1Var == null) {
                pt1Var = null;
            }
            drawableF = lxhVar.f(((DialogTitle) pt1Var.b).getContext());
            drawableF.setBounds(0, 0, drawableF.getIntrinsicWidth(), drawableF.getIntrinsicHeight());
        } else {
            drawableF = null;
        }
        dialogTitle.setCompoundDrawables((Drawable) null, drawableF, (Drawable) null, (Drawable) null);
    }
}
