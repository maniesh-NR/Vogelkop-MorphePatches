package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class yy9 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final View a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();

    public yy9(View view) {
        this.a = view;
        view.setTag(2131365024, this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.removeOnAttachStateChangeListener(this);
        view.setTag(2131365024, null);
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ViewTreeObserver.OnGlobalLayoutListener) it.next()).onGlobalLayout();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.a;
        view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view2.removeOnAttachStateChangeListener(this);
        view2.setTag(2131365024, null);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dh4) obj).onCancel();
        }
    }
}
