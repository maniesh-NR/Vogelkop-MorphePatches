package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class gnd extends i {
    public final View b;
    public final ImageView c;
    public final ProgressBar d;
    public final TextView e;
    public final /* synthetic */ qt5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnd(qt5 qt5Var, View view) {
        super(view);
        this.f = qt5Var;
        this.b = view;
        this.c = (ImageView) view.findViewById(2131363605);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131363607);
        this.d = progressBar;
        this.e = (TextView) view.findViewById(2131363606);
        o0g.z0(((hnd) qt5Var.h).i, progressBar);
    }
}
