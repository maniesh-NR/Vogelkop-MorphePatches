package defpackage;

import android.content.Context;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class m6j implements q6j {
    public final r6j a;

    public m6j(r6j r6jVar) {
        this.a = r6jVar;
    }

    @Override // defpackage.q6j
    public final String a(Context context) {
        StringBuilder sb = new StringBuilder();
        r6j r6jVar = this.a;
        if (!r6jVar.g) {
            sb.append(r6jVar.d.a(context));
            if (!StringsKt.N(sb)) {
                sb.append(" > ");
            }
        }
        sb.append(r6jVar.c.a(context));
        return sb.toString();
    }
}
