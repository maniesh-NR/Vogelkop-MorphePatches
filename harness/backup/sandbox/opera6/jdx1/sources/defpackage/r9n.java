package defpackage;

import android.app.WallpaperManager;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.service.autofill.Dataset;
import android.service.autofill.InlinePresentation;
import android.util.DisplayMetrics;
import android.util.Range;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class r9n {
    public static final int[] a = new int[2];

    public static final boolean A(Context context) {
        CameraManager cameraManager = (CameraManager) context.getApplicationContext().getSystemService("camera");
        if (cameraManager == null) {
            return false;
        }
        return !(cameraManager.getCameraIdList().length == 0);
    }

    public static final boolean B(Context context) {
        Rect rectI = i(context);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        (i >= 30 ? n(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay()).getMetrics(displayMetrics);
        float fWidth = rectI.width() / displayMetrics.xdpi;
        float fHeight = rectI.height() / displayMetrics.ydpi;
        float fSqrt = (float) Math.sqrt((fHeight * fHeight) + (fWidth * fWidth));
        float f = i >= 30 ? 6.0f : 5.8f;
        int i2 = context.getResources().getConfiguration().screenLayout & 15;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return false;
            }
            if (i2 != 3) {
                if (i2 != 4 && (fSqrt < f || Math.min(rectI.width(), rectI.height()) < 600.0d)) {
                    return false;
                }
            } else if (fSqrt < f) {
                return false;
            }
        } else if (fSqrt < f || Math.min(rectI.width(), rectI.height()) < 600.0d) {
            return false;
        }
        return true;
    }

    public static boolean C(PackageManager packageManager, Drawable drawable) {
        return packageManager.isDefaultApplicationIcon(drawable);
    }

    public static boolean D(Context context, String str) {
        return u(context, str, 0L) != null;
    }

    public static boolean E(ViewGroup viewGroup, float f, float f2) {
        WindowInsets rootWindowInsets = viewGroup.getRootWindowInsets();
        if (rootWindowInsets != null) {
            if ((Build.VERSION.SDK_INT >= 30 ? rootWindowInsets.getInsets(WindowInsets.Type.systemGestures()) : rootWindowInsets.getSystemGestureInsets()) != null) {
                View rootView = viewGroup.getRootView();
                int width = rootView.getWidth();
                int height = rootView.getHeight();
                if (width > 0 && height > 0) {
                    int[] iArr = a;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    viewGroup.getLocationInWindow(iArr);
                    float f3 = f + iArr[0];
                    float f4 = f2 + iArr[1];
                    if (f3 < r0.left || f3 > width - r0.right || f4 < r0.top || f4 > height - r0.bottom) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean F(Context context) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoT = t(context);
        return (packageInfoT == null || (applicationInfo = packageInfoT.applicationInfo) == null || (applicationInfo.flags & 1) == 0) ? false : true;
    }

    public static boolean G(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 30) {
            return (viewGroup.getSystemUiVisibility() & 4096) != 0;
        }
        WindowInsetsController windowInsetsController = viewGroup.getWindowInsetsController();
        return windowInsetsController != null && windowInsetsController.getSystemBarsBehavior() == 2;
    }

    public static final boolean H(Context context) {
        WallpaperManager wallpaperManager;
        return (i0l.g() || "Rockchip".equalsIgnoreCase(Build.MANUFACTURER) || (wallpaperManager = WallpaperManager.getInstance(context)) == null || !wallpaperManager.isWallpaperSupported() || !wallpaperManager.isSetWallpaperAllowed()) ? false : true;
    }

    public static List I(Context context, Intent intent, long j) {
        return Build.VERSION.SDK_INT >= 33 ? t8.M(context.getPackageManager(), intent, j) : context.getPackageManager().queryIntentActivities(intent, (int) j);
    }

    public static boolean J(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean K(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean L(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void M(Toast toast) {
        toast.addCallback(new ez0());
    }

    public static final void N(CameraDevice cameraDevice, int i) throws CameraAccessException {
        cameraDevice.setCameraAudioRestriction(i);
    }

    public static void O(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | NotificationCompat.FLAG_LOCAL_ONLY);
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int P(android.content.Context r5, android.graphics.Bitmap r6, kkn r7, android.graphics.Rect r8, boolean r9) {
        /*
            int r7 = r7.ordinal()
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L13
            r2 = 2
            if (r7 == r1) goto L14
            if (r7 != r2) goto Lf
            r2 = 3
            goto L14
        Lf:
            h9o.p()
            return r0
        L13:
            r2 = r1
        L14:
            java.lang.String r7 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "huawei"
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L4f
            if (r9 == 0) goto L3d
            int r7 = r8.left     // Catch: java.lang.Throwable -> L48
            int r9 = r8.top     // Catch: java.lang.Throwable -> L48
            int r3 = r8.right     // Catch: java.lang.Throwable -> L48
            int r3 = r3 - r7
            int r8 = r8.bottom     // Catch: java.lang.Throwable -> L48
            int r8 = r8 - r9
            r4 = 0
            if (r7 < 0) goto L38
            if (r9 < 0) goto L38
            if (r3 <= 0) goto L38
            if (r8 <= 0) goto L38
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r7, r9, r3, r8)     // Catch: java.lang.OutOfMemoryError -> L38 java.lang.Throwable -> L48
            goto L39
        L38:
            r6 = r4
        L39:
            if (r6 == 0) goto L47
            r0 = r1
            r8 = r4
        L3d:
            int r5 = U(r5, r6, r2, r8)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L46
            r6.recycle()
        L46:
            r0 = r5
        L47:
            return r0
        L48:
            r5 = move-exception
            if (r0 == 0) goto L4e
            r6.recycle()
        L4e:
            throw r5
        L4f:
            java.lang.String r9 = "xiaomi"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L5c
            int r5 = U(r5, r6, r2, r8)
            return r5
        L5c:
            java.lang.String r9 = "oppo"
            boolean r7 = r9.equalsIgnoreCase(r7)
            if (r7 == 0) goto L69
            int r5 = U(r5, r6, r2, r8)
            return r5
        L69:
            android.app.WallpaperManager r5 = android.app.WallpaperManager.getInstance(r5)
            int r5 = r5.setBitmap(r6, r8, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9n.P(android.content.Context, android.graphics.Bitmap, kkn, android.graphics.Rect, boolean):int");
    }

    public static void Q(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void R(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void S(Outline outline, d91 d91Var) {
        if (d91Var != null) {
            outline.setPath(d91Var.a);
        } else {
            yt7.k("Unable to obtain android.graphics.Path");
        }
    }

    public static void T(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static int U(Context context, Bitmap bitmap, int i, Rect rect) throws IOException {
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
        if (i != 3) {
            return wallpaperManager.setBitmap(bitmap, rect, true, i);
        }
        int bitmap2 = wallpaperManager.setBitmap(bitmap, rect, true, 1);
        int bitmap3 = wallpaperManager.setBitmap(bitmap, rect, true, 2);
        return bitmap2 > bitmap3 ? bitmap3 : bitmap2;
    }

    public static void V(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void W(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            w7d.r("Failed to call Surface.setFrameRate", e);
        }
    }

    public static boolean X(Context context) {
        return Build.VERSION.SDK_INT > 29 && context.getApplicationInfo().targetSdkVersion > 29;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bnd Y(android.media.MediaRoute2Info r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9n.Y(android.media.MediaRoute2Info):bnd");
    }

    public static Dataset.Builder a(Dataset.Builder builder, og6 og6Var) {
        RemoteViews remoteViews = og6Var.c;
        AutofillId autofillId = og6Var.a.a;
        AutofillValue autofillValue = og6Var.b;
        if (remoteViews == null) {
            return builder.setValue(autofillId, autofillValue);
        }
        InlinePresentation inlinePresentation = og6Var.e;
        return inlinePresentation != null ? builder.setValue(autofillId, autofillValue, remoteViews, inlinePresentation) : builder.setValue(autofillId, autofillValue, remoteViews);
    }

    public static nf2 b(AssistStructure.ViewNode viewNode, u9d u9dVar) {
        String strM;
        int i;
        String hintIdEntry = viewNode.getHintIdEntry();
        if (hintIdEntry == null || (strM = t0h.m(hintIdEntry)) == null) {
            return null;
        }
        Iterator it = u9dVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String[] strArr = (String[]) entry.getKey();
            nf2 nf2Var = (nf2) entry.getValue();
            int length = strArr.length;
            for (0; i < length; i + 1) {
                String str = strArr[i];
                i = str != null ? StringsKt.E(strM, str, true) : false ? i + 1 : 0;
            }
            return nf2Var;
        }
        return null;
    }

    public static Dataset.Builder c(Dataset.Builder builder, og6 og6Var) {
        RemoteViews remoteViews = og6Var.c;
        AutofillValue autofillValue = og6Var.b;
        AutofillId autofillId = og6Var.a.a;
        if (remoteViews == null) {
            return builder.setValue(autofillId, autofillValue);
        }
        InlinePresentation inlinePresentation = og6Var.e;
        return inlinePresentation != null ? builder.setValue(autofillId, autofillValue, remoteViews, inlinePresentation) : builder.setValue(autofillId, autofillValue, remoteViews);
    }

    public static Context d(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon e(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String f(Context context) {
        return context.getAttributionTag();
    }

    public static final Set g(CameraManager cameraManager) {
        return cameraManager.getConcurrentCameraIds();
    }

    public static final Range h(ge4 ge4Var) {
        Float f;
        Float fValueOf = Float.valueOf(1.0f);
        try {
            ma4 ma4Var = (ma4) ge4Var;
            Range range = (Range) ma4Var.c(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range == null) {
                if (gyg.G(5, "CXCP")) {
                    sd4.b(ma4Var.a);
                }
                return new Range(fValueOf, fValueOf);
            }
            float fFloatValue = ((Number) range.getLower()).floatValue();
            if (Math.abs(fFloatValue) < Math.ulp(Math.abs(fFloatValue)) * 2.0d || ((Number) range.getLower()).floatValue() < 0.0f) {
                if (gyg.G(5, "CXCP")) {
                    Objects.toString(range.getLower());
                }
                f = fValueOf;
            } else {
                f = (Float) range.getLower();
            }
            float fFloatValue2 = ((Number) range.getUpper()).floatValue();
            if (Math.abs(fFloatValue2) >= Math.ulp(Math.abs(fFloatValue2)) * 2.0d && ((Number) range.getUpper()).floatValue() >= 0.0f) {
                fValueOf = (Float) range.getUpper();
            } else if (gyg.G(5, "CXCP")) {
                Objects.toString(range.getUpper());
            }
            return new Range(f, fValueOf);
        } catch (AssertionError unused) {
            if (d77.a(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                if (!gyg.G(3, "CXCP")) {
                    return null;
                }
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                return null;
            }
            if (!gyg.G(6, "CXCP")) {
                return null;
            }
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            return null;
        }
    }

    public static final Rect i(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics().getBounds();
        }
        if (i == 29) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        Display displayN = i >= 30 ? n(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        return new Rect(0, 0, displayN.getWidth(), displayN.getHeight());
    }

    public static final Rect j(Context context) {
        Rect rectI = i(context);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            rectI.left += insets.left;
            rectI.top += insets.top;
            rectI.right -= insets.right;
            rectI.bottom -= insets.bottom;
        }
        return rectI;
    }

    public static void k(LocationManager locationManager, CancellationSignal cancellationSignal, Executor executor, ms7 ms7Var) {
        locationManager.getCurrentLocation("network", cancellationSignal, executor, new pv1(ms7Var, (byte) 2));
    }

    public static String l(Context context) {
        ActivityInfo activityInfo;
        try {
            List listI = I(context, new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").build()), 65536L);
            if (!listI.isEmpty() && (activityInfo = ((ResolveInfo) listI.get(0)).activityInfo) != null) {
                return activityInfo.packageName;
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    public static final int m(r rVar) {
        WindowManager windowManager = rVar.getWindowManager();
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getMaximumWindowMetrics().getBounds().height();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static Display n(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Objects.toString(context);
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    public static final int o(r rVar) {
        WindowManager windowManager = rVar.getWindowManager();
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getMaximumWindowMetrics().getBounds().width();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static String p(Context context) {
        String initiatingPackageName;
        try {
            initiatingPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInitiatingPackageName();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return initiatingPackageName != null ? initiatingPackageName : "";
    }

    public static String q(Context context) {
        String installingPackageName;
        try {
            installingPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return installingPackageName != null ? installingPackageName : "";
    }

    public static MediaRouter2 r(Context context) {
        return MediaRouter2.getInstance(context);
    }

    public static String s(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                String originatingPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getOriginatingPackageName();
                if (originatingPackageName != null) {
                    return originatingPackageName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return "";
    }

    public static PackageInfo t(Context context) {
        return u(context, context.getPackageName(), 0L);
    }

    public static PackageInfo u(Context context, String str, long j) {
        try {
            return Build.VERSION.SDK_INT >= 33 ? t8.t(context.getPackageManager(), str, j) : context.getPackageManager().getPackageInfo(str, (int) j);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String v(String str) {
        int iIndexOf = -1;
        for (int i = 0; i < 3; i++) {
            iIndexOf = str.indexOf(46, iIndexOf + 1);
        }
        if (iIndexOf <= 0) {
            return "";
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, i2);
        return iIndexOf2 == -1 ? str.substring(i2) : str.substring(i2, iIndexOf2);
    }

    public static ArrayList w(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static CharSequence x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets y(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static Bitmap.CompressFormat z() {
        return Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
    }
}
