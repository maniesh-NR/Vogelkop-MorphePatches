package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class dy0 extends mqk {
    public final /* synthetic */ byte j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy0(kqk kqkVar, String str, SettingsManager settingsManager, iv7 iv7Var, ikc ikcVar, ndc ndcVar, Function2 function2, byte b) {
        super(kqkVar, str, settingsManager, iv7Var, ikcVar, ndcVar, function2);
        this.j = b;
    }

    @Override // defpackage.mqk
    public final boolean a() {
        switch (this.j) {
            case 0:
                return super.a() && this.d.b() && !((List) this.e.g()).isEmpty();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return super.a() && this.d.b();
            default:
                return super.a();
        }
    }

    @Override // defpackage.mqk
    public final boolean b() {
        switch (this.j) {
            case 0:
            case 1:
            case 4:
            case 6:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return true;
            default:
                return super.b();
        }
    }

    @Override // defpackage.mqk
    public final boolean c() {
        switch (this.j) {
            case 0:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return true;
            default:
                return super.c();
        }
    }

    @Override // defpackage.mqk
    public final boolean d() {
        switch (this.j) {
            case 0:
            case 1:
            case 4:
            case 6:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
            case 12:
            case 15:
                return false;
            default:
                return super.d();
        }
    }
}
