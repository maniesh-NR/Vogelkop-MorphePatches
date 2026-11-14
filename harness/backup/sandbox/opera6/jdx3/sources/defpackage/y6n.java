package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class y6n extends z6n {
    public final tjn b;
    public aln c;
    public final pyl d;

    public y6n(Context context, int i, agm agmVar, tjn tjnVar) {
        super(new gt9(context, new k6n(tjnVar, (byte) 6)));
        this.b = tjnVar;
        this.d = new pyl(((i) this).itemView, agmVar, i, tjnVar);
        ((i) this).itemView.setOnClickListener(new pkm(this, (byte) 7));
        ((i) this).itemView.setOnLongClickListener(new zt((Object) this, (byte) 17));
    }
}
