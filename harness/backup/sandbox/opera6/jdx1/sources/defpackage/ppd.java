package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ppd implements zpd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aqd b;
    public final /* synthetic */ int c;

    public /* synthetic */ ppd(aqd aqdVar, int i, byte b) {
        this.a = b;
        this.b = aqdVar;
        this.c = i;
    }

    @Override // defpackage.zpd
    public final void b(nod nodVar) {
        byte b = this.a;
        int i = 0;
        z = false;
        boolean z = false;
        i = 0;
        i = 0;
        int i2 = this.c;
        aqd aqdVar = this.b;
        switch (b) {
            case 0:
                xkg xkgVar = aqdVar.f.t;
                int i3 = nac.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 == 1) {
                        i = 1;
                    } else if (i2 == 2 || i2 == 3) {
                        i = 2;
                    } else {
                        w7d.K("Unrecognized PlaybackStateCompat.RepeatMode: " + i2 + " was converted to `Player.REPEAT_MODE_OFF`");
                    }
                }
                xkgVar.setRepeatMode(i);
                break;
            default:
                xkg xkgVar2 = aqdVar.f.t;
                int i4 = nac.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        qp2.o(sko.i(i2, "Unrecognized ShuffleMode: "));
                        break;
                    } else {
                        z = true;
                    }
                }
                xkgVar2.setShuffleModeEnabled(z);
                break;
        }
    }
}
