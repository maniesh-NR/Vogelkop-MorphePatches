package defpackage;

import android.text.TextUtils;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.Collections;

/* loaded from: classes.dex */
public final class qmh extends SuggestionProviderBridge {
    public final /* synthetic */ byte d = 1;
    public final Object e;
    public final Object f;
    public final Object g;

    public qmh(grk grkVar, crk crkVar) {
        super(0);
        this.e = new Suggestion(15, "", "", "", null, null, Integer.MAX_VALUE, "", 0, -1, null);
        this.f = grkVar;
        this.g = crkVar;
    }

    public qmh(grk grkVar, grk grkVar2, s28 s28Var) {
        super(5);
        this.e = grkVar;
        this.f = grkVar2;
        this.g = s28Var;
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
        byte b = this.d;
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        byte b = this.d;
        Object obj = this.e;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                if (!((grk) obj).a() && (TextUtils.isEmpty(str) || (!wqm.x(str) && !((grk) obj3).a()))) {
                    s28 s28Var = (s28) obj2;
                    o8f o8fVar = new o8f(yv4Var, (byte) 29);
                    if (!s28Var.d) {
                        a1b a1bVar = h1b.b;
                        o8fVar.run(csh.e);
                        break;
                    } else {
                        ((ko7) s28Var.h).f(new q2g(s28Var, o8fVar, (byte) 22));
                        break;
                    }
                } else {
                    yv4Var.d(Collections.EMPTY_LIST);
                    break;
                }
            default:
                if (!((grk) obj3).b.I.a && ((fbf) ((crk) obj2).b).a.j.t.b.g == null) {
                    yv4Var.d(Collections.singletonList((Suggestion) obj));
                    break;
                } else {
                    yv4Var.d(Collections.EMPTY_LIST);
                    break;
                }
                break;
        }
    }
}
