package defpackage;

import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final /* synthetic */ class fpk implements NetworkChangeNotifier.ConnectionTypeObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fpk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onConnectionTypeChanged(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ipk ipkVar = (ipk) obj;
                if (ipkVar.R(false)) {
                    ipkVar.b.a();
                    break;
                }
                break;
            case 1:
                cdn cdnVar = (cdn) obj;
                cdnVar.i = sle.d();
                cdnVar.S();
                break;
            default:
                ydn ydnVar = (ydn) obj;
                gfn gfnVar = ydnVar.c;
                if (ydnVar.S != i) {
                    ydnVar.S = i;
                    ydnVar.O();
                    if (i != 6 && ydnVar.d.a && gfnVar.isEnabled() && ydnVar.G == 3 && ydnVar.I == null) {
                        gfnVar.g(new sdn(ydnVar, (byte) 1));
                        break;
                    }
                }
                break;
        }
    }
}
