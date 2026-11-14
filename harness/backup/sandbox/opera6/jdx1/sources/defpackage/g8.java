package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.NetworkException;
import android.net.http.QuicException;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.os.StrictMode;
import android.service.chooser.ChooserAction;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.google.android.gms.ads.AdError;
import com.opera.android.downloads.DownloadJobService;
import com.opera.android.downloads.DownloadService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.TraceEvent;
import org.chromium.gfx.mojom.Rect;
import org.chromium.net.CronetException;

/* loaded from: classes.dex */
public abstract class g8 {
    public static Method a;
    public static boolean b;
    public static boolean c;
    public static Method d;

    public static final boolean A(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isPostviewAvailable(i);
    }

    public static boolean B(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final boolean C(ge4 ge4Var) {
        int[] iArr = (int[]) ((ma4) ge4Var).c(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
        return iArr != null && e82.t(1, iArr) >= 0;
    }

    public static void D(int i) {
        ioh.y(i, 11, "InputMethod.StylusHandwriting.Gesture");
    }

    public static Parcelable E(Icon icon, String str, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return new ChooserAction.Builder(icon, str, pendingIntent).build();
        }
        return null;
    }

    public static final ColorSpace F(va5 va5Var) {
        if (Intrinsics.a(va5Var, xa5.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.a(va5Var, xa5.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final void G(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    public static void H(long j, sf1 sf1Var, boolean z, rmg rmgVar) {
        if (z) {
            int i = xjl.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(sf1Var, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < sf1Var.b.length() ? Character.codePointAt(sf1Var, iCharCount2) : 10;
            if (sgb.Q(iCodePointBefore) && (sgb.P(iCodePointAt) || sgb.O(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(sf1Var, iCharCount);
                    }
                } while (sgb.Q(iCodePointBefore));
                j = upj.c(iCharCount, iCharCount2);
            } else if (sgb.Q(iCodePointAt) && (sgb.P(iCodePointBefore) || sgb.O(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == sf1Var.b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(sf1Var, iCharCount2);
                    }
                } while (sgb.Q(iCodePointAt));
                j = upj.c(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        rmgVar.invoke(new j7a(new us7[]{new s4j(i2, i2), new d27(xjl.d(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int I(defpackage.gbc r16, android.view.inputmethod.HandwritingGesture r17, defpackage.dil r18, defpackage.u5n r19, rmg r20) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8.I(gbc, android.view.inputmethod.HandwritingGesture, dil, u5n, rmg):int");
    }

    public static boolean J(gbc gbcVar, PreviewableHandwritingGesture previewableHandwritingGesture, dil dilVar, CancellationSignal cancellationSignal) {
        sf1 sf1Var = gbcVar.j;
        if (sf1Var != null) {
            ojl ojlVarD = gbcVar.d();
            if (sf1Var.equals(ojlVarD != null ? ojlVarD.a.a.a : null)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (dilVar != null) {
                        long J = sgb.J(gbcVar, xvg.w(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        gbc gbcVar2 = dilVar.d;
                        if (gbcVar2 != null) {
                            gbcVar2.f(J);
                        }
                        gbc gbcVar3 = dilVar.d;
                        if (gbcVar3 != null) {
                            gbcVar3.e(xjl.b);
                        }
                        if (!xjl.c(J)) {
                            dilVar.u(false);
                            dilVar.r(b7a.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (dilVar != null) {
                        long J2 = sgb.J(gbcVar, xvg.w(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        gbc gbcVar4 = dilVar.d;
                        if (gbcVar4 != null) {
                            gbcVar4.e(J2);
                        }
                        gbc gbcVar5 = dilVar.d;
                        if (gbcVar5 != null) {
                            gbcVar5.f(xjl.b);
                        }
                        if (!xjl.c(J2)) {
                            dilVar.u(false);
                            dilVar.r(b7a.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (dilVar != null) {
                        long jK = sgb.K(gbcVar, xvg.w(selectRangeGesture.getSelectionStartArea()), xvg.w(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        gbc gbcVar6 = dilVar.d;
                        if (gbcVar6 != null) {
                            gbcVar6.f(jK);
                        }
                        gbc gbcVar7 = dilVar.d;
                        if (gbcVar7 != null) {
                            gbcVar7.e(xjl.b);
                        }
                        if (!xjl.c(jK)) {
                            dilVar.u(false);
                            dilVar.r(b7a.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (dilVar != null) {
                        long jK2 = sgb.K(gbcVar, xvg.w(deleteRangeGesture.getDeletionStartArea()), xvg.w(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        gbc gbcVar8 = dilVar.d;
                        if (gbcVar8 != null) {
                            gbcVar8.e(jK2);
                        }
                        gbc gbcVar9 = dilVar.d;
                        if (gbcVar9 != null) {
                            gbcVar9.f(xjl.b);
                        }
                        if (!xjl.c(jK2)) {
                            dilVar.u(false);
                            dilVar.r(b7a.a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new mg5(dilVar, (byte) 1));
                }
                return true;
            }
        }
        return false;
    }

    public static void K(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Objects.toString(pendingIntent);
            e.toString();
        }
    }

    public static void L(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void M(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void N(ActivityOptions activityOptions) {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return;
        }
        if (i <= 35) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(1);
        } else {
            activityOptions.setPendingIntentBackgroundActivityStartMode(3);
        }
    }

    public static void O(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setContainerTitle(str);
    }

    public static void P(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(Arrays.asList(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(e82.E(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static final void Q(ActivityOptions activityOptions) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(3);
        } else if (i >= 34) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(1);
        }
    }

    public static final void R(ActivityOptions activityOptions) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            activityOptions.setPendingIntentCreatorBackgroundActivityStartMode(3);
        } else if (i >= 34) {
            activityOptions.setPendingIntentCreatorBackgroundActivityStartMode(1);
        }
    }

    public static void S(MediaRouter2 mediaRouter2, RouteListingPreference routeListingPreference) {
        mediaRouter2.setRouteListingPreference(routeListingPreference);
    }

    public static final void T(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }

    public static final void U(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    public static void V(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    public static boolean W(MediaRouter2 mediaRouter2) {
        return mediaRouter2.showSystemOutputSwitcher();
    }

    public static Rect X(PointF pointF) {
        Rect rect = new Rect(0);
        rect.b = Math.round(pointF.x);
        rect.c = Math.round(pointF.y);
        rect.d = 0;
        rect.e = 0;
        return rect;
    }

    public static Rect Y(RectF rectF) {
        Rect rect = new Rect(0);
        rect.b = Math.round(rectF.left);
        rect.c = Math.round(rectF.top);
        rect.d = Math.round(rectF.right - rectF.left);
        rect.e = Math.round(rectF.bottom - rectF.top);
        return rect;
    }

    public static bhk Z(String str) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) str.charAt(i);
        }
        bhk bhkVar = new bhk(16);
        bhkVar.b = sArr;
        return bhkVar;
    }

    public static final void a(CursorAnchorInfo.Builder builder, njl njlVar, voh vohVar) {
        if (vohVar.f()) {
            return;
        }
        xbe xbeVar = njlVar.b;
        int i = xbeVar.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iC = djh.c(xbeVar.e(vohVar.b), 0, i);
        int iC2 = djh.c(xbeVar.e(vohVar.d), 0, i);
        if (iC > iC2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(njlVar.e(iC), xbeVar.f(iC), njlVar.f(iC), xbeVar.b(iC));
            if (iC == iC2) {
                return;
            } else {
                iC++;
            }
        }
    }

    public static RouteListingPreference a0(h9i h9iVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = h9iVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(new RouteListingPreference.Item.Builder(((g9i) it.next()).a).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(1).build());
        }
        return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(h9iVar.b).build();
    }

    public static final void b(CursorAnchorInfo.Builder builder, njl njlVar, voh vohVar) {
        if (vohVar.f()) {
            return;
        }
        xbe xbeVar = njlVar.b;
        int i = xbeVar.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iC = djh.c(xbeVar.e(vohVar.b), 0, i);
        int iC2 = djh.c(xbeVar.e(vohVar.d), 0, i);
        if (iC > iC2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(njlVar.e(iC), xbeVar.f(iC), njlVar.f(iC), xbeVar.b(iC));
            if (iC == iC2) {
                return;
            } else {
                iC++;
            }
        }
    }

    public static Rect[] b0(RectF rectF) {
        return new Rect[]{X(new PointF(rectF.left, (rectF.top + rectF.bottom) / 2.0f)), X(new PointF(rectF.right, (rectF.top + rectF.bottom) / 2.0f))};
    }

    public static GetTopicsRequest c(hx9 hx9Var) {
        GetTopicsRequest.Builder builderA = e71.a();
        hx9Var.getClass();
        return builderA.setAdsSdkName(AdError.GOOGLE_MOBILE_ADS_DOMAIN).setShouldRecordObservation(hx9Var.a).build();
    }

    public static CronetException c0(Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (t40.j(exc)) {
            return new ba1((QuicException) exc);
        }
        if (exc instanceof NetworkException) {
            return new e81((NetworkException) exc, false);
        }
        if (exc instanceof CallbackException) {
            CallbackException callbackException = (CallbackException) exc;
            return new s21(callbackException.getMessage(), callbackException.getCause());
        }
        HttpException httpException = (HttpException) exc;
        return new h71(httpException.getMessage(), httpException);
    }

    public static GetTopicsRequest d(hx9 hx9Var) {
        GetTopicsRequest.Builder builderA = e71.a();
        hx9Var.getClass();
        return builderA.setAdsSdkName(AdError.GOOGLE_MOBILE_ADS_DOMAIN).build();
    }

    public static Context e(int i, Context context) {
        return context.createDeviceContext(i);
    }

    public static vjk f(HandwritingGesture handwritingGesture) {
        if (handwritingGesture instanceof SelectGesture) {
            D(4);
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            vjk vjkVar = new vjk();
            vjkVar.b = (byte) 4;
            vjkVar.c = selectGesture.getGranularity() == 1;
            vjkVar.f = Z(selectGesture.getFallbackText());
            Rect[] rectArrB0 = b0(selectGesture.getSelectionArea());
            vjkVar.d = rectArrB0[0];
            vjkVar.e = rectArrB0[1];
            return vjkVar;
        }
        if (handwritingGesture instanceof InsertGesture) {
            D(5);
            InsertGesture insertGesture = (InsertGesture) handwritingGesture;
            vjk vjkVar2 = new vjk();
            vjkVar2.b = (byte) 1;
            vjkVar2.c = false;
            vjkVar2.f = Z(insertGesture.getFallbackText());
            vjkVar2.g = Z(insertGesture.getTextToInsert());
            vjkVar2.d = X(insertGesture.getInsertionPoint());
            return vjkVar2;
        }
        if (handwritingGesture instanceof DeleteGesture) {
            D(6);
            DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
            vjk vjkVar3 = new vjk();
            vjkVar3.b = (byte) 0;
            vjkVar3.c = deleteGesture.getGranularity() == 1;
            vjkVar3.f = Z(deleteGesture.getFallbackText());
            Rect[] rectArrB02 = b0(deleteGesture.getDeletionArea());
            vjkVar3.d = rectArrB02[0];
            vjkVar3.e = rectArrB02[1];
            return vjkVar3;
        }
        if (handwritingGesture instanceof RemoveSpaceGesture) {
            D(7);
            RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
            vjk vjkVar4 = new vjk();
            vjkVar4.b = (byte) 2;
            vjkVar4.c = false;
            vjkVar4.f = Z(removeSpaceGesture.getFallbackText());
            vjkVar4.d = X(removeSpaceGesture.getStartPoint());
            vjkVar4.e = X(removeSpaceGesture.getEndPoint());
            return vjkVar4;
        }
        if (handwritingGesture instanceof JoinOrSplitGesture) {
            D(8);
            JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
            vjk vjkVar5 = new vjk();
            vjkVar5.b = (byte) 3;
            vjkVar5.c = false;
            vjkVar5.f = Z(joinOrSplitGesture.getFallbackText());
            vjkVar5.d = X(joinOrSplitGesture.getJoinOrSplitPoint());
            return vjkVar5;
        }
        if (handwritingGesture instanceof SelectRangeGesture) {
            D(9);
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            vjk vjkVar6 = new vjk();
            vjkVar6.b = (byte) 4;
            vjkVar6.c = selectRangeGesture.getGranularity() == 1;
            vjkVar6.f = Z(selectRangeGesture.getFallbackText());
            vjkVar6.d = Y(selectRangeGesture.getSelectionStartArea());
            vjkVar6.e = Y(selectRangeGesture.getSelectionEndArea());
            return vjkVar6;
        }
        if (!(handwritingGesture instanceof DeleteRangeGesture)) {
            return null;
        }
        D(10);
        DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
        vjk vjkVar7 = new vjk();
        vjkVar7.b = (byte) 0;
        vjkVar7.c = deleteRangeGesture.getGranularity() == 1;
        vjkVar7.f = Z(deleteRangeGesture.getFallbackText());
        vjkVar7.d = Y(deleteRangeGesture.getDeletionStartArea());
        vjkVar7.e = Y(deleteRangeGesture.getDeletionEndArea());
        return vjkVar7;
    }

    public static void g(Context context, boolean z) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return;
        }
        if (!z) {
            jobScheduler.cancel(1002);
            return;
        }
        JobInfo.Builder requiredNetworkType = new JobInfo.Builder(1002, new ComponentName(context, (Class<?>) DownloadJobService.class)).setRequiredNetworkType(1);
        if (!DownloadService.e) {
            requiredNetworkType.setUserInitiated(true);
            requiredNetworkType.setPersisted(true);
        }
        jobScheduler.schedule(requiredNetworkType.build());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.chromium.net.CronetException */
    public static Object h(u16 u16Var, Class cls) throws Exception {
        try {
            return u16Var.run();
        } catch (Exception e) {
            if (e instanceof InlineExecutionProhibitedException) {
                org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = new org.chromium.net.InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (e instanceof HttpException) {
                throw c0(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static int i(HandwritingGesture handwritingGesture, rmg rmgVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        rmgVar.invoke(new yb5(fallbackText, 1));
        return 5;
    }

    public static JobScheduler j(JobScheduler jobScheduler) {
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }

    public static AccessibilityNodeInfo.AccessibilityAction k() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static Set n(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int o(Context context) {
        return context.getDeviceId();
    }

    public static int p(Context context) {
        return context.getDeviceId();
    }

    public static Drawable q(Resources resources, int i) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return resources.getDrawable(i, null);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static long r(MotionEvent motionEvent) throws NoSuchMethodException, SecurityException {
        long eventTime;
        if (Build.VERSION.SDK_INT >= 34) {
            return motionEvent.getEventTimeNanos();
        }
        if (b) {
            eventTime = motionEvent.getEventTime();
        } else {
            try {
                Method method = a;
                if (method == null) {
                    method = MotionEvent.class.getMethod("getEventTimeNano", null);
                    a = method;
                }
                return ((Long) method.invoke(motionEvent, null)).longValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                TraceEvent.m("MotionEventUtils::getEventTimeNano error", e.toString());
                b = true;
                eventTime = motionEvent.getEventTime();
            }
        }
        return eventTime * 1000000;
    }

    public static long s(MotionEvent motionEvent) throws NoSuchMethodException, SecurityException {
        long historicalEventTime;
        if (Build.VERSION.SDK_INT >= 34) {
            return motionEvent.getHistoricalEventTimeNanos(0);
        }
        if (c) {
            historicalEventTime = motionEvent.getHistoricalEventTime(0);
        } else {
            try {
                Method method = d;
                if (method == null) {
                    method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(motionEvent.getClass(), "getHistoricalEventTimeNano", new Class[]{Integer.TYPE});
                    method.setAccessible(true);
                    d = method;
                }
                return ((Long) method.invoke(motionEvent, 0)).longValue();
            } catch (Exception e) {
                TraceEvent.m("MotionEventUtils::getHistoricalEventTimeNanos error", e.toString());
                c = true;
                historicalEventTime = motionEvent.getHistoricalEventTime(0);
            }
        }
        return historicalEventTime * 1000000;
    }

    public static int[] t(ljl ljlVar, RectF rectF, int i, final whf whfVar) {
        return ljlVar.f.getRangeForRect(rectF, i == 1 ? new ig1(new rgh(ljlVar.f.getText(), ljlVar.l())) : new GraphemeClusterSegmentFinder(ljlVar.f.getText(), ljlVar.a), new Layout.TextInclusionStrategy() { // from class: n71
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) whfVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float u(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float v(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int w(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static boolean x(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static boolean y(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static final boolean z(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i);
    }
}
