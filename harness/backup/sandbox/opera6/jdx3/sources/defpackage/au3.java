package defpackage;

import android.view.Window;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class au3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Window b;

    public /* synthetic */ au3(Window window, byte b) {
        this.a = b;
        this.b = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                int i = BrowserActivity.E1;
                window.getDecorView().setVisibility(4);
                break;
            default:
                vtp.W(window, 0);
                break;
        }
    }
}
