package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class cug extends ic4 {
    public final /* synthetic */ String l;
    public final /* synthetic */ int m;
    public final /* synthetic */ l1b n;

    public cug(String str, int i, l1b l1bVar) {
        this.l = str;
        this.m = i;
        this.n = l1bVar;
    }

    public final void q(Intent intent) {
        Intent intentPutExtra = intent.putExtra("GIVEAWAY_CAMPAIGN", this.l).putExtra("GIVEAWAY_DURATION", this.m);
        l1b l1bVar = this.n;
        String str = (String) l1bVar.get("campaign");
        String str2 = (String) l1bVar.get("source");
        intentPutExtra.putExtra("CAMPAIGN_ID", str).putExtra("SOURCE_ID", str2).putExtra("TARGET_ID", (String) l1bVar.get("target"));
        intent.setAction("ACTION_PREMIUM_GIVEAWAY_ONBOARDING");
    }
}
