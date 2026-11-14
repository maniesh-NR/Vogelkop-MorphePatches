package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class pe9 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k5o b;

    public /* synthetic */ pe9(k5o k5oVar, byte b) {
        this.a = b;
        this.b = k5oVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        k5o k5oVar = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                ege egeVar = (ege) k5oVar.c;
                if (egeVar != null) {
                    if (l == null) {
                        egeVar.a();
                        break;
                    } else {
                        long jLongValue = l.longValue();
                        egeVar.d = true;
                        egeVar.e = jLongValue;
                        break;
                    }
                }
                break;
            case 1:
                q43 q43Var = (q43) obj;
                ege egeVar2 = (ege) k5oVar.c;
                if (egeVar2 != null) {
                    String str = q43Var.b;
                    egeVar2.a();
                    break;
                }
                break;
            case 2:
                Float f = (Float) obj;
                ege egeVar3 = (ege) k5oVar.c;
                if (egeVar3 != null) {
                    float fFloatValue = f.floatValue();
                    zb9 zb9Var = egeVar3.a;
                    if (fFloatValue != zb9Var.i) {
                        zb9Var.i = fFloatValue;
                        ac9 ac9Var = zb9Var.j;
                        if (ac9Var != null) {
                            ac9Var.e0();
                            break;
                        }
                    }
                }
                break;
            default:
                ege egeVar4 = (ege) k5oVar.c;
                if (egeVar4 != null) {
                    egeVar4.a();
                    break;
                }
                break;
        }
    }
}
