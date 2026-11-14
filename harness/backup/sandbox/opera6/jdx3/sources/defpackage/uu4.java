package defpackage;

import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.Collections;

/* loaded from: classes.dex */
public final class uu4 extends SuggestionProviderBridge {
    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        if (str.length() > 0) {
            yv4Var.d(l08.a);
        } else {
            yv4Var.d(Collections.singletonList(new Suggestion(25, "", "", "", null, null, Integer.MAX_VALUE, "", 0, -1, null)));
        }
    }
}
