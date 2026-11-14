package defpackage;

import android.text.TextWatcher;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public interface z6f extends TextWatcher {
    default boolean c(int i, KeyEvent keyEvent) {
        return false;
    }

    void d(int i, int i2);

    void e();

    void f(boolean z);

    void h();

    void i();
}
