package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class z6o implements a5n {
    public final View a;
    public final MaterialButton b;
    public final y6o c;

    public z6o(View view, MaterialButton materialButton, y6o y6oVar) {
        this.a = view;
        this.b = materialButton;
        this.c = y6oVar;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
