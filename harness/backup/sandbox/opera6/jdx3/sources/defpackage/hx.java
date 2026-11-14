package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hx implements ea2 {
    public final /* synthetic */ byte a;
    public Object b;

    public hx(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.b = new ArrayList();
                break;
        }
    }

    public /* synthetic */ hx(kze kzeVar, byte b) {
        this.a = b;
        this.b = kzeVar;
    }

    public final void a(ea2 ea2Var) {
        ((ArrayList) this.b).add(ea2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        byte b = 1;
        int i2 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                if (i == 2131558728) {
                    return new ix(ha2.M(viewGroup, i, 0), (kze) this.b, objArr == true ? 1 : 0);
                }
                return null;
            case 1:
                if (i == 2131558733 || i == 2131558731 || i == 2131558732) {
                    return new mx(ha2.M(viewGroup, i, 0), (kze) this.b, (byte) 0);
                }
                return null;
            case 2:
                if (i == 2131558759) {
                    return new ix(ha2.M(viewGroup, i, 0), (kze) this.b, b);
                }
                return null;
            case 3:
                if (i != 2131558762 && i != 2131558761 && i != 2131558760) {
                    return null;
                }
                View viewM = ha2.M(viewGroup, i, 0);
                so8 so8Var = new so8(viewM, new to8(), (kze) this.b);
                AppCompatImageView zo8Var = new zo8(viewM.getContext());
                gu8.h0("http://localhost:8082/image", zo8Var, so8Var.k, false, new d06(viewM));
                so8Var.h0(zo8Var);
                return so8Var;
            case 4:
                if (i == 2131558765 || i == 2131558763 || i == 2131558764) {
                    return new eu9(ha2.M(viewGroup, i, 0), (kze) this.b);
                }
                return null;
            case 5:
                if (i == 2131558771) {
                    return new ix(ha2.M(viewGroup, i, 0), (kze) this.b, (byte) 2);
                }
                return null;
            case 6:
                if (i == 2131558774 || i == 2131558772 || i == 2131558773) {
                    return new mx(ha2.M(viewGroup, i, 0), (kze) this.b, (byte) 1);
                }
                return null;
            default:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ab2 ab2VarK = ((ea2) obj).k(viewGroup, i);
                    if (ab2VarK != null) {
                        return ab2VarK;
                    }
                }
                return null;
        }
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        switch (this.a) {
            case 0:
                return ja2Var instanceof co ? 2131558728 : 0;
            case 1:
                if (!(ja2Var instanceof jo)) {
                    return 0;
                }
                if (ca2Var.b > 1) {
                    return 2131558732;
                }
                return ca2Var.a ? 2131558733 : 2131558731;
            case 2:
                return ja2Var instanceof po8 ? 2131558759 : 0;
            case 3:
                if (!(ja2Var instanceof ro8)) {
                    return 0;
                }
                int iOrdinal = ((ro8) ja2Var).p.u.ordinal();
                if (iOrdinal == 0) {
                    return 2131558762;
                }
                if (iOrdinal == 1) {
                    return 2131558761;
                }
                if (iOrdinal == 2) {
                    return 2131558760;
                }
                h9o.p();
                return 0;
            case 4:
                if (!(ja2Var instanceof vkf)) {
                    return 0;
                }
                if (ca2Var.b > 1) {
                    return 2131558764;
                }
                return ca2Var.a ? 2131558765 : 2131558763;
            case 5:
                return ja2Var instanceof fjf ? 2131558771 : 0;
            case 6:
                if (!(ja2Var instanceof inf)) {
                    return 0;
                }
                if (ca2Var.b > 1) {
                    return 2131558773;
                }
                return ca2Var.a ? 2131558774 : 2131558772;
            default:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    int iQ = ((ea2) obj).q(ja2Var, i, ca2Var);
                    if (iQ != 0) {
                        return iQ;
                    }
                }
                return 0;
        }
    }
}
