package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g;
import com.opera.android.feed.SoftwareClipMaskableFrameLayout;
import defpackage.bpd;
import defpackage.fl4;
import defpackage.gl4;
import defpackage.haa;
import defpackage.jwb;
import defpackage.lph;
import defpackage.mxf;
import defpackage.nb6;
import defpackage.tph;
import defpackage.vph;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends f implements el4, tph {
    public int a;
    public int b;
    public int c;
    public final ic7 d;
    public final gl4 e;
    public jwb f;
    public iwb g;
    public int h;
    public HashMap i;
    public tc2 j;
    public final View.OnLayoutChangeListener k;
    public int l;
    public int m;
    public final int n;

    public CarouselLayoutManager() {
        this(new haa((byte) 1));
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = new ic7();
        this.h = 0;
        this.k = new z22(this, (byte) 4);
        this.m = -1;
        this.n = 0;
        this.e = new haa((byte) 1);
        H();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihh.e);
            this.n = typedArrayObtainStyledAttributes.getInt(0, 0);
            H();
            setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public CarouselLayoutManager(gl4 gl4Var) {
        this.d = new ic7();
        this.h = 0;
        this.k = new z22(this, (byte) 4);
        this.m = -1;
        this.n = 0;
        this.e = gl4Var;
        H();
        setOrientation(0);
    }

    public static bpd B(float f, List list, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            hwb hwbVar = (hwb) list.get(i5);
            float f6 = z ? hwbVar.b : hwbVar.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new bpd((hwb) list.get(i), (hwb) list.get(i3));
    }

    public final int A(int i, iwb iwbVar) {
        int i2 = Integer.MAX_VALUE;
        for (hwb hwbVar : iwbVar.c.subList(iwbVar.d, iwbVar.e + 1)) {
            float f = iwbVar.a;
            float f2 = (f / 2.0f) + (i * f);
            int iW = (D() ? (int) ((w() - hwbVar.a) - f2) : (int) (f2 - hwbVar.a)) - this.a;
            if (Math.abs(i2) > Math.abs(iW)) {
                i2 = iW;
            }
        }
        return i2;
    }

    public final boolean C() {
        return !this.j.a;
    }

    public final boolean D() {
        return C() && getLayoutDirection() == 1;
    }

    public final boolean E(float f, bpd bpdVar) {
        hwb hwbVar = (hwb) bpdVar.b;
        float f2 = hwbVar.d;
        hwb hwbVar2 = (hwb) bpdVar.c;
        float fB = ze1.b(f2, hwbVar2.d, hwbVar.b, hwbVar2.b, f) / 2.0f;
        float f3 = D() ? f + fB : f - fB;
        return D() ? f3 < 0.0f : f3 > ((float) w());
    }

    public final boolean F(float f, bpd bpdVar) {
        hwb hwbVar = (hwb) bpdVar.b;
        float f2 = hwbVar.d;
        hwb hwbVar2 = (hwb) bpdVar.c;
        float fP = p(f, ze1.b(f2, hwbVar2.d, hwbVar.b, hwbVar2.b, f) / 2.0f);
        return D() ? fP > ((float) w()) : fP < 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131 A[PHI: r24
      0x0131: PHI (r24v1 float) = (r24v3 float), (r24v4 float) binds: [B:60:0x012f, B:57:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(androidx.recyclerview.widget.g r30) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.G(androidx.recyclerview.widget.g):void");
    }

    public final void H() {
        this.f = null;
        requestLayout();
    }

    public final int I(int i, g gVar, vph vphVar) {
        if (getChildCount() != 0 && i != 0) {
            if (this.f == null) {
                G(gVar);
            }
            int itemCount = getItemCount();
            jwb jwbVar = this.f;
            if (itemCount > (D() ? jwbVar.b() : jwbVar.d()).b) {
                int i2 = this.a;
                int i3 = this.b;
                int i4 = this.c;
                int i5 = i2 + i;
                if (i5 < i3) {
                    i = i3 - i2;
                } else if (i5 > i4) {
                    i = i4 - i2;
                }
                this.a = i2 + i;
                K(this.f);
                float f = this.g.a / 2.0f;
                float fU = u(getPosition(getChildAt(0)));
                Rect rect = new Rect();
                boolean zD = D();
                iwb iwbVar = this.g;
                float f2 = zD ? iwbVar.c().b : iwbVar.a().b;
                float f3 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    float fP = p(fU, f);
                    bpd bpdVarB = B(fP, this.g.c, false);
                    float fT = t(fP, bpdVarB);
                    super.getDecoratedBoundsWithMargins(childAt, rect);
                    J(childAt, fP, bpdVarB);
                    this.j.j(childAt, rect, f, fT);
                    float fAbs = Math.abs(f2 - fT);
                    if (fAbs < f3) {
                        this.m = getPosition(childAt);
                        f3 = fAbs;
                    }
                    fU = p(fU, this.g.a);
                }
                v(gVar, vphVar);
                return i;
            }
        }
        return 0;
    }

    public final void J(View view, float f, bpd bpdVar) {
        if (view instanceof SoftwareClipMaskableFrameLayout) {
            hwb hwbVar = (hwb) bpdVar.b;
            float f2 = hwbVar.c;
            hwb hwbVar2 = (hwb) bpdVar.c;
            float fB = ze1.b(f2, hwbVar2.c, hwbVar.a, hwbVar2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFB = this.j.b(height, width, ze1.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), ze1.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fT = t(f, bpdVar);
            RectF rectF = new RectF(fT - (rectFB.width() / 2.0f), fT - (rectFB.height() / 2.0f), (rectFB.width() / 2.0f) + fT, (rectFB.height() / 2.0f) + fT);
            RectF rectF2 = new RectF(this.j.d(), this.j.g(), this.j.e(), this.j.c());
            this.e.getClass();
            this.j.a(rectFB, rectF, rectF2);
            this.j.i(rectFB, rectF, rectF2);
            ((SoftwareClipMaskableFrameLayout) view).a(rectFB);
        }
    }

    public final void K(jwb jwbVar) {
        iwb iwbVarC;
        int i = this.c;
        int i2 = this.b;
        if (i <= i2) {
            iwbVarC = D() ? jwbVar.b() : jwbVar.d();
            this.g = iwbVarC;
        } else {
            iwbVarC = jwbVar.c(this.a, i2, i, false);
            this.g = iwbVarC;
        }
        List list = iwbVarC.c;
        ic7 ic7Var = this.d;
        ic7Var.getClass();
        ic7Var.c = Collections.unmodifiableList(list);
    }

    public final void L() {
        int itemCount = getItemCount();
        int i = this.l;
        if (itemCount == i || this.f == null) {
            return;
        }
        if (this.e.d(this, i)) {
            H();
        }
        this.l = itemCount;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean canScrollHorizontally() {
        return C();
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean canScrollVertically() {
        return !C();
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollExtent(vph vphVar) {
        if (getChildCount() == 0 || this.f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (((iwb) this.f.c).a / computeHorizontalScrollRange(vphVar)));
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollOffset(vph vphVar) {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollRange(vph vphVar) {
        return this.c - this.b;
    }

    @Override // defpackage.tph
    public final PointF computeScrollVectorForPosition(int i) {
        if (this.f == null) {
            return null;
        }
        int iZ = z(i, x(i)) - this.a;
        return C() ? new PointF(iZ, 0.0f) : new PointF(0.0f, iZ);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollExtent(vph vphVar) {
        if (getChildCount() == 0 || this.f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (((iwb) this.f.c).a / computeVerticalScrollRange(vphVar)));
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollOffset(vph vphVar) {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollRange(vph vphVar) {
        return this.c - this.b;
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateDefaultLayoutParams() {
        return new lph(-2, -2);
    }

    @Override // androidx.recyclerview.widget.f
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (C()) {
            fCenterY = rect.centerX();
        }
        bpd bpdVarB = B(fCenterY, this.g.c, true);
        hwb hwbVar = (hwb) bpdVarB.b;
        float f = hwbVar.d;
        hwb hwbVar2 = (hwb) bpdVarB.c;
        float fB = ze1.b(f, hwbVar2.d, hwbVar.b, hwbVar2.b, fCenterY);
        float fWidth = C() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = C() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.f
    public final void measureChildWithMargins(View view, int i, int i2) {
        if (!(view instanceof SoftwareClipMaskableFrameLayout)) {
            qp2.n("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            return;
        }
        lph lphVar = (lph) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = rect.left + rect.right + i;
        int i4 = rect.top + rect.bottom + i2;
        jwb jwbVar = this.f;
        view.measure(f.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lphVar).leftMargin + ((ViewGroup.MarginLayoutParams) lphVar).rightMargin + i3, (int) ((jwbVar == null || this.j.a) ? ((ViewGroup.MarginLayoutParams) lphVar).width : ((iwb) jwbVar.c).a), C()), f.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) lphVar).topMargin + ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin + i4, (int) ((jwbVar == null || !this.j.a) ? ((ViewGroup.MarginLayoutParams) lphVar).height : ((iwb) jwbVar.c).a), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.f
    public final void onAttachedToWindow(RecyclerView recyclerView) throws Resources.NotFoundException {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        gl4 gl4Var = this.e;
        float dimension = gl4Var.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(2131166009);
        }
        gl4Var.a = dimension;
        float dimension2 = gl4Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(2131166008);
        }
        gl4Var.b = dimension2;
        H();
        recyclerView.addOnLayoutChangeListener(this.k);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onDetachedFromWindow(RecyclerView recyclerView, g gVar) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // androidx.recyclerview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r5, int r6, androidx.recyclerview.widget.g r7, defpackage.vph r8) {
        /*
            r4 = this;
            int r8 = r4.getChildCount()
            if (r8 == 0) goto L73
            tc2 r8 = r4.j
            boolean r8 = r8.a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L3f
            r3 = 2
            if (r6 == r3) goto L3d
            r3 = 17
            if (r6 == r3) goto L32
            r3 = 33
            if (r6 == r3) goto L2f
            r3 = 66
            if (r6 == r3) goto L26
            r3 = 130(0x82, float:1.82E-43)
            if (r6 != r3) goto L3b
            if (r8 != r2) goto L3b
            goto L3d
        L26:
            if (r8 != 0) goto L3b
            boolean r6 = r4.D()
            if (r6 == 0) goto L3d
            goto L3f
        L2f:
            if (r8 != r2) goto L3b
            goto L3f
        L32:
            if (r8 != 0) goto L3b
            boolean r6 = r4.D()
            if (r6 == 0) goto L3f
            goto L3d
        L3b:
            r6 = r0
            goto L40
        L3d:
            r6 = r2
            goto L40
        L3f:
            r6 = r1
        L40:
            if (r6 == r0) goto L73
            r8 = 0
            if (r6 != r1) goto L68
            int r5 = r4.getPosition(r5)
            if (r5 == 0) goto L73
            android.view.View r5 = r4.getChildAt(r8)
            int r5 = r4.getPosition(r5)
            int r5 = r5 - r2
            r4.q(r7, r5, r8)
            boolean r5 = r4.D()
            if (r5 == 0) goto L63
            int r5 = r4.getChildCount()
            int r8 = r5 + (-1)
        L63:
            android.view.View r4 = r4.getChildAt(r8)
            return r4
        L68:
            int r5 = r4.getPosition(r5)
            int r6 = r4.getItemCount()
            int r6 = r6 - r2
            if (r5 != r6) goto L75
        L73:
            r4 = 0
            return r4
        L75:
            int r5 = r4.getChildCount()
            int r5 = r5 - r2
            android.view.View r5 = r4.getChildAt(r5)
            int r5 = r4.getPosition(r5)
            int r5 = r5 + r2
            r4.q(r7, r5, r1)
            boolean r5 = r4.D()
            if (r5 != 0) goto L92
            int r5 = r4.getChildCount()
            int r8 = r5 + (-1)
        L92:
            android.view.View r4 = r4.getChildAt(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.g, vph):android.view.View");
    }

    @Override // androidx.recyclerview.widget.f
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        L();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        L();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        L();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onLayoutChildren(g gVar, vph vphVar) {
        iwb iwbVarD;
        hwb hwbVarA;
        iwb iwbVarB;
        hwb hwbVarC;
        if (vphVar.b() <= 0 || w() <= 0.0f) {
            removeAndRecycleAllViews(gVar);
            this.h = 0;
            return;
        }
        boolean zD = D();
        jwb jwbVar = this.f;
        int i = 1;
        boolean z = jwbVar == null;
        if (z || ((iwb) jwbVar.c).f != w()) {
            G(gVar);
        }
        jwb jwbVar2 = this.f;
        if (D()) {
            iwbVarD = jwbVar2.b();
            hwbVarA = iwbVarD.c();
        } else {
            iwbVarD = jwbVar2.d();
            hwbVarA = iwbVarD.a();
        }
        float f = hwbVarA.a;
        float f2 = iwbVarD.a / 2.0f;
        int iF = (int) (this.j.f() - (D() ? f + f2 : f - f2));
        jwb jwbVar3 = this.f;
        boolean zD2 = D();
        if (zD2) {
            iwbVarB = jwbVar3.d();
            hwbVarC = iwbVarB.a();
        } else {
            iwbVarB = jwbVar3.b();
            hwbVarC = iwbVarB.c();
        }
        int iB = (int) ((((zD2 ? -1 : 1) * hwbVarC.d) / 2.0f) + ((((vphVar.b() - 1) * iwbVarB.a) * (zD2 ? -1.0f : 1.0f)) - (hwbVarC.a - this.j.f())));
        int iMin = zD2 ? Math.min(0, iB) : Math.max(0, iB);
        this.b = zD ? iMin : iF;
        if (zD) {
            iMin = iF;
        }
        this.c = iMin;
        if (z) {
            this.a = iF;
            jwb jwbVar4 = this.f;
            int itemCount = getItemCount();
            int i2 = this.b;
            int i3 = this.c;
            boolean zD3 = D();
            List list = (List) jwbVar4.d;
            List list2 = (List) jwbVar4.e;
            float f3 = ((iwb) jwbVar4.c).a;
            HashMap map = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (i4 < itemCount) {
                int i6 = zD3 ? (itemCount - i4) - i : i4;
                int i7 = i;
                if (i6 * f3 * (zD3 ? -1 : i7) > i3 - jwbVar4.b || i4 >= itemCount - list2.size()) {
                    map.put(Integer.valueOf(i6), (iwb) list2.get(nb6.j(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = itemCount - 1; i10 >= 0; i10--) {
                int i11 = zD3 ? (itemCount - i10) - 1 : i10;
                if (i11 * f3 * (zD3 ? -1 : i8) < i2 + jwbVar4.a || i10 < list.size()) {
                    map.put(Integer.valueOf(i11), (iwb) list.get(nb6.j(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.i = map;
            int i12 = this.m;
            if (i12 != -1) {
                this.a = z(i12, x(i12));
            }
        }
        int i13 = this.a;
        int i14 = this.b;
        int i15 = this.c;
        this.a = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.h = nb6.j(this.h, 0, vphVar.b());
        K(this.f);
        detachAndScrapAttachedViews(gVar);
        v(gVar, vphVar);
        this.l = getItemCount();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onLayoutCompleted(vph vphVar) {
        if (getChildCount() == 0) {
            this.h = 0;
        } else {
            this.h = getPosition(getChildAt(0));
        }
    }

    public final float p(float f, float f2) {
        return D() ? f - f2 : f + f2;
    }

    public final void q(g gVar, int i, int i2) {
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        float fU = u(i);
        View viewD = gVar.d(i);
        measureChildWithMargins(viewD, 0, 0);
        float fP = p(fU, this.g.a / 2.0f);
        bpd bpdVarB = B(fP, this.g.c, false);
        float fT = t(fP, bpdVarB);
        float f = this.g.a / 2.0f;
        addView(viewD, i2);
        measureChildWithMargins(viewD, 0, 0);
        this.j.h(viewD, (int) (fT - f), (int) (fT + f));
        J(viewD, fP, bpdVarB);
    }

    public final void r(int i, g gVar, vph vphVar) {
        float fU = u(i);
        while (i < vphVar.b()) {
            float fP = p(fU, this.g.a / 2.0f);
            bpd bpdVarB = B(fP, this.g.c, false);
            float fT = t(fP, bpdVarB);
            if (E(fT, bpdVarB)) {
                return;
            }
            fU = p(fU, this.g.a);
            if (!F(fT, bpdVarB)) {
                View viewD = gVar.d(i);
                float f = this.g.a / 2.0f;
                addView(viewD, -1);
                measureChildWithMargins(viewD, 0, 0);
                this.j.h(viewD, (int) (fT - f), (int) (fT + f));
                J(viewD, fP, bpdVarB);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iA;
        if (this.f == null || (iA = A(getPosition(view), x(getPosition(view)))) == 0) {
            return false;
        }
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i + iA;
        if (i4 < i2) {
            iA = i2 - i;
        } else if (i4 > i3) {
            iA = i3 - i;
        }
        int iA2 = A(getPosition(view), this.f.c(i + iA, i2, i3, false));
        if (C()) {
            recyclerView.scrollBy(iA2, 0);
            return true;
        }
        recyclerView.scrollBy(0, iA2);
        return true;
    }

    public final void s(int i, g gVar) {
        float fU = u(i);
        while (i >= 0) {
            float fP = p(fU, this.g.a / 2.0f);
            bpd bpdVarB = B(fP, this.g.c, false);
            float fT = t(fP, bpdVarB);
            if (F(fT, bpdVarB)) {
                return;
            }
            float f = this.g.a;
            fU = D() ? fU + f : fU - f;
            if (!E(fT, bpdVarB)) {
                View viewD = gVar.d(i);
                float f2 = this.g.a / 2.0f;
                addView(viewD, 0);
                measureChildWithMargins(viewD, 0, 0);
                this.j.h(viewD, (int) (fT - f2), (int) (fT + f2));
                J(viewD, fP, bpdVarB);
            }
            i--;
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        if (C()) {
            return I(i, gVar, vphVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f
    public final void scrollToPosition(int i) {
        this.m = i;
        if (this.f == null) {
            return;
        }
        this.a = z(i, x(i));
        this.h = nb6.j(i, 0, Math.max(0, getItemCount() - 1));
        K(this.f);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f
    public final int scrollVerticallyBy(int i, g gVar, vph vphVar) {
        if (canScrollVertically()) {
            return I(i, gVar, vphVar);
        }
        return 0;
    }

    public final void setOrientation(int i) {
        fl4 fl4Var;
        if (i != 0 && i != 1) {
            qp2.o(sko.i(i, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        tc2 tc2Var = this.j;
        if (tc2Var == null || i != tc2Var.a) {
            if (i == 0) {
                fl4Var = new fl4(this, (byte) 1);
            } else {
                if (i != 1) {
                    qp2.o("invalid orientation");
                    return;
                }
                fl4Var = new fl4(this, (byte) 0);
            }
            this.j = fl4Var;
            H();
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        mxf mxfVar = new mxf(this, recyclerView.getContext(), (byte) 3);
        mxfVar.setTargetPosition(i);
        startSmoothScroll(mxfVar);
    }

    public final float t(float f, bpd bpdVar) {
        hwb hwbVar = (hwb) bpdVar.b;
        float f2 = hwbVar.b;
        hwb hwbVar2 = (hwb) bpdVar.c;
        float f3 = hwbVar2.b;
        float f4 = hwbVar.a;
        float f5 = hwbVar2.a;
        float fB = ze1.b(f2, f3, f4, f5, f);
        if (hwbVar2 != this.g.b() && hwbVar != this.g.d()) {
            return fB;
        }
        return v0g.g(1.0f, hwbVar2.c, f - f5, fB);
    }

    public final float u(int i) {
        return p(this.j.f() - this.a, this.g.a * i);
    }

    public final void v(g gVar, vph vphVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            float fCenterX = C() ? rect.centerX() : rect.centerY();
            if (!F(fCenterX, B(fCenterX, this.g.c, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, gVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            float fCenterX2 = C() ? rect2.centerX() : rect2.centerY();
            if (!E(fCenterX2, B(fCenterX2, this.g.c, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, gVar);
            }
        }
        if (getChildCount() == 0) {
            s(this.h - 1, gVar);
            r(this.h, gVar, vphVar);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            s(position - 1, gVar);
            r(position2 + 1, gVar, vphVar);
        }
    }

    public final int w() {
        return C() ? getWidth() : getHeight();
    }

    public final iwb x(int i) {
        iwb iwbVar;
        HashMap map = this.i;
        return (map == null || (iwbVar = (iwb) map.get(Integer.valueOf(nb6.j(i, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? (iwb) this.f.c : iwbVar;
    }

    public final int y(int i) {
        int iZ = z(i, this.f.c(this.a, this.b, this.c, true)) - this.a;
        if (this.i != null) {
            z(i, x(i));
        }
        return iZ;
    }

    public final int z(int i, iwb iwbVar) {
        if (!D()) {
            return (int) ((iwbVar.a / 2.0f) + ((i * iwbVar.a) - iwbVar.a().a));
        }
        float fW = w() - iwbVar.c().a;
        float f = iwbVar.a;
        return (int) ((fW - (i * f)) - (f / 2.0f));
    }
}
