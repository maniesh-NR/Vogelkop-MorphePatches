package defpackage;

import com.opera.api.Callback;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ps2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rs2 b;

    public /* synthetic */ ps2(rs2 rs2Var, byte b) {
        this.a = b;
        this.b = rs2Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        rs2 rs2Var = this.b;
        switch (b) {
            case 0:
                a4g a4gVar = (a4g) obj;
                rs2Var.f = Collections.unmodifiableList(a4gVar.a).size();
                a4gVar.a();
                rs2Var.a();
                break;
            case 1:
                rs2Var.g = ((List) obj).size();
                rs2Var.a();
                break;
            case 2:
                rs2Var.h = ((List) obj).size();
                rs2Var.a();
                break;
            default:
                rs2Var.i = ((List) obj).size();
                rs2Var.a();
                break;
        }
    }
}
