package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class qlf extends plf {
    @Override // defpackage.plf
    public final void G(pxh pxhVar) {
        int i = OperaListItem.C;
        imf imfVar = this.h;
        if (imfVar == null) {
            imfVar = null;
        }
        ImageView imageView = imfVar.c;
        CharSequence charSequenceA = new sxh(2132021926, new Object[]{pxhVar}).a(imageView.getResources());
        imageView.setContentDescription(charSequenceA);
        imageView.setTooltipText(charSequenceA);
    }

    @Override // defpackage.plf
    public final boolean J() {
        return false;
    }

    @Override // defpackage.plf
    public final void O(b8h b8hVar) {
    }

    @Override // defpackage.plf
    public final void v(ViewGroup viewGroup) {
        super.v(viewGroup);
        imf imfVar = this.h;
        if (imfVar == null) {
            imfVar = null;
        }
        imfVar.c.setImageResource(2131232143);
    }
}
