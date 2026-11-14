package defpackage;

import j$.util.Collection;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class osg extends hv9 {
    private static final osg DEFAULT_INSTANCE;
    private static volatile r1g PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private gfb strings_ = b7h.d;

    static {
        osg osgVar = new osg();
        DEFAULT_INSTANCE = osgVar;
        hv9.j(osg.class, osgVar);
    }

    public static osg m() {
        return DEFAULT_INSTANCE;
    }

    public static nsg o() {
        return (nsg) ((bv9) DEFAULT_INSTANCE.c(5));
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
                return new ekh(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new osg();
            case 4:
                return new nsg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r1g r1gVar = PARSER;
                if (r1gVar != null) {
                    return r1gVar;
                }
                synchronized (osg.class) {
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

    public final void l(Iterable iterable) {
        Collection collectionD = this.strings_;
        if (!((o6) collectionD).a) {
            int size = collectionD.size();
            collectionD = ((b7h) collectionD).d(size == 0 ? 10 : size << 1);
            this.strings_ = collectionD;
        }
        Charset charset = jfb.a;
        if (iterable instanceof e7c) {
            ((e7c) iterable).l();
            h9o.t();
            return;
        }
        if (iterable instanceof zxg) {
            collectionD.addAll((java.util.Collection) iterable);
            return;
        }
        if ((collectionD instanceof ArrayList) && (iterable instanceof java.util.Collection)) {
            ((ArrayList) collectionD).ensureCapacity(((java.util.Collection) iterable).size() + collectionD.size());
        }
        int size2 = collectionD.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (collectionD.size() - size2) + " is null.";
                for (int size3 = collectionD.size() - 1; size3 >= size2; size3--) {
                    collectionD.remove(size3);
                }
                t3p.q(str);
                return;
            }
            collectionD.add(obj);
        }
    }

    public final gfb n() {
        return this.strings_;
    }
}
