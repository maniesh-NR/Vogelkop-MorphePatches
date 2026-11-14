package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class f7o extends i {
    public final q5g b;
    public final int c;
    public final float d;

    public f7o(q5g q5gVar) {
        super((LinearLayout) q5gVar.b);
        this.b = q5gVar;
        jxh jxhVar = new jxh(2131167809);
        ImageView imageView = (ImageView) q5gVar.c;
        this.c = jxhVar.k(imageView.getContext());
        this.d = new jxh(2131167810).k(imageView.getContext());
        oon oonVar = new oon(this, (byte) 5);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, imageView, oonVar);
    }
}
