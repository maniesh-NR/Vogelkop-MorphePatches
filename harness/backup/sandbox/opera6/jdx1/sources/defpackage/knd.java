package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class knd extends i {
    public final View b;
    public final ImageView c;
    public final ProgressBar d;
    public final TextView e;
    public final float f;
    public cod g;
    public final /* synthetic */ nnd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knd(nnd nndVar, View view) {
        super(view);
        this.h = nndVar;
        this.b = view;
        this.c = (ImageView) view.findViewById(2131363556);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131363558);
        this.d = progressBar;
        this.e = (TextView) view.findViewById(2131363557);
        ond ondVar = nndVar.j;
        this.f = o0g.S(ondVar.o);
        o0g.z0(ondVar.o, progressBar);
    }
}
