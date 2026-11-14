package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public final class w6n extends z6n {
    public final nck b;
    public final tjn c;
    public int d;
    public final pyl e;

    public w6n(nck nckVar, int i, agm agmVar, tjn tjnVar) {
        super(nckVar.b);
        this.b = nckVar;
        this.c = tjnVar;
        this.d = 22;
        AppCompatImageView appCompatImageView = nckVar.d;
        this.e = new pyl((View) appCompatImageView, agmVar, i, tjnVar);
        appCompatImageView.getLayoutParams().width = tjnVar.a();
        appCompatImageView.getLayoutParams().height = tjnVar.a();
        appCompatImageView.setOnClickListener(new pkm(this, (byte) 5));
    }
}
