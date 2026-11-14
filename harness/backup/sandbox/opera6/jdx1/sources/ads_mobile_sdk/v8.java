package ads_mobile_sdk;

import defpackage.jjj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v8 implements zcp {
    public final ArrayList a;

    public v8(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void a(jjj jjjVar) {
        jjjVar.adTypes.addAll(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof v8) && this.a.equals(((v8) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdTypeSignal(adTypes=" + this.a + ")";
    }
}
