package defpackage;

import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class l25 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n25 b;
    public final /* synthetic */ s25 c;
    public final /* synthetic */ iu2 d;

    public /* synthetic */ l25(n25 n25Var, s25 s25Var, iu2 iu2Var, byte b) {
        this.a = b;
        this.b = n25Var;
        this.c = s25Var;
        this.d = iu2Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        iu2 iu2Var = this.d;
        s25 s25Var = this.c;
        n25 n25Var = this.b;
        List list = (List) obj;
        switch (b) {
            case 0:
                n25Var.g = list.size();
                n25Var.e(s25Var, iu2Var);
                break;
            default:
                n25Var.h = list.size();
                n25Var.e(s25Var, iu2Var);
                break;
        }
    }
}
