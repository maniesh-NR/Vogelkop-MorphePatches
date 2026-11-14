package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class kyk implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jyk b;

    public /* synthetic */ kyk(jyk jykVar, byte b) {
        this.a = b;
        this.b = jykVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        jyk jykVar = this.b;
        switch (b) {
            case 0:
                lv5 lv5Var = (lv5) obj;
                if (lv5Var != null) {
                    lv5Var.a(new qlk(jykVar, (byte) 20));
                    break;
                } else {
                    jykVar.c(Boolean.FALSE);
                    break;
                }
            default:
                jykVar.c(Boolean.FALSE);
                break;
        }
    }
}
