package defpackage;

import android.view.View;
import com.opera.android.ui.catalog.widget.OperaRadioButton;

/* loaded from: classes.dex */
public final class jmf implements a5n {
    public final /* synthetic */ byte a;
    public final View b;
    public final OperaRadioButton c;

    public /* synthetic */ jmf(View view, OperaRadioButton operaRadioButton, byte b) {
        this.a = b;
        this.b = view;
        this.c = operaRadioButton;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
