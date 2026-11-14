package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class pv6 implements u89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.u89
    public final float invoke() {
        tul state;
        tul state2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rul rulVar = ((amj) obj).k;
                if (rulVar == null || (state = rulVar.getState()) == null) {
                    return 0.0f;
                }
                return state.c.h();
            case 1:
                rul rulVar2 = ((i8m) obj).o;
                if (rulVar2 == null || (state2 = rulVar2.getState()) == null) {
                    return 0.0f;
                }
                return state2.c.h();
            default:
                return ((Number) ((sah) obj).a.d()).floatValue();
        }
    }
}
