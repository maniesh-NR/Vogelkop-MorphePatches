package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class byg {
    public final HashMap a;
    public final HashMap b;

    public byg(yqa yqaVar) {
        this.a = new HashMap((HashMap) yqaVar.b);
        this.b = new HashMap((HashMap) yqaVar.c);
    }

    public final Object a(oup oupVar, Class cls) throws GeneralSecurityException {
        ayg aygVar = new ayg(oupVar.getClass(), cls);
        HashMap map = this.a;
        if (map.containsKey(aygVar)) {
            return ((vxg) map.get(aygVar)).c.a(oupVar);
        }
        sjn.h(aygVar, " available, see https://developers.google.com/tink/faq/registration_errors", "No PrimitiveConstructor for ");
        return null;
    }
}
