package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class iz7 extends wxe implements Runnable {
    public final WeakReference m;

    public iz7(EditText editText) {
        this.m = new WeakReference(editText);
    }

    @Override // defpackage.wxe
    public final void S() {
        Handler handler;
        EditText editText = (EditText) this.m.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz7.a((EditText) this.m.get(), 1);
    }
}
