package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.utilities.DisplayUtil;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m7d implements pvk {
    public final Context a;
    public final wt3 b;
    public final wv1 c;
    public i7d d;
    public byte e;

    public m7d(Context context, wt3 wt3Var, wv1 wv1Var) {
        this.a = context;
        this.b = wt3Var;
        this.c = wv1Var;
    }

    @Override // defpackage.pvk
    public final boolean a(int i) {
        return i == 1;
    }

    @Override // defpackage.pvk
    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        vl6 vl6Var;
        OperaBottomSheetBehavior operaBottomSheetBehavior;
        WeakReference weakReference;
        View view;
        if (this.d != null) {
            Context context = this.a;
            float fB = DisplayUtil.b(context) - i2;
            this.e = fB >= ((float) DisplayUtil.b(context)) * 0.6666667f ? (byte) 2 : fB >= ((float) DisplayUtil.b(context)) * 0.2f ? (byte) 1 : (byte) 0;
            i7d i7dVar = this.d;
            if (i7dVar == null || (vl6Var = i7dVar.k) == null || (weakReference = (operaBottomSheetBehavior = (OperaBottomSheetBehavior) vl6Var.b).y) == null || (view = (View) weakReference.get()) == null || operaBottomSheetBehavior.r == null) {
                return;
            }
            operaBottomSheetBehavior.J(1);
            int top = i2 - view.getTop();
            WeakHashMap weakHashMap = r5n.a;
            view.offsetTopAndBottom(top);
            operaBottomSheetBehavior.A(i2);
        }
    }

    @Override // defpackage.pvk
    public final void c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (Math.abs(i6) < 1000) {
            return;
        }
        if (i6 > 0) {
            this.e = (byte) 0;
            return;
        }
        if ((-i6) > 3000) {
            this.e = (byte) 2;
            return;
        }
        Context context = this.a;
        if (DisplayUtil.b(context) - i2 >= DisplayUtil.b(context) * 0.6666667f) {
            this.e = (byte) 2;
        } else {
            this.e = (byte) 1;
        }
    }

    @Override // defpackage.pvk
    public final void d() {
        i7d i7dVar = this.d;
        if (i7dVar == null) {
            return;
        }
        i7dVar.getLifecycle().a(new l7d(this, (byte) 1));
    }

    @Override // defpackage.pvk
    public final void e(int i, int i2, int i3) {
        if (this.d != null) {
            return;
        }
        i7d i7dVar = (i7d) this.b.get();
        this.d = i7dVar;
        this.e = (byte) 0;
        i7dVar.getLifecycle().a(new l7d(this, (byte) 0));
        zhj.a(this.d, 0).c(this.a);
    }
}
