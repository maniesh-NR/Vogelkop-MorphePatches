package defpackage;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes.dex */
public final class vw9 extends zb5 {
    public final boolean f;

    public vw9(Context context, ywh ywhVar, qtm qtmVar) {
        super(context, ywhVar, qtmVar);
        l0c l0cVar = qtmVar.a.e;
        this.f = l0cVar != null && "us".equals(l0cVar.a.toLowerCase(Locale.US));
    }
}
