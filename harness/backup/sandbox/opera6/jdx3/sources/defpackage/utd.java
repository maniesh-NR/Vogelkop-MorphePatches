package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class utd implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ utd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((MenuItem.OnActionExpandListener) obj2).onMenuItemActionCollapse(((vtd) obj).U(menuItem));
            default:
                if (!menuItem.equals(((itd) obj2).findItem(2131364146))) {
                    return false;
                }
                ((uoj) obj).G0(false);
                return true;
        }
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((MenuItem.OnActionExpandListener) obj2).onMenuItemActionExpand(((vtd) obj).U(menuItem));
            default:
                if (!menuItem.equals(((itd) obj2).findItem(2131364146))) {
                    return false;
                }
                ((uoj) obj).G0(true);
                return true;
        }
    }
}
