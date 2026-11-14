package defpackage;

import com.opera.android.widget.UrlFieldEditText;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xpm implements wpm {
    public UrlFieldEditText a;
    public final pde c;
    public final ArrayList b = new ArrayList();
    public final g9l d = new g9l(this, (byte) 9);

    public xpm(UrlFieldEditText urlFieldEditText) {
        this.a = urlFieldEditText;
        this.c = new pde(this.a.w.g());
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        z6f z6fVar = (z6f) obj;
        this.a.F(z6fVar);
        this.b.add(z6fVar);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        z6f z6fVar = (z6f) obj;
        this.a.H(z6fVar);
        this.b.remove(z6fVar);
    }

    @Override // defpackage.wpm
    public final int L() {
        return this.a.Q;
    }
}
