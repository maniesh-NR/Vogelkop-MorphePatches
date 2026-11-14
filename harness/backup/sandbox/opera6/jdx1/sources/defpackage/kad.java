package defpackage;

/* loaded from: classes.dex */
public final class kad {
    public static gad a(Object obj, Object obj2) {
        gad gadVarJ = (gad) obj;
        gad gadVar = (gad) obj2;
        if (!gadVar.isEmpty()) {
            if (!gadVarJ.a) {
                gadVarJ = gadVarJ.j();
            }
            gadVarJ.g();
            if (!gadVar.isEmpty()) {
                gadVarJ.putAll(gadVar);
            }
        }
        return gadVarJ;
    }
}
