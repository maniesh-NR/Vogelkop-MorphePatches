package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;

/* loaded from: classes.dex */
public final class ucj extends i {
    public final q5g b;
    public final ldh c;

    public ucj(q5g q5gVar, ldh ldhVar) {
        super((LayoutDirectionLinearLayout) q5gVar.b);
        this.b = q5gVar;
        this.c = ldhVar;
        View view = ((i) this).itemView;
        view.setOutlineProvider(new tk4(view, (byte) 4));
        view.setClipToOutline(true);
    }
}
