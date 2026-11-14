package defpackage;

import android.view.CollapsibleActionView;
import com.opera.android.custom_views.ActionBarSearchView;

/* loaded from: classes.dex */
public final class fm3 implements CollapsibleActionView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fm3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // android.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        byte b = this.a;
    }

    @Override // android.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                im3 im3Var = (im3) obj;
                ActionBarSearchView actionBarSearchView = im3Var.H;
                rm3 rm3Var = im3Var.x.y;
                rm3Var.q();
                actionBarSearchView.setQuery((String) rm3Var.a, false);
                break;
            default:
                oy oyVar = (oy) obj;
                ActionBarSearchView actionBarSearchView2 = (ActionBarSearchView) oyVar.i;
                if (actionBarSearchView2 != null) {
                    shf shfVar = (shf) oyVar.c;
                    shfVar.q();
                    esi esiVar = (esi) shfVar.a;
                    actionBarSearchView2.setQuery(esiVar != null ? esiVar.a : null, false);
                }
                ActionBarSearchView actionBarSearchView3 = (ActionBarSearchView) oyVar.i;
                if (actionBarSearchView3 != null) {
                    actionBarSearchView3.setOnQueryTextListener(new yhe((Object) oyVar, (byte) 19));
                    break;
                }
                break;
        }
    }
}
