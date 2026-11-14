package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class f4c implements f5d {
    public final int a;
    public LayoutInflater b;

    public f4c(int i) {
        this.a = i;
    }

    public final View a(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = this.b;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(new j39(viewGroup.getContext(), 2132084390));
            this.b = layoutInflaterFrom;
        }
        return layoutInflaterFrom.inflate(this.a, viewGroup, false);
    }
}
