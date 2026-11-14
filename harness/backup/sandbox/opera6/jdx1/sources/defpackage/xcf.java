package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class xcf implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();

    public xcf(View view) {
        this.a = view;
        view.setTag(2131365025, this);
        view.getViewTreeObserver().addOnPreDrawListener(this);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.a;
        view.setTag(2131365025, null);
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        Iterator it = this.b.values().iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (!((ViewTreeObserver.OnPreDrawListener) it.next()).onPreDraw() || z) {
                    z = true;
                }
            }
            return !z;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.a;
        view2.setTag(2131365025, null);
        view2.getViewTreeObserver().removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
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
