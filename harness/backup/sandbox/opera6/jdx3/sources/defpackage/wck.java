package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wck extends ViewGroup {
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof vck) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new vck(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new vck(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof vck)) {
            return new vck(layoutParams);
        }
        vck vckVar = (vck) layoutParams;
        vck vckVar2 = new vck(vckVar);
        vckVar2.a = vckVar.a;
        vckVar2.b = vckVar.b;
        return vckVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator it = new g6n(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            vck vckVar = (vck) view.getLayoutParams();
            view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams) vckVar).width, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams) vckVar).height, 1073741824));
            int i5 = vckVar.a;
            int i6 = vckVar.b;
            view.layout(i5, i6, ((ViewGroup.LayoutParams) vckVar).width + i5, ((ViewGroup.LayoutParams) vckVar).height + i6);
        }
    }
}
