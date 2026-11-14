package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.passwordmanager.PasswordGenerationPopupView;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.widget.MeasurableHeightScrollView;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class kq2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public kq2(PasswordGenerationPopupView passwordGenerationPopupView, View view) {
        this.a = (byte) 0;
        this.b = view;
        this.c = passwordGenerationPopupView;
    }

    public /* synthetic */ kq2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Resources.NotFoundException {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                b4g b4gVar = ((PasswordGenerationPopupView) obj).e;
                if (b4gVar != null) {
                    b4gVar.o((View) obj2);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ((Callback) obj2).run(Boolean.valueOf(q9n.t(view).centerX() < ((BrowserActivity) obj).getResources().getDisplayMetrics().widthPixels / 2));
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) obj2;
                knh knhVar = (knh) obj;
                y83 y83Var = knhVar.A;
                if (y83Var == null) {
                    y83Var = null;
                }
                Context context = ((MeasurableHeightScrollView) y83Var.g).getContext();
                y83 y83Var2 = knhVar.A;
                int height = ((MeasurableHeightScrollView) (y83Var2 != null ? y83Var2 : null).g).getHeight();
                double dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167736);
                double d = 6.75d * dimensionPixelSize;
                if (height > 0) {
                    while (d / height > 0.85d && d > (r4 << 1)) {
                        d -= dimensionPixelSize;
                    }
                }
                operaBottomSheetBehavior.H((int) d);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                z63 z63Var = (z63) obj2;
                pqh pqhVar = (pqh) obj;
                int i9 = ((r9b) pqhVar.a).a;
                int height2 = ((FrameLayout) ((pt1) z63Var.b).g).getHeight();
                r9b r9bVar = (r9b) pqhVar.a;
                z63Var.b(new Rect(i9, height2, r9bVar.c, r9bVar.d));
                break;
        }
    }
}
