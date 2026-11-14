package defpackage;

import android.net.Uri;
import com.leanplum.internal.Constants;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jfd extends n1 {
    public final /* synthetic */ byte c = 0;

    public /* synthetic */ jfd(eri eriVar) {
        super(eriVar, (byte) 25);
    }

    public jfd(eri eriVar, oc2 oc2Var) {
        super(eriVar, (byte) 25);
    }

    @Override // defpackage.bti
    public final boolean B() {
        byte b = this.c;
        return true;
    }

    @Override // defpackage.bti
    public final String m(String str) {
        switch (this.c) {
            case 0:
                eri eriVar = (eri) this.b;
                q6e q6eVar = eti.a;
                if (!(eriVar == null ? false : eriVar instanceof f1a)) {
                    return str;
                }
                Uri uriBuild = Uri.parse(str);
                String[] strArr = wqm.a;
                if (uriBuild.getQueryParameter(Constants.Params.CLIENT) != null) {
                    Uri.Builder builderBuildUpon = uriBuild.buildUpon();
                    builderBuildUpon.clearQuery();
                    for (String str2 : wqm.n(uriBuild)) {
                        if (!str2.equals(Constants.Params.CLIENT)) {
                            Iterator it = wqm.o(uriBuild, str2).iterator();
                            while (it.hasNext()) {
                                builderBuildUpon.appendQueryParameter(str2, (String) it.next());
                            }
                        }
                    }
                    uriBuild = builderBuildUpon.build();
                }
                return uriBuild.toString();
            default:
                return str;
        }
    }
}
