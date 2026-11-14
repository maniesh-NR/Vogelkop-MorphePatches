package defpackage;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x0a extends hi7 {
    public static Point x;
    public final qim v;
    public final tu7 w;

    static {
        x = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? new Point(0, Integer.MAX_VALUE) : new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0a(zh7 zh7Var, CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, qim qimVar, kze kzeVar, tu7 tu7Var) {
        yh7 yh7Var = yh7.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        or2 or2VarE = or2.e(layoutInflaterFrom, viewGroup);
        FrameLayout frameLayout = (FrameLayout) or2VarE.f;
        ExtendedFloatingActionButton extendedFloatingActionButtonInflate = layoutInflaterFrom.inflate(2131558911, (ViewGroup) frameLayout, false);
        frameLayout.addView(extendedFloatingActionButtonInflate);
        if (extendedFloatingActionButtonInflate == null) {
            t3p.q("rootView");
            throw null;
        }
        super(yh7Var, zh7Var, coordinatorLayout, viewGroup, new igi((FrameLayout) or2VarE.c, frameLayout, (View) or2VarE.b, extendedFloatingActionButtonInflate, (View) or2VarE.d, (ImageView) or2VarE.e, (byte) 20), qimVar, kzeVar, x);
        this.v = qimVar;
        this.w = tu7Var;
    }

    @Override // defpackage.hi7
    public final void c(ei7 ei7Var) {
        this.d.removeView((FrameLayout) this.e.b);
        this.w.invoke(ei7Var);
    }

    @Override // defpackage.hi7
    public final void e() {
        ysj ysjVar = this.v.e;
        w0a w0aVar = new w0a((byte) 0);
        ysjVar.getClass();
        ysjVar.b(w0aVar, ijm.b);
        super.e();
    }

    @Override // defpackage.hi7
    public final void g(Point point) {
        x = point;
    }
}
