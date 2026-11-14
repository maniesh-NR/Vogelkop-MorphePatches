package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class rp1 extends p8n {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rp1(Object obj, byte b) {
        this.e = b;
        this.f = obj;
    }

    @Override // defpackage.p8n
    public final void f() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((qp1) obj).b.v.setVisibility(0);
                break;
            case 1:
                xp1 xp1Var = (xp1) obj;
                xp1Var.v.setVisibility(0);
                if (xp1Var.v.getParent() instanceof View) {
                    View view = (View) xp1Var.v.getParent();
                    WeakHashMap weakHashMap = r5n.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }

    public final void g() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                xp1 xp1Var = ((qp1) obj).b;
                xp1Var.v.setAlpha(1.0f);
                xp1Var.y.d(null);
                xp1Var.y = null;
                break;
            case 1:
                xp1 xp1Var2 = (xp1) obj;
                xp1Var2.v.setAlpha(1.0f);
                xp1Var2.y.d(null);
                xp1Var2.y = null;
                break;
            default:
                xp1 xp1Var3 = (xp1) ((z8b) obj).b;
                xp1Var3.v.setVisibility(8);
                PopupWindow popupWindow = xp1Var3.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (xp1Var3.v.getParent() instanceof View) {
                    View view = (View) xp1Var3.v.getParent();
                    WeakHashMap weakHashMap = r5n.a;
                    view.requestApplyInsets();
                }
                xp1Var3.v.e();
                xp1Var3.y.d(null);
                xp1Var3.y = null;
                ViewGroup viewGroup = xp1Var3.A;
                WeakHashMap weakHashMap2 = r5n.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
