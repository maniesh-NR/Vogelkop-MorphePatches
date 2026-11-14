package defpackage;

import android.view.MenuItem;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class soj implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ kag[] a;
    public final /* synthetic */ OperaListItem b;
    public final /* synthetic */ toj c;

    public soj(toj tojVar, kag[] kagVarArr, OperaListItem operaListItem) {
        this.a = kagVarArr;
        this.b = operaListItem;
        this.c = tojVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        kag kagVar = this.a[menuItem.getItemId()];
        s9g s9gVar = s9g.h;
        uoj uojVar = this.c.c;
        s9gVar.p(uojVar.t, kagVar);
        uojVar.H0(this.b);
        return true;
    }
}
