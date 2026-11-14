package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public final class ioc extends l53 {
    public final /* synthetic */ byte c;
    public final View d;
    public final Object e;

    public /* synthetic */ ioc(byte b, View view, Object obj) {
        this.c = b;
        this.d = view;
        this.e = obj;
    }

    public ioc(View view, gv8 gv8Var) {
        this.c = (byte) 0;
        this.d = view;
        this.e = gv8Var;
    }

    @Override // defpackage.pz3
    public final lz3 c(ViewGroup viewGroup) {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                ixh ixhVar = new ixh(8.0f);
                View view = this.d;
                exd exdVar = new exd(viewGroup, new l11(3, ixhVar.k(view.getContext()), 48, view), (List) ((gv8) obj).invoke());
                exdVar.a(new vt5(this, (byte) 1));
                return exdVar;
            case 1:
                sxh sxhVar = new sxh(2132018985, new Object[0]);
                View view2 = this.d;
                fan.a(8.0f, view2.getResources());
                return new sba(new qba(viewGroup, view2, 0, 1, sxhVar, new f1p(this, view2, false), 2131558914, null, false));
            case 2:
                sxh sxhVar2 = new sxh(2132021807, new Object[0]);
                View view3 = this.d;
                fan.a(8.0f, view3.getResources());
                return new sba(new qba(viewGroup, view3, z7h.h(view3.getContext(), 8.0f), 3, sxhVar2, new rii(this, (byte) 11), 2131558914, null, false));
            case 3:
                sxh sxhVar3 = new sxh(2132017193, new Object[0]);
                View view4 = this.d;
                fan.a(8.0f, view4.getResources());
                return new sba(new qba(viewGroup, view4, 0, 1, sxhVar3, new wzg((byte) 10, this, view4, false), 2131558914, null, false));
            default:
                kdo kdoVar = (kdo) obj;
                rn9 rn9Var = new rn9((Object) kdoVar.j, (Object) mf0.m, (byte) 18);
                sxh sxhVar4 = new sxh(2132022714, new Object[0]);
                View view5 = this.d;
                fan.a(8.0f, view5.getResources());
                return new sba(new qba(viewGroup, view5, 0, 1, sxhVar4, new agm(kdoVar, rn9Var, view5, (byte) 8), 2131558915, new oc(new rxh(2132022713), new obn(rn9Var, kdoVar, (byte) 12)), false));
        }
    }
}
