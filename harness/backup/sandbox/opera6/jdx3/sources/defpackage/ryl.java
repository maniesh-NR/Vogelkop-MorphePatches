package defpackage;

import android.os.Bundle;
import androidx.fragment.app.i;
import androidx.fragment.app.w;

/* loaded from: classes.dex */
public class ryl extends i implements btj {
    public boolean a;
    public btj b;

    @Override // defpackage.btj
    public final void I() {
        btj btjVar = this.b;
        if (btjVar != null) {
            btjVar.I();
        }
    }

    public void g0() {
        if (this.a) {
            return;
        }
        if (i0()) {
            h0(getFragmentManager());
        }
        this.a = true;
    }

    public void h0(w wVar) {
        wVar.X();
    }

    public final boolean i0() {
        w fragmentManager = getFragmentManager();
        return (this.a || fragmentManager == null || fragmentManager.L || isRemoving()) ? false : true;
    }

    public void j0(btj btjVar) {
        this.b = btjVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setShowsDialog(false);
    }

    public void onDestroy() {
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        getViewModelStore().a();
    }

    @Override // defpackage.btj
    public final int z(o93 o93Var, mim mimVar) {
        btj btjVar = this.b;
        if (btjVar != null) {
            return btjVar.z(o93Var, mimVar);
        }
        return 3;
    }
}
