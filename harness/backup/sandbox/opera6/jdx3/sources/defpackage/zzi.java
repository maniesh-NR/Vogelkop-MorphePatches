package defpackage;

import J.N;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import defpackage.zzi;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class zzi implements wyi {
    public final long a;
    public final a0j b;
    public final huh c;
    public final WebContents d;
    public boolean e;

    public zzi(WebContents webContents, huh huhVar, xr5 xr5Var) {
        this.d = webContents;
        this.c = huhVar;
        Resources resources = xr5Var.getContext().getResources();
        this.a = N.MVHplMws(webContents, resources.getDimensionPixelSize(2131167433), resources.getDimensionPixelSize(2131167432));
        a0j a0jVar = new a0j(xr5Var.getContext());
        this.b = a0jVar;
        xr5Var.addView(a0jVar);
    }

    public final void a(int i, float f, float f2) {
        WebContents webContents = this.d;
        long j = this.a;
        if (i == 1) {
            if (this.e) {
                N.MQwJK6f8(j, webContents, new Object() { // from class: com.opera.android.browser.selection_zoom.SelectionZoomController$BitmapCallback
                    public final void run(@Nullable Bitmap bitmap, int i2, int i3) {
                        zzi zziVar = this.a;
                        a0j a0jVar = zziVar.b;
                        if (zziVar.e) {
                            a0jVar.b = bitmap;
                            Bitmap bitmap2 = (Bitmap) a0jVar.b;
                            a0jVar.h = new RectF(0.0f, 0.0f, bitmap2 == null ? 0 : bitmap2.getWidth(), ((Bitmap) a0jVar.b) == null ? 0 : r3.getHeight());
                            Paint paint = (Paint) a0jVar.f;
                            paint.setColor(-1);
                            paint.setAntiAlias(true);
                            huh huhVar = zziVar.c;
                            float f3 = huhVar.j;
                            int i4 = (int) (i2 * f3);
                            int i5 = ((int) (f3 * i3)) + ((int) huhVar.k);
                            Point point = (Point) a0jVar.e;
                            point.x = i4;
                            point.y = i5;
                            a0jVar.setVisibility(0);
                            a0jVar.invalidate();
                        }
                    }
                });
            }
        } else if (i == 3) {
            this.e = true;
            N.MQwJK6f8(j, webContents, new Object() { // from class: com.opera.android.browser.selection_zoom.SelectionZoomController$BitmapCallback
                public final void run(@Nullable Bitmap bitmap, int i2, int i3) {
                    zzi zziVar = this.a;
                    a0j a0jVar = zziVar.b;
                    if (zziVar.e) {
                        a0jVar.b = bitmap;
                        Bitmap bitmap2 = (Bitmap) a0jVar.b;
                        a0jVar.h = new RectF(0.0f, 0.0f, bitmap2 == null ? 0 : bitmap2.getWidth(), ((Bitmap) a0jVar.b) == null ? 0 : r3.getHeight());
                        Paint paint = (Paint) a0jVar.f;
                        paint.setColor(-1);
                        paint.setAntiAlias(true);
                        huh huhVar = zziVar.c;
                        float f3 = huhVar.j;
                        int i4 = (int) (i2 * f3);
                        int i5 = ((int) (f3 * i3)) + ((int) huhVar.k);
                        Point point = (Point) a0jVar.e;
                        point.x = i4;
                        point.y = i5;
                        a0jVar.setVisibility(0);
                        a0jVar.invalidate();
                    }
                }
            });
        } else if (i == 4) {
            this.e = false;
            this.b.setVisibility(4);
        }
    }

    public final void b() {
    }

    public final void c(ix5 ix5Var) {
    }

    public final boolean e(boolean z) {
        return false;
    }

    public final void g(String str) {
    }
}
