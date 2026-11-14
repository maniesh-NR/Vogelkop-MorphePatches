package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class v88 implements a5n {
    public final /* synthetic */ byte a;
    public final LinearLayout b;
    public final TextView c;
    public final StylingImageView d;
    public final TextView e;
    public final MaterialButton f;

    public /* synthetic */ v88(LinearLayout linearLayout, TextView textView, StylingImageView stylingImageView, TextView textView2, MaterialButton materialButton, byte b) {
        this.a = b;
        this.b = linearLayout;
        this.c = textView;
        this.d = stylingImageView;
        this.e = textView2;
        this.f = materialButton;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
