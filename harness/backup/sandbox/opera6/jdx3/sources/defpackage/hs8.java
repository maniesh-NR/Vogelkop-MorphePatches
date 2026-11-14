package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: classes.dex */
public final class hs8 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ hs8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ns8 ns8Var;
        eq1 eq1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int action = motionEvent.getAction();
                if (action == 0) {
                    w7d.d(view, lf1.b, 50L, 1.05f);
                } else if ((action == 1 || action == 3) && ((ns8Var = ((es8) obj).d) == null || !ns8Var.a)) {
                    w7d.d(view, lf1.a, 150L, 1.0f);
                }
                return false;
            case 1:
                ((ota) obj).y.onTouchEvent(motionEvent);
                return true;
            case 2:
                ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
                Runnable runnable = listPopupWindow.t;
                Handler handler = listPopupWindow.x;
                int action2 = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action2 == 0 && (eq1Var = listPopupWindow.B) != null && eq1Var.isShowing() && x >= 0 && x < listPopupWindow.B.getWidth() && y >= 0 && y < listPopupWindow.B.getHeight()) {
                    handler.postDelayed(runnable, 250L);
                } else if (action2 == 1) {
                    handler.removeCallbacks(runnable);
                }
                return false;
            case 3:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
            default:
                int actionMasked = motionEvent.getActionMasked();
                qt6 qt6Var = (qt6) obj;
                boolean zK = qt6Var.k();
                if (actionMasked == 0 || actionMasked == 5) {
                    qt6Var.b = true;
                } else if (actionMasked == 3 || actionMasked == 1) {
                    qt6Var.b = false;
                }
                if (qt6Var.k() != zK) {
                    zy4 zy4Var = (zy4) qt6Var.e;
                    zy4Var.k = qt6Var.k();
                    zy4Var.T();
                }
                return false;
        }
    }
}
