package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class by6 implements aln {
    @Override // defpackage.aln
    public final boolean a() {
        return false;
    }

    @Override // defpackage.aln
    public final g7j b() {
        return null;
    }

    @Override // defpackage.aln
    public final xkn c(Context context, o2c o2cVar) {
        int i = o2cVar.c ? 2131231361 : 2131231360;
        String str = "android.resource://" + context.getPackageName() + "/" + i;
        boolean z = !p37.u0(-8675124);
        return new xkn(this, str, -8675124, -8675124, -8675124, z, z, z);
    }

    @Override // defpackage.aln
    public final int f() {
        return 4;
    }

    @Override // defpackage.aln
    public final h06 g(Context context, o2c o2cVar) {
        return new h06("Down Peak", null, null, null, "Opera", "https://www.opera.com/");
    }

    @Override // defpackage.aln
    public final String getId() {
        return "NETWORK_529";
    }

    @Override // defpackage.aln
    public final int getType() {
        return 2;
    }
}
