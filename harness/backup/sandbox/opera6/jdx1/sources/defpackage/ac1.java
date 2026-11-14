package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.RemoteViews;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.ImageDownloadCallback;

/* loaded from: classes.dex */
public final class ac1 implements ImageDownloadCallback {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public ac1(Toolbar toolbar, i35 i35Var) {
        this.c = toolbar;
        this.d = i35Var;
        this.e = toolbar.o().findItem(2131363498);
        u7 u7Var = new u7(this, (byte) 27);
        q9n.e(toolbar, u7Var);
        u7Var.a(toolbar);
    }

    public ac1(CharSequence charSequence) {
        this.c = charSequence;
    }

    public ac1(CharSequence charSequence, CharSequence charSequence2, int i, int i2, View.OnClickListener onClickListener) {
        this.c = charSequence;
        this.d = charSequence2;
        this.a = i;
        this.b = i2;
        this.e = onClickListener;
    }

    public final void a(List list, List list2, int i) {
        if (i != this.b) {
            return;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        double d = 0.0d;
        Bitmap bitmap = null;
        while (it.hasNext() && it2.hasNext()) {
            Bitmap bitmap2 = (Bitmap) it.next();
            double dF = f((Rect) it2.next());
            if (d < dF) {
                bitmap = bitmap2;
                d = dF;
            }
        }
        ard ardVar = (ard) this.d;
        ardVar.getClass();
        ardVar.e = ipe.r(bitmap);
        ardVar.h();
        this.b = -1;
        this.d = null;
    }

    public final int b(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length << 1;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            b82.e(0, 0, 14, (int[]) this.d, iArr);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.b >= length2) {
            int i4 = length2 << 1;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            b82.e(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.b;
        this.b = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (Intrinsics.c(jArr3[i8], j) <= 0) {
                break;
            }
            i(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final i16 c() {
        Context context = (Context) this.c;
        ua7 ua7Var = (ua7) this.d;
        l1f l1fVar = (l1f) ua7Var.b;
        if (Build.VERSION.SDK_INT >= 31) {
            if (this.b > 0) {
                Resources resources = context.getResources();
                int i = this.b;
                ua7Var.O(resources.getQuantityString(2131886161, i, Integer.valueOf(i)));
                int i2 = this.b;
                int i3 = this.a;
                l1fVar.o = i2;
                l1fVar.p = i3;
                l1fVar.q = false;
            } else {
                ua7Var.O("");
                l1fVar.o = 0;
                l1fVar.p = 0;
                l1fVar.q = true;
            }
            return ua7Var.l();
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131558848);
        this.e = remoteViews;
        remoteViews.setTextViewText(2131362869, context.getResources().getString(2132017591));
        int i4 = this.b;
        RemoteViews remoteViews2 = (RemoteViews) this.e;
        if (i4 > 0) {
            Resources resources2 = context.getResources();
            int i5 = this.b;
            remoteViews2.setTextViewText(2131363485, resources2.getQuantityString(2131886161, i5, Integer.valueOf(i5)));
            ((RemoteViews) this.e).setProgressBar(2131363061, this.b, this.a, false);
        } else {
            remoteViews2.setTextViewText(2131363485, "");
            ((RemoteViews) this.e).setProgressBar(2131363061, 0, 0, true);
        }
        ((RemoteViews) this.e).setImageViewResource(2131362594, 2131231164);
        l1fVar.B = (RemoteViews) this.e;
        return ua7Var.l();
    }

    public final int d(int[] iArr, int i, int i2, int i3, vxd vxdVar) {
        int iE;
        kam kamVar;
        int i4 = iArr[i];
        if (i4 >= this.a || (kamVar = ((kam[]) this.d)[i4]) == null) {
            ((wxd) this.c).d(vxdVar, i4);
            iE = vxdVar.e();
        } else {
            iE = kamVar.a().e();
        }
        if (iE == i3) {
            i++;
        }
        int iD = 1;
        if (i >= i2) {
            return 1;
        }
        int i5 = i;
        while (i5 < i2) {
            int iE2 = this.e(iArr[i5], i3, vxdVar);
            int i6 = iD + 1;
            int i7 = i5;
            while (i7 < i2 && this.e(iArr[i7], i3, vxdVar) == iE2) {
                i7++;
            }
            ac1 ac1Var = this;
            iD = i6 + ac1Var.d(iArr, i5, i7, i3 + 1, vxdVar);
            this = ac1Var;
            i5 = i7;
        }
        return iD;
    }

    public final int e(int i, int i2, vxd vxdVar) {
        kam kamVar;
        if (i < this.a && (kamVar = ((kam[]) this.d)[i]) != null) {
            return kamVar.a().d(i2);
        }
        ((wxd) this.c).d(vxdVar, i);
        return vxdVar.d(i2);
    }

    public final double f(Rect rect) {
        int iMax = Math.max(rect.width(), rect.height());
        double d = 0.8d;
        if (iMax != 0) {
            if (iMax < 114) {
                d = 0.0d;
            } else {
                int i = this.a;
                d = iMax <= i ? (((iMax - 114) * 0.8d) / (i - 114)) + 0.2d : (i * 1.0d) / iMax;
            }
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        return (Math.min(iWidth, iHeight) / Math.max(iWidth, iHeight)) * d;
    }

    public final float g(TypedArray typedArray, String str, int i, float f) {
        if (xih.n((XmlResourceParser) this.c, str)) {
            f = typedArray.getFloat(i, f);
        }
        j(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(int[] r17, int r18, int r19, int r20, int r21, defpackage.vxd r22, defpackage.p79 r23) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac1.h(int[], int, int, int, int, vxd, p79):int");
    }

    public final void i(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public final void j(int i) {
        this.a |= i;
    }

    public final void k() {
        MenuItem menuItem = (MenuItem) this.e;
        menuItem.setVisible(true);
        int i = this.b;
        if (i == this.a) {
            menuItem.setIcon(2131232235);
            menuItem.setTitle(2132018543);
        } else if (i == 0) {
            menuItem.setIcon(2131232236);
            menuItem.setTitle(2132021029);
        } else {
            menuItem.setIcon(2131232237);
            menuItem.setTitle(2132018543);
        }
        l();
    }

    public final void l() {
        Drawable icon = ((MenuItem) this.e).getIcon();
        if (icon == null) {
            return;
        }
        int i = this.b;
        int i2 = this.a;
        Toolbar toolbar = (Toolbar) this.c;
        icon.setColorFilter(new PorterDuffColorFilter(i == i2 ? f03.u(2130969108, toolbar.getContext(), 2131099825).getDefaultColor() : f03.v(toolbar.getContext()).getDefaultColor(), PorterDuff.Mode.SRC_IN));
    }
}
