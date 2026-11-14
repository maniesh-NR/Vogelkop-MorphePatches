package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class b98 implements a5n {
    public final /* synthetic */ byte a;
    public final FrameLayout b;

    public /* synthetic */ b98(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    public b98(FrameLayout frameLayout, MaterialButton materialButton, cr2 cr2Var, vs vsVar, ov0 ov0Var) {
        this.a = (byte) 2;
        this.b = frameLayout;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
