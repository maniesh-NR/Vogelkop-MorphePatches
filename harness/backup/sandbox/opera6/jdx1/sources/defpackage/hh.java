package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.ShareActionProvider;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hh extends ViewGroup {
    public final fh a;
    public final gh b;
    public final View c;
    public final Drawable d;
    public final FrameLayout e;
    public final ImageView f;
    public final FrameLayout g;
    public final int h;
    public ShareActionProvider i;
    public final ch j;
    public final dh k;
    public ListPopupWindow l;
    public boolean m;
    public final int n;
    public boolean o;

    public hh(Context context) {
        super(context, null, 0);
        byte b = 0;
        this.j = new ch(this, b);
        this.k = new dh(this, b);
        this.n = 4;
        int[] iArr = zhh.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, 0);
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        this.n = typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(2131558406, (ViewGroup) this, true);
        gh ghVar = new gh(this);
        this.b = ghVar;
        View viewFindViewById = findViewById(2131361902);
        this.c = viewFindViewById;
        this.d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(2131362504);
        this.g = frameLayout;
        frameLayout.setOnClickListener(ghVar);
        frameLayout.setOnLongClickListener(ghVar);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(2131362815);
        frameLayout2.setOnClickListener(ghVar);
        frameLayout2.setAccessibilityDelegate(new eh());
        frameLayout2.setOnTouchListener(new ke(this, frameLayout2, (byte) 2));
        this.e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(2131363185);
        this.f = imageView;
        imageView.setImageDrawable(drawable);
        fh fhVar = new fh(this);
        this.a = fhVar;
        fhVar.registerDataSetObserver(new ch(this, (byte) 1));
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
    }

    public final void a() {
        if (c()) {
            b().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.k);
            }
        }
    }

    public final ListPopupWindow b() {
        if (this.l == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.l = listPopupWindow;
            listPopupWindow.k(this.a);
            ListPopupWindow listPopupWindow2 = this.l;
            listPopupWindow2.q = this;
            listPopupWindow2.q(true);
            ListPopupWindow listPopupWindow3 = this.l;
            gh ghVar = this.b;
            listPopupWindow3.r = ghVar;
            listPopupWindow3.B.setOnDismissListener(ghVar);
        }
        return this.l;
    }

    public final boolean c() {
        return b().B.isShowing();
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public final void d(int i) {
        fh fhVar = this.a;
        if (fhVar.a == null) {
            qp2.n("No data model. Did you call #setDataModel?");
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.k);
        ?? r1 = this.g.getVisibility() == 0 ? 1 : 0;
        int iD = fhVar.a.d();
        if (i == Integer.MAX_VALUE || iD <= i + r1) {
            if (fhVar.e) {
                fhVar.e = false;
                fhVar.notifyDataSetChanged();
            }
            if (fhVar.b != i) {
                fhVar.b = i;
                fhVar.notifyDataSetChanged();
            }
        } else {
            if (!fhVar.e) {
                fhVar.e = true;
                fhVar.notifyDataSetChanged();
            }
            int i2 = i - 1;
            if (fhVar.b != i2) {
                fhVar.b = i2;
                fhVar.notifyDataSetChanged();
            }
        }
        ListPopupWindow listPopupWindowB = b();
        if (listPopupWindowB.B.isShowing()) {
            return;
        }
        if (this.m || r1 == 0) {
            if (!fhVar.c || fhVar.d != r1) {
                fhVar.c = true;
                fhVar.d = r1;
                fhVar.notifyDataSetChanged();
            }
        } else if (fhVar.c || fhVar.d) {
            fhVar.c = false;
            fhVar.d = false;
            fhVar.notifyDataSetChanged();
        }
        int i3 = fhVar.b;
        fhVar.b = Integer.MAX_VALUE;
        int count = fhVar.getCount();
        int iMax = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            view = fhVar.getView(i4, view, null);
            view.measure(0, 0);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        fhVar.b = i3;
        listPopupWindowB.o(Math.min(iMax, this.h));
        listPopupWindowB.show();
        ShareActionProvider shareActionProvider = this.i;
        if (shareActionProvider != null) {
            shareActionProvider.j(true);
        }
        listPopupWindowB.c.setContentDescription(getContext().getString(2132017158));
        listPopupWindowB.c.setSelector(new ColorDrawable(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bh bhVar = this.a.a;
        if (bhVar != null) {
            bhVar.registerObserver(this.j);
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bh bhVar = this.a.a;
        if (bhVar != null) {
            bhVar.unregisterObserver(this.j);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.k);
        }
        if (c()) {
            a();
        }
        this.o = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
        if (c()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.c;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
