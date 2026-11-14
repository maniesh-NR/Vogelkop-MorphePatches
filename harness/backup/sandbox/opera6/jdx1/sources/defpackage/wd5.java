package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.a;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class wd5 extends Activity implements ndc, pub {

    @NotNull
    private final hkj extraDataMap = new hkj(0);

    @NotNull
    private final qdc lifecycleRegistry = new qdc(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = r5n.a;
        return superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = r5n.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @f37
    public <T extends rd5> T getExtraData(@NotNull Class<T> cls) {
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        h9o.t();
        return null;
    }

    @Override // defpackage.ndc
    public tcc getLifecycle() {
        return this.lifecycleRegistry;
    }

    public final void k() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = ReportFragment.a;
        a.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.lifecycleRegistry.g(qcc.c);
        super.onSaveInstanceState(bundle);
    }

    @f37
    public void putExtraData(@NotNull rd5 rd5Var) {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 1
            r0 = 0
            if (r3 == 0) goto L4a
            int r1 = r3.length
            if (r1 == 0) goto L4a
            r3 = r3[r0]
            int r1 = r3.hashCode()
            switch(r1) {
                case -645125871: goto L3b;
                case 100470631: goto L2c;
                case 472614934: goto L23;
                case 1159329357: goto L1a;
                case 1455016274: goto L11;
                default: goto L10;
            }
        L10:
            goto L4a
        L11:
            java.lang.String r1 = "--autofill"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L49
            goto L4a
        L1a:
            java.lang.String r1 = "--contentcapture"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L49
            goto L4a
        L23:
            java.lang.String r1 = "--list-dumpables"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L34
            goto L4a
        L2c:
            java.lang.String r1 = "--dump-dumpable"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L4a
        L34:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r3 < r1) goto L4a
            goto L49
        L3b:
            java.lang.String r1 = "--translation"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L4a
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r3 < r1) goto L4a
        L49:
            r0 = r2
        L4a:
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd5.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // defpackage.pub
    public boolean superDispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
