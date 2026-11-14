package defpackage;

import android.media.AudioManager;
import android.view.KeyEvent;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;

/* loaded from: classes.dex */
public abstract class qtn extends WebContentsDelegateAndroid {
    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void handleKeyboardEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 222) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                    }
                    return;
            }
        }
        ((AudioManager) t8.a.getSystemService("audio")).dispatchMediaKeyEvent(keyEvent);
    }
}
