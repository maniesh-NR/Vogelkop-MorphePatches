package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;

/* loaded from: classes.dex */
public final class sg2 implements ato {
    public Object a;
    public final ato b;
    public final /* synthetic */ byte c;

    public sg2(a2 a2Var, ato atoVar, byte b) {
        this.c = b;
        switch (b) {
            case 1:
                this.b = atoVar;
                s61 s61Var = a2Var.I;
                this.a = s61Var != null ? s61Var.e : null;
                break;
            default:
                this.a = a2Var;
                this.b = atoVar;
                break;
        }
    }

    @Override // defpackage.ato
    public final ato a() {
        switch (this.c) {
        }
        return this.b.a();
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        switch (this.c) {
        }
        return this.b.a(cy0Var, map, mt5Var);
    }

    @Override // defpackage.ato
    public final void a(String str) {
        switch (this.c) {
            case 0:
                this.b.a(str);
                break;
            default:
                this.a = str;
                break;
        }
    }

    @Override // defpackage.ato
    public final int b() {
        switch (this.c) {
        }
        return this.b.b();
    }

    @Override // defpackage.ato
    public final boolean c() {
        switch (this.c) {
        }
        return this.b.c();
    }

    @Override // defpackage.ato
    public final String d() {
        switch (this.c) {
            case 0:
                s61 s61Var = ((a2) this.a).I;
                if (s61Var != null) {
                    return s61Var.e;
                }
                return null;
            default:
                return (String) this.a;
        }
    }
}
