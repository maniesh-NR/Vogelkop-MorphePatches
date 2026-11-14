package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class msg extends hv9 {
    private static final msg DEFAULT_INSTANCE;
    private static volatile r1g PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private gad preferences_ = gad.b;

    static {
        msg msgVar = new msg();
        DEFAULT_INSTANCE = msgVar;
        hv9.j(msg.class, msgVar);
    }

    public static ksg n() {
        return (ksg) ((bv9) DEFAULT_INSTANCE.c(5));
    }

    public static msg o(InputStream inputStream) {
        s75 q75Var;
        msg msgVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = jfb.b;
            int length = bArr.length;
            q75Var = new o75(bArr, 0, length, false);
            try {
                q75Var.m(length);
            } catch (cjb e) {
                t3p.n(e);
                return null;
            }
        } else {
            q75Var = new q75(inputStream);
        }
        zk8 zk8VarA = zk8.a();
        hv9 hv9VarI = msgVar.i();
        try {
            y6h y6hVar = y6h.c;
            y6hVar.getClass();
            bni bniVarA = y6hVar.a(hv9VarI.getClass());
            r05 r05Var = (r05) q75Var.c;
            if (r05Var == null) {
                r05Var = new r05(q75Var);
            }
            bniVarA.a(hv9VarI, r05Var, zk8VarA);
            bniVarA.makeImmutable(hv9VarI);
            if (hv9.f(hv9VarI, true)) {
                return (msg) hv9VarI;
            }
            throw new cjb(new alm().getMessage());
        } catch (alm e2) {
            throw new cjb(e2.getMessage());
        } catch (cjb e3) {
            if (e3.a) {
                throw new cjb(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof cjb) {
                throw ((cjb) e4.getCause());
            }
            throw new cjb(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof cjb) {
                throw ((cjb) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // defpackage.hv9
    public final Object c(int i) {
        r1g dv9Var;
        switch (vep.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ekh(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", lsg.a});
            case 3:
                return new msg();
            case 4:
                return new ksg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r1g r1gVar = PARSER;
                if (r1gVar != null) {
                    return r1gVar;
                }
                synchronized (msg.class) {
                    dv9Var = PARSER;
                    if (dv9Var == null) {
                        dv9Var = new dv9();
                        PARSER = dv9Var;
                    }
                }
                return dv9Var;
            default:
                t3p.o();
                return null;
        }
    }

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final gad m() {
        gad gadVar = this.preferences_;
        if (gadVar.a) {
            return gadVar;
        }
        gad gadVarJ = gadVar.j();
        this.preferences_ = gadVarJ;
        return gadVarJ;
    }
}
