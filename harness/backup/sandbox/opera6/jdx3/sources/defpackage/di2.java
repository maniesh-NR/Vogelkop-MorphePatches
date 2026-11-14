package defpackage;

import android.net.Uri;
import com.opera.android.oauth2.OperaAccessToken;

/* loaded from: classes.dex */
public final class di2 extends s43 {
    public final pi d;

    public di2(umi umiVar, pi piVar) {
        super(umiVar);
        this.d = piVar;
    }

    public static String c(OperaAccessToken operaAccessToken) {
        return "Bearer " + operaAccessToken.a;
    }

    @Override // defpackage.s43
    public final Uri b() {
        return (Uri) this.d.get();
    }
}
