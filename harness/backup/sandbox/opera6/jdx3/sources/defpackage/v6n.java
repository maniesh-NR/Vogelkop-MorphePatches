package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class v6n extends z6n {
    public final int b;

    public v6n(Context context, int i, tjn tjnVar) {
        k6n k6nVar = new k6n(tjnVar, (byte) 4);
        super(new ft9(context, k6nVar, k6nVar));
        this.b = i;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((i) this).itemView.getContext());
        ViewGroup viewGroup = (ViewGroup) ((i) this).itemView;
        View viewInflate = layoutInflaterFrom.inflate(2131559551, viewGroup, false);
        viewGroup.addView(viewInflate);
        if (viewInflate == null) {
            t3p.q("rootView");
            throw null;
        }
        ((i) this).itemView.setOnClickListener(new n6n(tjnVar, (byte) 3));
        q9n.f(((i) this).itemView, new svk(this, (byte) 16));
    }
}
