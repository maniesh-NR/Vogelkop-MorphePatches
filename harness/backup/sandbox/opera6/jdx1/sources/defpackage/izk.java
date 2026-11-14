package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class izk {
    public final gzk a;
    public final ArrayList b = new ArrayList();
    public r9b c;
    public r9b d;
    public int e;

    public izk(ViewGroup viewGroup) {
        View childAt;
        r9b r9bVar = r9b.e;
        this.c = r9bVar;
        this.d = r9bVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        gzk gzkVar = new gzk(this, viewGroup.getContext(), viewGroup);
        this.a = gzkVar;
        gzkVar.setVisibility(8);
        gzkVar.setWillNotDraw(true);
        crk crkVar = new crk(this, (byte) 6);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(gzkVar, crkVar);
        n2o.a(gzkVar, new hzk(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(gzkVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new tu4(viewGroup, gzkVar, (byte) 5));
        }
    }
}
