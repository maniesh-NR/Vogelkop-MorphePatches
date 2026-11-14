package defpackage;

import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final /* synthetic */ class ymk implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cnk b;

    public /* synthetic */ ymk(cnk cnkVar, byte b) {
        this.a = b;
        this.b = cnkVar;
    }

    public final Object get() {
        byte b = this.a;
        cnk cnkVar = this.b;
        switch (b) {
            case 0:
            default:
                cnkVar.b();
                break;
            case 1:
                cnkVar.getClass();
                if (!sle.d()) {
                    NetworkChangeNotifier.addConnectionTypeObserver(new zmk(cnkVar));
                    break;
                }
                break;
        }
        return null;
    }
}
