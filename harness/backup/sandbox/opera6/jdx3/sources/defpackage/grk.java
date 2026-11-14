package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class grk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrk b;

    public /* synthetic */ grk(mrk mrkVar, byte b) {
        this.a = b;
        this.b = mrkVar;
    }

    public final boolean a() {
        byte b = this.a;
        mrk mrkVar = this.b;
        switch (b) {
            case 0:
                b2l b2lVar = mrkVar.i.o;
                if (b2lVar != null) {
                    return ((d7l) b2lVar).j.m();
                }
                return false;
            default:
                return mrkVar.I.a;
        }
    }
}
