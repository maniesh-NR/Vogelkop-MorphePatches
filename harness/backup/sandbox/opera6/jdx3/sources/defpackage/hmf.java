package defpackage;

import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes.dex */
public final class hmf implements a5n {
    public final /* synthetic */ byte a;
    public final View b;
    public final MaterialCheckBox c;

    public /* synthetic */ hmf(View view, MaterialCheckBox materialCheckBox, byte b) {
        this.a = b;
        this.b = view;
        this.c = materialCheckBox;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
