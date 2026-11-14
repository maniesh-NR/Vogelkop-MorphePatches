package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class h22 extends ic4 {
    public final /* synthetic */ l1b l;

    public h22(l1b l1bVar) {
        this.l = l1bVar;
    }

    public final void q(Intent intent) {
        l1b l1bVar = this.l;
        intent.putExtra("CAMPAIGN_ID", (String) l1bVar.get("campaign"));
        intent.putExtra("SOURCE_ID", (String) l1bVar.get("source"));
        intent.putExtra("TARGET_ID", (String) l1bVar.get("target"));
        intent.putExtra("PROMPT", (String) l1bVar.get("prompt"));
        intent.putExtra("INSTANT_SEND", Boolean.parseBoolean((String) l1bVar.get("instant_send")));
        intent.setAction("ACTION_SHOW_ARIA");
    }
}
