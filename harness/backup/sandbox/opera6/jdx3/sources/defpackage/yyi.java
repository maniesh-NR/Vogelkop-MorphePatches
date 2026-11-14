package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.opera.android.BrowserActivity;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class yyi extends ltl implements qzi {
    public final tzi r;
    public final boolean s;
    public MenuItem t;
    public final int u;
    public CollapsingToolbarLayout v;
    public kf w;

    /* JADX WARN: Illegal instructions before constructor call */
    public yyi(int i, int i2, int i3, int i4) {
        u7k u7kVarJ = u7k.j(i);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(i2);
        itlVar.b = i3 == 0 ? 2131755058 : i3;
        super(itlVar);
        tzi tziVar = new tzi();
        this.r = tziVar;
        this.s = true;
        this.u = i4;
        tziVar.c.b(this);
        tziVar.d.b(this);
    }

    public boolean G0() {
        return false;
    }

    public boolean H0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        tzi tziVar = this.r;
        if (itemId != 2131363484) {
            if (menuItem.getItemId() != 2131363474) {
                return false;
            }
            tziVar.d();
            return true;
        }
        e5d e5dVar = tziVar.a;
        if (tziVar.e != null) {
            int size = ((LinkedHashSet) e5dVar.c).size();
            tziVar.h = true;
            for (int i = 0; i < tziVar.e.a.getItemCount(); i++) {
                if (tziVar.e.a(i)) {
                    long itemId2 = tziVar.e.a.getItemId(i);
                    if (((LinkedHashSet) e5dVar.c).add(Long.valueOf(itemId2))) {
                        e5dVar.c(itemId2, true);
                    }
                }
            }
            tziVar.h = false;
            if (size != ((LinkedHashSet) e5dVar.c).size()) {
                tziVar.a();
            }
        }
        return true;
    }

    public void I0() {
        MenuItem menuItem = this.t;
        if (menuItem != null) {
            menuItem.setVisible(G0());
        }
    }

    public void J0(itd itdVar, int i) {
        itdVar.setGroupVisible(2131363479, i > 0);
        itdVar.findItem(2131362654).setVisible(i == 1);
        itdVar.findItem(2131362505).setVisible(i > 0);
        MenuItem menuItemFindItem = itdVar.findItem(2131363482);
        menuItemFindItem.setVisible(i > 0);
        if (i > 1) {
            menuItemFindItem.setTitle(getString(2132020201));
        } else {
            menuItemFindItem.setTitle(getString(2132018428));
        }
        MenuItem menuItemFindItem2 = itdVar.findItem(2131363481);
        menuItemFindItem2.setVisible(i > 0);
        if (i > 1) {
            menuItemFindItem2.setTitle(getString(2132019767));
        } else {
            menuItemFindItem2.setTitle(getString(2132018430));
        }
    }

    @Override // defpackage.qzi
    public final void W(boolean z) {
        if (!z) {
            se seVar = this.m;
            if (seVar != null) {
                seVar.a();
                return;
            }
            return;
        }
        rii riiVar = new rii((Object) this, (byte) 2);
        if (this.m != null) {
            return;
        }
        BrowserActivity activity = getActivity();
        int i = BrowserActivity.E1;
        this.m = activity.startSupportActionMode(new ivg((byte) 10, this, riiVar, false));
    }

    @Override // defpackage.ltl
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363483) {
            return false;
        }
        this.r.c();
        return true;
    }

    @Override // defpackage.ltl
    public void x0(itd itdVar) {
        if (this.s) {
            Toolbar toolbar = this.l;
            toolbar.getClass();
            new lsk(toolbar.getContext()).inflate(2131755058, toolbar.o());
        }
        this.t = itdVar.findItem(2131363483);
        I0();
    }
}
