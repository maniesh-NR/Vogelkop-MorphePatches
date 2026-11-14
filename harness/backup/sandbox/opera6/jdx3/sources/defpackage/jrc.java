package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class jrc implements a5n {
    public final /* synthetic */ byte a;
    public final LinearLayout b;
    public final MaterialButton c;

    public /* synthetic */ jrc(LinearLayout linearLayout, MaterialButton materialButton, byte b) {
        this.a = b;
        this.b = linearLayout;
        this.c = materialButton;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
