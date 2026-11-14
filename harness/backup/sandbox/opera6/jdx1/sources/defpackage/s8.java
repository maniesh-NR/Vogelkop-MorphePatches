package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes.dex */
public final class s8 {
    public static final s8 A;
    public static final s8 B;
    public static final s8 C;
    public static final s8 D;
    public static final s8 E;
    public static final s8 F;
    public static final s8 G;
    public static final s8 H;
    public static final s8 I;
    public static final s8 J;
    public static final s8 K;
    public static final s8 L;
    public static final s8 M;
    public static final s8 N;
    public static final s8 O;
    public static final s8 e = new s8(1, (String) null);
    public static final s8 f = new s8(2, (String) null);
    public static final s8 g;
    public static final s8 h;
    public static final s8 i;
    public static final s8 j;
    public static final s8 k;
    public static final s8 l;
    public static final s8 m;
    public static final s8 n;
    public static final s8 o;
    public static final s8 p;
    public static final s8 q;
    public static final s8 r;
    public static final s8 s;
    public static final s8 t;
    public static final s8 u;
    public static final s8 v;
    public static final s8 w;
    public static final s8 x;
    public static final s8 y;
    public static final s8 z;
    public final Object a;
    public final int b;
    public final Class c;
    public final la d;

    static {
        new s8(4, (String) null);
        new s8(8, (String) null);
        g = new s8(16, (String) null);
        h = new s8(32, (String) null);
        i = new s8(64, (String) null);
        j = new s8(NotificationCompat.FLAG_HIGH_PRIORITY, (String) null);
        k = new s8(ea.class, NotificationCompat.FLAG_LOCAL_ONLY);
        l = new s8(ea.class, NotificationCompat.FLAG_GROUP_SUMMARY);
        m = new s8(fa.class, 1024);
        n = new s8(fa.class, 2048);
        o = new s8(4096, (String) null);
        p = new s8(8192, (String) null);
        q = new s8(16384, (String) null);
        r = new s8(32768, (String) null);
        s = new s8(65536, (String) null);
        t = new s8(ja.class, 131072);
        u = new s8(262144, (String) null);
        v = new s8(524288, (String) null);
        w = new s8(1048576, (String) null);
        x = new s8(ka.class, 2097152);
        y = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        z = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, ha.class);
        A = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        B = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        C = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        D = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        E = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        F = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        G = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        H = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        I = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        J = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, ia.class);
        new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, ga.class);
        K = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        L = new s8(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new s8(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        M = new s8(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new s8(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new s8(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new s8(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new s8(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        N = new s8(i2 >= 34 ? g8.k() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        O = new s8(z04.a() ? w8.c() : null, R.id.ALT, null, null, null);
    }

    public s8(int i2, String str) {
        this(null, i2, str, null, null);
    }

    public s8(Class cls, int i2) {
        this(null, i2, null, null, cls);
    }

    public s8(Object obj, int i2, String str, la laVar, Class cls) {
        this.b = i2;
        this.d = laVar;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s8)) {
            return false;
        }
        Object obj2 = ((s8) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strE = AccessibilityNodeInfoCompat.e(this.b);
        if (strE.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strE = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strE);
        return sb.toString();
    }
}
