package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class sq3 extends mq3 {
    public final Boolean a;
    public final g3o b;
    public Window c;
    public boolean d;

    public sq3(View view, g3o g3oVar) {
        this.b = g3oVar;
        zdd zddVar = BottomSheetBehavior.D(view).j;
        ColorStateList backgroundTintList = zddVar != null ? zddVar.b.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(fr3.O(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListN = fr3.N(view.getBackground());
        Integer numValueOf = colorStateListN != null ? Integer.valueOf(colorStateListN.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(fr3.O(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    public final void a(View view) {
        d(view);
    }

    public final void b(View view) {
        d(view);
    }

    public final void c(int i, View view) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        g3o g3oVar = this.b;
        if (top < g3oVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                oji ojiVar = new oji(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new j3o(window, ojiVar) : i >= 30 ? new i3o(window, ojiVar) : new h3o(window, ojiVar)).w(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), g3oVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                oji ojiVar2 = new oji(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new j3o(window2, ojiVar2) : i2 >= 30 ? new i3o(window2, ojiVar2) : new h3o(window2, ojiVar2)).w(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                oji ojiVar = new oji(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                this.d = (i >= 35 ? new j3o(window, ojiVar) : i >= 30 ? new i3o(window, ojiVar) : new h3o(window, ojiVar)).q();
            }
        }
    }
}
