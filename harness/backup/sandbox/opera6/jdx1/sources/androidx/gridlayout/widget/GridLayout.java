package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.l4a;
import defpackage.m4a;
import defpackage.n5n;
import defpackage.nb6;
import defpackage.q4a;
import defpackage.r4a;
import defpackage.r5n;
import defpackage.s4a;
import defpackage.t4a;
import defpackage.v4a;
import defpackage.xhh;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    public static final LogPrinter i = new LogPrinter(3, GridLayout.class.getName());
    public static final byte j = 3;
    public static final byte k = 4;
    public static final boolean l = true;
    public static final byte m = 6;
    public static final byte n = 5;
    public static final byte o = 2;
    public static final l4a p = new l4a(0);
    public static final l4a q;
    public static final l4a r;
    public static final l4a s;
    public static final l4a t;
    public static final m4a u;
    public static final m4a v;
    public static final l4a w;
    public static final l4a x;
    public static final l4a y;
    public final q4a a;
    public final q4a b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public int g;
    public final LogPrinter h;

    static {
        l4a l4aVar = new l4a((byte) 1);
        l4a l4aVar2 = new l4a((byte) 2);
        q = l4aVar;
        r = l4aVar2;
        s = l4aVar;
        t = l4aVar2;
        u = new m4a(l4aVar, l4aVar2);
        v = new m4a(l4aVar2, l4aVar);
        w = new l4a((byte) 3);
        x = new l4a((byte) 4);
        y = new l4a((byte) 5);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        q4a q4aVar = new q4a(this, true);
        this.a = q4aVar;
        q4a q4aVar2 = new q4a(this, false);
        this.b = q4aVar2;
        this.c = 0;
        this.d = false;
        this.e = 1;
        this.g = 0;
        this.h = i;
        this.f = context.getResources().getDimensionPixelOffset(2131165537);
        int[] iArr = xhh.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            q4aVar2.o(typedArrayObtainStyledAttributes.getInt(k, LinearLayoutManager.INVALID_OFFSET));
            h();
            requestLayout();
            q4aVar.o(typedArrayObtainStyledAttributes.getInt(l ? 1 : 0, LinearLayoutManager.INVALID_OFFSET));
            h();
            requestLayout();
            int i2 = typedArrayObtainStyledAttributes.getInt(j, 0);
            if (this.c != i2) {
                this.c = i2;
                h();
                requestLayout();
            }
            this.d = typedArrayObtainStyledAttributes.getBoolean(m, false);
            requestLayout();
            this.e = typedArrayObtainStyledAttributes.getInt(0, 1);
            requestLayout();
            q4aVar2.u = typedArrayObtainStyledAttributes.getBoolean(n, true);
            q4aVar2.l();
            h();
            requestLayout();
            q4aVar.u = typedArrayObtainStyledAttributes.getBoolean(o, true);
            q4aVar.l();
            h();
            requestLayout();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static nb6 d(int i2, boolean z) {
        int i3;
        int i4;
        if (z) {
            i4 = 0;
            i3 = 7;
        } else {
            i3 = 112;
            i4 = 4;
        }
        int i5 = (i2 & i3) >> i4;
        return i5 != 1 ? i5 != 3 ? i5 != 5 ? i5 != 7 ? i5 != 8388611 ? i5 != 8388613 ? p : t : s : y : z ? v : r : z ? u : q : w;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(t4a t4aVar, int i2, int i3, int i4, int i5) {
        s4a s4aVar = new s4a(i2, i3 + i2);
        v4a v4aVar = t4aVar.a;
        t4aVar.a = new v4a(v4aVar.a, s4aVar, v4aVar.c, v4aVar.d);
        s4a s4aVar2 = new s4a(i4, i5 + i4);
        v4a v4aVar2 = t4aVar.b;
        t4aVar.b = new v4a(v4aVar2.a, s4aVar2, v4aVar2.c, v4aVar2.d);
    }

    public static v4a l(int i2, int i3, nb6 nb6Var, float f) {
        return new v4a(i2 != Integer.MIN_VALUE, new s4a(i2, i3 + i2), nb6Var, f);
    }

    public final void a(t4a t4aVar, boolean z) {
        v4a v4aVar;
        String str;
        if (z) {
            v4aVar = t4aVar.b;
            str = "column";
        } else {
            v4aVar = t4aVar.a;
            str = "row";
        }
        s4a s4aVar = v4aVar.b;
        int i2 = s4aVar.a;
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i3 = (z ? this.a : this.b).b;
        if (i3 != Integer.MIN_VALUE) {
            if (s4aVar.b > i3) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (s4aVar.a() > i3) {
                g(str + " span mustn't exceed the " + str + " count");
                throw null;
            }
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((t4a) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public final void c() {
        int i2 = this.g;
        if (i2 != 0) {
            if (i2 != b()) {
                this.h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                h();
                c();
                return;
            }
            return;
        }
        boolean z = this.c == 0;
        int i3 = (z ? this.a : this.b).b;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 0;
        }
        int[] iArr = new int[i3];
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            t4a t4aVar = (t4a) getChildAt(i6).getLayoutParams();
            v4a v4aVar = z ? t4aVar.a : t4aVar.b;
            s4a s4aVar = v4aVar.b;
            boolean z2 = v4aVar.a;
            int iA = s4aVar.a();
            if (z2) {
                i4 = s4aVar.a;
            }
            v4a v4aVar2 = z ? t4aVar.b : t4aVar.a;
            s4a s4aVar2 = v4aVar2.b;
            boolean z3 = v4aVar2.a;
            int iA2 = s4aVar2.a();
            int i7 = s4aVar2.a;
            if (i3 != 0) {
                iA2 = Math.min(iA2, i3 - (z3 ? Math.min(i7, i3) : 0));
            }
            if (z3) {
                i5 = i7;
            }
            if (i3 != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i8 = i5 + iA2;
                        if (i8 <= i3) {
                            for (int i9 = i5; i9 < i8; i9++) {
                                if (iArr[i9] <= i4) {
                                }
                            }
                            break;
                        }
                        if (z3) {
                            i4++;
                        } else if (i8 <= i3) {
                            i5++;
                        } else {
                            i4++;
                            i5 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i5, i3), Math.min(i5 + iA2, i3), i4 + iA);
            }
            if (z) {
                k(t4aVar, i4, iA, i5, iA2);
            } else {
                k(t4aVar, i5, iA2, i4, iA);
            }
            i5 += iA2;
        }
        this.g = b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof t4a)) {
            return false;
        }
        t4a t4aVar = (t4a) layoutParams;
        a(t4aVar, true);
        a(t4aVar, false);
        return true;
    }

    public final int e(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.e == 1) {
            return f(view, z, z2);
        }
        q4a q4aVar = z ? this.a : this.b;
        if (z2) {
            if (q4aVar.j == null) {
                q4aVar.j = new int[q4aVar.f() + 1];
            }
            if (!q4aVar.k) {
                q4aVar.c(true);
                q4aVar.k = true;
            }
            iArr = q4aVar.j;
        } else {
            if (q4aVar.l == null) {
                q4aVar.l = new int[q4aVar.f() + 1];
            }
            if (!q4aVar.m) {
                q4aVar.c(false);
                q4aVar.m = true;
            }
            iArr = q4aVar.l;
        }
        t4a t4aVar = (t4a) view.getLayoutParams();
        s4a s4aVar = (z ? t4aVar.b : t4aVar.a).b;
        return iArr[z2 ? s4aVar.a : s4aVar.b];
    }

    public final int f(View view, boolean z, boolean z2) {
        t4a t4aVar = (t4a) view.getLayoutParams();
        int i2 = z ? z2 ? ((ViewGroup.MarginLayoutParams) t4aVar).leftMargin : ((ViewGroup.MarginLayoutParams) t4aVar).rightMargin : z2 ? ((ViewGroup.MarginLayoutParams) t4aVar).topMargin : ((ViewGroup.MarginLayoutParams) t4aVar).bottomMargin;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (!this.d || view.getClass() == Space.class) {
            return 0;
        }
        return this.f / 2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        v4a v4aVar = v4a.e;
        t4a t4aVar = new t4a(-2, -2);
        t4aVar.a = v4aVar;
        t4aVar.b = v4aVar;
        t4aVar.setMargins(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        t4aVar.a = v4aVar;
        t4aVar.b = v4aVar;
        return t4aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        t4a t4aVar = new t4a(context, attributeSet);
        v4a v4aVar = v4a.e;
        t4aVar.a = v4aVar;
        t4aVar.b = v4aVar;
        int[] iArr = xhh.b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(t4a.d, LinearLayoutManager.INVALID_OFFSET);
            ((ViewGroup.MarginLayoutParams) t4aVar).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(t4a.e, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) t4aVar).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(t4a.f, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) t4aVar).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(t4a.g, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) t4aVar).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(t4a.h, dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int i2 = typedArrayObtainStyledAttributes.getInt(t4a.o, 0);
                int i3 = typedArrayObtainStyledAttributes.getInt(t4a.i, LinearLayoutManager.INVALID_OFFSET);
                byte b = t4a.j;
                int i4 = t4a.c;
                t4aVar.b = l(i3, typedArrayObtainStyledAttributes.getInt(b, i4), d(i2, true), typedArrayObtainStyledAttributes.getFloat(t4a.k, 0.0f));
                t4aVar.a = l(typedArrayObtainStyledAttributes.getInt(t4a.l, LinearLayoutManager.INVALID_OFFSET), typedArrayObtainStyledAttributes.getInt(t4a.m, i4), d(i2, false), typedArrayObtainStyledAttributes.getFloat(t4a.n, 0.0f));
                return t4aVar;
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t4a) {
            t4a t4aVar = (t4a) layoutParams;
            t4a t4aVar2 = new t4a(t4aVar);
            v4a v4aVar = v4a.e;
            t4aVar2.a = v4aVar;
            t4aVar2.b = v4aVar;
            t4aVar2.a = t4aVar.a;
            t4aVar2.b = t4aVar.b;
            return t4aVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            t4a t4aVar3 = new t4a((ViewGroup.MarginLayoutParams) layoutParams);
            v4a v4aVar2 = v4a.e;
            t4aVar3.a = v4aVar2;
            t4aVar3.b = v4aVar2;
            return t4aVar3;
        }
        t4a t4aVar4 = new t4a(layoutParams);
        v4a v4aVar3 = v4a.e;
        t4aVar4.a = v4aVar3;
        t4aVar4.b = v4aVar3;
        return t4aVar4;
    }

    public final void h() {
        this.g = 0;
        q4a q4aVar = this.a;
        if (q4aVar != null) {
            q4aVar.l();
        }
        q4a q4aVar2 = this.b;
        if (q4aVar2 != null) {
            q4aVar2.l();
        }
        if (q4aVar == null || q4aVar2 == null) {
            return;
        }
        q4aVar.m();
        q4aVar2.m();
    }

    public final void i(View view, int i2, int i3, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, e(view, true, false) + e(view, true, true), i4), ViewGroup.getChildMeasureSpec(i3, e(view, false, false) + e(view, false, true), i5));
    }

    public final void j(int i2, int i3, boolean z) {
        int i4;
        int i5;
        GridLayout gridLayout;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                gridLayout = this;
                i4 = i2;
                i5 = i3;
            } else {
                t4a t4aVar = (t4a) childAt.getLayoutParams();
                if (z) {
                    int i7 = ((ViewGroup.MarginLayoutParams) t4aVar).width;
                    int i8 = ((ViewGroup.MarginLayoutParams) t4aVar).height;
                    gridLayout = this;
                    i4 = i2;
                    i5 = i3;
                    gridLayout.i(childAt, i4, i5, i7, i8);
                } else {
                    i4 = i2;
                    i5 = i3;
                    boolean z2 = this.c == 0;
                    v4a v4aVar = z2 ? t4aVar.b : t4aVar.a;
                    if (v4aVar.a(z2) == y) {
                        s4a s4aVar = v4aVar.b;
                        int[] iArrH = (z2 ? this.a : this.b).h();
                        int iE = (iArrH[s4aVar.b] - iArrH[s4aVar.a]) - (this.e(childAt, z2, false) + this.e(childAt, z2, true));
                        if (z2) {
                            int i9 = ((ViewGroup.MarginLayoutParams) t4aVar).height;
                            gridLayout = this;
                            gridLayout.i(childAt, i4, i5, iE, i9);
                        } else {
                            int i10 = ((ViewGroup.MarginLayoutParams) t4aVar).width;
                            gridLayout = this;
                            gridLayout.i(childAt, i4, i5, i10, iE);
                        }
                    } else {
                        gridLayout = this;
                    }
                }
            }
            i6++;
            this = gridLayout;
            i2 = i4;
            i3 = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        GridLayout gridLayout = this;
        gridLayout.c();
        int i10 = i4 - i2;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        int i11 = (i10 - paddingLeft) - paddingRight;
        q4a q4aVar = gridLayout.a;
        q4aVar.v.a = i11;
        q4aVar.w.a = -i11;
        q4aVar.q = false;
        q4aVar.h();
        int i12 = ((i5 - i3) - paddingTop) - paddingBottom;
        q4a q4aVar2 = gridLayout.b;
        q4aVar2.v.a = i12;
        q4aVar2.w.a = -i12;
        q4aVar2.q = false;
        q4aVar2.h();
        int[] iArrH = q4aVar.h();
        int[] iArrH2 = q4aVar2.h();
        int childCount = gridLayout.getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = gridLayout.getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                i7 = i13;
                i6 = i10;
                i8 = paddingLeft;
                i9 = paddingTop;
            } else {
                t4a t4aVar = (t4a) childAt.getLayoutParams();
                v4a v4aVar = t4aVar.b;
                v4a v4aVar2 = t4aVar.a;
                s4a s4aVar = v4aVar.b;
                s4a s4aVar2 = v4aVar2.b;
                int i14 = i13;
                int i15 = iArrH[s4aVar.a];
                int i16 = iArrH2[s4aVar2.a];
                int i17 = iArrH[s4aVar.b];
                int i18 = iArrH2[s4aVar2.b];
                int i19 = i17 - i15;
                int i20 = i18 - i16;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                nb6 nb6VarA = v4aVar.a(true);
                nb6 nb6VarA2 = v4aVar2.a(false);
                ua7 ua7VarG = q4aVar.g();
                r4a r4aVar = (r4a) ((Object[]) ua7VarG.d)[((int[]) ua7VarG.b)[i14]];
                ua7 ua7VarG2 = q4aVar2.g();
                i6 = i10;
                r4a r4aVar2 = (r4a) ((Object[]) ua7VarG2.d)[((int[]) ua7VarG2.b)[i14]];
                int iY = nb6VarA.y(i19 - r4aVar.d(true), childAt);
                int iY2 = nb6VarA2.y(i20 - r4aVar2.d(true), childAt);
                int iE = gridLayout.e(childAt, true, true);
                int iE2 = gridLayout.e(childAt, false, true);
                int iE3 = gridLayout.e(childAt, true, false);
                int i21 = iE + iE3;
                int iE4 = iE2 + gridLayout.e(childAt, false, false);
                i7 = i14;
                i8 = paddingLeft;
                i9 = paddingTop;
                int iA = r4aVar.a(gridLayout, childAt, nb6VarA, measuredWidth + i21, true);
                int iA2 = r4aVar2.a(this, childAt, nb6VarA2, measuredHeight + iE4, false);
                int iZ = nb6VarA.z(measuredWidth, i19 - i21);
                int iZ2 = nb6VarA2.z(measuredHeight, i20 - iE4);
                int i22 = i15 + iY + iA;
                int i23 = getLayoutDirection() == 1 ? (((i6 - iZ) - paddingRight) - iE3) - i22 : i8 + iE + i22;
                int i24 = i9 + i16 + iY2 + iA2 + iE2;
                if (iZ != childAt.getMeasuredWidth() || iZ2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iZ, 1073741824), View.MeasureSpec.makeMeasureSpec(iZ2, 1073741824));
                }
                childAt.layout(i23, i24, iZ + i23, iZ2 + i24);
            }
            i13 = i7 + 1;
            gridLayout = this;
            paddingLeft = i8;
            paddingTop = i9;
            i10 = i6;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iJ;
        int iJ2;
        c();
        q4a q4aVar = this.b;
        q4a q4aVar2 = this.a;
        if (q4aVar2 != null && q4aVar != null) {
            q4aVar2.m();
            q4aVar.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i2), View.MeasureSpec.getMode(i2));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i3), View.MeasureSpec.getMode(i3));
        j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.c == 0) {
            iJ2 = q4aVar2.j(iMakeMeasureSpec);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ = q4aVar.j(iMakeMeasureSpec2);
        } else {
            iJ = q4aVar.j(iMakeMeasureSpec2);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ2 = q4aVar2.j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iJ2 + paddingRight, getSuggestedMinimumWidth()), i2, 0), View.resolveSizeAndState(Math.max(iJ + paddingBottom, getSuggestedMinimumHeight()), i3, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }
}
