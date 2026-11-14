package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class zq2 implements a5n {
    public final /* synthetic */ byte a;
    public final LinearLayout b;
    public final MaterialButton c;
    public final MaterialButton d;

    public /* synthetic */ zq2(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, byte b) {
        this.a = b;
        this.b = linearLayout;
        this.c = materialButton;
        this.d = materialButton2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
