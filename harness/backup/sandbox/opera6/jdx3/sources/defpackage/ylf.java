package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ylf extends i41 {
    public imf l;

    public final View D() {
        imf imfVar = this.l;
        if (imfVar == null) {
            imfVar = null;
        }
        return imfVar.c;
    }

    public final void F(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        this.l = imf.a(LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }
}
