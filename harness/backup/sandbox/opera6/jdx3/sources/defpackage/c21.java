package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class c21 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c21(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                i21 i21Var = (i21) obj;
                if (i21Var.v) {
                    i21Var.v = false;
                }
                if (!i21Var.r) {
                    i21Var.d.removeCallbacks(i21Var.k);
                    h7f h7fVar = i21Var.l;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((PopupWindow.OnDismissListener) g7fVarH.next()).onDismiss();
                    }
                    i21Var.i.o0();
                    i21Var.f.o0();
                    break;
                }
                break;
            case 1:
                u85 u85Var = (u85) obj;
                ((i21) u85Var.h).a();
                View view = (View) u85Var.e;
                view.removeOnLayoutChangeListener((ho3) u85Var.f);
                view.setTag(null);
                break;
            case 2:
                ((fud) obj).c();
                break;
            default:
                eyi eyiVar = (eyi) obj;
                if (!eyiVar.b) {
                    ((wa) eyiVar.c).c(null);
                    eyiVar.b = true;
                    break;
                }
                break;
        }
    }
}
