package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class rcf implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();
    public boolean d;

    public rcf(View view) {
        this.a = view;
        view.setTag(2131365023, this);
        view.getViewTreeObserver().addOnDrawListener(this);
        view.addOnAttachStateChangeListener(this);
    }

    public final void a(boolean z) {
        this.d = true;
        View view = this.a;
        view.setTag(2131365023, null);
        if (z) {
            view.post(new yqd(this, (byte) 26));
        } else {
            view.getViewTreeObserver().removeOnDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.d) {
            return;
        }
        a(true);
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ViewTreeObserver.OnDrawListener) it.next()).onDraw();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = 0;
        a(false);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dh4) obj).onCancel();
        }
    }
}
