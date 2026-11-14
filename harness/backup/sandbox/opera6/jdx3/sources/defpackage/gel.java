package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class gel {
    public final i a;
    public final s9i b;
    public final pde c;
    public final View d;
    public final cbl e;
    public final float f;
    public final float g;
    public final int h;

    public gel(i iVar, s9i s9iVar, pde pdeVar) {
        this.a = iVar;
        this.b = s9iVar;
        this.c = pdeVar;
        View view = iVar.itemView;
        this.d = view;
        cbl cblVar = new cbl(this, (byte) 3);
        this.e = cblVar;
        this.f = view.getTranslationX() + view.getLeft();
        this.g = view.getTranslationY() + view.getTop();
        int iH = z7h.h(view.getContext(), 16.0f);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.h = iH < scaledTouchSlop ? scaledTouchSlop : iH;
        view.postOnAnimation(cblVar);
    }
}
