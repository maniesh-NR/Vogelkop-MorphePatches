package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.opera.android.bubbleview.BubbleView;

/* loaded from: classes.dex */
public final /* synthetic */ class ml2 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ml2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        pde pdeVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ql2 ql2Var = (ql2) obj;
                ql2Var.c = false;
                ql2Var.b();
                break;
            case 1:
                x03 x03Var = (x03) obj;
                n03 n03Var = x03Var.e;
                if (n03Var != null && (pdeVar = n03Var.b) != null) {
                }
                View view = x03Var.a;
                int[] iArr = x03Var.d;
                view.getLocationInWindow(iArr);
                int i = iArr[0];
                if (i != x03Var.b || iArr[1] != x03Var.c) {
                    x03Var.b = i;
                    x03Var.c = iArr[1];
                    break;
                }
                break;
            case 2:
                int i2 = BubbleView.D;
                break;
            case 3:
                ev4 ev4Var = (ev4) obj;
                ev4Var.b = false;
                boolean z = ((Boolean) ((j1k) ev4Var.e).invoke()).booleanValue() && ev4Var.c;
                if (z) {
                    ev4Var.c = false;
                    p37.A((View) ev4Var.d, ev4Var, new uog(ev4Var, (byte) 1), new ol2(ev4Var, (byte) 4));
                }
                break;
            case 4:
                h5k h5kVar = (h5k) obj;
                if (!h5kVar.a) {
                    h5kVar.a = true;
                    ((TextView) h5kVar.b).postOnAnimation(new y1n((Object) h5kVar, (byte) 2));
                    break;
                }
                break;
            case 5:
                tuj tujVar = (tuj) obj;
                if (!tujVar.c) {
                    tujVar.c = true;
                    ((Handler) tujVar.k).postDelayed((iv) tujVar.j, 100L);
                    break;
                }
                break;
            default:
                tuj tujVar2 = (tuj) obj;
                if (!tujVar2.c) {
                    tujVar2.c = true;
                    ((Handler) tujVar2.k).postDelayed((iv) tujVar2.j, 100L);
                    break;
                }
                break;
        }
        return true;
    }
}
