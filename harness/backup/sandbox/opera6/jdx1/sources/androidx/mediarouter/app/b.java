package androidx.mediarouter.app;

import android.view.animation.Animation;
import defpackage.xuf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.F;
        ArrayList arrayList = overlayListView.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xuf xufVar = (xuf) obj;
            if (!xufVar.j) {
                xufVar.i = overlayListView.getDrawingTime();
                xufVar.j = true;
            }
        }
        dVar.F.postDelayed(dVar.p0, dVar.i0);
    }
}
