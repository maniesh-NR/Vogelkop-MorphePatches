package com.opera.android.browser.chromium;

import J.N;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.ckf;
import defpackage.hs8;
import defpackage.lb4;
import defpackage.qt6;
import defpackage.tw2;
import defpackage.tz4;
import defpackage.yy4;
import defpackage.zy4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public class ChromiumContainerView extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final ckf a;
    public final zy4 b;
    public qt6 c;
    public yy4 d;
    public ChromiumContent e;
    public int f;
    public int g;
    public boolean h;

    public ChromiumContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ckf ckfVar = new ckf(this);
        ckfVar.k = new ArrayList();
        ckfVar.l = new ArrayList();
        this.a = ckfVar;
        this.b = new zy4(new lb4(this, (byte) 12));
        tw2 tw2Var = new tw2((Object) this, (byte) 19);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(this, tw2Var);
    }

    public final void a(int i2) {
        boolean z = i2 > 0;
        if (z || this.h) {
            this.h = z;
            ChromiumContent chromiumContent = this.e;
            if (chromiumContent == null || chromiumContent.h()) {
                return;
            }
            if (!z) {
                ChromiumContent chromiumContent2 = this.e;
                if (chromiumContent2.h()) {
                    return;
                }
                N.MwcFF$jM(chromiumContent2.e(), 0, 0, 0, 0);
                return;
            }
            Rect rect = new Rect();
            getRootView().getWindowVisibleDisplayFrame(rect);
            ChromiumContent chromiumContent3 = this.e;
            int i3 = rect.left;
            int i4 = rect.top;
            int width = getWidth();
            if (chromiumContent3.h()) {
                return;
            }
            N.MwcFF$jM(chromiumContent3.e(), i3, i4, width, i2);
        }
    }

    public final void b(ChromiumContent chromiumContent) {
        ktn ktnVar = oup.c;
        qt6 qt6Var = this.c;
        if (qt6Var != null) {
            ((GestureListenerManagerImpl) qt6Var.c).h((tz4) qt6Var.d);
            qt6Var.d = null;
            qt6Var.c = null;
            ((xr5) qt6Var.f).setOnTouchListener(null);
            this.c = null;
        }
        ChromiumContent chromiumContent2 = this.e;
        zy4 zy4Var = this.b;
        if (chromiumContent2 != null) {
            yy4 yy4Var = this.d;
            if (yy4Var != null) {
                yy4Var.M(chromiumContent2);
            }
            this.h = false;
            this.e.y(zy4Var);
            WebContents webContentsF = this.e.f();
            if (webContentsF != null) {
                LongSparseArray longSparseArray = ImeAdapterImpl.E;
                webContentsF.X(ImeAdapterImpl.class, ktnVar).h.remove(zy4Var);
            }
        }
        this.e = chromiumContent;
        ckf ckfVar = this.a;
        if (chromiumContent == null) {
            ckfVar.c(null);
            return;
        }
        WebContents webContentsE = chromiumContent.e();
        xr5 xr5Var = chromiumContent.J;
        qt6 qt6Var2 = new qt6();
        qt6Var2.e = zy4Var;
        qt6Var2.c = GestureListenerManagerImpl.e(webContentsE);
        qt6Var2.f = xr5Var;
        xr5Var.setOnTouchListener(new hs8(qt6Var2, (byte) 4));
        tz4 tz4Var = new tz4(qt6Var2, (byte) 3);
        qt6Var2.d = tz4Var;
        ((GestureListenerManagerImpl) qt6Var2.c).b(tz4Var, 2);
        this.c = qt6Var2;
        ckfVar.c(webContentsE);
        chromiumContent.k(zy4Var);
        zy4Var.K(webContentsE.x0());
        chromiumContent.A(zy4Var.Q());
        LongSparseArray longSparseArray2 = ImeAdapterImpl.E;
        ((ImeAdapterImpl) webContentsE.X(ImeAdapterImpl.class, ktnVar)).h.add(zy4Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, this.f, getWidth(), getHeight() - this.g);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        addView((View) this.a, 0, new FrameLayout.LayoutParams(-1, -1));
    }
}
