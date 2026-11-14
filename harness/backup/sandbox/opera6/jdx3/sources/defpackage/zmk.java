package defpackage;

import java.util.Objects;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class zmk implements NetworkChangeNotifier.ConnectionTypeObserver {
    public final /* synthetic */ cnk a;

    public zmk(cnk cnkVar) {
        Objects.requireNonNull(cnkVar);
        this.a = cnkVar;
    }

    public final void onConnectionTypeChanged(int i) {
        if (i != 6) {
            NetworkChangeNotifier.removeConnectionTypeObserver(this);
            cnk cnkVar = this.a;
            umi umiVar = cnkVar.b;
            ymk ymkVar = new ymk(cnkVar, (byte) 2);
            umiVar.getClass();
            umiVar.g(new scl(ymkVar, (byte) 1)).a(null);
        }
    }
}
