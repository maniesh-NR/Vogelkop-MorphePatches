package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class jm9 implements a5n {
    public final /* synthetic */ byte a = 1;
    public final ConstraintLayout b;
    public final OperaMaterialButton c;

    public jm9(ConstraintLayout constraintLayout, CheckBox checkBox, StylingTextView stylingTextView, OperaMaterialButton operaMaterialButton, OperaMaterialButton operaMaterialButton2) {
        this.b = constraintLayout;
        this.c = operaMaterialButton2;
    }

    public jm9(ConstraintLayout constraintLayout, OperaMaterialButton operaMaterialButton) {
        this.b = constraintLayout;
        this.c = operaMaterialButton;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
