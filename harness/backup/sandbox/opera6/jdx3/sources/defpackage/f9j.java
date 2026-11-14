package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class f9j implements a5n {
    public final LinearLayout a;
    public final MaterialButton b;

    public f9j(LinearLayout linearLayout, MaterialButton materialButton) {
        this.a = linearLayout;
        this.b = materialButton;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
