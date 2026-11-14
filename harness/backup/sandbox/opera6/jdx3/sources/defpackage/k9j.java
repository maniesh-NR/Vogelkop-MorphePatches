package defpackage;

import com.opera.android.settings.settings_search.database.SettingsSearchDatabase;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class k9j implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o9j b;

    public /* synthetic */ k9j(o9j o9jVar, byte b) {
        this.a = b;
        this.b = o9jVar;
    }

    public final Object g(Object obj) {
        byte b = this.a;
        o9j o9jVar = this.b;
        switch (b) {
            case 0:
                o9j.h(o9jVar, (String) ((shf) o9jVar.c.e).a, 2);
                break;
            default:
                kfo.Y(((SettingsSearchDatabase) o9jVar.c.b).x().a, false, true, new u4h((byte) 10));
                o9j.h(o9jVar, null, 3);
                break;
        }
        return Unit.a;
    }
}
