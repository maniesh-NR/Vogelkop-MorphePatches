package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eve extends ba2 {
    public final /* synthetic */ byte b = 1;
    public final Object c;
    public final Object d;

    public eve(Context context, tah tahVar) {
        super(nxc.class);
        this.c = context;
        this.d = tahVar;
    }

    public eve(uqe uqeVar, vue vueVar, vue vueVar2, dmg dmgVar) {
        r9i r9iVar = new r9i((Object) uqeVar, (Object) vueVar, (Object) vueVar2, (Object) dmgVar, (byte) 22);
        super(j82.class);
        this.c = r9iVar;
        this.d = uqeVar;
    }

    private final void t(int i, ArrayList arrayList) {
    }

    private final void u(int i, ArrayList arrayList) {
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        byte b = this.b;
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        ab2 idnVar;
        byte b = this.b;
        byte b2 = 2;
        Object obj = this.d;
        byte b3 = 1;
        byte b4 = 0;
        switch (b) {
            case 0:
                uqe uqeVar = (uqe) obj;
                if (i == 2131558810) {
                    return new ou8(new mve(uqeVar, new dve(this, b3), new dve(this, b2), new dve(this, (byte) 3), (byte) 0), ha2.M(viewGroup, i, 0));
                }
                if (i == 2131558809) {
                    return new ov8(ha2.M(viewGroup, i, 0), uqeVar.w, new r9i((Object) uqeVar, (Object) new dve(this, (byte) 4), (Object) new dve(this, (byte) 5), (Object) new dve(this, (byte) 6), (byte) 22));
                }
                Object obj2 = null;
                if (i == 2131558813) {
                    return new dx8(new r9i((Object) uqeVar, (Object) new dve(this, (byte) 7), obj2, (Object) new dve(this, (byte) 8), (byte) 22), ha2.M(viewGroup, i, 0));
                }
                if (i == 2131558807) {
                    return new ju8(new r9i((Object) uqeVar, (Object) new dve(this, (byte) 9), obj2, (Object) new dve(this, b4), (byte) 22), ha2.M(viewGroup, i, 0));
                }
                if (2131558803 != i) {
                    return null;
                }
                return new ou8((r9i) this.c, ha2.M(viewGroup, i, 0));
            default:
                tah tahVar = (tah) obj;
                if (i == 2131559511) {
                    return new kpf(owc.a(ha2.M(viewGroup, i, 0)), tahVar, b3);
                }
                if (i == 2131559509) {
                    idnVar = new jdn(ha2.M(viewGroup, i, 0), tahVar, new hdn(this, b4));
                } else if (i == 2131559508) {
                    idnVar = new idn(ha2.M(viewGroup, i, 0), tahVar, new hdn(this, b3));
                } else {
                    if (i != 2131559513) {
                        return null;
                    }
                    idnVar = new idn(ha2.M(viewGroup, i, 0), tahVar, new hdn(this, b2), (byte) 0);
                }
                return idnVar;
        }
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        switch (this.b) {
            case 0:
                oqe oqeVar = ((pue) ja2Var).c;
                if (oqeVar instanceof dre) {
                    return 2131558810;
                }
                if ((oqeVar instanceof rre) && ((rre) oqeVar).E) {
                    return 2131558809;
                }
                if (oqeVar instanceof d9i) {
                    return 2131558813;
                }
                return "podcast".equals(oqeVar.c) ? 2131558807 : 2131558803;
            default:
                if (!(ja2Var instanceof kxc)) {
                    if (ja2Var instanceof jxc) {
                        return 2131559509;
                    }
                    if (ja2Var instanceof ixc) {
                        return 2131559508;
                    }
                    if (ja2Var instanceof lxc) {
                        return 2131559513;
                    }
                    if (!(ja2Var instanceof mxc)) {
                        return 0;
                    }
                }
                return 2131559511;
        }
    }
}
