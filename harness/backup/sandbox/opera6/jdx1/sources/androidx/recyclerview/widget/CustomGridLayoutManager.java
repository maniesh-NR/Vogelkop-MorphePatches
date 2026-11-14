package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.bfc;
import defpackage.cfc;
import defpackage.dfc;
import defpackage.jph;
import defpackage.lph;
import defpackage.p3p;
import defpackage.vph;
import defpackage.zdh;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CustomGridLayoutManager extends LinearLayoutManager {
    public boolean a;
    public int b;
    public fr[] c;
    public View[] d;
    public final Rect e;
    public final i7f f;
    public int g;

    public CustomGridLayoutManager() {
        super(1, false);
        this.b = -1;
        this.e = new Rect();
        this.f = new i7f();
        this.g = 1;
        K(16);
    }

    public CustomGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = -1;
        this.e = new Rect();
        this.f = new i7f();
        this.g = 1;
        K(f.getProperties(context, attributeSet, i, i2).b);
    }

    public final void D(int i) {
        int i2 = this.b;
        fr[] frVarArr = this.c;
        if (frVarArr == null || frVarArr.length != i2) {
            this.c = new fr[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.c[i3] = new fr((byte) 6, false);
            }
        }
        E(this.c, i, this.b);
    }

    public void E(fr[] frVarArr, int i, int i2) {
        int i3;
        int i4 = i / i2;
        int i5 = i % i2;
        int i6 = 0;
        while (i6 < i2) {
            if (i5 > 0) {
                i3 = i4 + 1;
                i5--;
            } else {
                i3 = i4;
            }
            int i7 = i6 == 0 ? 0 : frVarArr[i6 - 1].c;
            fr frVar = frVarArr[i6];
            frVar.b = i7;
            frVar.c = i3 + i7;
            i6++;
        }
    }

    public final void F() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    public final int G(int i, g gVar, vph vphVar) {
        if (!vphVar.g) {
            return i % this.b;
        }
        int iB = gVar.b(i);
        if (iB == -1) {
            return 0;
        }
        return iB % this.b;
    }

    public final int H(int i, g gVar, vph vphVar) {
        if (!vphVar.g) {
            return i % this.b;
        }
        int iB = gVar.b(i);
        if (iB == -1) {
            return 0;
        }
        return iB % this.b;
    }

    public final int I(int i) {
        int i2;
        int i3;
        if (this.mOrientation == 1 && isLayoutRTL()) {
            fr frVar = this.c[(this.b - i) - 1];
            i2 = frVar.c;
            i3 = frVar.b;
        } else {
            fr frVar2 = this.c[i];
            i2 = frVar2.c;
            i3 = frVar2.b;
        }
        return i2 - i3;
    }

    public final void J(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        lph lphVar = (lph) view.getLayoutParams();
        Rect rect = lphVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) lphVar).topMargin + ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) lphVar).leftMargin + ((ViewGroup.MarginLayoutParams) lphVar).rightMargin;
        int I = I(lphVar.a.getLayoutPosition() % this.b);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = f.getChildMeasureSpec(I, i, i3, ((ViewGroup.MarginLayoutParams) lphVar).width, false);
            childMeasureSpec = f.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) lphVar).height, true);
        } else {
            int childMeasureSpec3 = f.getChildMeasureSpec(I, i, i2, ((ViewGroup.MarginLayoutParams) lphVar).height, false);
            int childMeasureSpec4 = f.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) lphVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        lph lphVar2 = (lph) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, lphVar2) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, lphVar2)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public void K(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i < 1) {
            qp2.o(sko.i(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.b = i;
        i7f i7fVar = this.f;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            zdh zdhVar = (zdh) g7fVarC.next();
            byte b = zdhVar.a;
            Object obj = zdhVar.b;
            switch (b) {
                case 0:
                    beh behVar = (beh) obj;
                    d dVar = behVar.k;
                    int i2 = behVar.j.b;
                    ydh ydhVar = (tq8) ((ns8) dVar).c.b;
                    if (ydhVar.i == i2) {
                        break;
                    } else {
                        ydhVar.i = i2;
                        ydhVar.D();
                        RecyclerView recyclerView = behVar.i;
                        if (recyclerView.m == null) {
                            break;
                        } else {
                            recyclerView.y0(dVar);
                            break;
                        }
                    }
                default:
                    ((kok) obj).b(i);
                    break;
            }
        }
        requestLayout();
    }

    public final void L() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        D(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(vph vphVar, dfc dfcVar, jph jphVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && dfcVar.b(vphVar) && i > 0; i2++) {
            ((a) jphVar).a(dfcVar.d, dfcVar.g);
            i--;
            dfcVar.d += dfcVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(g gVar, vph vphVar, boolean z, boolean z2) {
        int i;
        int childCount;
        ensureLayoutState();
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iB = vphVar.b();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && H(position, gVar, vphVar) == 0) {
                if (((lph) childAt.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final lph generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new lph(-2, -1) : new lph(-1, -2);
    }

    @Override // androidx.recyclerview.widget.f
    public final int getColumnCountForAccessibility(g gVar, vph vphVar) {
        if (this.mOrientation == 1) {
            return this.b;
        }
        if (vphVar.b() < 1) {
            return 0;
        }
        return G(vphVar.b() - 1, gVar, vphVar) + 1;
    }

    @Override // androidx.recyclerview.widget.f
    public final int getRowCountForAccessibility(g gVar, vph vphVar) {
        if (this.mOrientation == 0) {
            return this.b;
        }
        if (vphVar.b() < 1) {
            return 0;
        }
        return G(vphVar.b() - 1, gVar, vphVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(g gVar, vph vphVar, dfc dfcVar, cfc cfcVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iD;
        int i8;
        int i9;
        int paddingLeft;
        int i10;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewC;
        CustomGridLayoutManager customGridLayoutManager = this;
        int iJ = customGridLayoutManager.mOrientationHelper.j();
        boolean z = true;
        boolean z2 = iJ != 1073741824;
        if (z2) {
            customGridLayoutManager.L();
        }
        boolean z3 = dfcVar.e == 1;
        int iH = customGridLayoutManager.b;
        if (!z3) {
            iH = customGridLayoutManager.H(dfcVar.d, gVar, vphVar) + 1;
        }
        int i11 = 0;
        while (i11 < customGridLayoutManager.b && dfcVar.b(vphVar) && iH > 0) {
            int i12 = dfcVar.d;
            if (1 > customGridLayoutManager.b) {
                qp2.o(p3p.k(customGridLayoutManager.b, " spans.", p3p.o(i12, "Item at position ", " requires 1 spans but GridLayoutManager has only ")));
                return;
            }
            iH--;
            if (iH < 0 || (viewC = dfcVar.c(gVar)) == null) {
                break;
            }
            customGridLayoutManager.d[i11] = viewC;
            i11++;
        }
        if (i11 == 0) {
            cfcVar.b = true;
            return;
        }
        if (z3) {
            i = 0;
            i3 = 1;
            i2 = i11;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            customGridLayoutManager.d[i].setTag(2131364517, Integer.valueOf(i13));
            i13++;
            i += i3;
            z = z;
        }
        boolean z4 = z;
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view = customGridLayoutManager.d[i15];
            if (dfcVar.k == null) {
                if (z3) {
                    customGridLayoutManager.addView(view);
                } else {
                    customGridLayoutManager.addView(view, 0);
                }
            } else if (z3) {
                customGridLayoutManager.addDisappearingView(view);
            } else {
                customGridLayoutManager.addDisappearingView(view, 0);
            }
            customGridLayoutManager.calculateItemDecorationsForChild(view, customGridLayoutManager.e);
            customGridLayoutManager.J(view, iJ, false);
            int iC = customGridLayoutManager.mOrientationHelper.c(view);
            if (iC > i14) {
                i14 = iC;
            }
            float fD = customGridLayoutManager.mOrientationHelper.d(view) * 1.0f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z2) {
            customGridLayoutManager.D(Math.round(f * customGridLayoutManager.b));
            int i16 = 0;
            i14 = 0;
            while (i16 < i11) {
                View view2 = customGridLayoutManager.d[i16];
                customGridLayoutManager.J(view2, 1073741824, z4);
                int iC2 = customGridLayoutManager.mOrientationHelper.c(view2);
                if (iC2 > i14) {
                    i14 = iC2;
                }
                i16++;
                z4 = true;
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view3 = customGridLayoutManager.d[i17];
            if (customGridLayoutManager.mOrientationHelper.c(view3) != i14) {
                lph lphVar = (lph) view3.getLayoutParams();
                Rect rect = lphVar.b;
                int i18 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) lphVar).topMargin + ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin;
                int i19 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) lphVar).leftMargin + ((ViewGroup.MarginLayoutParams) lphVar).rightMargin;
                int I = customGridLayoutManager.I(((Integer) view3.getTag(2131364517)).intValue() % customGridLayoutManager.b);
                if (customGridLayoutManager.mOrientation == 1) {
                    childMeasureSpec2 = f.getChildMeasureSpec(I, 1073741824, i19, ((ViewGroup.MarginLayoutParams) lphVar).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    childMeasureSpec = f.getChildMeasureSpec(I, 1073741824, i18, ((ViewGroup.MarginLayoutParams) lphVar).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (customGridLayoutManager.shouldReMeasureChild(view3, childMeasureSpec2, childMeasureSpec, (lph) view3.getLayoutParams())) {
                    view3.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        cfcVar.a = i14;
        int i20 = customGridLayoutManager.mOrientation;
        int i21 = dfcVar.f;
        int i22 = dfcVar.b;
        if (i20 == 1) {
            if (i21 == -1) {
                i5 = i22 - i14;
                i6 = i22;
                i22 = 0;
            } else {
                int i23 = i14 + i22;
                i5 = i22;
                i22 = 0;
                i6 = i23;
            }
            i4 = i22;
        } else if (i21 == -1) {
            int i24 = i22 - i14;
            i4 = i22;
            i6 = 0;
            i22 = i24;
            i5 = 0;
        } else {
            i4 = i14 + i22;
            i5 = 0;
            i6 = 0;
        }
        if (customGridLayoutManager.g != 2 || i11 >= (i10 = customGridLayoutManager.b)) {
            i7 = 0;
        } else {
            fr[] frVarArr = customGridLayoutManager.c;
            i7 = (frVarArr[i10 - 1].c - frVarArr[i11 - 1].c) / 2;
        }
        int iD2 = i4;
        int i25 = 0;
        while (true) {
            View[] viewArr = customGridLayoutManager.d;
            if (i25 >= i11) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int i26 = i5;
            View view4 = viewArr[i25];
            lph lphVar2 = (lph) view4.getLayoutParams();
            int iIntValue = ((Integer) view4.getTag(2131364517)).intValue() % customGridLayoutManager.b;
            if (customGridLayoutManager.mOrientation == 1) {
                if (customGridLayoutManager.isLayoutRTL()) {
                    iD2 = (customGridLayoutManager.getPaddingLeft() + customGridLayoutManager.c[(customGridLayoutManager.b - iIntValue) - 1].c) - i7;
                    paddingLeft = iD2 - customGridLayoutManager.mOrientationHelper.d(view4);
                } else {
                    paddingLeft = customGridLayoutManager.getPaddingLeft() + customGridLayoutManager.c[iIntValue].b + i7;
                    iD2 = customGridLayoutManager.mOrientationHelper.d(view4) + paddingLeft;
                }
                iD = i6;
                i9 = paddingLeft;
                i8 = i26;
            } else {
                int paddingTop = customGridLayoutManager.getPaddingTop() + customGridLayoutManager.c[iIntValue].b + i7;
                iD = customGridLayoutManager.mOrientationHelper.d(view4) + paddingTop;
                int i27 = i22;
                i8 = paddingTop;
                i9 = i27;
            }
            customGridLayoutManager.layoutDecoratedWithMargins(view4, i9, i8, iD2, iD);
            i5 = i8;
            i22 = i9;
            i6 = iD;
            if (lphVar2.a.isRemoved() || lphVar2.a.isUpdated()) {
                cfcVar.c = true;
            }
            cfcVar.d |= view4.isFocusable();
            i25++;
            customGridLayoutManager = this;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(g gVar, vph vphVar, bfc bfcVar, int i) {
        super.onAnchorReady(gVar, vphVar, bfcVar, i);
        L();
        if (vphVar.b() > 0 && !vphVar.g) {
            boolean z = i == 1;
            int iH = H(bfcVar.b, gVar, vphVar);
            if (z) {
                while (iH > 0) {
                    int i2 = bfcVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    bfcVar.b = i3;
                    iH = H(i3, gVar, vphVar);
                }
            } else {
                int iB = vphVar.b() - 1;
                int i4 = bfcVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iH2 = H(i5, gVar, vphVar);
                    if (iH2 <= iH) {
                        break;
                    }
                    i4 = i5;
                    iH = iH2;
                }
                bfcVar.b = i4;
            }
        }
        F();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r19, int r20, androidx.recyclerview.widget.g r21, defpackage.vph r22) {
        /*
            r18 = this;
            r0 = r18
            android.view.View r1 = r18.findContainingItemView(r19)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r3 = r0.getPosition(r1)
            int r4 = r0.b
            int r3 = r3 % r4
            int r4 = r3 + 1
            android.view.View r5 = super.onFocusSearchFailed(r19, r20, r21, r22)
            if (r5 != 0) goto L1a
            return r2
        L1a:
            r5 = r20
            int r5 = r0.convertFocusDirectionToLayoutDirection(r5)
            r7 = 1
            if (r5 != r7) goto L25
            r5 = r7
            goto L26
        L25:
            r5 = 0
        L26:
            boolean r8 = r0.mShouldReverseLayout
            r9 = -1
            if (r5 == r8) goto L33
            int r5 = r0.getChildCount()
            int r5 = r5 - r7
            r8 = r9
            r10 = r8
            goto L3a
        L33:
            int r5 = r0.getChildCount()
            r8 = r5
            r10 = r7
            r5 = 0
        L3a:
            int r11 = r0.mOrientation
            if (r11 != r7) goto L46
            boolean r11 = r0.isLayoutRTL()
            if (r11 == 0) goto L46
            r11 = r7
            goto L47
        L46:
            r11 = 0
        L47:
            r12 = 0
        L48:
            if (r5 == r8) goto L8d
            android.view.View r13 = r0.getChildAt(r5)
            if (r13 == r1) goto L8d
            boolean r14 = r13.isFocusable()
            if (r14 == 0) goto L8b
            int r14 = r0.getPosition(r13)
            int r15 = r0.b
            int r15 = r14 % r15
            int r6 = r15 + 1
            if (r15 != r3) goto L65
            if (r6 != r4) goto L65
            return r13
        L65:
            if (r2 == 0) goto L7c
            int r16 = java.lang.Math.max(r15, r3)
            int r17 = java.lang.Math.min(r6, r4)
            int r7 = r17 - r16
            if (r7 > r12) goto L7c
            if (r7 != r12) goto L8b
            if (r15 <= r9) goto L79
            r7 = 1
            goto L7a
        L79:
            r7 = 0
        L7a:
            if (r11 != r7) goto L8b
        L7c:
            int r2 = r0.b
            int r14 = r14 % r2
            int r2 = java.lang.Math.min(r6, r4)
            int r6 = java.lang.Math.max(r15, r3)
            int r12 = r2 - r6
            r2 = r13
            r9 = r14
        L8b:
            int r5 = r5 + r10
            goto L48
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.CustomGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.g, vph):android.view.View");
    }

    @Override // androidx.recyclerview.widget.f
    public final void onInitializeAccessibilityNodeInfoForItem(g gVar, vph vphVar, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof lph)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        lph lphVar = (lph) layoutParams;
        int iG = G(lphVar.a.getLayoutPosition(), gVar, vphVar);
        int i = this.mOrientation;
        i iVar = lphVar.a;
        if (i == 0) {
            accessibilityNodeInfoCompat.w(tw2.r(iVar.getLayoutPosition() % this.b, 1, iG, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.w(tw2.r(iG, 1, iVar.getLayoutPosition() % this.b, 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final void onLayoutCompleted(vph vphVar) {
        super.onLayoutCompleted(vphVar);
        this.a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        L();
        F();
        return super.scrollHorizontallyBy(i, gVar, vphVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final int scrollVerticallyBy(int i, g gVar, vph vphVar) {
        L();
        F();
        return super.scrollVerticallyBy(i, gVar, vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = f.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            fr[] frVarArr = this.c;
            iChooseSize = f.chooseSize(i, frVarArr[frVarArr.length - 1].c + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = f.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            fr[] frVarArr2 = this.c;
            iChooseSize2 = f.chooseSize(i2, frVarArr2[frVarArr2.length - 1].c + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            yt7.k("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }
}
