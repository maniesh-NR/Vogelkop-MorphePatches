package defpackage;

/* loaded from: classes.dex */
public final class zfe extends hji {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public zfe(gcj gcjVar, fcj fcjVar) {
        this.a = (byte) 1;
        this.b = gcjVar;
        this.c = fcjVar;
    }

    public /* synthetic */ zfe(ltl ltlVar, Object obj, byte b) {
        this.a = b;
        this.b = obj;
        this.c = ltlVar;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                fge fgeVar = (fge) obj2;
                return new if7(mejVar, fgeVar.r, fgeVar.s, fgeVar.x, (ib9) obj, fgeVar.v);
            case 1:
                gcj gcjVar = (gcj) obj;
                fcj fcjVar = (fcj) obj2;
                return new ueh(mejVar, gcjVar.t, gcjVar.r, gcjVar.s, new nqi((Object) gcjVar, (byte) 5), new j3i(gcjVar, (byte) 23), fcjVar.c, fcjVar.a, fcjVar.d);
            default:
                juj jujVar = (juj) obj2;
                return new kuj(mejVar, jujVar.u, jujVar.v, jujVar.s, (String) obj, jujVar.t, new mni(this, (byte) 16));
        }
    }
}
