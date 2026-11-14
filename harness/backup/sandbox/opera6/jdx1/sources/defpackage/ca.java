package defpackage;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final /* synthetic */ class ca implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ca(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                Rect rect = new Rect();
                view.getHitRect(rect);
                float fApplyDimension = TypedValue.applyDimension(1, 48.0f, view.getContext().getResources().getDisplayMetrics());
                int i = rect.bottom;
                int i2 = rect.top;
                float f = i - i2;
                if (fApplyDimension > f) {
                    int i3 = ((int) ((fApplyDimension - f) / 2.0f)) + 1;
                    rect.top = i2 - i3;
                    rect.bottom = i + i3;
                }
                int i4 = rect.right;
                int i5 = rect.left;
                float f2 = i4 - i5;
                if (fApplyDimension > f2) {
                    int i6 = ((int) ((fApplyDimension - f2) / 2.0f)) + 1;
                    rect.left = i5 - i6;
                    rect.right = i4 + i6;
                }
                ViewParent parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                    break;
                }
                break;
            case 1:
                j14.l(4, view);
                break;
            case 2:
                RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
                if (recyclerView != null) {
                    recyclerView.a0();
                    break;
                }
                break;
            case 3:
                view.jumpDrawablesToCurrentState();
                break;
            case 4:
                view.performClick();
                break;
            case 5:
                view.jumpDrawablesToCurrentState();
                break;
            case 6:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 7:
                j14.i(view);
                break;
            case 8:
                j14.m(view);
                break;
            case 9:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 10:
                view.jumpDrawablesToCurrentState();
                break;
            case 11:
                view.setVisibility(0);
                break;
            default:
                view.setVisibility(8);
                break;
        }
    }
}
