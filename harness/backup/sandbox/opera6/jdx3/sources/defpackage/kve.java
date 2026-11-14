package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class kve extends cve implements iue {
    public final x5f h;
    public final vm3 i;

    public kve(View view, ro9 ro9Var, uqe uqeVar, vue vueVar, vue vueVar2, dmg dmgVar, x5f x5fVar) {
        super(view, ro9Var, uqeVar, vueVar, vueVar2, dmgVar);
        this.h = x5fVar;
        vm3 vm3Var = new vm3((cve) this, (byte) 2);
        this.i = vm3Var;
        this.e.o(vm3Var);
        new sp8().attachToRecyclerView(this.e);
    }

    @Override // defpackage.iue
    public final void O(boolean z) {
    }

    @Override // defpackage.cve, defpackage.ya2
    public final void R() {
        super.R();
        this.i.b = false;
    }

    @Override // defpackage.cve
    public final nu8 e0() {
        return null;
    }

    @Override // defpackage.cve
    public final void h0(Context context) {
        haa haaVar = new haa((byte) 0);
        haaVar.d = 0;
        this.e.C0(new CarouselLayoutManager(haaVar));
    }

    @Override // defpackage.cve, defpackage.ab2
    public final void onDestroy() {
        super.onDestroy();
        this.e.t0(this.i);
    }
}
