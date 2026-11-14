package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.custom_views.AnchoringViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class j21 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j21(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((AnchoringViewGroup) obj).requestLayout();
                break;
            case 1:
                int i = BubbleView.D;
                ((BubbleView) obj).c();
                break;
            case 2:
                kxe kxeVar = (kxe) obj;
                vs vsVar = kxeVar.H;
                if (vsVar != null && ((RelativeLayout) vsVar.b).getWidth() != kxeVar.N) {
                    if (kxeVar.F != null) {
                        kxeVar.L0();
                    }
                    kxeVar.K0();
                    kxeVar.N = ((RelativeLayout) kxeVar.H.b).getWidth();
                    break;
                }
                break;
            case 3:
                ((fsj) obj).b();
                break;
            default:
                p37.h0((View) obj);
                break;
        }
    }
}
