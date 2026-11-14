package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class ls implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ns b;

    public /* synthetic */ ls(ns nsVar, byte b) {
        this.a = b;
        this.b = nsVar;
    }

    public final Object g(Object obj) {
        byte b = this.a;
        ns nsVar = this.b;
        switch (b) {
            case 0:
                return nsVar.b(obj);
            case 1:
                nsVar.g = obj;
                if (nsVar.f && obj != null) {
                    nsVar.f = false;
                    nsVar.c(obj);
                }
                nsVar.c(obj);
                return Unit.a;
            case 2:
                ms msVar = (ms) obj;
                return nsVar.a(msVar.a, msVar.b, msVar.c);
            default:
                nsVar.d.invoke(obj);
                return Unit.a;
        }
    }
}
