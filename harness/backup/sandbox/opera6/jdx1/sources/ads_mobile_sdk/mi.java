package ads_mobile_sdk;

import com.google.android.gms.appset.AppSetIdInfo;
import defpackage.bdg;
import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mi implements zcp {
    public final AppSetIdInfo a;

    public mi(AppSetIdInfo appSetIdInfo) {
        this.a = appSetIdInfo;
    }

    public final void a(jjj jjjVar) {
        AppSetIdInfo appSetIdInfo = this.a;
        if (appSetIdInfo != null) {
            bdg bdgVar = jjjVar.personallyIdentifiableInformation;
            bdgVar.appSetId = appSetIdInfo.getId();
            bdgVar.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi) && Intrinsics.a(this.a, ((mi) obj).a);
    }

    public final int hashCode() {
        AppSetIdInfo appSetIdInfo = this.a;
        if (appSetIdInfo == null) {
            return 0;
        }
        return appSetIdInfo.hashCode();
    }

    public final String toString() {
        return "AppSetIdInfoSignal(appSetIdInfo=" + this.a + ")";
    }
}
