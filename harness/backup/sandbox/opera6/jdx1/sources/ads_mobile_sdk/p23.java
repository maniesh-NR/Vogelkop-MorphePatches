package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p23 implements zcp {
    public final Bundle a;

    public p23(Bundle bundle) {
        this.a = bundle;
    }

    public final void a(jjj jjjVar) {
        jjjVar.sharedPreferenceSignals = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p23) && Intrinsics.a(this.a, ((p23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedPreferenceSignal(sharedPreferences=" + this.a + ")";
    }
}
