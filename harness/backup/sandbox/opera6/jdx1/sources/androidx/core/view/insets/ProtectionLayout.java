package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.izk;
import defpackage.l6h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object c = new Object();
    public final ArrayList a;
    public l6h b;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.a = new ArrayList();
    }

    public final void a() {
        if (this.b != null) {
            removeViews(getChildCount() - this.b.a.size(), this.b.a.size());
            int size = this.b.a.size();
            l6h l6hVar = this.b;
            if (size > 0) {
                throw fki.n(0, l6hVar.a);
            }
            ArrayList arrayList = l6hVar.a;
            if (!l6hVar.d) {
                l6hVar.d = true;
                l6hVar.b.b.remove(l6hVar);
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    throw fki.n(size2, arrayList);
                }
                arrayList.clear();
            }
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            l6h l6hVar = this.b;
            int childCount = getChildCount() - (l6hVar != null ? l6hVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        izk izkVar;
        super.onAttachedToWindow();
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            a();
        } else {
            ViewGroup viewGroup = (ViewGroup) getRootView();
            Object tag = viewGroup.getTag(2131364695);
            if (tag instanceof izk) {
                izkVar = (izk) tag;
            } else {
                izkVar = new izk(viewGroup);
                viewGroup.setTag(2131364695, izkVar);
            }
            a();
            this.b = new l6h(izkVar, arrayList);
            getChildCount();
            if (this.b.a.size() > 0) {
                if (this.b.a.get(0) == null) {
                    getContext();
                    throw null;
                }
                h9o.t();
            }
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(2131364695);
        if (tag instanceof izk) {
            izk izkVar = (izk) tag;
            if (izkVar.b.isEmpty()) {
                izkVar.a.post(new qlk(izkVar, (byte) 22));
                viewGroup.setTag(2131364695, null);
            }
        }
    }
}
