package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nzb extends ba2 {
    public final /* synthetic */ byte b;
    public final tah c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzb(tah tahVar, byte b) {
        super(kzb.class);
        this.b = b;
        switch (b) {
            case 1:
                super(qmf.class);
                this.c = tahVar;
                break;
            case 2:
                super(xxc.class);
                this.c = tahVar;
                break;
            default:
                this.c = tahVar;
                break;
        }
    }

    private final void t(int i, ArrayList arrayList) {
    }

    private final void u(int i, ArrayList arrayList) {
    }

    private final void w(int i, ArrayList arrayList) {
    }

    public static CharSequence y(String str, rcd rcdVar) {
        if (rcdVar == null) {
            return str;
        }
        Pair pair = rcdVar.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), 33);
        return spannableStringBuilder;
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        byte b = this.b;
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        byte b = this.b;
        tah tahVar = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                if (i == 2131559526) {
                    return new mzb(ha2.M(viewGroup, i, 0), tahVar);
                }
                return null;
            case 1:
                if (i == 2131559525) {
                    return new kpf(owc.a(ha2.M(viewGroup, i, 0)), tahVar, b2);
                }
                return null;
            default:
                if (i == 2131559512) {
                    return new kpf(owc.a(ha2.M(viewGroup, i, 0)), tahVar, (byte) 3);
                }
                if (i == 2131559510) {
                    return new kpf(owc.a(ha2.M(viewGroup, i, 0)), tahVar, (byte) 2);
                }
                return null;
        }
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        switch (this.b) {
            case 0:
                if (ja2Var instanceof kzb) {
                }
                break;
            case 1:
                if (ja2Var instanceof qmf) {
                }
                break;
            default:
                if (!(ja2Var instanceof wxc)) {
                    if (ja2Var instanceof vxc) {
                    }
                }
                break;
        }
        return 0;
    }
}
