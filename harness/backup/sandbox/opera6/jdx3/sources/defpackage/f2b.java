package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class f2b implements a5n {
    public final /* synthetic */ byte a;
    public final ConstraintLayout b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final TextView e;

    public /* synthetic */ f2b(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, byte b) {
        this.a = b;
        this.b = constraintLayout;
        this.c = materialButton;
        this.d = materialButton2;
        this.e = textView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
