package defpackage;

import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ljf implements Runnable {
    public final NestedScrollView a;
    public final OverScroller b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ OperaBottomSheetBehavior f;

    public ljf(OperaBottomSheetBehavior operaBottomSheetBehavior, NestedScrollView nestedScrollView) {
        this.f = operaBottomSheetBehavior;
        this.a = nestedScrollView;
        this.b = new OverScroller(nestedScrollView.getContext());
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller = this.b;
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        NestedScrollView nestedScrollView = this.a;
        int top = nestedScrollView.getTop();
        OperaBottomSheetBehavior operaBottomSheetBehavior = this.f;
        operaBottomSheetBehavior.A(top);
        if (!zComputeScrollOffset) {
            if (this.c) {
                return;
            }
            operaBottomSheetBehavior.J(3);
            this.e = true;
            return;
        }
        if (!this.d) {
            int iMax = Math.max(0, overScroller.getCurrY()) - nestedScrollView.getTop();
            WeakHashMap weakHashMap = r5n.a;
            nestedScrollView.offsetTopAndBottom(iMax);
            operaBottomSheetBehavior.A(nestedScrollView.getTop());
            if (nestedScrollView.getTop() == 0) {
                this.d = true;
            }
        }
        if (this.d) {
            nestedScrollView.scrollTo(nestedScrollView.getLeft(), Math.abs(overScroller.getCurrY()));
        }
        nestedScrollView.postOnAnimation(this);
    }
}
