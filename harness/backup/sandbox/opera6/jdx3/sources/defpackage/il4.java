package defpackage;

import com.opera.android.suggestion.Suggestion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class il4 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hqk b;

    public /* synthetic */ il4(hqk hqkVar, byte b) {
        this.a = b;
        this.b = hqkVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hqk hqkVar = this.b;
        Suggestion suggestion = (Suggestion) obj;
        switch (b) {
            case 0:
                hqkVar.q(suggestion, false);
                break;
            default:
                hqkVar.q(suggestion, true);
                break;
        }
        return Unit.a;
    }
}
