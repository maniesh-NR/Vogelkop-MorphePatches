package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class ixk implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxk b;
    public final /* synthetic */ bf9 c;

    public /* synthetic */ ixk(kxk kxkVar, bf9 bf9Var, byte b) {
        this.a = b;
        this.b = kxkVar;
        this.c = bf9Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        bf9 bf9Var = this.c;
        kxk kxkVar = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (b) {
            case 0:
                if (!zBooleanValue) {
                    kxkVar.b(2132019203, 5000);
                    break;
                } else {
                    ((db) kxkVar.a.get()).j(true);
                    bf9Var.h();
                    kxkVar.b(2132021772, 2500);
                    break;
                }
            default:
                if (!zBooleanValue) {
                    kxkVar.b(2132019203, 5000);
                    break;
                } else {
                    ixk ixkVar = new ixk(kxkVar, bf9Var, (byte) 0);
                    myk mykVarS = bf9Var.s();
                    if (mykVarS != null) {
                        new jyk(mykVarS, ixkVar);
                        break;
                    } else {
                        ixkVar.run(Boolean.FALSE);
                        break;
                    }
                }
        }
    }
}
