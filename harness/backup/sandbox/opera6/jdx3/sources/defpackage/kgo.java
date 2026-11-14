package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class kgo implements n1p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kgo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.n1p
    public final void invoke(Object obj) {
        p7p p7pVar;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ivo) obj2).invoke((t0i) obj);
                break;
            case 1:
                t5p t5pVar = (t5p) obj;
                ((a3p) obj2).g("window.operaBridge.notifyConnectionChange('" + t5pVar.a() + "', '" + t5pVar.c + "')");
                break;
            default:
                o7p o7pVar = (o7p) obj2;
                if (t0i.d(((t0i) obj).a) != null && (p7pVar = o7pVar.i) != null) {
                    LinkedHashSet linkedHashSet = p7p.c;
                    p7pVar.g(9004, null);
                    break;
                }
                break;
        }
    }
}
