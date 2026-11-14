package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f9g implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ lag b;
    public final /* synthetic */ OperaListItem c;
    public final /* synthetic */ String d;
    public final /* synthetic */ g9g e;

    public f9g(g9g g9gVar, ArrayList arrayList, lag lagVar, OperaListItem operaListItem, String str) {
        this.a = arrayList;
        this.b = lagVar;
        this.c = operaListItem;
        this.d = str;
        this.e = g9gVar;
    }

    public final void a(kag kagVar) {
        s9g s9gVar = s9g.h;
        g9g g9gVar = this.e;
        s9gVar.o(false, g9gVar.w, this.b, kagVar, true);
        Context context = g9gVar.getContext();
        String str = this.d;
        lag lagVar = this.b;
        qxh qxhVar = new qxh(ui6.R(context, lagVar, kagVar, str));
        OperaListItem operaListItem = this.c;
        operaListItem.C(qxhVar);
        operaListItem.z(new lxh(ui6.z(lagVar, kagVar)));
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        kag kagVar = (kag) this.a.get(menuItem.getItemId());
        Context contextRequireContext = this.e.requireContext();
        sz4 sz4Var = (sz4) contextRequireContext.getSystemService("com.opera.android.permissions.PermissionHandlerService");
        Objects.requireNonNull(sz4Var);
        if (this.b == lag.b && kagVar == kag.GRANTED && yi4.T(sz4Var)) {
            yi4.R(contextRequireContext, sz4Var, oi.d(contextRequireContext), new eof(this, kagVar, (byte) 7));
            return true;
        }
        a(kagVar);
        return true;
    }
}
