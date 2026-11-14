package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class m5n {
    public static void a(View view, final q5n q5nVar) {
        hkj hkjVar = (hkj) view.getTag(2131364698);
        if (hkjVar == null) {
            hkjVar = new hkj(0);
            view.setTag(2131364698, hkjVar);
        }
        Objects.requireNonNull(q5nVar);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: l5n
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return q5nVar.onUnhandledKeyEvent(view2, keyEvent);
            }
        };
        hkjVar.put(q5nVar, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, q5n q5nVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        hkj hkjVar = (hkj) view.getTag(2131364698);
        if (hkjVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hkjVar.get(q5nVar)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
