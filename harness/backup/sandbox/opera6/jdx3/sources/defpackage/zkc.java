package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public abstract class zkc extends i implements y9n {
    public boolean b;

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        if (i >= 99 && !this.b) {
            this.b = true;
            V();
        } else {
            if (i >= 70 || !this.b) {
                return;
            }
            this.b = false;
            U();
        }
    }

    public abstract void U();

    public abstract void V();
}
