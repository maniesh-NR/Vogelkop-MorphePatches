package defpackage;

import android.app.Notification;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.os.flagging.AconfigStorageReadException;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class u8 {
    public static final wje a(BackEvent backEvent) {
        return new wje(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, xr5 xr5Var, int i) {
        accessibilityNodeInfo.addLabeledBy(xr5Var, i);
    }

    public static boolean c() {
        AconfigPackage aconfigPackage;
        if (Build.VERSION.SDK_INT < 36) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = f79.a;
        CopyOnWriteArraySet copyOnWriteArraySet = f79.b;
        if (concurrentHashMap.containsKey("com.android.media.flags")) {
            aconfigPackage = (AconfigPackage) concurrentHashMap.get("com.android.media.flags");
        } else if (copyOnWriteArraySet.contains("com.android.media.flags")) {
            aconfigPackage = null;
        } else {
            try {
                AconfigPackage aconfigPackageLoad = AconfigPackage.load("com.android.media.flags");
                concurrentHashMap.put("com.android.media.flags", aconfigPackageLoad);
                aconfigPackage = aconfigPackageLoad;
            } catch (AconfigStorageReadException unused) {
                copyOnWriteArraySet.add("com.android.media.flags");
            }
        }
        if (aconfigPackage != null) {
            return aconfigPackage.getBooleanFlagValue("enable_suggested_device_api", false);
        }
        return false;
    }

    public static int d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static int e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static final List f(String str) {
        List<ey5> list = cy5.a;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        for (ey5 ey5Var : list) {
            String str2 = ey5Var.c;
            Locale localeOf = Build.VERSION.SDK_INT >= 36 ? Locale.of(str, str2) : new Locale(str, str2);
            arrayList.add(new ey5(localeOf.getDisplayCountry(localeOf), ey5Var.b, ey5Var.c));
        }
        return CollectionsKt.c0(new yg9((byte) 23), arrayList);
    }

    public static CharSequence g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean h(Notification notification) {
        return notification.hasPromotableCharacteristics();
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static final ColorSpace j(va5 va5Var) {
        if (Intrinsics.a(va5Var, xa5.x)) {
            return ColorSpace.get(ColorSpace.Named.OK_LAB);
        }
        return null;
    }

    public static final Locale k(String str) {
        return Build.VERSION.SDK_INT >= 36 ? Locale.of(str) : new Locale(str);
    }

    public static final Locale l(String str, String str2) {
        return Build.VERSION.SDK_INT >= 36 ? Locale.of(str, str2) : new Locale(str, str2);
    }

    public static void m(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        accessibilityNodeInfo.setChecked(i);
    }

    public static final void n(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        accessibilityNodeInfo.setChecked(i);
    }

    public static void o(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        accessibilityNodeInfo.setExpandedState(i);
    }

    public static void p(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setFieldRequired(z);
    }

    public static void q(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }

    public static void r(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setSupplementalDescription(str);
    }
}
