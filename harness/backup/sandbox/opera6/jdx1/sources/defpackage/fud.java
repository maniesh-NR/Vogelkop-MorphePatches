package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class fud {
    public final Context a;
    public final itd b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public kud i;
    public eud j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final c21 l = new c21(this, (byte) 2);

    public fud(int i, int i2, itd itdVar, Context context, View view, boolean z) {
        this.a = context;
        this.b = itdVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final eud a() throws Resources.NotFoundException {
        eud l3kVar;
        eud eudVar = this.j;
        if (eudVar != null) {
            return eudVar;
        }
        Context context = this.a;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int iMin = Math.min(point.x, point.y);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165206);
        Context context2 = this.a;
        if (iMin >= dimensionPixelSize) {
            l3kVar = new nl4(context2, this.f, this.d, this.e, this.c);
        } else {
            View view = this.f;
            l3kVar = new l3k(this.d, this.e, this.b, context2, view, this.c);
        }
        l3kVar.j(this.b);
        l3kVar.q(this.l);
        l3kVar.m(this.f);
        l3kVar.d(this.i);
        l3kVar.n(this.h);
        l3kVar.o(this.g);
        this.j = l3kVar;
        return l3kVar;
    }

    public final boolean b() {
        eud eudVar = this.j;
        return eudVar != null && eudVar.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        eud eudVarA = a();
        eudVarA.r(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            eudVarA.p(i);
            eudVarA.s(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            eudVarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        eudVarA.show();
    }
}
