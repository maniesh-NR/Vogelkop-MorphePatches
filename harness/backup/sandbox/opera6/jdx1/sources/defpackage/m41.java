package defpackage;

import android.app.Notification;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.location.Location;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowManager;
import android.view.textclassifier.TextLinks;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class m41 {
    public static final InputConfiguration A(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            qp2.n("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (arrayList.size() == 1) {
            m8b m8bVar = (m8b) CollectionsKt.K(arrayList);
            return new InputConfiguration(m8bVar.a, m8bVar.b, m8bVar.c);
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m8b m8bVar2 = (m8b) obj;
            l41.f();
            arrayList2.add(l41.c(m8bVar2.a, m8bVar2.b, str));
        }
        return l41.b(((m8b) CollectionsKt.K(arrayList)).c, arrayList2);
    }

    public static void B(o41 o41Var, long[] jArr, Consumer consumer) {
        k0j k0jVar;
        for (long j : jArr) {
            m0j m0jVar = (m0j) o41Var.c().e((int) j);
            if (m0jVar != null && (k0jVar = m0jVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(o41Var.a.getAutofillId(), k0jVar.f);
                Object objG = k0jVar.d.a.g(n0j.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new sf1(tic.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float C(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static boolean D(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static Rect E(Rect rect, float f) {
        RectF rectF = new RectF(rect.left * f, rect.top * f, rect.right * f, rect.bottom * f);
        Rect rect2 = new Rect();
        rectF.roundOut(rect2);
        return rect2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void F(android.content.Context r5, android.util.DisplayMetrics r6) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            int r0 = r6.densityDpi
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r2 = "com.google.android.automotive.software.car_ready_mobile_apps"
            r3 = 2
            boolean r1 = r1.hasSystemFeature(r2, r3)
            if (r1 == 0) goto L2a
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            java.lang.String r3 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            if (r2 == 0) goto L28
            java.lang.String r3 = "android.software.car.display_compatibility"
            boolean r1 = r2.getBoolean(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
        L28:
            if (r1 != 0) goto L67
        L2a:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources r5 = r5.getResources()
            r2 = 2131165335(0x7f070097, float:1.7944884E38)
            r3 = 1
            r5.getValue(r2, r1, r3)
            org.chromium.base.CommandLine r5 = org.chromium.base.CommandLine.d
            java.lang.String r2 = "clamp-automotive-scale-up"
            boolean r3 = r5.c(r2)
            if (r3 == 0) goto L54
            java.lang.String r5 = r5.b(r2)
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Exception -> L54
            float r2 = r1.getFloat()     // Catch: java.lang.Exception -> L54
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
        L54:
            float r5 = r1.getFloat()
        L58:
            float r0 = (float) r0
            float r0 = r0 * r5
            int r5 = (int) r0
            float r5 = (float) r5
            r0 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 / r0
            double r0 = (double) r5
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            int r0 = r5 * 20
        L67:
            float r5 = (float) r0
            int r1 = r6.densityDpi
            float r1 = (float) r1
            float r5 = r5 / r1
            float r1 = r6.density
            float r1 = r1 * r5
            r6.density = r1
            r6.densityDpi = r0
            float r0 = r6.xdpi
            float r0 = r0 * r5
            r6.xdpi = r0
            float r0 = r6.ydpi
            float r0 = r0 * r5
            r6.ydpi = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m41.F(android.content.Context, android.util.DisplayMetrics):void");
    }

    public static void G(Context context, DisplayMetrics displayMetrics) throws Resources.NotFoundException {
        int i = displayMetrics.densityDpi;
        context.getResources().getValue(2131167811, new TypedValue(), true);
        int iCeil = ((int) Math.ceil(((int) (i * r1.getFloat())) / 10.0f)) * 10;
        float f = iCeil / displayMetrics.densityDpi;
        displayMetrics.density *= f;
        displayMetrics.densityDpi = iCeil;
        displayMetrics.xdpi *= f;
        displayMetrics.ydpi *= f;
    }

    public static void H(Notification.Action.Builder builder, boolean z) {
        builder.setAuthenticationRequired(z);
    }

    public static void I(MediaDrm mediaDrm, byte[] bArr, fjg fjgVar) {
        LogSessionId logSessionIdA = fjgVar.a();
        if (logSessionIdA.equals(odf.c())) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdA);
    }

    public static void J(igi igiVar, fjg fjgVar) {
        LogSessionId logSessionIdA = fjgVar.a();
        if (logSessionIdA.equals(odf.c())) {
            return;
        }
        ((MediaFormat) igiVar.c).setString("log-session-id", logSessionIdA.getStringId());
    }

    public static void K(bpd bpdVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((xod) bpdVar.b).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            w7d.r("caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }

    public static boolean L(Service service, int i, Notification notification) {
        try {
            service.startForeground(i, notification);
            return true;
        } catch (IllegalStateException e) {
            if (yq4.k(e)) {
                return false;
            }
            throw e;
        }
    }

    public static boolean M(Context context, Intent intent) {
        try {
            context.startForegroundService(intent);
            return true;
        } catch (IllegalStateException e) {
            if (yq4.k(e)) {
                return false;
            }
            throw e;
        }
    }

    public static final String N(ji9 ji9Var, Context context) {
        List list = ji9Var.a;
        s27 s27VarA = fsp.a(context);
        int i = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == 0) {
            return tic.a(list, null, new m3g(s27VarA, (byte) 17), 31);
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            h9o.t();
            return null;
        }
        return ((Object) (!list.isEmpty() ? "," : "")) + "'wght' " + djh.b(i + 400.0f, 1.0f, 1000.0f);
    }

    public static int[] O(NetworkRequest networkRequest) {
        return networkRequest.getTransportTypes();
    }

    public static int[] a(NetworkRequest networkRequest) {
        return networkRequest.getCapabilities();
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static Bitmap c(int i, int i2, byte[] bArr) throws IOException {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize <<= 1;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw s1g.d("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            gh8 gh8Var = new gh8(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (gh8Var.d(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static void d(Context context, gpe gpeVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            epe epeVar = new epe(gpeVar);
            telephonyManager.registerTelephonyCallback((Executor) gpeVar.c, epeVar);
            telephonyManager.unregisterTelephonyCallback(epeVar);
        } catch (RuntimeException unused) {
            gpeVar.d(5);
        }
    }

    public static void e(o41 o41Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        m0j m0jVar;
        k0j k0jVar;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (m0jVar = (m0j) o41Var.c().e((int) jKeyAt)) != null && (k0jVar = m0jVar.a) != null) {
                Object objG = k0jVar.d.a.g(e0j.l);
                if (objG == null) {
                    objG = null;
                }
                c8 c8Var = (c8) objG;
                if (c8Var != null && (function1 = c8Var.b) != null) {
                }
            }
        }
    }

    public static void f(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void g(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void h(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static gn2 i(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new fn2(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new hn2(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return gn2.e(arrayList, arrayList2, defaultDurationSeconds, recommendedFileFormat);
    }

    public static EncoderProfiles j(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static int k(ClipDescription clipDescription) {
        return clipDescription.getClassificationStatus();
    }

    public static float l(ClipDescription clipDescription) {
        return clipDescription.getConfidenceScore("url");
    }

    public static int m(Context context) {
        boolean zIsUiContext;
        Context context2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            zIsUiContext = context.isUiContext();
        } else {
            zIsUiContext = true;
            if (i >= 30 && t8.d(context) == null) {
                zIsUiContext = false;
            }
        }
        if (!zIsUiContext) {
            fb7 fb7VarA = fb7.a(context);
            int i2 = fb7VarA.f;
            int i3 = fb7VarA.g;
            if (i2 >= i3) {
                i2 = i3;
            }
            return Math.round(i2 / fb7VarA.h);
        }
        fb7 fb7VarA2 = fb7.a(context);
        if (i < 30) {
            int i4 = fb7VarA2.f;
            int i5 = fb7VarA2.g;
            if (i4 >= i5) {
                i4 = i5;
            }
            return Math.round(i4 / fb7VarA2.h);
        }
        if (i >= 30 && i < 33 && (context2 = ((beg) fb7VarA2).x) != null) {
            context = context2;
        }
        Rect bounds = ((WindowManager) context.getSystemService("window")).getMaximumWindowMetrics().getBounds();
        return Math.round(Math.min(bounds.right - bounds.left, bounds.bottom - bounds.top) / fb7VarA2.h);
    }

    public static Path n(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float o(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static CharSequence p(ClipData.Item item) {
        TextLinks textLinks = item.getTextLinks();
        CharSequence charSequenceSubSequence = null;
        if (textLinks != null) {
            if (textLinks.getLinks().isEmpty()) {
                textLinks = null;
            }
            if (textLinks != null) {
                float f = 0.0f;
                for (TextLinks.TextLink textLink : textLinks.getLinks()) {
                    float confidenceScore = textLink.getConfidenceScore("url");
                    if (confidenceScore > f) {
                        charSequenceSubSequence = item.getText().subSequence(textLink.getStart(), textLink.getEnd());
                        if (confidenceScore >= 0.99f) {
                            return charSequenceSubSequence;
                        }
                        f = confidenceScore;
                    }
                }
            }
        }
        return charSequenceSubSequence;
    }

    public static Shader.TileMode q() {
        return Shader.TileMode.DECAL;
    }

    public static rg2 r(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return rg2.d;
        }
        ukh ukhVar = new ukh((byte) 1);
        boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
        ukhVar.b = true;
        ukhVar.c = z2;
        ukhVar.d = z;
        return ukhVar.a();
    }

    public static final Map s(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static t8i t(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        qp2.o(sko.i(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new t8i(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int u(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static final List v(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        return cameraExtensionCharacteristics.getSupportedExtensions();
    }

    public static boolean w(Location location) {
        return location.isMock();
    }

    public static boolean x() {
        if (Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            String str = Build.HARDWARE;
            Locale locale = Locale.ROOT;
            if (!c.q(str.toLowerCase(locale), "ums", false) && ((!c.m(Build.MANUFACTURER, "Itel", true) && !c.m(Build.BRAND, "Itel", true)) || !c.q(str.toLowerCase(locale), "sp", false))) {
                return false;
            }
        }
        return true;
    }

    public static Bitmap y(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    public static Typeface z(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, nb6.j(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
