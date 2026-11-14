package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class sy implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wy b;

    public /* synthetic */ sy(wy wyVar, byte b) {
        this.a = b;
        this.b = wyVar;
    }

    public final Object get() {
        byte b = this.a;
        wy wyVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(wyVar.T());
            case 1:
                c3j c3jVarD = ((d3j) e3j.t(wyVar.a).i()).d(6, false);
                Uri uriBuild = new Uri.Builder().scheme("https").authority(c3jVarD != null ? (String) c3jVarD.d : "api-a.op-mobile.opera.com").build();
                return new r9i((Object) uriBuild.buildUpon().appendEncodedPath("config").build(), (Object) uriBuild.buildUpon().appendEncodedPath("fetch").build(), (Object) uriBuild.buildUpon().appendEncodedPath("v1/feedback/rejected").build(), (Object) uriBuild.buildUpon().path("/v1/dps/").build(), (byte) 3);
            default:
                c3j c3jVarD2 = ((d3j) e3j.t(wyVar.a).i()).d(7, false);
                Uri uriBuild2 = new Uri.Builder().scheme("https").authority(c3jVarD2 != null ? (String) c3jVarD2.d : "dot-a.op-mobile.opera.com").build();
                return new k5o((Object) uriBuild2.buildUpon().appendEncodedPath("impression").build(), (Object) uriBuild2.buildUpon().appendEncodedPath("click").build(), (byte) 2);
        }
    }
}
