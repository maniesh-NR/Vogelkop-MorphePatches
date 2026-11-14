package defpackage;

import android.app.Activity;
import android.app.LocaleManager;
import android.app.StatusBarManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.service.autofill.Dataset;
import android.service.autofill.Field;
import android.service.autofill.FillResponse;
import android.service.autofill.InlinePresentation;
import android.service.autofill.Presentations;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import androidx.webkit.WebViewFeature;
import com.opera.android.browser.Referrer;
import com.opera.android.vpn.quick_settings_tile.VpnProQuickSettingsTileService;
import java.io.Serializable;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public abstract class t8 {
    public static Context a;

    public static Serializable A(Intent intent) {
        return intent.getSerializableExtra("output-format", Bitmap.CompressFormat.class);
    }

    public static String B(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics C(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean D(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean E(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Process.isSdkSandbox();
        }
        return false;
    }

    public static boolean G(im7 im7Var) {
        return im7Var.isSelectedChildViewEnabled();
    }

    public static boolean H(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList I(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void J(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static final void K(aog aogVar, wi wiVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (wiVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = aogVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, wiVar);
    }

    public static final void L(aog aogVar, wi wiVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (wiVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = aogVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(wiVar);
    }

    public static List M(PackageManager packageManager, Intent intent, long j) {
        return packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(j));
    }

    public static Parcelable N(Parcel parcel, ClassLoader classLoader, Class cls) {
        return (Parcelable) parcel.readParcelable(classLoader, cls);
    }

    public static Serializable O(Parcel parcel) {
        return (Serializable) parcel.readSerializable(null, Referrer.Policy.class);
    }

    public static wi P(Object obj, xp1 xp1Var) {
        wi wiVar = new wi(xp1Var, (byte) 2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, wiVar);
        return wiVar;
    }

    public static Intent Q(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static void R(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        StatusBarManager statusBarManager = (StatusBarManager) context.getSystemService(StatusBarManager.class);
        ComponentName componentName = new ComponentName(context, (Class<?>) VpnProQuickSettingsTileService.class);
        String string = context.getString(2132022254);
        xen xenVar = xen.d;
        statusBarManager.requestAddTileService(componentName, string, Icon.createWithResource(context, 2131231939), new bx1((byte) 7), new qg2((byte) 12));
    }

    public static ProviderInfo S(Context context, String str) {
        return context.getPackageManager().resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(0L));
    }

    public static final void T(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setDynamicRangeProfile(j);
    }

    public static final void U(CursorAnchorInfo.Builder builder, voh vohVar) {
        builder.setEditorBoundsInfo(v8.b().setEditorBounds(xvg.v(vohVar)).setHandwritingBounds(xvg.v(vohVar)).build());
    }

    public static final void V(CursorAnchorInfo.Builder builder, voh vohVar) {
        builder.setEditorBoundsInfo(v8.b().setEditorBounds(xvg.v(vohVar)).setHandwritingBounds(xvg.v(vohVar)).build());
    }

    public static void W(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static final void X(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static final void Y(OutputConfiguration outputConfiguration, int i) {
        outputConfiguration.setMirrorMode(i);
    }

    public static void Z(im7 im7Var, boolean z) {
        im7Var.setSelectedChildViewEnabled(z);
    }

    public static final void a(final myn mynVar, final c8e c8eVar, final boolean z, final ayn aynVar, final kxn kxnVar, final Function1 function1, final Function1 function12, final na naVar, final ma maVar, final Function1 function13, ih5 ih5Var, final int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1648281350);
        if ((i & 6) == 0) {
            i2 = (vt9Var.h(mynVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.g(z) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.f(aynVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.f(kxnVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.h(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= vt9Var.h(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= vt9Var.h(naVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= vt9Var.h(maVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= vt9Var.h(function13) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && vt9Var.z()) {
            vt9Var.Q();
        } else {
            vt9Var.S();
            if ((i & 1) != 0 && !vt9Var.x()) {
                vt9Var.Q();
            }
            vt9Var.q();
            uup.d(c8eVar, null, gyg.P(1897941596, new ta(mynVar, z, aynVar, kxnVar, function1, function12, naVar, maVar, function13), vt9Var), vt9Var, ((i2 >> 3) & 14) | 3072);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: oa
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t8.a(mynVar, c8eVar, z, aynVar, kxnVar, function1, function12, naVar, maVar, function13, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void a0(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setStreamUseCase(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, byte] */
    public static final void b(myn mynVar, FrameLayout.LayoutParams layoutParams, boolean z, ayn aynVar, kxn kxnVar, Function1 function1, Function1 function12, na naVar, ma maVar, Function1 function13, ih5 ih5Var, int i) {
        boolean z2;
        ?? r9;
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1022054648);
        int i2 = (vt9Var2.h(maVar) ? 536870912 : 268435456) | i | (vt9Var2.h(mynVar) ? 4 : 2) | (vt9Var2.h(layoutParams) ? 32 : 16) | (vt9Var2.g(z) ? 2048 : 1024) | (vt9Var2.f(aynVar) ? 16384 : 8192) | (vt9Var2.f(kxnVar) ? 131072 : 65536) | (vt9Var2.h(function1) ? 1048576 : 524288) | (vt9Var2.h(function12) ? 8388608 : 4194304) | (vt9Var2.h(naVar) ? 67108864 : 33554432);
        char c = vt9Var2.h(function13) ? (char) 4 : (char) 2;
        if ((i2 & 306783379) == 306783378 && (c & 3) == 2 && vt9Var2.z()) {
            vt9Var2.Q();
            vt9Var = vt9Var2;
        } else {
            vt9Var2.S();
            if ((i & 1) != 0 && !vt9Var2.x()) {
                vt9Var2.Q();
            }
            vt9Var2.q();
            wc1 wc1Var = (wc1) mynVar.g.getValue();
            Object objK = vt9Var2.K();
            Object obj = hh5.a;
            if (objK == obj) {
                objK = rm5.p(h.a, vt9Var2);
                vt9Var2.g0(objK);
            }
            nx5 nx5Var = (nx5) objK;
            boolean z3 = z && ((Boolean) aynVar.d.getValue()).booleanValue();
            vt9Var2.W(5004770);
            boolean zH = vt9Var2.h(wc1Var);
            Object objK2 = vt9Var2.K();
            if (zH || objK2 == obj) {
                z2 = 0;
                objK2 = new pa(wc1Var, (byte) 0);
                vt9Var2.g0(objK2);
            } else {
                z2 = 0;
            }
            vt9Var2.p(z2);
            nb6.b(z3, (Function0) objK2, vt9Var2, z2, z2);
            naVar.a = mynVar;
            naVar.b = aynVar;
            maVar.a = mynVar;
            vt9Var2.W(-1224400529);
            boolean zH2 = ((c & 14) == 4 ? true : z2) | ((3670016 & i2) == 1048576 ? true : z2) | vt9Var2.h(layoutParams) | vt9Var2.h(mynVar) | vt9Var2.h(maVar) | vt9Var2.h(naVar) | vt9Var2.h(nx5Var) | ((458752 & i2) == 131072 ? true : z2);
            Object objK3 = vt9Var2.K();
            if (zH2 || objK3 == obj) {
                r9 = z2;
                qa qaVar = new qa(function13, function1, layoutParams, mynVar, maVar, naVar, nx5Var, kxnVar);
                vt9Var2.g0(qaVar);
                objK3 = qaVar;
            } else {
                r9 = z2;
            }
            Function1 function14 = (Function1) objK3;
            vt9Var2.p(r9);
            vt9Var2.W(1849434622);
            Object objK4 = vt9Var2.K();
            if (objK4 == obj) {
                objK4 = new y2((byte) 3);
                vt9Var2.g0(objK4);
            }
            Function1 function15 = (Function1) objK4;
            vt9Var2.p(r9);
            vt9Var2.W(5004770);
            boolean z4 = (i2 & 29360128) == 8388608 ? true : r9;
            Object objK5 = vt9Var2.K();
            if (z4 || objK5 == obj) {
                objK5 = new ra(function12, r9);
                vt9Var2.g0(objK5);
            }
            vt9Var2.p(r9);
            vt9Var = vt9Var2;
            nb6.a(function14, z7e.b, function15, (Function1) objK5, null, vt9Var, 432);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new sa(mynVar, layoutParams, z, aynVar, kxnVar, function1, function12, naVar, maVar, function13, i);
        }
    }

    public static void b0(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    public static final WebView c(Function1 function1, Function1 function12, FrameLayout.LayoutParams layoutParams, myn mynVar, ma maVar, na naVar, kxn kxnVar, Context context) {
        WebView webView;
        tvk kvnVar;
        if (function1 == null || (webView = (WebView) function1.invoke(context)) == null) {
            webView = new WebView(context);
        }
        function12.invoke(webView);
        webView.setLayoutParams(layoutParams);
        Bundle bundle = mynVar.h;
        if (bundle != null) {
            webView.restoreState(bundle);
        }
        maVar.b = context;
        webView.setWebChromeClient(maVar);
        webView.setWebViewClient(naVar);
        ghg ghgVar = mynVar.b().b;
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        mynVar.b().getClass();
        settings.setJavaScriptEnabled(true);
        settings.setUserAgentString(null);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        ghg ghgVar2 = mynVar.b().b;
        settings.setSafeBrowsingEnabled(true);
        if (Build.VERSION.SDK_INT >= 33) {
            settings.setAlgorithmicDarkeningAllowed(false);
        }
        webView.setBackgroundColor(cs5.u0(mynVar.b().a));
        settings.setAllowFileAccess(false);
        settings.setTextZoom(100);
        settings.setUseWideViewPort(false);
        settings.setStandardFontFamily("sans-serif");
        settings.setDefaultFontSize(16);
        settings.setLoadsImagesAutomatically(true);
        settings.setDomStorageEnabled(ghgVar2.q);
        settings.setMediaPlaybackRequiresUserGesture(true);
        if (axn.b(WebViewFeature.FORCE_DARK)) {
            if ((webView.getResources().getConfiguration().uiMode & 48) == 32) {
                WebSettings settings2 = webView.getSettings();
                axn.l.getClass();
                settings2.setForceDark(2);
            } else {
                WebSettings settings3 = webView.getSettings();
                axn.l.getClass();
                settings3.setForceDark(0);
            }
            if (axn.b(WebViewFeature.FORCE_DARK_STRATEGY)) {
                WebSettings settings4 = webView.getSettings();
                if (!axn.m.a()) {
                    throw axn.a();
                }
                try {
                    kvnVar = new tvk((WebSettingsBoundaryInterface) fr3.m(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) cxn.a.a).convertSettings(settings4)));
                } catch (ClassCastException e) {
                    if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(settings4.getClass().getCanonicalName())) {
                        throw e;
                    }
                    kvnVar = new kvn(null);
                }
                kvnVar.q();
            }
        }
        wc1 wc1Var = new wc1(webView, kxnVar);
        mynVar.g.setValue(wc1Var);
        if (kxnVar != null) {
            kxnVar.b = wc1Var;
        }
        return webView;
    }

    public static void c0(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }

    public static Activity d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static void d0(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static Dataset.Builder e(Dataset.Builder builder, og6 og6Var) {
        RemoteViews remoteViews = og6Var.c;
        RemoteViews remoteViews2 = og6Var.d;
        if (remoteViews == null && og6Var.e == null && remoteViews2 == null) {
            return r9n.a(builder, og6Var);
        }
        Field.Builder builder2 = new Field.Builder();
        Presentations.Builder builder3 = new Presentations.Builder();
        RemoteViews remoteViews3 = og6Var.c;
        if (remoteViews3 != null) {
            builder3.setMenuPresentation(remoteViews3);
        }
        if (remoteViews2 != null) {
            builder3.setDialogPresentation(remoteViews2);
        }
        InlinePresentation inlinePresentation = og6Var.e;
        if (inlinePresentation != null) {
            builder3.setInlinePresentation(inlinePresentation);
        }
        Field.Builder presentations = builder2.setPresentations(builder3.build());
        AutofillValue autofillValue = og6Var.b;
        if (autofillValue != null) {
            presentations.setValue(autofillValue);
        }
        return builder.setField(og6Var.a.a, presentations.build());
    }

    public static void e0(FillResponse.Builder builder, RemoteViews remoteViews, AutofillId[] autofillIdArr) {
        builder.setFillDialogTriggerIds((AutofillId[]) Arrays.copyOf(autofillIdArr, autofillIdArr.length)).setDialogHeader(remoteViews);
    }

    public static tw2 f(int i, int i2, int i3, int i4) {
        return new tw2(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(false).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(false).setRowTitle(null).setColumnTitle(null).build(), (byte) 3);
    }

    public static void f0(Object obj, wi wiVar) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, wiVar);
    }

    public static String g(String str) {
        return URLDecoder.decode(str, StandardCharsets.UTF_8);
    }

    public static void g0(Object obj, wi wiVar) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(wiVar);
    }

    public static String h(String str) {
        return URLEncoder.encode(str, StandardCharsets.UTF_8);
    }

    public static void h0(Object obj, wi wiVar) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(wiVar);
    }

    public static OnBackInvokedDispatcher i(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    public static gn2 j(EncoderProfiles encoderProfiles) {
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
            arrayList2.add(new hn2(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return gn2.e(arrayList, arrayList2, defaultDurationSeconds, recommendedFileFormat);
    }

    public static qe6 k(ge4 ge4Var) {
        int i = Build.VERSION.SDK_INT;
        qe6 qe6Var = null;
        if (i >= 33) {
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((ma4) ge4Var).c(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
            if (dynamicRangeProfiles != null) {
                if (i < 33) {
                    t14.c(p3p.i(i, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", " (requires API 33)"));
                    return null;
                }
                qe6Var = new qe6(new mp7(dynamicRangeProfiles), (byte) 7);
            }
        }
        return qe6Var == null ? np7.a : qe6Var;
    }

    public static ActivityInfo l(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static long m(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode();
    }

    public static final Set n(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i);
    }

    public static final Set o(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i);
    }

    public static uf2 p(AudioManager audioManager, pf2 pf2Var) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(pf2Var.b());
        HashMap map = new HashMap();
        map.put(2, new HashSet(sgb.i(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (tym.I(format) || uf2.e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(sgb.i(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(sgb.i(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        z0b z0bVarP = h1b.p();
        for (Map.Entry entry : map.entrySet()) {
            z0bVarP.c(new tf2(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new uf2(z0bVarP.g());
    }

    public static AudioDeviceInfo q(AudioManager audioManager, pf2 pf2Var) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(pf2Var.b());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static OnBackInvokedDispatcher r(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static PackageInfo s(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static PackageInfo t(PackageManager packageManager, String str, long j) {
        return packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(j));
    }

    public static Object u(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] v(Bundle bundle, String str) {
        return bundle.getParcelableArray(str, Parcelable.class);
    }

    public static ArrayList w(Bundle bundle, String str) {
        return bundle.getParcelableArrayList(str, IntentFilter.class);
    }

    public static Object x(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static ip7 y(ge4 ge4Var) {
        Long l = (Long) ((ma4) ge4Var).c(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (ip7) jp7.a.get(l);
        }
        return null;
    }

    public static Serializable z(Bundle bundle) {
        return bundle.getSerializable("com.opera.android.autofill.EXTRA_SIGNUP_DATA", ujj.class);
    }
}
