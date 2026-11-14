package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class cu extends eu implements h4a {
    public final jt c;
    public final bs d;
    public is e;

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public cu(ViewGroup viewGroup, bs bsVar) {
        Object objN = j7c.n(viewGroup, 2131558448, null, false);
        if (objN == null) {
            t3p.q("rootView");
            throw null;
        }
        ?? r4 = (OperaListItem) objN;
        jt jtVar = new jt(r4, (byte) 0);
        super((View) r4);
        this.c = jtVar;
        this.d = bsVar;
        r4.setOnClickListener(new ks8(new gf((Object) this, (byte) 6), (byte) 2));
        r4.setOnLongClickListener(new zt((Object) this, (byte) 1));
    }

    @Override // defpackage.eu
    public final void U(js jsVar) {
        is isVar = (is) jsVar;
        this.e = isVar;
        st stVar = isVar.c;
        Integer num = stVar.d;
        jt jtVar = this.c;
        if (num != null) {
            jtVar.b.z(new lxh(num.intValue()));
        }
        OperaListItem operaListItem = jtVar.b;
        operaListItem.E(stVar.a);
        v0g.m(operaListItem, stVar.b);
        operaListItem.v(stVar.k ? new lxh(2131232238) : new lxh(2131231971));
    }

    @Override // defpackage.h4a
    public final void l(Rect rect) {
        rect.set(0, 0, 0, 0);
    }
}
