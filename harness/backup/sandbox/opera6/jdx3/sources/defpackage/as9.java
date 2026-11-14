package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.opera.android.OperaApplication;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final class as9 implements r03 {
    @Override // defpackage.r03
    public final boolean a(Context context, zcl zclVar, bx7 bx7Var) {
        PersistableBundle persistableBundle = zclVar.b;
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        es9 es9VarA = es9.a(bundle, new wu5());
        if (es9VarA == null) {
            return false;
        }
        String[] strArr = OperaApplication.K;
        CommandLine commandLine = ((OperaApplication) context.getApplicationContext()).n;
        if (commandLine == null) {
            commandLine = null;
        }
        fsp.g(context, commandLine);
        e7d.a(context, new wt2(es9VarA, (byte) 5));
        return false;
    }

    @Override // defpackage.r03
    public final boolean b(Context context, zcl zclVar) {
        return false;
    }
}
