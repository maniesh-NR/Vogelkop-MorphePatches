package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.suggestion.ChatSuggestionView;
import com.opera.android.suggestion.Suggestion;

/* loaded from: classes.dex */
public final class kl4 extends i {
    public final cq3 b;
    public final il4 c;
    public final il4 d;
    public final nv6 e;
    public Suggestion f;
    public int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.opera.android.suggestion.ChatSuggestionView] */
    public kl4(cq3 cq3Var, il4 il4Var, il4 il4Var2, nv6 nv6Var) {
        ?? r0 = (ChatSuggestionView) cq3Var.b;
        super((View) r0);
        this.b = cq3Var;
        this.c = il4Var;
        this.d = il4Var2;
        this.e = nv6Var;
        r0.setOnClickListener(new yk4((Object) this, (byte) 1));
        r0.h = new lb4(this, (byte) 4);
        new w9n(r0, new jl4((Object) this, (byte) 0));
    }
}
