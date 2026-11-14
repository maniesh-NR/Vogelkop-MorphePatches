package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.opera.ad.view.VolumeMutableButton;

/* loaded from: classes.dex */
public final class h7p extends fjo {
    public nxo a;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nxo nxoVar = this.a;
        FrameLayout frameLayout = nxoVar.j;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(getContext());
            nxoVar.b(frameLayout, null);
        } else {
            upj.j(frameLayout);
        }
        addView(frameLayout);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        nxo nxoVar = this.a;
        if (nxoVar == null || size == 0 || size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int[] iArrK = z4o.k(nxoVar, size, size2);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof VolumeMutableButton) {
                i3 = childAt.getLayoutParams().width;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iArrK[0], 1073741824);
                i3 = iArrK[1];
            }
            childAt.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        setMeasuredDimension(iArrK[0], iArrK[1]);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        nxo nxoVar = this.a;
        if (nxoVar != null) {
            if (z) {
                nxoVar.g();
            } else {
                nxoVar.f();
            }
        }
        super.onWindowFocusChanged(z);
    }

    @Override // defpackage.mro
    public final void unregister() {
        nxo nxoVar = this.a;
        if (nxoVar != null) {
            nxoVar.f();
        }
        upj.j(this);
    }
}
