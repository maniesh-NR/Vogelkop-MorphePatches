package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class smd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;

    public smd(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iM;
        HashMap map;
        HashMap map2;
        Bitmap bitmap;
        d dVar = this.b;
        dVar.u.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.g0) {
            dVar.h0 = true;
            return;
        }
        cod codVar = dVar.j;
        int i = dVar.B.getLayoutParams().height;
        d.p(-1, dVar.B);
        dVar.v(dVar.j());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.p(i, dVar.B);
        if (!(dVar.v.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.v.getDrawable()).getBitmap()) == null) {
            iM = 0;
        } else {
            iM = dVar.m(bitmap.getWidth(), bitmap.getHeight());
            dVar.v.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iN = dVar.n(dVar.j());
        int size = dVar.H.size();
        int size2 = dVar.o() ? Collections.unmodifiableList(codVar.v).size() * dVar.P : 0;
        if (size > 0) {
            size2 += dVar.R;
        }
        int iMin = Math.min(size2, dVar.Q);
        if (!dVar.f0) {
            iMin = 0;
        }
        int iMax = Math.max(iM, iMin) + iN;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (dVar.t.getMeasuredHeight() - dVar.u.getMeasuredHeight());
        if (iM <= 0 || iMax > iHeight) {
            if (dVar.B.getMeasuredHeight() + dVar.F.getLayoutParams().height >= dVar.u.getMeasuredHeight()) {
                dVar.v.setVisibility(8);
            }
            iMax = iMin + iN;
            iM = 0;
        } else {
            dVar.v.setVisibility(0);
            d.p(iM, dVar.v);
        }
        if (!dVar.j() || iMax > iHeight) {
            dVar.C.setVisibility(8);
        } else {
            dVar.C.setVisibility(0);
        }
        dVar.v(dVar.C.getVisibility() == 0);
        int iN2 = dVar.n(dVar.C.getVisibility() == 0);
        int iMax2 = Math.max(iM, iMin) + iN2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        dVar.B.clearAnimation();
        dVar.F.clearAnimation();
        dVar.u.clearAnimation();
        LinearLayout linearLayout = dVar.B;
        boolean z = this.a;
        if (z) {
            dVar.h(iN2, linearLayout);
            dVar.h(iMin, dVar.F);
            dVar.h(iHeight, dVar.u);
        } else {
            d.p(iN2, linearLayout);
            d.p(iMin, dVar.F);
            d.p(iHeight, dVar.u);
        }
        d.p(rect.height(), dVar.s);
        List listUnmodifiableList = Collections.unmodifiableList(codVar.v);
        boolean zIsEmpty = listUnmodifiableList.isEmpty();
        ArrayList arrayList = dVar.H;
        if (zIsEmpty) {
            arrayList.clear();
            dVar.G.notifyDataSetChanged();
            return;
        }
        if (new HashSet(arrayList).equals(new HashSet(listUnmodifiableList))) {
            dVar.G.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = dVar.F;
            c cVar = dVar.G;
            map = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                Object item = cVar.getItem(firstVisiblePosition + i2);
                View childAt = overlayListView.getChildAt(i2);
                map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            map = null;
        }
        if (z) {
            Context context = dVar.k;
            OverlayListView overlayListView2 = dVar.F;
            c cVar2 = dVar.G;
            map2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                Object item2 = cVar2.getItem(firstVisiblePosition2 + i3);
                View childAt2 = overlayListView2.getChildAt(i3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(bitmapCreateBitmap));
                map2.put(item2, new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
            }
        } else {
            map2 = null;
        }
        ArrayList arrayList2 = dVar.H;
        HashSet hashSet = new HashSet(listUnmodifiableList);
        hashSet.removeAll(arrayList2);
        dVar.I = hashSet;
        HashSet hashSet2 = new HashSet(dVar.H);
        hashSet2.removeAll(listUnmodifiableList);
        dVar.J = hashSet2;
        dVar.H.addAll(0, dVar.I);
        dVar.H.removeAll(dVar.J);
        dVar.G.notifyDataSetChanged();
        if (z && dVar.f0) {
            if (dVar.J.size() + dVar.I.size() > 0) {
                dVar.F.setEnabled(false);
                dVar.F.requestLayout();
                dVar.g0 = true;
                dVar.F.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, map, map2));
                return;
            }
        }
        dVar.I = null;
        dVar.J = null;
    }
}
