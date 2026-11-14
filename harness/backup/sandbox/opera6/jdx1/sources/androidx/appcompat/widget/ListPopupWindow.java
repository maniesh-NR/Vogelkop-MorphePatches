package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.eq1;
import defpackage.gij;
import defpackage.im7;
import defpackage.mic;
import defpackage.nic;
import defpackage.oic;
import defpackage.zhh;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow implements gij {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sSetEpicenterBoundsMethod;
    public boolean A;
    public eq1 B;
    public final Context a;
    public ListAdapter b;
    public im7 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final short h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int m;
    private int mDropDownGravity;
    public LinearLayout n;
    public boolean o;
    public l46 p;
    public View q;
    public AdapterView.OnItemClickListener r;
    public AdapterView.OnItemSelectedListener s;
    public final nic t;
    public final hs8 u;
    public final oic v;
    public final nic w;
    public final Handler x;
    public final Rect y;
    public Rect z;

    public ListPopupWindow(Context context) {
        this(context, null, 2130970186, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = -2;
        this.e = -2;
        this.h = (short) 1002;
        this.mDropDownGravity = 0;
        this.l = DEBUG;
        this.m = Integer.MAX_VALUE;
        this.o = DEBUG;
        this.t = new nic(this, (byte) 1);
        this.u = new hs8(this, (byte) 2);
        this.v = new oic(this);
        this.w = new nic(this, (byte) 0);
        this.y = new Rect();
        this.a = context;
        this.x = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zhh.p, i, i2);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        eq1 eq1Var = new eq1(context, attributeSet, i, i2);
        this.B = eq1Var;
        eq1Var.setInputMethodMode(1);
    }

    private void setPopupClipToScreenEnabled(boolean z) {
        this.B.setIsClippedToScreen(z);
    }

    @Override // defpackage.gij
    public final boolean a() {
        return this.B.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i) {
        this.f = i;
    }

    @Override // defpackage.gij
    public final void dismiss() {
        this.B.dismiss();
        LinearLayout linearLayout = this.n;
        if (linearLayout != null) {
            ViewParent parent = linearLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.n);
            }
        }
        this.B.setContentView(null);
        this.c = null;
        this.x.removeCallbacks(this.t);
    }

    public final Drawable e() {
        return this.B.getBackground();
    }

    public final void g(int i) {
        this.g = i;
        this.i = true;
    }

    public final int j() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void k(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.p;
        if (dataSetObserver == null) {
            this.p = new l46(this, (byte) 2);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p);
        }
        im7 im7Var = this.c;
        if (im7Var != null) {
            im7Var.setAdapter(this.b);
        }
    }

    @Override // defpackage.gij
    public final im7 l() {
        return this.c;
    }

    public final void m(Drawable drawable) {
        this.B.setBackgroundDrawable(drawable);
    }

    public im7 n(Context context, boolean z) {
        return new im7(context, z);
    }

    public final void o(int i) {
        Drawable background = this.B.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.y;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }

    public final void p(int i) {
        this.mDropDownGravity = i;
    }

    public final void q(boolean z) {
        this.A = z;
        this.B.setFocusable(z);
    }

    @Override // defpackage.gij
    public void show() {
        int measuredHeight;
        int i;
        int i2;
        im7 im7Var;
        int i3;
        im7 im7Var2 = this.c;
        Context context = this.a;
        if (im7Var2 == null) {
            im7 im7VarN = n(context, !this.A);
            this.c = im7VarN;
            im7VarN.setAdapter(this.b);
            this.c.setOnItemClickListener(this.r);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new mic(this, (byte) 0));
            this.c.setOnScrollListener(this.v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.s;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.c;
            View view2 = this.n;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                boolean z = this.o;
                if (!z) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (z) {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i4 = this.e;
                if (i4 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i4, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.B.setContentView(view);
        } else {
            LinearLayout linearLayout2 = this.n;
            if (linearLayout2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                measuredHeight = layoutParams3.bottomMargin + linearLayout2.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.B.getBackground();
        Rect rect = this.y;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.i) {
                this.g = -i5;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = this.B.getMaxAvailableHeight(this.q, this.g, this.B.getInputMethodMode() == 2);
        if (this.d == -1) {
            i2 = maxAvailableHeight + i;
        } else {
            int i6 = this.e;
            int iA = this.c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), LinearLayoutManager.INVALID_OFFSET), maxAvailableHeight - measuredHeight);
            if (iA > 0) {
                measuredHeight += this.c.getPaddingBottom() + this.c.getPaddingTop() + i;
            }
            i2 = iA + measuredHeight;
        }
        boolean z2 = this.B.getInputMethodMode() == 2;
        this.B.setWindowLayoutType(this.h);
        if (this.B.isShowing()) {
            if (this.q.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.q.getWidth();
                }
                int i7 = this.d;
                if (i7 == -1) {
                    if (!z2) {
                        i2 = -1;
                    }
                    eq1 eq1Var = this.B;
                    int i8 = this.e;
                    if (z2) {
                        eq1Var.setWidth(i8 == -1 ? -1 : 0);
                        this.B.setHeight(0);
                    } else {
                        eq1Var.setWidth(i8 == -1 ? -1 : 0);
                        this.B.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    i2 = i7;
                }
                this.B.setOutsideTouchable(!this.l);
                this.B.update(this.q, this.f, this.g, width < 0 ? -1 : width, i2 < 0 ? -1 : i2);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.q.getWidth();
        }
        int i9 = this.d;
        if (i9 == -1) {
            i2 = -1;
        } else if (i9 != -2) {
            i2 = i9;
        }
        this.B.setWidth(width2);
        this.B.setHeight(i2);
        setPopupClipToScreenEnabled(true);
        this.B.setOutsideTouchable(!this.l);
        this.B.setTouchInterceptor(this.u);
        if (this.k) {
            this.B.setOverlapAnchor(this.j);
        }
        this.B.setEpicenterBounds(this.z);
        this.B.showAsDropDown(this.q, this.f, this.g, this.mDropDownGravity);
        this.c.setSelection(-1);
        if ((!this.A || this.c.isInTouchMode()) && (im7Var = this.c) != null) {
            im7Var.h = true;
            im7Var.requestLayout();
        }
        if (this.A) {
            return;
        }
        this.x.post(this.w);
    }
}
