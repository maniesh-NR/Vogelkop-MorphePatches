package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class hjn implements a5n {
    public final ConstraintLayout a;
    public final OperaMaterialButton b;

    public hjn(ConstraintLayout constraintLayout, OperaMaterialButton operaMaterialButton) {
        this.a = constraintLayout;
        this.b = operaMaterialButton;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
