package defpackage;

import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;
import org.chromium.ui.display.DisplayAndroidManager;

/* loaded from: classes.dex */
public final class hb7 implements DisplayManager.DisplayListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                kb7 kb7Var = (kb7) this.b;
                synchronized (kb7Var.c) {
                    kb7Var.d = null;
                    kb7Var.f = null;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) throws Resources.NotFoundException, NumberFormatException {
        switch (this.a) {
            case 0:
                beg begVar = (beg) ((DisplayAndroidManager) this.b).c.get(i);
                Display display = DisplayAndroidManager.d().getDisplay(i);
                if (begVar == null || display == null) {
                    return;
                }
                begVar.j(display);
                return;
            case 1:
                kb7 kb7Var = (kb7) this.b;
                synchronized (kb7Var.c) {
                    kb7Var.d = null;
                    kb7Var.f = null;
                }
                return;
            default:
                PreviewView previewView = (PreviewView) this.b;
                Display defaultDisplay = previewView.getDefaultDisplay();
                if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                    return;
                }
                previewView.b();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.a) {
            case 0:
                if (DisplayAndroidManager.isDisplayTopologyAvailable()) {
                    return;
                }
                ((DisplayAndroidManager) this.b).f(i);
                return;
            case 1:
                kb7 kb7Var = (kb7) this.b;
                synchronized (kb7Var.c) {
                    kb7Var.d = null;
                    kb7Var.f = null;
                }
                return;
            default:
                return;
        }
    }
}
