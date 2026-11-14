package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.window.OnBackInvokedDispatcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.itd;
import defpackage.lsk;
import defpackage.ltd;
import defpackage.mud;
import defpackage.n5n;
import defpackage.n9k;
import defpackage.nbi;
import defpackage.ne;
import defpackage.ntd;
import defpackage.psl;
import defpackage.ptd;
import defpackage.qe;
import defpackage.qsl;
import defpackage.r5n;
import defpackage.rsl;
import defpackage.rtl;
import defpackage.t8;
import defpackage.tsl;
import defpackage.wi;
import defpackage.yq1;
import defpackage.zhh;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements ltd {
    public boolean A;
    public boolean B;
    public final ArrayList C;
    public final ArrayList D;
    public final int[] E;
    public final ntd F;
    public ArrayList G;
    public ssl H;
    public final rii I;
    public rtl J;
    public ne K;
    public qsl L;
    public n9k M;
    public dcl N;
    public wi O;
    public OnBackInvokedDispatcher P;
    public boolean Q;
    public final ssi R;
    public qe a;
    public yq1 b;
    public yq1 c;
    public AppCompatImageView d;
    public final Drawable e;
    public final CharSequence f;
    public AppCompatImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public final int m;
    private ImageButton mNavButtonView;
    public final int n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public nbi s;
    public final int t;
    public final int u;
    public final int v;
    public CharSequence w;
    public CharSequence x;
    public ColorStateList y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, 2130971164);
        this.v = 8388627;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new int[2];
        this.F = new ntd(new psl(this, (byte) 1));
        this.G = new ArrayList();
        this.I = new rii(this, (byte) 12);
        this.R = new ssi(this, (byte) 12);
        Context context2 = getContext();
        int[] iArr = zhh.z;
        ghf ghfVarH = ghf.H(2130971164, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context, iArr, attributeSet, typedArray, 2130971164, 0);
        TypedArray typedArray2 = (TypedArray) ghfVarH.c;
        this.k = typedArray2.getResourceId(28, 0);
        this.l = typedArray2.getResourceId(19, 0);
        this.v = typedArray2.getInteger(0, 8388627);
        this.m = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.q = dimensionPixelOffset;
        this.p = dimensionPixelOffset;
        this.o = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.o = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.p = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.q = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.r = dimensionPixelOffset5;
        }
        this.n = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        d();
        nbi nbiVar = this.s;
        nbiVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            nbiVar.e = dimensionPixelSize;
            nbiVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            nbiVar.f = dimensionPixelSize2;
            nbiVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            nbiVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.t = typedArray2.getDimensionPixelOffset(10, LinearLayoutManager.INVALID_OFFSET);
        this.u = typedArray2.getDimensionPixelOffset(6, LinearLayoutManager.INVALID_OFFSET);
        this.e = ghfVarH.t(4);
        this.f = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            D(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            C(text2);
        }
        this.i = getContext();
        int resourceId = typedArray2.getResourceId(17, 0);
        if (this.j != resourceId) {
            this.j = resourceId;
            if (resourceId == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), resourceId);
            }
        }
        Drawable drawableT = ghfVarH.t(16);
        if (drawableT != null) {
            A(drawableT);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            z(text3);
        }
        Drawable drawableT2 = ghfVarH.t(11);
        if (drawableT2 != null) {
            y(drawableT2);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            if (!TextUtils.isEmpty(text4) && this.d == null) {
                this.d = new AppCompatImageView(getContext());
            }
            AppCompatImageView appCompatImageView = this.d;
            if (appCompatImageView != null) {
                appCompatImageView.setContentDescription(text4);
            }
        }
        if (typedArray2.hasValue(29)) {
            ColorStateList colorStateListS = ghfVarH.s(29);
            this.y = colorStateListS;
            yq1 yq1Var = this.b;
            if (yq1Var != null) {
                yq1Var.setTextColor(colorStateListS);
            }
        }
        if (typedArray2.hasValue(20)) {
            ColorStateList colorStateListS2 = ghfVarH.s(20);
            this.z = colorStateListS2;
            yq1 yq1Var2 = this.c;
            if (yq1Var2 != null) {
                yq1Var2.setTextColor(colorStateListS2);
            }
        }
        if (typedArray2.hasValue(14)) {
            new lsk(getContext()).inflate(typedArray2.getResourceId(14, 0), o());
        }
        ghfVarH.J();
    }

    public static rsl h() {
        rsl rslVar = new rsl(-2, -2);
        rslVar.b = (byte) 0;
        rslVar.a = 8388627;
        return rslVar;
    }

    public static rsl i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof rsl;
        if (z) {
            rsl rslVar = (rsl) layoutParams;
            rsl rslVar2 = new rsl(rslVar);
            rslVar2.b = (byte) 0;
            rslVar2.b = rslVar.b;
            return rslVar2;
        }
        if (z) {
            rsl rslVar3 = new rsl((rsl) layoutParams);
            rslVar3.b = (byte) 0;
            return rslVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            rsl rslVar4 = new rsl(layoutParams);
            rslVar4.b = (byte) 0;
            return rslVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        rsl rslVar5 = new rsl(marginLayoutParams);
        rslVar5.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) rslVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) rslVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) rslVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) rslVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return rslVar5;
    }

    public static int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void A(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!s(this.mNavButtonView)) {
                b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && s(imageButton)) {
                removeView(this.mNavButtonView);
                this.D.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void B(View.OnClickListener onClickListener) {
        g();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public final void C(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        yq1 yq1Var = this.c;
        if (!zIsEmpty) {
            if (yq1Var == null) {
                Context context = getContext();
                yq1 yq1Var2 = new yq1(context, null);
                this.c = yq1Var2;
                yq1Var2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!s(this.c)) {
                b(this.c, true);
            }
        } else if (yq1Var != null && s(yq1Var)) {
            removeView(this.c);
            this.D.remove(this.c);
        }
        yq1 yq1Var3 = this.c;
        if (yq1Var3 != null) {
            yq1Var3.setText(charSequence);
        }
        this.x = charSequence;
    }

    public final void D(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        yq1 yq1Var = this.b;
        if (!zIsEmpty) {
            if (yq1Var == null) {
                Context context = getContext();
                yq1 yq1Var2 = new yq1(context, null);
                this.b = yq1Var2;
                yq1Var2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.y;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!s(this.b)) {
                b(this.b, true);
            }
        } else if (yq1Var != null && s(yq1Var)) {
            removeView(this.b);
            this.D.remove(this.b);
        }
        yq1 yq1Var3 = this.b;
        if (yq1Var3 != null) {
            yq1Var3.setText(charSequence);
        }
        this.w = charSequence;
    }

    public final boolean E(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean F() {
        ne neVar;
        qe qeVar = this.a;
        return (qeVar == null || (neVar = qeVar.t) == null || !neVar.l()) ? false : true;
    }

    public final void G() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherI = t8.i(this);
            qsl qslVar = this.L;
            byte b = 0;
            boolean z = (qslVar == null || qslVar.b == null || onBackInvokedDispatcherI == null || !isAttachedToWindow() || !this.Q) ? false : true;
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.P;
            if (!z) {
                if (onBackInvokedDispatcher != null) {
                    t8.g0(onBackInvokedDispatcher, this.O);
                    this.P = null;
                    return;
                }
                return;
            }
            if (onBackInvokedDispatcher == null) {
                wi wiVar = this.O;
                if (wiVar == null) {
                    wi wiVar2 = new wi(new psl(this, b), (byte) 5);
                    this.O = wiVar2;
                    wiVar = wiVar2;
                }
                t8.f0(onBackInvokedDispatcherI, wiVar);
                this.P = onBackInvokedDispatcherI;
            }
        }
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                rsl rslVar = (rsl) childAt.getLayoutParams();
                if (rslVar.b == 0 && E(childAt)) {
                    int i3 = rslVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            rsl rslVar2 = (rsl) childAt2.getLayoutParams();
            if (rslVar2.b == 0 && E(childAt2)) {
                int i5 = rslVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // defpackage.ltd
    public final void addMenuProvider(mud mudVar) {
        ntd ntdVar = this.F;
        ntdVar.b.add(mudVar);
        ntdVar.a.run();
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        rsl rslVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (rsl) layoutParams;
        rslVarH.b = (byte) 1;
        if (!z || this.h == null) {
            addView(view, rslVarH);
        } else {
            view.setLayoutParams(rslVarH);
            this.D.add(view);
        }
    }

    public final void c() {
        if (this.g == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, 2130971162);
            this.g = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.e);
            this.g.setContentDescription(this.f);
            rsl rslVarH = h();
            rslVarH.a = (this.m & 112) | 8388611;
            rslVarH.b = (byte) 2;
            this.g.setLayoutParams(rslVarH);
            this.g.setOnClickListener(new ic(this, (byte) 12));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof rsl);
    }

    public final void d() {
        if (this.s == null) {
            nbi nbiVar = new nbi();
            nbiVar.a = 0;
            nbiVar.b = 0;
            nbiVar.c = LinearLayoutManager.INVALID_OFFSET;
            nbiVar.d = LinearLayoutManager.INVALID_OFFSET;
            nbiVar.e = 0;
            nbiVar.f = 0;
            nbiVar.g = false;
            nbiVar.h = false;
            this.s = nbiVar;
        }
    }

    public final void e() {
        f();
        qe qeVar = this.a;
        if (qeVar.p == null) {
            itd itdVarJ = qeVar.j();
            qsl qslVar = this.L;
            if (qslVar == null) {
                qslVar = new qsl(this);
                this.L = qslVar;
            }
            this.a.t.m = true;
            itdVarJ.b(qslVar, this.i);
            G();
        }
    }

    public final void f() {
        if (this.a == null) {
            qe qeVar = new qe(getContext(), null);
            this.a = qeVar;
            int i = this.j;
            if (i != 0) {
                qeVar.r = i;
                if (i == 0) {
                    qeVar.q = qeVar.getContext();
                } else {
                    qeVar.q = new ContextThemeWrapper(qeVar.getContext(), i);
                }
            }
            qe qeVar2 = this.a;
            qeVar2.A = this.I;
            n9k n9kVar = this.M;
            oji ojiVar = new oji(this);
            qeVar2.u = n9kVar;
            qeVar2.v = ojiVar;
            rsl rslVarH = h();
            rslVarH.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(rslVarH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, 2130971162);
            rsl rslVarH = h();
            rslVarH.a = (this.m & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(rslVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        rsl rslVar = new rsl(context, attributeSet);
        rslVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zhh.b);
        rslVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        rslVar.b = (byte) 0;
        return rslVar;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public final int j(int i, View view) {
        rsl rslVar = (rsl) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = rslVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.v & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) rslVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) rslVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) rslVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final int k() {
        itd itdVar;
        qe qeVar = this.a;
        if (qeVar != null && (itdVar = qeVar.p) != null && itdVar.hasVisibleItems()) {
            nbi nbiVar = this.s;
            return Math.max(nbiVar != null ? nbiVar.g ? nbiVar.a : nbiVar.b : 0, Math.max(this.u, 0));
        }
        nbi nbiVar2 = this.s;
        if (nbiVar2 != null) {
            return nbiVar2.g ? nbiVar2.a : nbiVar2.b;
        }
        return 0;
    }

    public final int l() {
        Drawable drawableQ = q();
        nbi nbiVar = this.s;
        if (drawableQ != null) {
            return Math.max(nbiVar != null ? nbiVar.g ? nbiVar.b : nbiVar.a : 0, Math.max(this.t, 0));
        }
        if (nbiVar != null) {
            return nbiVar.g ? nbiVar.b : nbiVar.a;
        }
        return 0;
    }

    public final ArrayList m() {
        ArrayList arrayList = new ArrayList();
        itd itdVarO = o();
        for (int i = 0; i < itdVarO.f.size(); i++) {
            arrayList.add(itdVarO.getItem(i));
        }
        return arrayList;
    }

    public final itd o() {
        e();
        return this.a.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        G();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029f A[LOOP:0: B:120:0x029d->B:121:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b8 A[LOOP:1: B:123:0x02b6->B:124:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9 A[LOOP:2: B:126:0x02d7->B:127:0x02d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0326 A[LOOP:3: B:134:0x0324->B:135:0x0326, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iN;
        int iMax;
        int iCombineMeasuredStates;
        int iN2;
        int i3;
        int iCombineMeasuredStates2;
        int iR;
        int iMax2 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (E(this.mNavButtonView)) {
            x(this.mNavButtonView, i, 0, i2, this.n);
            iN = n(this.mNavButtonView) + this.mNavButtonView.getMeasuredWidth();
            iMax = Math.max(0, r(this.mNavButtonView) + this.mNavButtonView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            iN = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (E(this.g)) {
            x(this.g, i, 0, i2, this.n);
            iN = n(this.g) + this.g.getMeasuredWidth();
            iMax = Math.max(iMax, r(this.g) + this.g.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        int iL = l();
        int iMax3 = Math.max(iL, iN);
        int iMax4 = Math.max(0, iL - iN);
        Object[] objArr2 = objArr;
        int[] iArr = this.E;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (E(this.a)) {
            x(this.a, i, iMax3, i2, this.n);
            iN2 = n(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, r(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iN2 = 0;
        }
        int iK = k();
        int iMax5 = iMax3 + Math.max(iK, iN2);
        iArr[c] = Math.max(0, iK - iN2);
        if (E(this.h)) {
            iMax5 += w(this.h, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, r(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        if (E(this.d)) {
            iMax5 += w(this.d, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, r(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((rsl) childAt.getLayoutParams()).b == 0 && E(childAt)) {
                iMax5 += w(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, r(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.q + this.r;
        int i7 = this.o + this.p;
        if (E(this.b)) {
            w(this.b, i, i5 + i7, i2, i6, iArr);
            i3 = i6;
            iMax2 = n(this.b) + this.b.getMeasuredWidth();
            int measuredHeight = this.b.getMeasuredHeight() + r(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iR = measuredHeight;
        } else {
            i3 = i6;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iR = 0;
        }
        if (E(this.c)) {
            iMax2 = Math.max(iMax2, w(this.c, i, i5 + i7, i2, iR + i3, iArr));
            iR += r(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        if (E(this.b) || E(this.c)) {
            iR += i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(iMax, iR), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof tsl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tsl tslVar = (tsl) parcelable;
        super.onRestoreInstanceState(tslVar.a);
        qe qeVar = this.a;
        itd itdVar = qeVar != null ? qeVar.p : null;
        int i = tslVar.c;
        if (i != 0 && this.L != null && itdVar != null && (menuItemFindItem = itdVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (tslVar.d) {
            ssi ssiVar = this.R;
            removeCallbacks(ssiVar);
            post(ssiVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        nbi nbiVar = this.s;
        boolean z = i == 1;
        if (z == nbiVar.g) {
            return;
        }
        nbiVar.g = z;
        if (!nbiVar.h) {
            nbiVar.a = nbiVar.e;
            nbiVar.b = nbiVar.f;
            return;
        }
        if (z) {
            int i2 = nbiVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = nbiVar.e;
            }
            nbiVar.a = i2;
            int i3 = nbiVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = nbiVar.f;
            }
            nbiVar.b = i3;
            return;
        }
        int i4 = nbiVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = nbiVar.e;
        }
        nbiVar.a = i4;
        int i5 = nbiVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = nbiVar.f;
        }
        nbiVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ptd ptdVar;
        tsl tslVar = new tsl(super.onSaveInstanceState());
        qsl qslVar = this.L;
        if (qslVar != null && (ptdVar = qslVar.b) != null) {
            tslVar.c = ptdVar.a;
        }
        tslVar.d = t();
        return tslVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = false;
        }
        if (!this.A) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.A = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.A = false;
        return true;
    }

    public final CharSequence p() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final Drawable q() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    @Override // defpackage.ltd
    public final void removeMenuProvider(mud mudVar) {
        this.F.b(mudVar);
    }

    public final boolean s(View view) {
        return view.getParent() == this || this.D.contains(view);
    }

    public final boolean t() {
        ne neVar;
        qe qeVar = this.a;
        return (qeVar == null || (neVar = qeVar.t) == null || !neVar.k()) ? false : true;
    }

    public final int u(View view, int i, int i2, int[] iArr) {
        rsl rslVar = (rsl) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) rslVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) rslVar).rightMargin + iMax;
    }

    public final int v(View view, int i, int i2, int[] iArr) {
        rsl rslVar = (rsl) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) rslVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) rslVar).leftMargin);
    }

    public final int w(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void x(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void y(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.d;
        if (drawable != null) {
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(getContext());
                this.d = appCompatImageView;
            }
            if (!s(appCompatImageView)) {
                b(this.d, true);
            }
        } else if (appCompatImageView != null && s(appCompatImageView)) {
            removeView(this.d);
            this.D.remove(this.d);
        }
        AppCompatImageView appCompatImageView2 = this.d;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public final void z(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.mNavButtonView.setTooltipText(charSequence);
        }
    }
}
