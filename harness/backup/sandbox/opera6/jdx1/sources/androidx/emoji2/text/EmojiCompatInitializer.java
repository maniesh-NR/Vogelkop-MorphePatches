package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ndc;
import defpackage.tcc;
import defpackage.vh9;
import defpackage.xx7;
import defpackage.yx7;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements v7b {
    public final Object create(Context context) {
        Object objT;
        vh9 vh9Var = new vh9(new c61(context, (byte) 3));
        vh9Var.b = true;
        xx7.d(vh9Var);
        l45 l45VarG = l45.G(context);
        l45VarG.getClass();
        synchronized (l45.e) {
            objT = ((HashMap) l45VarG.a).get(ProcessLifecycleInitializer.class);
            if (objT == null) {
                objT = l45VarG.t(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        tcc lifecycle = ((ndc) objT).getLifecycle();
        lifecycle.a(new yx7(this, lifecycle));
        return Boolean.TRUE;
    }

    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
