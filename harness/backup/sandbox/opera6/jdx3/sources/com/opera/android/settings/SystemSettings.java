package com.opera.android.settings;

import android.content.ContentResolver;
import android.provider.Settings;
import defpackage.mcj;
import defpackage.td2;
import defpackage.umi;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class SystemSettings {
    public final ContentResolver a;
    public final td2 b;
    public HashMap c;

    public SystemSettings(ContentResolver contentResolver, umi umiVar) {
        this.a = contentResolver;
        td2 td2Var = new td2(umiVar);
        this.b = td2Var;
        td2Var.a(null, new mcj((Object) this, (Object) null, false));
    }

    public final boolean getPasswordEchoEnabled() {
        HashMap map = this.c;
        return map != null ? ((Boolean) map.get("show_password")).booleanValue() : Settings.System.getInt(this.a, "show_password", 1) == 1;
    }
}
