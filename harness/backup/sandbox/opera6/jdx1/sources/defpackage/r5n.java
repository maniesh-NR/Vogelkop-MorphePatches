package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public abstract class r5n {
    public static WeakHashMap a;
    public static final int[] b = {2131361813, 2131361814, 2131361825, 2131361836, 2131361839, 2131361840, 2131361841, 2131361842, 2131361843, 2131361844, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361823, 2131361824, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361832, 2131361833, 2131361834, 2131361835, 2131361837, 2131361838};
    public static final e5n c = new e5n();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        ((View) view.getParent()).setTag(2131365016, viewGroup);
    }

    public static l8n b(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        l8n l8nVar = (l8n) weakHashMap.get(view);
        if (l8nVar != null) {
            return l8nVar;
        }
        l8n l8nVar2 = new l8n(view);
        a.put(view, l8nVar2);
        return l8nVar2;
    }

    public static g3o c(View view, g3o g3oVar) {
        WindowInsets windowInsetsF = g3oVar.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? o5n.a(view, windowInsetsF) : f5n.a(view, windowInsetsF);
            if (!windowInsetsA.equals(windowInsetsF)) {
                return g3o.g(view, windowInsetsA);
            }
        }
        return g3oVar;
    }

    public static ArrayList d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131364685);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131364685, arrayList2);
        return arrayList2;
    }

    @SuppressLint({"InlinedApi"})
    public static int e(View view) {
        return k5n.a(view);
    }

    public static String[] f(bq1 bq1Var) {
        return Build.VERSION.SDK_INT >= 31 ? p5n.a(bq1Var) : (String[]) bq1Var.getTag(2131364692);
    }

    public static void g(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m5n.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m5n.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m5n.b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static g3o h(View view, g3o g3oVar) {
        WindowInsets windowInsetsF = g3oVar.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsF);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsF)) {
                return g3o.g(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return g3oVar;
    }

    public static sq5 i(bq1 bq1Var, sq5 sq5Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(sq5Var);
            bq1Var.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p5n.b(bq1Var, sq5Var);
        }
        if (((ukl) bq1Var.getTag(2131364691)) == null) {
            return bq1Var.e(sq5Var);
        }
        sq5 sq5VarA = ukl.a(bq1Var, sq5Var);
        if (sq5VarA == null) {
            return null;
        }
        return bq1Var.e(sq5VarA);
    }

    public static void j(int i, View view) {
        ArrayList arrayListD = d(view);
        for (int i2 = 0; i2 < arrayListD.size(); i2++) {
            if (((s8) arrayListD.get(i2)).a() == i) {
                arrayListD.remove(i2);
                return;
            }
        }
    }

    public static void k(View view, s8 s8Var, String str, la laVar) {
        if (laVar == null && str == null) {
            j(s8Var.a(), view);
            g(0, view);
            return;
        }
        s8 s8Var2 = new s8(null, s8Var.b, str, laVar, s8Var.c);
        View.AccessibilityDelegate accessibilityDelegateA = n5n.a(view);
        f8 f8Var = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof e8 ? ((e8) accessibilityDelegateA).a : new f8(accessibilityDelegateA);
        if (f8Var == null) {
            f8Var = new f8();
        }
        l(view, f8Var);
        j(s8Var2.a(), view);
        d(view).add(s8Var2);
        g(0, view);
    }

    public static void l(View view, f8 f8Var) {
        if (f8Var == null && (n5n.a(view) instanceof e8)) {
            f8Var = new f8();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(f8Var == null ? null : f8Var.b);
    }

    public static void m(View view, CharSequence charSequence) {
        new d5n(2131364688, CharSequence.class, 8, 28, (byte) 0).a(view, charSequence);
        e5n e5nVar = c;
        if (charSequence == null) {
            e5nVar.a.remove(view);
            view.removeOnAttachStateChangeListener(e5nVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(e5nVar);
        } else {
            e5nVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(e5nVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e5nVar);
            }
        }
    }

    public static void n(View view, int i) {
        k5n.b(view, i);
    }
}
