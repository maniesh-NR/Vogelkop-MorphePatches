package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class blb implements r8n {
    public static final alb c = new alb((byte) 0);
    public static final alb d = new alb((byte) 2);
    public int a = -1;
    public Float b;

    public static int e(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 >> 1;
            i4 |= (-3158065) & i5;
            i3 = i5 & 3158064;
        }
        return i4 | (i3 >> 2);
    }

    public static int f(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 << 1;
            i4 |= (-789517) & i5;
            i3 = i5 & 789516;
        }
        return i4 | (i3 << 2);
    }

    @Override // defpackage.r8n
    public void a(View view) {
    }

    public boolean b(i iVar) {
        return !(this instanceof mv2);
    }

    public i c(i iVar, ArrayList arrayList, int i, int i2) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int width = iVar.itemView.getWidth() + i;
        int height = iVar.itemView.getHeight() + i2;
        int left2 = i - iVar.itemView.getLeft();
        int top2 = i2 - iVar.itemView.getTop();
        int size = arrayList.size();
        i iVar2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            i iVar3 = (i) arrayList.get(i4);
            if (left2 > 0 && (right = iVar3.itemView.getRight() - width) < 0 && iVar3.itemView.getRight() > iVar.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                iVar2 = iVar3;
                i3 = iAbs4;
            }
            if (left2 < 0 && (left = iVar3.itemView.getLeft() - i) > 0 && iVar3.itemView.getLeft() < iVar.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                iVar2 = iVar3;
                i3 = iAbs3;
            }
            if (top2 < 0 && (top = iVar3.itemView.getTop() - i2) > 0 && iVar3.itemView.getTop() < iVar.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                iVar2 = iVar3;
                i3 = iAbs2;
            }
            if (top2 > 0 && (bottom = iVar3.itemView.getBottom() - height) < 0 && iVar3.itemView.getBottom() > iVar.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                iVar2 = iVar3;
                i3 = iAbs;
            }
        }
        return iVar2;
    }

    public void d(RecyclerView recyclerView, i iVar) {
        View view = iVar.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag != null && (tag instanceof Float)) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r5n.a;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int g() {
        return 0;
    }

    public int h(RecyclerView recyclerView, i iVar) {
        int i = iVar instanceof th7 ? 15 : 0;
        return i | (i << 16);
    }

    public float i(i iVar) {
        return 0.2f;
    }

    public float j(i iVar) {
        return 0.5f;
    }

    public final int k(Resources resources, int i, int i2, long j) throws Resources.NotFoundException {
        int dimensionPixelSize = this.a;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.a = dimensionPixelSize;
        }
        int interpolation = (int) (c.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (d.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * dimensionPixelSize)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public boolean l() {
        return true;
    }

    public boolean m() {
        return true;
    }

    public boolean n(int i) {
        return false;
    }

    public void o(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        View view = iVar.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = r5n.a;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r5n.a;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void p(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        View view = iVar.itemView;
    }

    public void q(RecyclerView recyclerView) {
    }

    public boolean r(RecyclerView recyclerView, i iVar, i iVar2) {
        return false;
    }

    public void s(RecyclerView recyclerView, i iVar, int i) {
        f fVar = recyclerView.n;
        if (fVar.canScrollHorizontally()) {
            if (fVar.getDecoratedLeft(iVar.itemView) <= recyclerView.getPaddingLeft()) {
                recyclerView.x0(i);
            }
            if (fVar.getDecoratedRight(iVar.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.x0(i);
            }
        }
        if (fVar.canScrollVertically()) {
            if (fVar.getDecoratedTop(iVar.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.x0(i);
            }
            if (fVar.getDecoratedBottom(iVar.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.x0(i);
            }
        }
    }

    public abstract void t(i iVar, int i);

    public void u(i iVar, int i) {
    }
}
