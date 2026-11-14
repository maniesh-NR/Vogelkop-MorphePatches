package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class ulj extends d {
    public final void onBindViewHolder(i iVar, int i) {
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewN = j7c.n(viewGroup, 2131559347, viewGroup, false);
        if (viewN != null) {
            return new zl5((FrameLayout) viewN);
        }
        t3p.q("rootView");
        return null;
    }
}
