package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class kjg implements k37 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjg b;

    public /* synthetic */ kjg(tjg tjgVar, byte b) {
        this.a = b;
        this.b = tjgVar;
    }

    @Override // defpackage.k37
    public final void a(mkg[] mkgVarArr) {
        byte b = this.a;
        tjg tjgVar = this.b;
        switch (b) {
            case 0:
                tjgVar.k.a(-1, mkgVarArr);
                break;
            case 1:
            default:
                int nextWindowIndex = ((gk9) tjgVar.i).b.getNextWindowIndex();
                if (nextWindowIndex == -1) {
                    nextWindowIndex = ((gk9) tjgVar.i).b.getCurrentTimeline().o();
                }
                tjgVar.k.a(nextWindowIndex, mkgVarArr);
                break;
            case 2:
                tjgVar.v.add(new q2g(tjgVar, new ljg(tjgVar, (byte) 0), (byte) 3));
                tjgVar.k.d(mkgVarArr, 0, 0L);
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        tjg tjgVar = this.b;
        switch (b) {
            case 1:
                tjgVar.h();
                break;
            default:
                tjgVar.h();
                break;
        }
    }
}
