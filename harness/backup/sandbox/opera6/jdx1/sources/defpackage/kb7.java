package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kb7 {
    public static final a36 g = new a36();
    public static final Size h = new Size(1920, 1080);
    public static final Size i = new Size(320, 240);
    public static final Size j = new Size(640, 480);
    public static volatile kb7 k;
    public final i4d a = new i4d();
    public final d06 b = new d06((byte) 10);
    public final Object c = new Object();
    public volatile Display[] d;
    public final DisplayManager e;
    public volatile Size f;

    public kb7(Context context) {
        hb7 hb7Var = new hb7(this, (byte) 1);
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(hb7Var, new Handler(Looper.getMainLooper()));
        this.e = displayManager;
    }

    public final Size a() {
        Size sizeE;
        Point point = new Point();
        b(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (qpj.a(size) < qpj.a(i)) {
            Size size2 = ((SmallDisplaySizeQuirk) this.b.a) != null ? (Size) SmallDisplaySizeQuirk.a.get(Build.MODEL.toUpperCase(Locale.ROOT)) : null;
            if (size2 == null) {
                size2 = j;
            }
            size = size2;
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        Size size3 = h;
        if (qpj.a(size3) < qpj.a(size)) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.a.b) != null && (sizeE = ExtraCroppingQuirk.e(htk.a)) != null) {
            if (sizeE.getHeight() * sizeE.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeE;
            }
        }
        return size;
    }

    public final Display b(boolean z) {
        Display[] displays;
        int i2;
        synchronized (this.c) {
            displays = this.d;
            if (displays == null) {
                displays = this.e.getDisplays();
                this.d = displays;
            }
        }
        if (displays.length == 1) {
            return displays[0];
        }
        int i3 = -1;
        int i4 = -1;
        Display display = null;
        Display display2 = null;
        for (Display display3 : displays) {
            Point point = new Point();
            display3.getRealSize(point);
            int i5 = point.x * point.y;
            if (i5 > i3) {
                display = display3;
                i3 = i5;
            }
            if (display3.getState() != 1 && (i2 = point.x * point.y) > i4) {
                display2 = display3;
                i4 = i2;
            }
        }
        if (z && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        n57.e("No displays found from ", Arrays.toString(displays), 33);
        return null;
    }

    public final Size c() {
        Size size;
        synchronized (this.c) {
            if (this.f != null) {
                size = this.f;
            } else {
                this.f = a();
                size = this.f;
            }
        }
        return size;
    }
}
