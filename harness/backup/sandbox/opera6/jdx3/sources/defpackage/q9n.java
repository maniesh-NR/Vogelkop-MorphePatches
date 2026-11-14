package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.BrowserActivity;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class q9n extends fan {
    public static final l5b c = new l5b((byte) 11, true);
    public static final l5b d = new l5b((byte) 11, false);

    public static void A(View view, Runnable runnable) {
        if (view.isLaidOut()) {
            runnable.run();
        } else {
            d(new qj(runnable, (byte) 9), view);
        }
    }

    public static void B(View view, Drawable drawable) {
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        Drawable background = view.getBackground();
        view.setBackground(drawable);
        if (background != null && drawable != null && background.getLevel() != 0) {
            drawable.mutate().setLevel(background.getLevel());
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public static void C(int i, View view) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void D(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
                return;
            }
            marginLayoutParams.setMargins(i, i2, i3, i4);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void E(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin == i && marginLayoutParams.bottomMargin == i2) {
                return;
            }
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i2;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void F(TextInputLayout textInputLayout, CharSequence charSequence) {
        boolean z = textInputLayout.x0;
        if (z) {
            textInputLayout.x0 = false;
        }
        EditText editText = textInputLayout.e;
        if (editText instanceof AutoCompleteTextView) {
            ((AutoCompleteTextView) editText).setText(charSequence, false);
        } else {
            editText.setText(charSequence);
        }
        if (z) {
            textInputLayout.x0 = true;
        }
    }

    public static boolean G(Context context, View view) {
        view.requestFocus();
        if (view.hasWindowFocus()) {
            return ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 0);
        }
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new k9n(view));
        return true;
    }

    public static boolean H(View view) {
        return G(view.getContext(), view);
    }

    public static void I(View view, p9n p9nVar) {
        J(view, View.class, p9nVar);
    }

    public static void J(View view, Class cls, p9n p9nVar) {
        if (!(cls.isAssignableFrom(view.getClass()) && p9nVar.m(view)) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                J(viewGroup.getChildAt(i), cls, p9nVar);
            }
        }
    }

    public static void d(m9n m9nVar, View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new j9n(m9nVar, view));
    }

    public static void e(View view, r8n r8nVar) {
        dll dllVarS = s(view);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, view, r8nVar);
    }

    public static void f(View view, r8n r8nVar) {
        e(view, r8nVar);
        r8nVar.a(view);
    }

    public static void g(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        if (view.isAttachedToWindow()) {
            onAttachStateChangeListener.onViewAttachedToWindow(view);
        }
    }

    public static void h(Context context) {
        Activity activityD;
        View currentFocus;
        if (context == null || (activityD = t8.d(context)) == null || (currentFocus = activityD.getWindow().getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
    }

    public static void i(View view) {
        if (i0l.g() || (Build.VERSION.SDK_INT == 29 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER))) {
            r5n.n(view, 8);
        }
    }

    public static View j(View view) {
        if (view.isVerticalScrollBarEnabled()) {
            view.setVerticalScrollBarEnabled(false);
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewJ = j(viewGroup.getChildAt(i));
            if (viewJ != null) {
                return viewJ;
            }
        }
        return null;
    }

    public static boolean k(List list, List list2) {
        if (list.size() == list2.size()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    return true;
                }
                Object obj = list.get(i);
                Object obj2 = list2.get(i);
                if (!(obj != obj2 ? (obj == null || obj2 == null) ? false : obj.equals(obj2) : true)) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static Context l(Context context, Class cls) {
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (cls.isAssignableFrom(baseContext.getClass())) {
                return baseContext;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        if (baseContext != null && cls.isAssignableFrom(baseContext.getClass())) {
            return baseContext;
        }
        kp5.d("Could not unwrap ", cls, " from ", context);
        return null;
    }

    public static View m(im7 im7Var) {
        while (im7Var != null) {
            if (im7Var.getBackground() != null) {
                return im7Var;
            }
            if (!(im7Var.getParent() instanceof View)) {
                return null;
            }
            im7Var = (View) im7Var.getParent();
        }
        return null;
    }

    public static Rect n(View view) {
        View rootView = view.getRootView();
        Rect rectT = t(rootView);
        d3o d3oVar = g3o.g(rootView, rootView.getRootWindowInsets()).a;
        r9b r9bVarI = d3oVar.i(519);
        r9b r9bVarI2 = d3oVar.i(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
        rectT.left = Math.max(r9bVarI.a, r9bVarI2.a) + rectT.left;
        rectT.top = Math.max(r9bVarI.b, r9bVarI2.b) + rectT.top;
        rectT.right -= Math.max(r9bVarI.c, r9bVarI2.c);
        rectT.bottom -= Math.max(r9bVarI.d, r9bVarI2.d);
        return rectT;
    }

    public static BrowserActivity o(Context context) {
        for (Object baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof BrowserActivity) {
                return (BrowserActivity) baseContext;
            }
        }
        return null;
    }

    public static dx3 p(Context context) {
        try {
            return (dx3) l(context, dx3.class);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Point q(View view, View view2) {
        Point point = new Point();
        point.x = view.getLeft() + point.x;
        point.y = view.getTop() + point.y;
        for (View view3 = (View) view.getParent(); view3 != view2; view3 = (View) view3.getParent()) {
            point.x = (view3.getLeft() - view3.getScrollX()) + point.x;
            point.y = (view3.getTop() - view3.getScrollY()) + point.y;
        }
        return point;
    }

    public static Rect r(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static dll s(View view) {
        return hjf.v(view.getContext());
    }

    public static Rect t(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static boolean u(View view) {
        IBinder windowToken = view.getWindowToken();
        if (windowToken != null) {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(windowToken, 0);
        }
        return false;
    }

    public static boolean v(Window window) {
        return u(window.getDecorView());
    }

    public static boolean w(ViewGroup viewGroup, View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == viewGroup) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        if (view.getParent() instanceof View) {
            return x((View) view.getParent());
        }
        return true;
    }

    public static View y(int i, View view) {
        View viewFindViewById = view.findViewById(i);
        Objects.requireNonNull(viewFindViewById);
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View z(BrowserActivity browserActivity) {
        return y(2131363373, browserActivity.getWindow().getDecorView());
    }
}
