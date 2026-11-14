package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w1o extends p8n {
    public final /* synthetic */ byte e;
    public final /* synthetic */ y1o f;

    public /* synthetic */ w1o(y1o y1oVar, byte b) {
        this.e = b;
        this.f = y1oVar;
    }

    public final void g() {
        View view;
        byte b = this.e;
        y1o y1oVar = this.f;
        switch (b) {
            case 0:
                if (y1oVar.p && (view = y1oVar.h) != null) {
                    view.setTranslationY(0.0f);
                    y1oVar.e.setTranslationY(0.0f);
                }
                y1oVar.e.setVisibility(8);
                ActionBarContainer actionBarContainer = y1oVar.e;
                actionBarContainer.a = false;
                actionBarContainer.setDescendantFocusability(262144);
                y1oVar.u = null;
                z8b z8bVar = y1oVar.l;
                if (z8bVar != null) {
                    z8bVar.p(y1oVar.k);
                    y1oVar.k = null;
                    y1oVar.l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = y1oVar.d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = r5n.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                y1oVar.u = null;
                y1oVar.e.requestLayout();
                break;
        }
    }
}
