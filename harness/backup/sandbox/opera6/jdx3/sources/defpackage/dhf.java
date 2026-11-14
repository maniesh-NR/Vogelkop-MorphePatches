package defpackage;

import com.opera.android.oauth2.OperaAccessToken;

/* loaded from: classes.dex */
public final class dhf extends yi2 {
    public final /* synthetic */ ab g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhf(qie qieVar, OperaAccessToken operaAccessToken, ab abVar) {
        super(operaAccessToken, "social-accounts");
        this.g = abVar;
    }

    @Override // defpackage.yi2
    public final void i(String str) {
        this.g.run(null);
    }
}
