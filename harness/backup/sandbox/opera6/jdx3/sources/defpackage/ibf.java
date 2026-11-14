package defpackage;

/* loaded from: classes.dex */
public final class ibf {
    public final int a;
    public final fr[] b;

    public ibf() {
        this.b = new fr[12];
        this.a = 0;
        for (int i = 0; i < 12; i++) {
            this.b[i] = new fr(0, 1000, (byte) 18);
        }
    }

    public ibf(izd izdVar) {
        this.b = new fr[12];
        this.a = izdVar.readInt();
        int i = 0;
        while (true) {
            fr[] frVarArr = this.b;
            if (i > 7) {
                fr frVar = frVarArr[6];
                frVarArr[8] = new fr(frVar.b + 1, frVar.c, (byte) 18);
                fr frVar2 = frVarArr[7];
                frVarArr[9] = new fr(frVar2.b + 1, frVar2.c, (byte) 18);
                frVarArr[10] = new fr(r5.b - 1, frVarArr[4].c, (byte) 18);
                frVarArr[11] = new fr(r5.b - 1, frVarArr[5].c, (byte) 18);
                return;
            }
            frVarArr[i] = new fr(izdVar);
            i++;
        }
    }

    public final boolean a(int i) {
        return (this.a & i) != 0;
    }
}
