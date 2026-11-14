package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class vse implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wse b;
    public final /* synthetic */ ate c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ vse(wse wseVar, ate ateVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = wseVar;
        this.c = ateVar;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ate ateVar = this.c;
        wse wseVar = this.b;
        switch (b) {
            case 0:
                wseVar.p.I0(ateVar, arrayList);
                break;
            default:
                wseVar.p.I0(ateVar, arrayList);
                break;
        }
    }
}
