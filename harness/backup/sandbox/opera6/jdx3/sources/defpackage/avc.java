package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class avc extends ba2 {
    public final /* synthetic */ byte b = 0;
    public Object c;

    public /* synthetic */ avc(Class cls) {
        super(cls);
    }

    public avc(wse wseVar) {
        super(ewc.class);
        this.c = wseVar;
    }

    private final void t(int i, ArrayList arrayList) {
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        switch (this.b) {
            case 0:
                if (i == 0) {
                    xuc xucVar = (xuc) this.c;
                    if (xucVar == null) {
                        xucVar = new xuc((byte) 0);
                        this.c = xucVar;
                    }
                    arrayList.add(0, xucVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        switch (this.b) {
            case 0:
                if (i == 2131558824) {
                    return new zuc(ha2.M(viewGroup, i, 0));
                }
                return null;
            default:
                if (i == 2131558985) {
                    return new hwc(ha2.M(viewGroup, i, 0), (byte) 1);
                }
                if (i == 2131558989) {
                    return new hwc(ha2.M(viewGroup, i, 0), (byte) 3);
                }
                if (i == 2131558988) {
                    return new hwc(ha2.M(viewGroup, i, 0), (byte) 2);
                }
                if (i == 2131558984) {
                    return new hwc(ha2.M(viewGroup, i, 0), (byte) 0);
                }
                return null;
        }
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        switch (this.b) {
            case 0:
                return 2131558824;
            default:
                if (ja2Var instanceof iwc) {
                    return 2131558985;
                }
                if (ja2Var instanceof kwc) {
                    return 2131558989;
                }
                if (ja2Var instanceof jwc) {
                    return 2131558988;
                }
                return ja2Var instanceof fwc ? 2131558984 : 0;
        }
    }
}
