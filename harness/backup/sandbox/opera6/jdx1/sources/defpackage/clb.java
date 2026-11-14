package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class clb {
    public static final alb b = new alb((byte) 1);
    public static final alb c = new alb((byte) 3);
    public int a = -1;

    public static int c(int i, int i2) {
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

    public static int d(int i, int i2) {
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

    public static int j(int i, int i2) {
        return i2 | i | (i2 << 8) | (i << 16);
    }

    public boolean a(i iVar) {
        return true;
    }

    public void b(RecyclerView recyclerView, i iVar) {
        View view = iVar.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r5n.a;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public long e(RecyclerView recyclerView, int i) {
        e eVar = recyclerView.M;
        return eVar == null ? i == 8 ? 200L : 250L : i == 8 ? eVar.g() : eVar.d;
    }

    public abstract int f(RecyclerView recyclerView, i iVar);

    public float g(i iVar) {
        return 0.5f;
    }

    public float h(float f) {
        return f;
    }

    public final int i(RecyclerView recyclerView, int i, int i2, long j) throws Resources.NotFoundException {
        int dimensionPixelSize = this.a;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.a = dimensionPixelSize;
        }
        int interpolation = (int) (b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * dimensionPixelSize)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public void k(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
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

    public boolean l(i iVar, i iVar2) {
        if (iVar instanceof hlb) {
            return ((hlb) iVar).h(iVar2);
        }
        return false;
    }

    public void m(i iVar, int i) {
    }

    public void n(i iVar, int i) {
        if (iVar instanceof hlb) {
            ((hlb) iVar).A();
        }
    }
}
