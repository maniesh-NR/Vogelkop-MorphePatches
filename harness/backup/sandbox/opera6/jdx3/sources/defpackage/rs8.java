package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import com.opera.android.BrowserActivity;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.settings.SettingsManager;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class rs8 extends wu8 {
    public final dg7 g;
    public final ps8 h;
    public final ks6 i;
    public final ow7 j;
    public boolean k;

    public rs8(View view, FeedScrollView feedScrollView, x5f x5fVar, SettingsManager settingsManager, nr8 nr8Var, kze kzeVar, View.OnLongClickListener onLongClickListener, dg7 dg7Var, nv2 nv2Var, tlg tlgVar, bvl bvlVar, pde pdeVar, p6l p6lVar, ps8 ps8Var) {
        super(view);
        this.g = dg7Var;
        this.h = ps8Var;
        ks6 ks6Var = new ks6(this, (byte) 8);
        this.i = ks6Var;
        this.k = true;
        RecyclerView recyclerViewFindViewById = ((i) this).itemView.findViewById(2131363055);
        l5b l5bVar = q9n.c;
        ow7 ow7Var = new ow7((BrowserActivity) (recyclerViewFindViewById == null ? null : q9n.p(recyclerViewFindViewById.getContext())), nr8Var, recyclerViewFindViewById, feedScrollView, bvlVar, x5fVar, settingsManager, kzeVar, nv2Var, tlgVar, pdeVar, p6lVar);
        this.j = ow7Var;
        new eqh(recyclerViewFindViewById, onLongClickListener);
        ((pde) ow7Var.n.b).k(ks6Var);
    }

    @Override // defpackage.wu8
    public final void c0() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        ow7 ow7Var = this.j;
        if (ow7Var.j) {
            ow7Var.j = false;
            ow7Var.g.i();
        }
        this.g.run(Boolean.FALSE);
    }

    @Override // defpackage.wu8
    public final void e0() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        ow7 ow7Var = this.j;
        if (!ow7Var.j) {
            ow7Var.j = true;
            vml.c(new ig(ow7Var));
        }
        this.g.run(Boolean.TRUE);
    }

    @Override // defpackage.ab2
    public final void onDestroy() {
        ow7 ow7Var = this.j;
        ((pde) ow7Var.n.b).p(this.i);
        ow7Var.l.p(ow7Var.m);
        RecyclerView recyclerView = ow7Var.c;
        recyclerView.y0((d) null);
        ow7Var.i = null;
        recyclerView.C0((f) null);
        ow7Var.e.a.remove(ow7Var);
        lw7 lw7Var = ow7Var.h;
        tcc tccVar = lw7Var.b;
        if (tccVar != null) {
            tccVar.b(lw7Var);
            lw7Var.b = null;
        }
    }
}
