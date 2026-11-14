package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public class plf extends uup {
    public imf h;

    public void G(pxh pxhVar) {
        int i = OperaListItem.C;
        imf imfVar = this.h;
        if (imfVar == null) {
            imfVar = null;
        }
        ImageView imageView = imfVar.c;
        CharSequence charSequenceA = pxhVar.a(imageView.getResources());
        imageView.setContentDescription(charSequenceA);
        imageView.setTooltipText(charSequenceA);
    }

    public final void H(boolean z) {
        imf imfVar = this.h;
        if (imfVar == null) {
            imfVar = null;
        }
        imfVar.c.setEnabled(z);
    }

    public final void I(boolean z) {
        imf imfVar = this.h;
        if (imfVar == null) {
            imfVar = null;
        }
        imfVar.c.setImportantForAccessibility(z ? 1 : 2);
    }

    public boolean J() {
        imf imfVar = this.h;
        if (imfVar == null) {
            imfVar = null;
        }
        return imfVar.c.hasOnClickListeners();
    }

    public void O(b8h b8hVar) {
        imf imfVar = this.h;
        ImageView imageView = (imfVar != null ? imfVar : null).c;
        if (imfVar == null) {
            imfVar = null;
        }
        imageView.setImageDrawable(b8hVar.f(imfVar.c.getContext()));
    }

    public void v(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        LayoutInflater.from(viewGroup.getContext()).inflate(2131559184, viewGroup);
        ImageView imageView = (ImageView) w1h.j(2131363187, viewGroup);
        if (imageView != null) {
            this.h = new imf(viewGroup, imageView, (byte) 0);
        } else {
            t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(2131363187)));
        }
    }
}
