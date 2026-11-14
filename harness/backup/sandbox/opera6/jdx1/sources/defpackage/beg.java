package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DeviceProductInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import org.chromium.base.CommandLine;
import org.chromium.base.DeviceInfo;

/* loaded from: classes.dex */
public final class beg extends fb7 {
    public static final boolean D;
    public static Float E;
    public final Display A;
    public RectF B;
    public pv1 C;
    public final Context x;
    public final WindowManager y;
    public final it5 z;

    static {
        D = Build.VERSION.SDK_INT >= 31;
    }

    public beg(Display display, RectF rectF) throws Resources.NotFoundException, NumberFormatException {
        super(display.getDisplayId());
        if (D) {
            Context context = t8.a;
            tgk tgkVarH = tgk.h();
            try {
                Context contextCreateWindowContext = context.createWindowContext(display, 2, null);
                this.x = contextCreateWindowContext;
                tgkVarH.close();
                it5 it5Var = new it5(this, (byte) 2);
                this.z = it5Var;
                contextCreateWindowContext.registerComponentCallbacks(it5Var);
                this.y = (WindowManager) contextCreateWindowContext.getSystemService(WindowManager.class);
                display = contextCreateWindowContext.getDisplay();
                this.A = display;
                this.B = rectF;
                i();
            } catch (Throwable th) {
                try {
                    tgkVarH.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = display;
            j(display);
        }
        if (Build.VERSION.SDK_INT < 34 || !display.isHdrSdrRatioAvailable()) {
            this.C = null;
            return;
        }
        pv1 pv1Var = new pv1(this, (byte) 5);
        this.C = pv1Var;
        display.registerHdrSdrRatioChangedListener(new bx1((byte) 4), pv1Var);
    }

    public static float d() {
        float fFloatValue;
        Float fValueOf = E;
        if (fValueOf == null) {
            String strB = CommandLine.d.b("force-device-scale-factor");
            float f = 0.0f;
            if (strB != null) {
                try {
                    fFloatValue = Float.valueOf(strB).floatValue();
                } catch (NumberFormatException unused) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue <= 0.0f) {
                    Locale locale = Locale.US;
                } else {
                    f = fFloatValue;
                }
            }
            fValueOf = Float.valueOf(f);
            E = fValueOf;
        }
        return fValueOf.floatValue();
    }

    public static Float e(Display display) {
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        return Float.valueOf(display.getHdrSdrRatio());
    }

    public static boolean f(Display display) {
        return Build.VERSION.SDK_INT >= 34 && display.isHdr() && display.isHdrSdrRatioAvailable();
    }

    public final void g() {
        Consumer<Display> consumer;
        if (D) {
            this.x.unregisterComponentCallbacks(this.z);
        }
        if (Build.VERSION.SDK_INT < 34 || (consumer = this.C) == null) {
            return;
        }
        this.A.unregisterHdrSdrRatioChangedListener(consumer);
        this.C = null;
    }

    public final void h(Rect rect, Rect rect2, int i, int i2, float f, float f2, float f3, Display display) {
        Display.Mode mode;
        Display display2;
        db7 db7Var;
        DeviceProductInfo deviceProductInfo;
        boolean zIsWideColorGamut = display.isWideColorGamut();
        try {
            mode = display.getMode();
        } catch (Exception unused) {
            mode = null;
        }
        Display.Mode[] supportedModes = display.getSupportedModes();
        List listAsList = (supportedModes == null || supportedModes.length <= 0) ? null : Arrays.asList(supportedModes);
        int i3 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i3 >= 31 && (deviceProductInfo = display.getDeviceProductInfo()) != null && deviceProductInfo.getConnectionToSinkType() == 1) {
            z = true;
        }
        z04 z04Var = z04.a;
        if (i3 >= 36 || (i3 >= 35 && z04.b("Baklava", Build.VERSION.CODENAME))) {
            boolean zHasArrSupport = display.hasArrSupport();
            display2 = display;
            db7Var = new db7(zHasArrSupport ? display2.getSuggestedFrameRate(1) : 0.0f, i3 >= 37 ? display2.getFrameRateVelocityMapping() : null, zHasArrSupport);
        } else {
            display2 = display;
            db7Var = null;
        }
        c(display2.getName(), rect, rect2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), 24, 8, Integer.valueOf(display2.getRotation()), Boolean.valueOf(zIsWideColorGamut), (Boolean) null, Float.valueOf(display2.getRefreshRate()), mode, listAsList, Boolean.valueOf(f(display2)), e(display2), Boolean.valueOf(z), db7Var);
    }

    public final void i() throws Resources.NotFoundException, NumberFormatException {
        Rect rectE;
        Rect rect;
        Context context = this.x;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        if (d() > 0.0f) {
            float fD = d();
            float f2 = displayMetrics.density;
            float f3 = fD / f2;
            displayMetrics.density = f2 * f3;
            displayMetrics.xdpi *= f3;
            displayMetrics.ydpi *= f3;
        } else {
            boolean z = DeviceInfo.b().a.b;
            Display display = this.A;
            CommandLine commandLine = CommandLine.d;
            if (z && commandLine.c("automotive-web-ui-scale-up-enabled")) {
                display.getRealMetrics(displayMetrics);
                m41.F(context, displayMetrics);
            } else if (DeviceInfo.b().a.g && commandLine.c("xr-web-ui-scale-up-enabled")) {
                display.getRealMetrics(displayMetrics);
                m41.G(context, displayMetrics);
            }
        }
        WindowManager windowManager = this.y;
        Insets insetsIgnoringVisibility = windowManager.getCurrentWindowMetrics().getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
        RectF rectF = this.B;
        float f4 = displayMetrics.density;
        if (rectF != null) {
            float f5 = f / f4;
            RectF rectF2 = this.B;
            RectF rectF3 = new RectF(rectF2.left * f5, rectF2.top * f5, rectF2.right * f5, rectF2.bottom * f5);
            Rect rect2 = new Rect();
            rectF3.roundOut(rect2);
            float f6 = rectF3.left;
            float f7 = insetsIgnoringVisibility.left;
            float f8 = displayMetrics.density;
            RectF rectF4 = new RectF((f7 / f8) + f6, (insetsIgnoringVisibility.top / f8) + rectF3.top, rectF3.right - (insetsIgnoringVisibility.right / f8), rectF3.bottom - (insetsIgnoringVisibility.bottom / f8));
            rectE = new Rect();
            rectF4.roundOut(rectE);
            rect = rect2;
        } else {
            Rect rectE2 = m41.E(bounds, 1.0f / f4);
            rectE = m41.E(new Rect(bounds.left + insetsIgnoringVisibility.left, bounds.top + insetsIgnoringVisibility.top, bounds.right - insetsIgnoringVisibility.right, bounds.bottom - insetsIgnoringVisibility.bottom), 1.0f / displayMetrics.density);
            rect = rectE2;
        }
        h(rect, rectE, bounds.width(), bounds.height(), displayMetrics.density, displayMetrics.xdpi, displayMetrics.ydpi, context.getDisplay());
    }

    public final void j(Display display) throws Resources.NotFoundException, NumberFormatException {
        if (D) {
            i();
            return;
        }
        Point point = new Point();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealSize(point);
        display.getRealMetrics(displayMetrics);
        if (d() > 0.0f) {
            float fD = d();
            float f = displayMetrics.density;
            float f2 = fD / f;
            displayMetrics.density = f * f2;
            displayMetrics.xdpi *= f2;
            displayMetrics.ydpi *= f2;
        } else {
            boolean z = DeviceInfo.b().a.b;
            CommandLine commandLine = CommandLine.d;
            if (z && commandLine.c("automotive-web-ui-scale-up-enabled")) {
                m41.F(t8.a, displayMetrics);
            } else if (DeviceInfo.b().a.g && commandLine.c("xr-web-ui-scale-up-enabled")) {
                m41.G(t8.a, displayMetrics);
            }
        }
        Rect rectE = m41.E(new Rect(0, 0, point.x, point.y), 1.0f / displayMetrics.density);
        h(rectE, new Rect(rectE), point.x, point.y, displayMetrics.density, displayMetrics.xdpi, displayMetrics.ydpi, display);
    }
}
