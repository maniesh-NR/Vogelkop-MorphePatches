package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.opera.android.browser.passwordmanager.PasswordGenerationPopupView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class nc1 extends ViewGroup {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;

    public nc1(Context context) {
        super(context);
        setClipChildren(false);
        this.b = new HashMap();
        this.c = new HashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc1(PasswordGenerationPopupView passwordGenerationPopupView, Context context) {
        super(context, null, 0);
        this.c = passwordGenerationPopupView;
        this.b = new Rect();
        View view = new View(context);
        view.setWillNotDraw(true);
        addView(view);
    }

    private final void a(Canvas canvas) {
    }

    private final void b(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        switch (this.a) {
            case 0:
                return null;
            default:
                return super.invalidateChildInParent(iArr, rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.onDescendantInvalidated(view, view2);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                for (c6n c6nVar : ((HashMap) obj).keySet()) {
                    c6nVar.layout(c6nVar.getLeft(), c6nVar.getTop(), c6nVar.getRight(), c6nVar.getBottom());
                }
                break;
            default:
                Rect rect = (Rect) obj;
                getChildAt(0).layout(rect.left, rect.top, rect.right, rect.bottom);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
                    a8b.a("widthMeasureSpec should be EXACTLY");
                }
                if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
                    a8b.a("heightMeasureSpec should be EXACTLY");
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                for (c6n c6nVar : ((HashMap) obj).keySet()) {
                    int i4 = c6nVar.v;
                    if (i4 != Integer.MIN_VALUE && (i3 = c6nVar.w) != Integer.MIN_VALUE) {
                        c6nVar.measure(i4, i3);
                    }
                }
                break;
            default:
                Rect rect = (Rect) obj;
                PasswordGenerationPopupView passwordGenerationPopupView = (PasswordGenerationPopupView) this.c;
                b4g b4gVar = passwordGenerationPopupView.e;
                if (b4gVar.j == null) {
                    b4gVar.j = new Rect();
                    Drawable drawableX = f03.x(2130970552, b4gVar.a);
                    if (drawableX != null) {
                        drawableX.getPadding(b4gVar.j);
                    }
                }
                Rect rect2 = b4gVar.j;
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int mode = View.MeasureSpec.getMode(i);
                if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                    rect.left = cs5.t(passwordGenerationPopupView.c.left, rect2.left, size - rect2.right);
                    rect.right = cs5.t(passwordGenerationPopupView.c.right, rect2.left, size - rect2.right);
                }
                int mode2 = View.MeasureSpec.getMode(i2);
                if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                    rect.top = cs5.t(passwordGenerationPopupView.c.top, rect2.top, size2 - rect2.bottom);
                    rect.bottom = cs5.t(passwordGenerationPopupView.c.bottom, rect2.top, size2 - rect2.bottom);
                }
                getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824));
                setMeasuredDimension(size, size2);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                cleanupLayoutState(this);
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    m3c m3cVar = (m3c) ((HashMap) this.b).get(childAt);
                    if (childAt.isLayoutRequested() && m3cVar != null) {
                        m3c.V(m3cVar, false, 7);
                    }
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.shouldDelayChildPressedState();
        }
    }
}
