package defpackage;

import android.content.Context;
import com.opera.android.aiassistant.db.AiAssistantDatabase;

/* loaded from: classes.dex */
public final class vk6 {
    public final rv0 a;
    public final umi b;
    public final qie c;

    public vk6(Context context, umi umiVar) {
        u5i u5iVarF = xih.f(context.getApplicationContext(), AiAssistantDatabase.class, "ai_assistant");
        u5iVarF.a(new ryd[]{AiAssistantDatabase.l});
        u5iVarF.a(new ryd[]{AiAssistantDatabase.m});
        this.a = ((AiAssistantDatabase) u5iVarF.b()).x();
        this.b = umiVar;
        this.c = new qie((byte) 19);
    }
}
