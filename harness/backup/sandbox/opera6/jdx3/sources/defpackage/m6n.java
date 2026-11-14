package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class m6n extends o6n {
    public final StylingImageView c;

    /* JADX WARN: Multi-variable type inference failed */
    public m6n(Context context, int i, tjn tjnVar) {
        super(new y46(context, new k6n(tjnVar, (byte) 1), new k6n(tjnVar, (byte) 2)), i, tjnVar);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((i) this).itemView.getContext());
        ViewGroup viewGroup = (ViewGroup) ((i) this).itemView;
        View viewInflate = layoutInflaterFrom.inflate(2131559548, viewGroup, false);
        viewGroup.addView(viewInflate);
        if (viewInflate == 0) {
            t3p.q("rootView");
            throw null;
        }
        this.c = (StylingImageView) viewInflate;
        q9n.f(((i) this).itemView, new svk(this, (byte) 14));
    }
}
